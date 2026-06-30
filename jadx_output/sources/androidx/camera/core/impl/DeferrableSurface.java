package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public abstract class DeferrableSurface {
    private t2.k mCloseCompleter;
    private final wa.a mCloseFuture;
    private boolean mClosed;
    java.lang.Class<?> mContainerClass;
    private final java.lang.Object mLock;
    private final android.util.Size mPrescribedSize;
    private final int mPrescribedStreamFormat;
    private t2.k mTerminationCompleter;
    private final wa.a mTerminationFuture;
    private int mUseCount;
    public static final android.util.Size SIZE_UNDEFINED = new android.util.Size(0, 0);
    private static final java.lang.String TAG = "DeferrableSurface";
    private static final boolean DEBUG = androidx.camera.core.Logger.isDebugEnabled(TAG);
    private static final java.util.concurrent.atomic.AtomicInteger USED_COUNT = new java.util.concurrent.atomic.AtomicInteger(0);
    private static final java.util.concurrent.atomic.AtomicInteger TOTAL_COUNT = new java.util.concurrent.atomic.AtomicInteger(0);

    /* loaded from: classes14.dex */
    public static final class SurfaceClosedException extends java.lang.Exception {
        androidx.camera.core.impl.DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(java.lang.String str, androidx.camera.core.impl.DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public androidx.camera.core.impl.DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    /* loaded from: classes14.dex */
    public static final class SurfaceUnavailableException extends java.lang.Exception {
        public SurfaceUnavailableException(java.lang.String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$new$0(t2.k kVar) {
        synchronized (this.mLock) {
            this.mTerminationCompleter = kVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ java.lang.Object lambda$new$1(t2.k kVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = kVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(java.lang.String str) {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (java.lang.Exception e17) {
            androidx.camera.core.Logger.e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, java.lang.Boolean.valueOf(this.mClosed), java.lang.Integer.valueOf(this.mUseCount)), e17);
            }
        }
    }

    private void printGlobalDebugCounts(java.lang.String str, int i17, int i18) {
        if (!DEBUG && androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            androidx.camera.core.Logger.d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        androidx.camera.core.Logger.d(TAG, str + "[total_surfaces=" + i17 + ", used_surfaces=" + i18 + "](" + this + "}");
    }

    public void close() {
        t2.k kVar;
        synchronized (this.mLock) {
            if (this.mClosed) {
                kVar = null;
            } else {
                this.mClosed = true;
                this.mCloseCompleter.a(null);
                if (this.mUseCount == 0) {
                    kVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    kVar = null;
                }
                if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                    androidx.camera.core.Logger.d(TAG, "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                }
            }
        }
        if (kVar != null) {
            kVar.a(null);
        }
    }

    public void decrementUseCount() {
        t2.k kVar;
        synchronized (this.mLock) {
            int i17 = this.mUseCount;
            if (i17 == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i18 = i17 - 1;
            this.mUseCount = i18;
            if (i18 == 0 && this.mClosed) {
                kVar = this.mTerminationCompleter;
                this.mTerminationCompleter = null;
            } else {
                kVar = null;
            }
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                androidx.camera.core.Logger.d(TAG, "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                if (this.mUseCount == 0) {
                    printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                }
            }
        }
        if (kVar != null) {
            kVar.a(null);
        }
    }

    public wa.a getCloseFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mCloseFuture);
    }

    public java.lang.Class<?> getContainerClass() {
        return this.mContainerClass;
    }

    public android.util.Size getPrescribedSize() {
        return this.mPrescribedSize;
    }

    public int getPrescribedStreamFormat() {
        return this.mPrescribedStreamFormat;
    }

    public final wa.a getSurface() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return androidx.camera.core.impl.utils.futures.Futures.immediateFailedFuture(new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return provideSurface();
        }
    }

    public wa.a getTerminationFuture() {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public int getUseCount() {
        int i17;
        synchronized (this.mLock) {
            i17 = this.mUseCount;
        }
        return i17;
    }

    public void incrementUseCount() {
        synchronized (this.mLock) {
            int i17 = this.mUseCount;
            if (i17 == 0 && this.mClosed) {
                throw new androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.mUseCount = i17 + 1;
            if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
                if (this.mUseCount == 1) {
                    printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                }
                androidx.camera.core.Logger.d(TAG, "use count+1, useCount=" + this.mUseCount + " " + this);
            }
        }
    }

    public boolean isClosed() {
        boolean z17;
        synchronized (this.mLock) {
            z17 = this.mClosed;
        }
        return z17;
    }

    public abstract wa.a provideSurface();

    public void setContainerClass(java.lang.Class<?> cls) {
        this.mContainerClass = cls;
    }

    public DeferrableSurface(android.util.Size size, int i17) {
        this.mLock = new java.lang.Object();
        this.mUseCount = 0;
        this.mClosed = false;
        this.mPrescribedSize = size;
        this.mPrescribedStreamFormat = i17;
        wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurface$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$0;
                lambda$new$0 = androidx.camera.core.impl.DeferrableSurface.this.lambda$new$0(kVar);
                return lambda$new$0;
            }
        });
        this.mTerminationFuture = a17;
        this.mCloseFuture = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurface$$b
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$new$1;
                lambda$new$1 = androidx.camera.core.impl.DeferrableSurface.this.lambda$new$1(kVar);
                return lambda$new$1;
            }
        });
        if (androidx.camera.core.Logger.isDebugEnabled(TAG)) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            final java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Exception());
            a17.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurface$$c
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.DeferrableSurface.this.lambda$new$2(stackTraceString);
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        }
    }
}
