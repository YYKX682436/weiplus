package androidx.camera.core.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\b\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u0002R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "Ljz5/f0;", "completePendingScreenFlashListener", "completePendingScreenFlashClear", "", "expirationTimeMillis", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "screenFlashListener", "apply", "clear", "getBaseScreenFlash", "completePendingTasks", "screenFlash", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "Ljava/lang/Object;", "lock", "Ljava/lang/Object;", "", "isClearScreenFlashPending", "Z", "pendingListener", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "<init>", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "Companion", "camera-core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes14.dex */
public final class ScreenFlashWrapper implements androidx.camera.core.ImageCapture.ScreenFlash {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.core.internal.ScreenFlashWrapper.Companion INSTANCE = new androidx.camera.core.internal.ScreenFlashWrapper.Companion(null);
    private static final java.lang.String TAG = "ScreenFlashWrapper";
    private boolean isClearScreenFlashPending;
    private final java.lang.Object lock;
    private androidx.camera.core.ImageCapture.ScreenFlashListener pendingListener;
    private final androidx.camera.core.ImageCapture.ScreenFlash screenFlash;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper$Companion;", "", "()V", "TAG", "", "from", "Landroidx/camera/core/internal/ScreenFlashWrapper;", "screenFlash", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final androidx.camera.core.internal.ScreenFlashWrapper from(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
            return new androidx.camera.core.internal.ScreenFlashWrapper(screenFlash, null);
        }
    }

    public /* synthetic */ ScreenFlashWrapper(androidx.camera.core.ImageCapture.ScreenFlash screenFlash, kotlin.jvm.internal.i iVar) {
        this(screenFlash);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(androidx.camera.core.internal.ScreenFlashWrapper this$0) {
        kotlin.jvm.internal.o.g(this$0, "this$0");
        synchronized (this$0.lock) {
            if (this$0.pendingListener == null) {
                androidx.camera.core.Logger.w(TAG, "apply: pendingListener is null!");
            }
            this$0.completePendingScreenFlashListener();
        }
    }

    private final void completePendingScreenFlashClear() {
        jz5.f0 f0Var;
        synchronized (this.lock) {
            if (this.isClearScreenFlashPending) {
                androidx.camera.core.ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                if (screenFlash != null) {
                    screenFlash.clear();
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    androidx.camera.core.Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                androidx.camera.core.Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
            }
            this.isClearScreenFlashPending = false;
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
            if (screenFlashListener != null) {
                screenFlashListener.onCompleted();
            }
            this.pendingListener = null;
        }
    }

    public static final androidx.camera.core.internal.ScreenFlashWrapper from(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        return INSTANCE.from(screenFlash);
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j17, androidx.camera.core.ImageCapture.ScreenFlashListener screenFlashListener) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
        }
        androidx.camera.core.ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j17, new androidx.camera.core.ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.ScreenFlashWrapper$$a
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    androidx.camera.core.internal.ScreenFlashWrapper.apply$lambda$2(androidx.camera.core.internal.ScreenFlashWrapper.this);
                }
            });
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            androidx.camera.core.Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    /* renamed from: getBaseScreenFlash, reason: from getter */
    public final androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.screenFlash;
    }

    private ScreenFlashWrapper(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new java.lang.Object();
    }
}
