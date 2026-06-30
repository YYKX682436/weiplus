package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.DeferrableSurface */
/* loaded from: classes14.dex */
public abstract class AbstractC0697x654a0293 {

    /* renamed from: mCloseCompleter */
    private t2.k f1638xbc4e790e;

    /* renamed from: mCloseFuture */
    private final wa.a f1639x9e3d0f2e;

    /* renamed from: mClosed */
    private boolean f1640xfe820839;

    /* renamed from: mContainerClass */
    java.lang.Class<?> f1641x38251f44;

    /* renamed from: mLock */
    private final java.lang.Object f1642x6243b38;

    /* renamed from: mPrescribedSize */
    private final android.util.Size f1643x646ed05;

    /* renamed from: mPrescribedStreamFormat */
    private final int f1644xc4065c9b;

    /* renamed from: mTerminationCompleter */
    private t2.k f1645xffa9afc2;

    /* renamed from: mTerminationFuture */
    private final wa.a f1646xa94874fa;

    /* renamed from: mUseCount */
    private int f1647x12919f55;

    /* renamed from: SIZE_UNDEFINED */
    public static final android.util.Size f1635x23d5f672 = new android.util.Size(0, 0);
    private static final java.lang.String TAG = "DeferrableSurface";

    /* renamed from: DEBUG */
    private static final boolean f1634x3de9e33 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG);

    /* renamed from: USED_COUNT */
    private static final java.util.concurrent.atomic.AtomicInteger f1637xe15d1ded = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: TOTAL_COUNT */
    private static final java.util.concurrent.atomic.AtomicInteger f1636x9ea0b414 = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException */
    /* loaded from: classes14.dex */
    public static final class SurfaceClosedException extends java.lang.Exception {

        /* renamed from: mDeferrableSurface */
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 f1648x176749c6;

        public SurfaceClosedException(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 abstractC0697x654a0293) {
            super(str);
            this.f1648x176749c6 = abstractC0697x654a0293;
        }

        /* renamed from: getDeferrableSurface */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293 m5413xcdba49fd() {
            return this.f1648x176749c6;
        }
    }

    /* renamed from: androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException */
    /* loaded from: classes14.dex */
    public static final class SurfaceUnavailableException extends java.lang.Exception {
        public SurfaceUnavailableException(java.lang.String str) {
            super(str);
        }
    }

    public AbstractC0697x654a0293() {
        this(f1635x23d5f672, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0 */
    public /* synthetic */ java.lang.Object m5397x51ef5f0f(t2.k kVar) {
        synchronized (this.f1642x6243b38) {
            this.f1645xffa9afc2 = kVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1 */
    public /* synthetic */ java.lang.Object m5398x51ef5f10(t2.k kVar) {
        synchronized (this.f1642x6243b38) {
            this.f1638xbc4e790e = kVar;
        }
        return "DeferrableSurface-close(" + this + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$2 */
    public /* synthetic */ void m5399x51ef5f11(java.lang.String str) {
        try {
            this.f1646xa94874fa.get();
            m5400x68b6b6a7("Surface terminated", f1636x9ea0b414.decrementAndGet(), f1637xe15d1ded.get());
        } catch (java.lang.Exception e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.e(TAG, "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f1642x6243b38) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, java.lang.Boolean.valueOf(this.f1640xfe820839), java.lang.Integer.valueOf(this.f1647x12919f55)), e17);
            }
        }
    }

    /* renamed from: printGlobalDebugCounts */
    private void m5400x68b6b6a7(java.lang.String str, int i17, int i18) {
        if (!f1634x3de9e33 && p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, str + "[total_surfaces=" + i17 + ", used_surfaces=" + i18 + "](" + this + "}");
    }

    /* renamed from: close */
    public void mo5401x5a5ddf8() {
        t2.k kVar;
        synchronized (this.f1642x6243b38) {
            if (this.f1640xfe820839) {
                kVar = null;
            } else {
                this.f1640xfe820839 = true;
                this.f1638xbc4e790e.a(null);
                if (this.f1647x12919f55 == 0) {
                    kVar = this.f1645xffa9afc2;
                    this.f1645xffa9afc2 = null;
                } else {
                    kVar = null;
                }
                if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "surface closed,  useCount=" + this.f1647x12919f55 + " closed=true " + this);
                }
            }
        }
        if (kVar != null) {
            kVar.a(null);
        }
    }

    /* renamed from: decrementUseCount */
    public void m5402xc13e57b() {
        t2.k kVar;
        synchronized (this.f1642x6243b38) {
            int i17 = this.f1647x12919f55;
            if (i17 == 0) {
                throw new java.lang.IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i18 = i17 - 1;
            this.f1647x12919f55 = i18;
            if (i18 == 0 && this.f1640xfe820839) {
                kVar = this.f1645xffa9afc2;
                this.f1645xffa9afc2 = null;
            } else {
                kVar = null;
            }
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "use count-1,  useCount=" + this.f1647x12919f55 + " closed=" + this.f1640xfe820839 + " " + this);
                if (this.f1647x12919f55 == 0) {
                    m5400x68b6b6a7("Surface no longer in use", f1636x9ea0b414.get(), f1637xe15d1ded.decrementAndGet());
                }
            }
        }
        if (kVar != null) {
            kVar.a(null);
        }
    }

    /* renamed from: getCloseFuture */
    public wa.a m5403xce0644a5() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f1639x9e3d0f2e);
    }

    /* renamed from: getContainerClass */
    public java.lang.Class<?> m5404x2009e26d() {
        return this.f1641x38251f44;
    }

    /* renamed from: getPrescribedSize */
    public android.util.Size m5405xee2bb02e() {
        return this.f1643x646ed05;
    }

    /* renamed from: getPrescribedStreamFormat */
    public int m5406x676de6c4() {
        return this.f1644xc4065c9b;
    }

    /* renamed from: getSurface */
    public final wa.a m5407xcf572877() {
        synchronized (this.f1642x6243b38) {
            if (this.f1640xfe820839) {
                return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return mo4801xc462ecc();
        }
    }

    /* renamed from: getTerminationFuture */
    public wa.a m5408x5f9b7531() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(this.f1646xa94874fa);
    }

    /* renamed from: getUseCount */
    public int m5409x696e353e() {
        int i17;
        synchronized (this.f1642x6243b38) {
            i17 = this.f1647x12919f55;
        }
        return i17;
    }

    /* renamed from: incrementUseCount */
    public void m5410x8d860857() {
        synchronized (this.f1642x6243b38) {
            int i17 = this.f1647x12919f55;
            if (i17 == 0 && this.f1640xfe820839) {
                throw new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.f1647x12919f55 = i17 + 1;
            if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
                if (this.f1647x12919f55 == 1) {
                    m5400x68b6b6a7("New surface in use", f1636x9ea0b414.get(), f1637xe15d1ded.incrementAndGet());
                }
                p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "use count+1, useCount=" + this.f1647x12919f55 + " " + this);
            }
        }
    }

    /* renamed from: isClosed */
    public boolean m5411xd742d336() {
        boolean z17;
        synchronized (this.f1642x6243b38) {
            z17 = this.f1640xfe820839;
        }
        return z17;
    }

    /* renamed from: provideSurface */
    public abstract wa.a mo4801xc462ecc();

    /* renamed from: setContainerClass */
    public void m5412xe8004a79(java.lang.Class<?> cls) {
        this.f1641x38251f44 = cls;
    }

    public AbstractC0697x654a0293(android.util.Size size, int i17) {
        this.f1642x6243b38 = new java.lang.Object();
        this.f1647x12919f55 = 0;
        this.f1640xfe820839 = false;
        this.f1643x646ed05 = size;
        this.f1644xc4065c9b = i17;
        wa.a a17 = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurface$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m5397x51ef5f0f;
                m5397x51ef5f0f = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this.m5397x51ef5f0f(kVar);
                return m5397x51ef5f0f;
            }
        });
        this.f1646xa94874fa = a17;
        this.f1639x9e3d0f2e = t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurface$$b
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m5398x51ef5f10;
                m5398x51ef5f10 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this.m5398x51ef5f10(kVar);
                return m5398x51ef5f10;
            }
        });
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.m4672xa8834bb8(TAG)) {
            m5400x68b6b6a7("Surface created", f1636x9ea0b414.incrementAndGet(), f1637xe15d1ded.get());
            final java.lang.String stackTraceString = android.util.Log.getStackTraceString(new java.lang.Exception());
            a17.mo606x162a7075(new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurface$$c
                @Override // java.lang.Runnable
                public final void run() {
                    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.this.m5399x51ef5f11(stackTraceString);
                }
            }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
        }
    }
}
