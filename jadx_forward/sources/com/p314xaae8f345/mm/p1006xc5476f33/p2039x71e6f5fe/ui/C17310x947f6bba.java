package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView */
/* loaded from: classes15.dex */
public class C17310x947f6bba extends com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 {
    public static final int P1 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_scan_code_continuous_max_frame, 50);
    public java.lang.String A;
    public boolean A1;
    public java.lang.String B;
    public final e04.l2 B1;
    public java.lang.String C;
    public int C1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 D;
    public long D1;
    public d04.h E;
    public final long E1;
    public d04.i F;
    public boolean F1;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u G;
    public boolean G1;
    public d04.y2 H;
    public boolean H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f240928J;
    public boolean J1;
    public int K;
    public java.lang.Runnable K1;
    public float L;
    public final e04.j1 L1;
    public int M;
    public final at5.b M1;
    public boolean N;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N1;
    public final android.view.GestureDetector O1;
    public android.graphics.Point P;
    public boolean Q;
    public boolean R;
    public final e04.g1 S;
    public final e04.h1 T;
    public boolean U;
    public int V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f240929l1;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 f240930p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f240931p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f240932p1;

    /* renamed from: q, reason: collision with root package name */
    public d04.j f240933q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f240934r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf f240935s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17315x949fc5b3 f240936t;

    /* renamed from: u, reason: collision with root package name */
    public int f240937u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f240938v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f240939w;

    /* renamed from: x, reason: collision with root package name */
    public long f240940x;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1 f240941x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f240942x1;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 f240943y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f240944y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f240945y1;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.ScanCallBack f240946z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f240947z1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 extends qt5.g {
        public AnonymousClass1() {
        }

        @Override // qt5.f
        public void a() {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
            if (c17310x947f6bba.f296840m) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onResume cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) c17310x947f6bba.f296835e).f448190b), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.R), java.lang.Integer.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448206r));
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
            e04.j1 j1Var = c17310x947f6bba2.L1;
            qt5.i0 i0Var = c17310x947f6bba2.f296835e;
            j1Var.c(((qt5.c) i0Var).f448206r, ((qt5.c) i0Var).f448207s);
            if (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
                uo.n.f511055a.f(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.getContext());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.n(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
                uo.n.f511055a.g(3, true, new yz5.a() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        boolean z17;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass1.this;
                        if ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.getContext() instanceof android.app.Activity) && !((android.app.Activity) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.getContext()).isFinishing()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                            if (!((qt5.c) c17310x947f6bba3.f296835e).f448190b) {
                                z17 = false;
                                return java.lang.Boolean.valueOf(z17);
                            }
                        }
                        z17 = true;
                        return java.lang.Boolean.valueOf(z17);
                    }
                }, new yz5.p() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$1$$b
                    @Override // yz5.p
                    /* renamed from: invoke */
                    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                        final java.lang.Integer num = (java.lang.Integer) obj;
                        final yz5.l lVar = (yz5.l) obj2;
                        final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass1 anonymousClass1 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass1.this;
                        anonymousClass1.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.1.1
                            @Override // qt5.f
                            public void a() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                                if (c17310x947f6bba3.f296840m) {
                                    return;
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "retryOpenCameraDelay %s s, cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) c17310x947f6bba3.f296835e).f448190b), num, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.R), java.lang.Integer.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448206r));
                                lVar.mo146xb9724478(java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b));
                                if (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
                                }
                            }
                        });
                        return null;
                    }
                });
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$11, reason: invalid class name */
    /* loaded from: classes15.dex */
    class AnonymousClass11 implements yz5.a {
        public AnonymousClass11() {
        }

        @Override // yz5.a
        /* renamed from: invoke */
        public java.lang.Object mo152xb9724478() {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
            c17310x947f6bba.f240934r.m68841xc0e5f07e(true);
            c17310x947f6bba.f240935s.m68882x445f919b(true);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$OnSingleTapListener */
    /* loaded from: classes13.dex */
    public interface OnSingleTapListener {
    }

    /* renamed from: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$ScanCallBack */
    /* loaded from: classes15.dex */
    public interface ScanCallBack {
    }

    public C17310x947f6bba(android.content.Context context) {
        super(context);
        this.f240937u = 1;
        this.f240938v = true;
        this.f240939w = true;
        this.f240943y = null;
        this.I = true;
        this.f240928J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f240931p0 = false;
        this.f240944y0 = false;
        this.f240929l1 = false;
        this.f240932p1 = false;
        this.f240942x1 = false;
        this.f240945y1 = false;
        this.f240947z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f327541b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f240940x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                                if (c17310x947f6bba.W && ((qt5.c) c17310x947f6bba.f296835e).f448191c) {
                                    ((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).p((int) (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f556917q++;
                                    g0Var.f556918r = f17 * g0Var.f556918r;
                                    g0Var.f556919s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f556983a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                n0Var.d(c17310x947f6bba.f240940x, c17310x947f6bba.f240943y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                c17310x947f6bba.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15 anonymousClass15 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        long j18 = c17310x947f6bba2.f240940x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = c17310x947f6bba2.L1;
                        j1Var.f327517s = true;
                        j1Var.f327518t = currentTimeMillis - j1Var.f327499a;
                        e04.i1 i1Var = e04.i1.f327491f;
                        i1Var.toString();
                        j1Var.f327519u = i1Var;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DECODE_SUCCESS;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        c17310x947f6bba3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i17 = 0;
                        while (it.hasNext()) {
                            if (((com.p314xaae8f345.p2891x34da02.C25303x87b156a3) it.next()) != null) {
                                i17++;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i17));
                        final android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle2.putInt("result_code_point_count", i17);
                        if (c17310x947f6bba3.m68698x7f89ad84() != null) {
                            bundle2.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = c17310x947f6bba3.f240935s;
                        if (abstractC17340x3097aadf != null && (abstractC17340x3097aadf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf).Q.cancel();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.ScanCallBack scanCallBack = c17310x947f6bba3.f240946z;
                        if (scanCallBack != null) {
                            final long j27 = c17310x947f6bba3.f240940x;
                            final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9) scanCallBack;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                            if (!activityC17284x451cd422.U) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(activityC17284x451cd422.C));
                                return;
                            }
                            if (activityC17284x451cd422.f240692t != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - activityC17284x451cd422.A));
                                final java.util.ArrayList parcelableArrayList = bundle2.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList == null || parcelableArrayList.size() <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i18 = bundle2.getInt("result_code_point_count", 0);
                                long j28 = bundle2.getLong("decode_success_cost_time", 0L);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.r(activityC17284x451cd422.C, true, activityC17284x451cd422.f240700y0 ? 3 : 1, i18);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(1, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.D(activityC17284x451cd422.C);
                                activityC17284x451cd422.k7(true, i18 > 1);
                                activityC17284x451cd422.p7(false);
                                int i19 = activityC17284x451cd422.C;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2(parcelableArrayList, j28);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k = d2Var;
                                try {
                                    java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.d(i19);
                                    d2Var.f240401c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.c(i19);
                                        d2Var2.f240402d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var3 != null) {
                                        d2Var3.f240403e = java.lang.Long.parseLong(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var4 != null) {
                                        d2Var4.f240404f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = activityC17284x451cd422.f240678f.f240998g;
                                final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) parcelableArrayList.get(0);
                                if (c25311x69ff7e80 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab = (com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab) bundle2.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e80, parcelableArrayList.size() <= 1, c25309x51dbc9ab)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.q(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c25311x69ff7e80.f556864e)) ? 1 : 2, 1, activityC17284x451cd422.D1, activityC17284x451cd422.S);
                                bundle2.putInt("qbar_string_scan_source", 0);
                                if (i18 <= 0 || activityC17284x451cd422.f240677e == null) {
                                    activityC17284x451cd422.p7(true);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e80, true, c25309x51dbc9ab)) {
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd422, j27, bundle2, c25311x69ff7e80);
                                    return;
                                }
                                com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c = (com.p314xaae8f345.p2891x34da02.C25308xdf65b80c) bundle2.getParcelable("decode_success_frame_data");
                                if (c25308xdf65b80c != null) {
                                    activityC17284x451cd422.f240677e.m68712x86db0f04(c25308xdf65b80c);
                                }
                                activityC17284x451cd422.f240698x1 = i18 > 1;
                                activityC17284x451cd422.M1 = null;
                                if (i18 > 1) {
                                    activityC17284x451cd422.f240686p.a(false);
                                    activityC17284x451cd422.f240686p.b(true, null);
                                    activityC17284x451cd422.r7(false);
                                }
                                activityC17284x451cd422.T = true;
                                activityC17284x451cd422.f240677e.m68733x9ee9454e(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f240805a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f240806b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240807c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f240808d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f240809e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList2, final int i182, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab2, final long j272, final android.os.Bundle bundle22) {
                                        r2 = parcelableArrayList2;
                                        r3 = i182;
                                        r4 = c25309x51dbc9ab2;
                                        r5 = j272;
                                        r7 = bundle22;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2
                                    public void a(int i27, android.view.View view) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e802 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) arrayList2.get(i27);
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab2 = r4;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e802, true, c25309x51dbc9ab2)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd4222, r5, r7, c25311x69ff7e802);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(2, i27, activityC17284x451cd4222.f240700y0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, !com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240462j ? 63 : 83);
                                    }
                                });
                                activityC17284x451cd422.Y6(2);
                                activityC17284x451cd422.s7(false, false);
                                activityC17284x451cd422.h7();
                                activityC17284x451cd422.f240677e.v(parcelableArrayList2, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f240811a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f240812b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 f240813c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240814d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f240815e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f240816f;

                                    public AnonymousClass2(final int i182, final java.util.ArrayList parcelableArrayList2, final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e802, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab2, final long j272, final android.os.Bundle bundle22) {
                                        r2 = i182;
                                        r3 = parcelableArrayList2;
                                        r4 = c25311x69ff7e802;
                                        r5 = c25309x51dbc9ab2;
                                        r6 = j272;
                                        r8 = bundle22;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void b(boolean z18) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240694v.a(false);
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        activityC17284x451cd4222.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab2 = r5;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e802 = r4;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e802, true, c25309x51dbc9ab2)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this, r6, r8, c25311x69ff7e802);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(1, 0, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240700y0);
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (j17 != c17310x947f6bba.f240940x || j17 == 0) {
                    return;
                }
                c17310x947f6bba.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (!c17310x947f6bba.f240929l1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (c17310x947f6bba.f240932p1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) c17310x947f6bba.f296835e).f448190b) {
                        qt5.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e;
                        android.graphics.Point point = ((qt5.c) i0Var).f448195g;
                        vz3.t.f523243a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f448200l, ((xy3.a) i0Var).f448189a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.f39173x3fe91575 = 208336003;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273 c5966x180c3273) {
                int i17 = c5966x180c3273.f136263g.f89566a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (i17 == 1) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar = (xy3.a) c17310x947f6bba.f296835e;
                    if (!aVar.f448201m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar2 = (xy3.a) c17310x947f6bba.f296835e;
                    if (aVar2.f448201m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                qt5.i0 i0Var = c17310x947f6bba.f296835e;
                if (((xy3.a) i0Var).f448203o != ((xy3.a) i0Var).f448204p) {
                    ((xy3.a) i0Var).o(1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 6, c17310x947f6bba.f240929l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 5, c17310x947f6bba.f240929l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i17;
                int i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.f240928J;
                boolean z18 = c17310x947f6bba.I;
                if (!c17310x947f6bba.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var = c17310x947f6bba.H;
                        if (y2Var != null && (i18 = y2Var.f307098d + 1) >= 0 && i18 < y2Var.f307097c.size()) {
                            y2Var.f307098d = i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = y2Var.f307096b;
                            if (c17336x6a4658b0 != null) {
                                c17336x6a4658b0.h(i18, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    } else if (f17 > 1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var2 = c17310x947f6bba.H;
                        if (y2Var2 != null && y2Var2.f307098d - 1 >= 0 && i17 < y2Var2.f307097c.size()) {
                            y2Var2.f307098d = i17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b02 = y2Var2.f307096b;
                            if (c17336x6a4658b02 != null) {
                                c17336x6a4658b02.h(i17, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.N;
                if (c17310x947f6bba.N) {
                    return true;
                }
                c17310x947f6bba.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScanCodeRect */
    public android.graphics.Rect m68698x7f89ad84() {
        return m68701x1edf9e33();
    }

    /* renamed from: getScanCodeTabType */
    private int m68699x199578cf() {
        if (this.f240929l1) {
            zs5.g0 g0Var = zs5.g0.F;
            return 4;
        }
        zs5.g0 g0Var2 = zs5.g0.F;
        return 1;
    }

    /* renamed from: getSessionInfo */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 m68700xd87a672e() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1();
        d1Var.f298520f = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.c(this.f240937u);
        d1Var.f298519e = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b;
        return d1Var;
    }

    public static void l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba) {
        e04.l2 l2Var = c17310x947f6bba.B1;
        boolean z17 = l2Var.f327552m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "retryByPreviewTimeout hasRetry: %s", java.lang.Boolean.valueOf(z17));
        if (z17 || !c17310x947f6bba.q() || c17310x947f6bba.F1) {
            return;
        }
        c17310x947f6bba.G1 = false;
        c17310x947f6bba.F1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240453a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanReporter", "reportOnPreviewFrameNotCalled");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 0);
        int i17 = l2Var.f327546g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "checkAndRetry retryType: %d, canRetry: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(i17 == 1 ? l2Var.f327548i : false));
        if ((i17 == 1 ? l2Var.f327548i : false) && i17 == 1) {
            l2Var.f327552m = true;
            e04.k2 k2Var = e04.k2.f327534f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanRetryManager", "setRetryReason reason: " + k2Var);
            l2Var.f327547h = k2Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.B(1, k2Var);
            c17310x947f6bba.p();
        }
    }

    public static void n(final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba) {
        java.lang.StackTraceElement stackTraceElement;
        java.lang.StackTraceElement[] stackTrace;
        java.lang.StackTraceElement[] stackTrace2;
        if (c17310x947f6bba.R) {
            android.content.Context context = c17310x947f6bba.getContext();
            java.lang.String scanUISession = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b;
            yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$b
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    c17310x947f6bba2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "checkShowCameraOpenFailView onShow");
                    c17310x947f6bba2.E(true);
                    return null;
                }
            };
            boolean z17 = e04.a1.f327394a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanUISession, "scanUISession");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = e04.a1.f327396c;
            if (o4Var != null) {
                o4Var.putLong("open_camera_error_time", currentTimeMillis);
            }
            e04.a1.f327394a = true;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e04.a1.f327395b, scanUISession)) {
                e04.a1.a(e04.y0.f327689e, currentTimeMillis);
            }
            e04.a1.f327395b = scanUISession;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraErrorHelper", "checkShowCameraOpenFailView scanUISession: " + scanUISession + ", errTimestamp: " + currentTimeMillis + ", lastOpenCameraError: " + e04.a1.f327394a);
            uo.n nVar = uo.n.f511055a;
            e04.z0 z0Var = new e04.z0(aVar, currentTimeMillis);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "checkShowFailAlert: " + qt5.c.class + ", mLastErr=" + uo.n.f511058d + ", caller=" + qt5.c.class.getName());
            java.lang.Throwable th6 = uo.n.f511058d;
            if (th6 != null && (stackTrace2 = th6.getStackTrace()) != null) {
                int length = stackTrace2.length;
                for (int i17 = 0; i17 < length; i17++) {
                    stackTraceElement = stackTrace2[i17];
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stackTraceElement.getClassName(), qt5.c.class.getName())) {
                        break;
                    }
                }
            }
            stackTraceElement = null;
            if (stackTraceElement != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
                if (!L.contains("last-open-camera-err-alert")) {
                    L.putLong("last-open-camera-err-alert", java.lang.System.currentTimeMillis());
                }
                if (!nVar.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "notShow: disabled");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", "postShow");
                android.app.Dialog dialog = uo.n.f511060f;
                if (!(dialog != null && dialog.isShowing())) {
                    nVar.d().removeCallbacksAndMessages(null);
                    nVar.d().postDelayed(new uo.e(context, z0Var), 1000L);
                }
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notShow: mLastErr=\n");
                java.lang.Throwable th7 = uo.n.f511058d;
                sb6.append((th7 == null || (stackTrace = th7.getStackTrace()) == null) ? null : kz5.z.d0(stackTrace, "\n", null, null, 0, null, uo.f.f511044d, 30, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CameraCompat", sb6.toString());
            }
            uo.n.f511058d = null;
        }
    }

    public static void o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba) {
        c17310x947f6bba.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onCameraOpenSuccess");
        boolean z17 = e04.a1.f327394a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraErrorHelper", "markCameraOpenSuccess lastOpenCameraError: " + e04.a1.f327394a);
        if (e04.a1.f327394a) {
            e04.a1.a(e04.y0.f327690f, java.lang.System.currentTimeMillis());
        }
        e04.a1.f327394a = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = e04.a1.f327396c;
        if (o4Var != null) {
            o4Var.d();
        }
        c17310x947f6bba.E(false);
    }

    public final void A() {
        this.f240934r.m68846x4095a790(this.f240941x0);
        int i17 = this.f240937u;
        if (i17 != 1 && i17 != 8) {
            if (i17 == 12) {
                this.f240934r.m68848xee562399(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9a));
            } else if (i17 == 3) {
                this.f240934r.m68848xee562399(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9e));
            } else if (i17 != 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanUIRectView", "refreshSharedMaskView unknown scan mode %d", java.lang.Integer.valueOf(i17));
            }
            post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.10
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = c17310x947f6bba.D;
                    if (c17327x39ee10a4 == null || (c17337xb9c9eb33 = c17310x947f6bba.f240934r) == null) {
                        return;
                    }
                    int m68782x45d3cfbd = c17327x39ee10a4.m68782x45d3cfbd();
                    android.view.View view = c17337xb9c9eb33.f241325i;
                    if (view == null || view.getHeight() <= 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                        return;
                    }
                    android.view.View view2 = c17337xb9c9eb33.f241325i;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                        throw null;
                    }
                    int height = m68782x45d3cfbd - view2.getHeight();
                    c17337xb9c9eb33.galleryIconBottomMarginDelta = height;
                    if (height < 0) {
                        c17337xb9c9eb33.galleryIconBottomMarginDelta = 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + c17337xb9c9eb33.galleryIconBottomMarginDelta);
                    c17337xb9c9eb33.n(c17337xb9c9eb33.f241328o);
                }
            });
        }
        if (this.f240929l1) {
            this.f240934r.m68848xee562399(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i99));
        } else {
            this.f240934r.m68848xee562399(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9f));
        }
        post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.10
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = c17310x947f6bba.D;
                if (c17327x39ee10a4 == null || (c17337xb9c9eb33 = c17310x947f6bba.f240934r) == null) {
                    return;
                }
                int m68782x45d3cfbd = c17327x39ee10a4.m68782x45d3cfbd();
                android.view.View view = c17337xb9c9eb33.f241325i;
                if (view == null || view.getHeight() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta galleryButton is not init");
                    return;
                }
                android.view.View view2 = c17337xb9c9eb33.f241325i;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                    throw null;
                }
                int height = m68782x45d3cfbd - view2.getHeight();
                c17337xb9c9eb33.galleryIconBottomMarginDelta = height;
                if (height < 0) {
                    c17337xb9c9eb33.galleryIconBottomMarginDelta = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanSharedMaskView", "updateGalleryIconBottomMarginDelta: " + c17337xb9c9eb33.galleryIconBottomMarginDelta);
                c17337xb9c9eb33.n(c17337xb9c9eb33.f241328o);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.B():void");
    }

    public final void C() {
        java.lang.Runnable runnable;
        if (this.J1 || (runnable = this.K1) == null) {
            return;
        }
        removeCallbacks(runnable);
        this.J1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.D(long, boolean):void");
    }

    public final void E(boolean z17) {
        this.f240939w = !z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u uVar = this.G;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) uVar;
            activityC17284x451cd422.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "showOpenCameraFailView show: %s", java.lang.Boolean.valueOf(z17));
            activityC17284x451cd422.f240684n.setVisibility(z17 ? 0 : 8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f240934r;
        if (c17337xb9c9eb33 != null) {
            c17337xb9c9eb33.m68850x62607a57(!z17);
            this.f240934r.m68851xe9aedf19(!z17);
        }
    }

    public void F() {
        long j17 = this.f240940x;
        if (j17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "startNewSession fail  curSession:%s, focus mode:%s", java.lang.Long.valueOf(j17), ((qt5.c) this.f296835e).d(false));
            return;
        }
        this.f240940x = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession:" + this.f240940x);
        if (!((qt5.c) this.f296835e).f448190b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession openCamera");
            g(null);
        } else if (((qt5.c) this.f296835e).f448191c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession camera is previewing");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession  focus mode %s", ((qt5.c) this.f296835e).d(false));
            k(0L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession startPreview");
            ((xy3.a) this.f296835e).r(false);
            i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.6
                @Override // qt5.l
                public void d() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed startNewSession isUIPaused: %s", java.lang.Boolean.valueOf(c17310x947f6bba.f296840m));
                    if (c17310x947f6bba.f296840m) {
                        return;
                    }
                    ((xy3.a) c17310x947f6bba.f296835e).k();
                    c17310x947f6bba.k(0L);
                }
            });
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "startNewSession focus mode %s", ((qt5.c) this.f296835e).d(false));
        }
        this.f240943y = m68700xd87a672e();
        zs5.n0.f556983a.c(this.f240940x, m68699x199578cf(), m68700xd87a672e(), this.M1);
        vz3.t.f523243a.g(this.f240940x);
    }

    public void G(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "stopCurrentSession %d, reason: %s", java.lang.Long.valueOf(this.f240940x), f1Var);
        if (this.f240940x == 0) {
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.d1 d1Var = this.f240943y;
        if (d1Var != null) {
            d1Var.f298526o = f1Var;
            d04.j jVar = this.f240933q;
            if (jVar != null) {
                d1Var.f298527p.f298480d = jVar.getF241318y();
            }
        }
        zs5.n0.f556983a.a(this.f240940x, this.f240943y);
        vz3.t.f523243a.l(this.f240940x);
        this.f240940x = 0L;
    }

    public final void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "updateScanCodeRect visibleResolution: %s", this.P);
        android.graphics.Point point = this.P;
        if (point == null || point.x <= 0 || point.y <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089 c17347xc7989089 = this.f240930p;
        android.graphics.Point point2 = this.P;
        int i17 = point2.y;
        c17347xc7989089.m68914x7b335ea7(new android.graphics.Rect(0, (int) ((i17 * 1.0f) / 19.0f), point2.x, (int) ((i17 * 17.0f) / 19.0f)));
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void a() {
        if (((qt5.c) this.f296835e).f448190b) {
            this.U = true;
            super.a();
        }
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void b() {
        this.f296835e = new xy3.a();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0093 -> B:11:0x0090). Please report as a decompilation issue!!! */
    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void d() {
        java.lang.String str;
        java.lang.String optString;
        android.view.TextureView textureView = new android.view.TextureView(getContext());
        this.f296834d = textureView;
        textureView.setSurfaceTextureListener(this);
        addView(this.f296834d, new android.widget.FrameLayout.LayoutParams(-1, -1));
        b();
        this.f296837g = getResources().getConfiguration().orientation;
        g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.9
            @Override // qt5.f
            public void a() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "init cameraOpened isOpen: %s, hasCameraPermission: %s, cameraFacing: %s", java.lang.Boolean.valueOf(((qt5.c) c17310x947f6bba.f296835e).f448190b), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.R), java.lang.Integer.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448206r));
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (c17310x947f6bba2.f296840m) {
                    return;
                }
                e04.j1 j1Var = c17310x947f6bba2.L1;
                qt5.i0 i0Var = c17310x947f6bba2.f296835e;
                j1Var.c(((qt5.c) i0Var).f448206r, ((qt5.c) i0Var).f448207s);
                if (!((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.n(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.o(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
                    uo.n.f511055a.f(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.getContext());
                }
            }
        });
        this.f240930p = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.C17347xc7989089(getContext());
        boolean z17 = true;
        if (this.f240944y0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
            if (o4Var == null || (str = o4Var.getString("scan_config_guide_wording", "")) == null) {
                str = "";
            }
            if (!(str.length() == 0)) {
                try {
                    java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanGoodsGuideWording currentLanguage: %s", d17);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, "zh_CN")) {
                        optString = jSONObject.optString("desc_chinese");
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, "en")) {
                        optString = jSONObject.optString("desc_english");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanFastFocusEngineManager", e17, "getScanGoodsGuideWording exception", new java.lang.Object[0]);
                }
                this.A = optString;
            }
            optString = null;
            this.A = optString;
        }
        if (this.f240929l1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
            java.lang.String string = o4Var2 != null ? o4Var2.getString("scan_config_scan_merge_wording", "") : null;
            if (string == null) {
                string = "";
            }
            this.B = string;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
            java.lang.String string2 = o4Var3 != null ? o4Var3.getString("scan_config_scan_retrieval_lite_succ_wording", "") : null;
            if (string2 != null && !r26.n0.N(string2)) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return default wording");
                string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "getScanMergeProductEducationWording , return tips:" + string2);
            }
            this.C = string2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "initScanTips enableScanGoodsWording: %b, scanGoodsTips: %s, scanMergeTips: %s, scanMergeProductEducationTips: %s", java.lang.Boolean.valueOf(this.f240944y0), this.A, this.B, this.C);
        addView(this.f240930p, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17330xed59b884 c17330xed59b884 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17330xed59b884(context2, null);
        this.f240934r = c17330xed59b884;
        c17330xed59b884.o();
        this.f240936t = this.f240934r.m68834x7ada8080();
        addView(this.f240934r, new android.widget.FrameLayout.LayoutParams(-1, -1));
        A();
        z(false);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void e() {
        super.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onPause");
        C();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.l();
        }
        G(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void f() {
        super.f();
        if (!((qt5.c) this.f296835e).f448190b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onResume openCamera");
            g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass1());
        } else if (((qt5.c) this.f296835e).f448191c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onResume camera is previewing");
            k(0L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onResume startPreview");
            ((xy3.a) this.f296835e).r(false);
            i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.2
                @Override // qt5.l
                public void d() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed onResume isUIPaused: %s", java.lang.Boolean.valueOf(c17310x947f6bba.f296840m));
                    if (c17310x947f6bba.f296840m) {
                        return;
                    }
                    ((xy3.a) c17310x947f6bba.f296835e).k();
                    c17310x947f6bba.k(0L);
                }
            });
        }
        if (this.f240940x == 0) {
            this.f240940x = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onResume session: %d, %s", java.lang.Long.valueOf(this.f240940x), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (q()) {
            this.f240943y = m68700xd87a672e();
            zs5.n0.f556983a.c(this.f240940x, m68699x199578cf(), this.f240943y, this.M1);
            vz3.t.f523243a.g(this.f240940x);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.n();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.3
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1 c17264x215089a1 = c17310x947f6bba.f240941x0;
                if (c17264x215089a1 == null || !c17264x215089a1.f240197f) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa.f241362l;
                    try {
                        c17339x2dbc71fa.f241364b = ((xy3.a) c17310x947f6bba.f296835e).d(true);
                        c17339x2dbc71fa.c();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCameraLightDetector", e17, "start error: %s", e17.getMessage());
                    }
                }
            }
        }, 300L);
        this.f240945y1 = true;
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void g(final qt5.f fVar) {
        if (!this.Q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "openCamera not enable and stop");
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.CAMERA")) {
            this.U = false;
            super.g(new qt5.g() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.7

                /* renamed from: a, reason: collision with root package name */
                public long f240989a = 0;

                @Override // qt5.f
                public void a() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "cameraOpened, ignoreCameraOpenedCallback: %s", java.lang.Boolean.valueOf(c17310x947f6bba.U));
                    if (c17310x947f6bba.U) {
                        return;
                    }
                    qt5.f fVar2 = fVar;
                    if (fVar2 != null) {
                        fVar2.a();
                    }
                    c17310x947f6bba.r();
                }

                @Override // qt5.g, qt5.p
                public void b(long j17) {
                    long j18 = j17 - this.f240989a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-open calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, opened: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b));
                    e04.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S;
                    if (g1Var.f327453d) {
                        return;
                    }
                    g1Var.f327453d = true;
                    g1Var.f327450a = java.lang.Boolean.TRUE;
                    g1Var.f327457h = false;
                    g1Var.f327454e = j18;
                    g1Var.f327455f = j17;
                }

                @Override // qt5.g, qt5.p
                public void c(qt5.d dVar) {
                    if (dVar == null || !dVar.f448213d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-open not called and ignore, opened: %s", java.lang.Boolean.valueOf(((qt5.c) c17310x947f6bba.f296835e).f448190b));
                        if (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b) {
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.a();
                        return;
                    }
                    boolean z17 = dVar.f448212c != null;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - this.f240989a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-open taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, opened: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    c17310x947f6bba2.S.f327476i = ((qt5.c) c17310x947f6bba2.f296835e).f448190b;
                    e04.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S;
                    g1Var.f327477j = dVar;
                    g1Var.f327456g = currentTimeMillis;
                    g1Var.f327457h = true;
                    if (z17) {
                        g1Var.f327452c = true;
                    } else {
                        g1Var.f327452c = false;
                        g1Var.f327451b = j17;
                    }
                }

                @Override // qt5.g, qt5.p
                public void e() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    e04.g1 g1Var = c17310x947f6bba.S;
                    if (g1Var.f327450a == null) {
                        g1Var.f327450a = java.lang.Boolean.FALSE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.f240989a = currentTimeMillis;
                    c17310x947f6bba.L1.f327512n = currentTimeMillis;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onCameraTaskSubmit-open");
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "openCamera not enable. no permission!");
        m68711x83c7756(false);
        r();
        if (fVar != null) {
            fVar.a();
        }
    }

    /* renamed from: getDecorRect */
    public android.graphics.Rect m68701x1edf9e33() {
        return this.f240930p.m68913x1edf9e33();
    }

    /* renamed from: getScanCamera */
    public qt5.i0 m68702x90d39bf8() {
        return this.f296835e;
    }

    /* renamed from: getScanCameraReporter */
    public e04.j1 m68703x9ba6cf9() {
        return this.L1;
    }

    /* renamed from: getScanMaskView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf m68704xc3ad4fc4() {
        return this.f240935s;
    }

    /* renamed from: getScanProductMaskDecorView */
    public d04.j m68705x9a72bb02() {
        return this.f240933q;
    }

    /* renamed from: getSharedMaskView */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 m68706xe291082c() {
        return this.f240934r;
    }

    /* renamed from: getTextrueView */
    public android.view.TextureView m68707xa0729d44() {
        return this.f296834d;
    }

    /* renamed from: getVisibleResolution */
    public android.graphics.Point m68708x6aa56608() {
        return this.P;
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void i(final qt5.l lVar) {
        super.i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.5

            /* renamed from: a, reason: collision with root package name */
            public long f240985a = 0;

            @Override // qt5.m, qt5.p
            public void b(long j17) {
                long j18 = j17 - this.f240985a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-preview calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, , previewed: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448191c));
                e04.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T;
                if (h1Var.f327453d) {
                    return;
                }
                h1Var.f327453d = true;
                h1Var.f327450a = java.lang.Boolean.TRUE;
                h1Var.f327457h = false;
                h1Var.f327454e = j18;
                h1Var.f327455f = j17;
            }

            @Override // qt5.m, qt5.p
            public void c(qt5.d dVar) {
                if (dVar == null || !dVar.f448213d) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-preview not called and ignore, previewed: %s", java.lang.Boolean.valueOf(((qt5.c) c17310x947f6bba.f296835e).f448191c));
                    if (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448191c) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T.a();
                    return;
                }
                boolean z17 = dVar.f448212c != null;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = currentTimeMillis - this.f240985a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-preview taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, previewed: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448191c));
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                c17310x947f6bba2.T.f327482i = ((qt5.c) c17310x947f6bba2.f296835e).f448191c;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                c17310x947f6bba3.T.f327483j = ((qt5.c) c17310x947f6bba3.f296835e).f448194f;
                e04.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T;
                h1Var.f327456g = currentTimeMillis;
                h1Var.f327457h = true;
                if (z17) {
                    h1Var.f327452c = true;
                } else {
                    h1Var.f327452c = false;
                    h1Var.f327451b = j17;
                }
            }

            @Override // qt5.l
            public void d() {
                int i17;
                qt5.l lVar2 = lVar;
                if (lVar2 != null) {
                    lVar2.d();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                qt5.i0 i0Var = c17310x947f6bba.f296835e;
                if (i0Var == null || !((qt5.c) i0Var).f448191c) {
                    return;
                }
                qt5.i0 i0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e;
                android.graphics.Point point = ((qt5.c) i0Var2).f448195g;
                vz3.t tVar = vz3.t.f523243a;
                int i19 = point.x;
                int i27 = point.y;
                try {
                    i17 = ((xy3.a) i0Var2).f448189a.getParameters().getPreviewFormat();
                } catch (java.lang.Throwable unused) {
                    i17 = 17;
                }
                tVar.d(i19, i27, i17, ((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448200l);
            }

            @Override // qt5.m, qt5.p
            public void e() {
                e04.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.T;
                if (h1Var.f327450a == null) {
                    h1Var.f327450a = java.lang.Boolean.FALSE;
                }
                this.f240985a = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onCameraTaskSubmit-preview");
            }
        });
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void j() {
        super.j();
        this.f240942x1 = true;
        this.f240945y1 = false;
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2
    public void k(long j17) {
        this.f240931p0 = true;
        if (this.I1) {
            e04.l2 l2Var = this.B1;
            if (l2Var != null) {
                int i17 = this.C1;
                if ((i17 == 1 ? l2Var.f327548i : false) && i17 == 1) {
                    super.k(j17);
                    this.D1 = java.lang.System.currentTimeMillis();
                    return;
                }
                return;
            }
            return;
        }
        super.k(j17);
        this.D1 = java.lang.System.currentTimeMillis();
        if (!this.f296840m && ((qt5.c) this.f296835e).f448191c && !this.H1 && this.G1 && q()) {
            removeCallbacks(this.K1);
            postDelayed(this.K1, this.E1);
            this.J1 = false;
        }
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onAutoFocus %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            this.G1 = false;
            k(0L);
        }
        c(1000);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        int i17;
        this.f296838h = 0L;
        this.H1 = true;
        e04.j1 j1Var = this.L1;
        boolean z17 = bArr != null;
        if (!j1Var.f327510l || j1Var.f327511m != z17) {
            j1Var.f327510l = true;
            j1Var.f327511m = z17;
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                long j17 = j1Var.f327499a;
                if (j17 != 0) {
                    j1Var.f327513o = currentTimeMillis - j17;
                }
                long j18 = j1Var.f327512n;
                if (j18 != 0) {
                    j1Var.f327514p = currentTimeMillis - j18;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setCameraFrameCalled: true, dataValid: " + z17 + ", firstDataFrameCost: " + j1Var.f327513o + ", firstCameraFrameCost: " + j1Var.f327514p);
        }
        C();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.D1;
        e04.j1 j1Var2 = this.L1;
        if (!j1Var2.f327516r) {
            j1Var2.f327516r = true;
            j1Var2.f327515q = currentTimeMillis2;
        }
        e04.l2 l2Var = this.B1;
        if (l2Var != null) {
            long currentTimeMillis3 = java.lang.System.currentTimeMillis() - this.D1;
            if (!l2Var.f327545f) {
                l2Var.f327545f = true;
                l2Var.f327541b = java.lang.Math.max(l2Var.f327543d, java.lang.Math.min(l2Var.f327542c, ((float) currentTimeMillis3) * l2Var.f327544e));
            }
            this.B1.f327551l = true;
        }
        if (this.f240942x1 && this.f240945y1) {
            this.f240942x1 = false;
            this.f240945y1 = false;
            y(false);
            k(100L);
            return;
        }
        if (this.A1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "onPreviewFrame ignorePreviewFrame");
            return;
        }
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "onPreviewFrame data is null");
            k(0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240453a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanReporter", "reportOnPreviewFrameDataNull");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, 1);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onPreviewFrame");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "processFrame");
        if (((qt5.c) this.f296835e).f448191c && ((xy3.a) this.f296835e).s()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa c17339x2dbc71fa = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa.f241362l;
            android.graphics.Point point = ((xy3.a) this.f296835e).f448195g;
            c17339x2dbc71fa.b(bArr, point.x, point.y);
        }
        int i18 = this.f240937u;
        if (i18 != 1 && i18 != 4 && i18 != 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "unknown scan mode %d", java.lang.Integer.valueOf(i18));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "handleCodeData");
        android.graphics.Point resolution = ((qt5.c) this.f296835e).f448195g;
        boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s1.f240553a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resolution, "resolution");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s1.f240561i = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s1.f240564l++;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s1.f240563k.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(resolution.x);
            sb6.append('_');
            sb6.append(resolution.y);
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s1.f240563k = sb6.toString();
        }
        if (this.f240940x == 0 || !((qt5.c) this.f296835e).f448191c) {
            return;
        }
        android.graphics.Point point2 = ((qt5.c) this.f296835e).f448195g;
        if (point2 != null) {
            android.graphics.Rect m68698x7f89ad84 = m68698x7f89ad84();
            if (!this.I1 || this.C1 == 1) {
                android.graphics.Rect g17 = ((xy3.a) this.f296835e).g(m68698x7f89ad84);
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
                if (abstractC17340x3097aadf != null) {
                    abstractC17340x3097aadf.m68893x2344480a(g17);
                    this.f240935s.m68896x417dac83(m68698x7f89ad84);
                    this.f240935s.m68901x463b727c(this.P);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf2 = this.f240935s;
                    if (abstractC17340x3097aadf2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf2).m68775xcaf90f93(true);
                    }
                }
                zs5.n0 n0Var = zs5.n0.f556983a;
                qt5.i0 i0Var = this.f296835e;
                int i19 = ((qt5.c) i0Var).f448200l;
                try {
                    i17 = ((xy3.a) i0Var).f448189a.getParameters().getPreviewFormat();
                } catch (java.lang.Throwable unused) {
                    i17 = 17;
                }
                int i27 = i17;
                int i28 = ((qt5.c) this.f296835e).f448200l;
                int i29 = point2.x;
                int i37 = point2.y;
                if (i28 % 180 == 0) {
                    i37 = i29;
                    i29 = i37;
                }
                float f17 = i29;
                n0Var.h(bArr, point2, i19, i27, g17, new android.graphics.Rect(0, (int) ((1.0f * f17) / 19.0f), i37, (int) ((f17 * 17.0f) / 19.0f)));
            }
        }
        if ("auto".equals(((qt5.c) this.f296835e).d(true)) || zs5.n0.f556983a.f() <= P1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "change to FOCUS_MODE_AUTO");
        ((qt5.c) this.f296835e).j("auto");
        c(100L);
    }

    @Override // com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super.onSurfaceTextureAvailable(surfaceTexture, i17, i18);
        android.graphics.Point point = this.P;
        if (point != null && i17 == point.x && i18 == point.y) {
            return;
        }
        if (point == null) {
            this.P = new android.graphics.Point(i17, i18);
        }
        if (q()) {
            H();
        }
    }

    public final void p() {
        e04.j1 j1Var = this.L1;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "checkAndReopenCamera");
            j1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setOverTimeNotFrameCallback: true");
            j1Var.f327509k = true;
            D(java.lang.System.currentTimeMillis(), false);
            j1Var.b();
            j1Var.d(true, this.B1.f327547h);
            this.S.a();
            this.T.a();
            h(new qt5.j() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.8

                /* renamed from: a, reason: collision with root package name */
                public long f240992a = 0;

                @Override // qt5.i
                public void a() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "cameraOpened, ignoreCameraOpenedCallback: %s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.U));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    if (c17310x947f6bba.U) {
                        return;
                    }
                    c17310x947f6bba.C1 = 1;
                    c17310x947f6bba.I1 = true;
                    qt5.i0 i0Var = c17310x947f6bba.f296835e;
                    if (i0Var != null) {
                        c17310x947f6bba.L1.c(((qt5.c) i0Var).f448206r, ((qt5.c) i0Var).f448207s);
                        if (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.r();
                        }
                    }
                }

                @Override // qt5.j, qt5.p
                public void b(long j17) {
                    long j18 = j17 - this.f240992a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onBeforeCameraTaskCall-reopen calledTimestamp: %s, threadScheduleCost: %s ms, updated: %s, opened: %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b));
                    e04.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S;
                    if (g1Var.f327453d) {
                        return;
                    }
                    g1Var.f327453d = true;
                    g1Var.f327450a = java.lang.Boolean.TRUE;
                    g1Var.f327457h = false;
                    g1Var.f327454e = j18;
                    g1Var.f327455f = j17;
                }

                @Override // qt5.j, qt5.p
                public void c(qt5.d dVar) {
                    if (dVar == null || !dVar.f448213d) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-reopen not called and ignore");
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.a();
                        return;
                    }
                    boolean z17 = dVar.f448212c != null;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - this.f240992a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onAfterCameraTaskCall-reopen taskExceptionOccurred: %s, current: %s, cost: %s ms, updated: %s, opened: %s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S.f327453d), java.lang.Boolean.valueOf(((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).f448190b));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    c17310x947f6bba.S.f327476i = ((qt5.c) c17310x947f6bba.f296835e).f448190b;
                    e04.g1 g1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.S;
                    g1Var.f327477j = dVar;
                    g1Var.f327456g = currentTimeMillis;
                    g1Var.f327457h = true;
                    if (z17) {
                        g1Var.f327452c = true;
                    } else {
                        g1Var.f327452c = false;
                        g1Var.f327451b = j17;
                    }
                }

                @Override // qt5.j, qt5.p
                public void e() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                    e04.g1 g1Var = c17310x947f6bba.S;
                    if (g1Var.f327450a == null) {
                        g1Var.f327450a = java.lang.Boolean.FALSE;
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.f240992a = currentTimeMillis;
                    c17310x947f6bba.L1.f327512n = currentTimeMillis;
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "checkAnReopenCamera exception", new java.lang.Object[0]);
        }
    }

    public final boolean q() {
        return e04.v3.b(this.f240937u);
    }

    public final void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onCameraOpened isUIPaused: %s", java.lang.Boolean.valueOf(this.f296840m));
        if (this.f296840m) {
            return;
        }
        ((xy3.a) this.f296835e).r(false);
        i(new qt5.m() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.4
            @Override // qt5.l
            public void d() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "cameraStartPreviewed onCameraOpened isUIPaused: %s", java.lang.Boolean.valueOf(c17310x947f6bba.f296840m));
                if (c17310x947f6bba.f296840m) {
                    return;
                }
                c17310x947f6bba.k(0L);
            }
        });
    }

    public void s() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onCreate");
        d();
        this.M = (int) (i65.a.B(getContext()) / 4.5f);
        zs5.n0.f556983a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.v2());
        setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.18

            /* renamed from: d, reason: collision with root package name */
            public float f240978d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f240979e = false;

            /* renamed from: f, reason: collision with root package name */
            public boolean f240980f = false;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                int i17;
                int i18;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (actionMasked == 0) {
                    motionEvent.getX();
                    motionEvent.getY();
                    c17310x947f6bba.L = motionEvent.getRawX();
                    c17310x947f6bba.f240928J = true;
                    this.f240979e = false;
                    this.f240980f = false;
                } else if (actionMasked == 1) {
                    motionEvent.getX();
                    motionEvent.getY();
                    if (motionEvent.getPointerCount() == 2) {
                        this.f240978d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                    }
                } else if (actionMasked != 2) {
                    if (actionMasked == 5) {
                        motionEvent.getX(actionIndex);
                        motionEvent.getY(actionIndex);
                        if (motionEvent.getPointerCount() == 2) {
                            this.f240978d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                            c17310x947f6bba.N = true;
                        }
                        this.f240979e = false;
                        this.f240980f = false;
                    } else if (actionMasked == 6) {
                        motionEvent.getX(actionIndex);
                        motionEvent.getY(actionIndex);
                        if (motionEvent.getPointerCount() == 2) {
                            this.f240978d = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                            if (this.f240979e) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 7, c17310x947f6bba.f240929l1);
                            } else if (this.f240980f) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 8, c17310x947f6bba.f240929l1);
                            }
                            this.f240979e = false;
                            this.f240980f = false;
                        }
                    }
                } else if (motionEvent.getPointerCount() == 2) {
                    motionEvent.getX(0);
                    motionEvent.getY(0);
                    motionEvent.getX(1);
                    motionEvent.getY(1);
                    float pow = (float) (java.lang.Math.pow(motionEvent.getX(0) - motionEvent.getX(1), 2.0d) + java.lang.Math.pow(motionEvent.getY(0) - motionEvent.getY(1), 2.0d));
                    if (java.lang.Math.abs(pow - this.f240978d) > 400.0f) {
                        if (c17310x947f6bba.W) {
                            c17310x947f6bba.W = false;
                        }
                        if (pow - this.f240978d > 0.0f) {
                            ((qt5.c) c17310x947f6bba.f296835e).o(2);
                            this.f240979e = true;
                        } else {
                            ((qt5.c) c17310x947f6bba.f296835e).o(3);
                            this.f240980f = true;
                        }
                        this.f240978d = pow;
                    }
                } else if (motionEvent.getPointerCount() == 1 && c17310x947f6bba.I && !c17310x947f6bba.N) {
                    float rawX = motionEvent.getRawX() - c17310x947f6bba.L;
                    boolean z17 = c17310x947f6bba.f240928J;
                    if (rawX >= c17310x947f6bba.M && z17) {
                        d04.y2 y2Var = c17310x947f6bba.H;
                        if (y2Var != null && y2Var.f307098d - 1 >= 0 && i18 < y2Var.f307097c.size()) {
                            y2Var.f307098d = i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = y2Var.f307096b;
                            if (c17336x6a4658b0 != null) {
                                c17336x6a4658b0.h(i18, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    } else if (rawX <= (-r5) && z17) {
                        d04.y2 y2Var2 = c17310x947f6bba.H;
                        if (y2Var2 != null && (i17 = y2Var2.f307098d + 1) >= 0 && i17 < y2Var2.f307097c.size()) {
                            y2Var2.f307098d = i17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b02 = y2Var2.f307096b;
                            if (c17336x6a4658b02 != null) {
                                c17336x6a4658b02.h(i17, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    }
                }
                android.view.GestureDetector gestureDetector = c17310x947f6bba.O1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(motionEvent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
                if (motionEvent.getAction() == 1) {
                    c17310x947f6bba.N = false;
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return true;
            }
        });
        this.N1.mo48813x58998cd();
        e04.l2 l2Var = this.B1;
        if (l2Var != null) {
            l2Var.f327549j = java.lang.System.currentTimeMillis();
        }
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) this.G).B;
        e04.j1 j1Var = this.L1;
        j1Var.f327499a = j17;
        j1Var.f327500b = java.lang.System.currentTimeMillis();
    }

    /* renamed from: setActivity */
    public void m68709x13de9191(android.app.Activity activity) {
    }

    /* renamed from: setBottomExtraHeight */
    public void m68710x40a2edea(int i17) {
        this.K = i17;
    }

    /* renamed from: setCameraPermission */
    public void m68711x83c7756(boolean z17) {
        this.R = z17;
        e04.j1 j1Var = this.L1;
        j1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setCameraPermission: " + z17);
        j1Var.f327503e = z17;
    }

    /* renamed from: setDecodeSuccessFrameData */
    public void m68712x86db0f04(com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.mo68771x86db0f04(c25308xdf65b80c);
        }
    }

    /* renamed from: setDecorRect */
    public void m68713x7b335ea7(android.graphics.Rect rect) {
        this.f240930p.m68914x7b335ea7(rect);
    }

    /* renamed from: setDisableScanProductInMergeMode */
    public void m68714x3822170a(boolean z17) {
        this.f240932p1 = z17;
    }

    /* renamed from: setEnableOpenCamera */
    public void m68715x3644ac74(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "setEnableOpenCamera: %b", java.lang.Boolean.valueOf(z17));
        this.Q = z17;
    }

    /* renamed from: setEnableScanCodeProductMerge */
    public void m68716xd247d7d8(boolean z17) {
        this.f240929l1 = z17;
    }

    /* renamed from: setEnableScanGoodsDynamicWording */
    public void m68717x425f184d(boolean z17) {
        this.f240944y0 = z17;
    }

    /* renamed from: setEnableScrollSwitchTab */
    public void m68718x4fde642f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "setEnableScrollSwitchTab: %b", java.lang.Boolean.valueOf(z17));
        this.I = z17;
    }

    /* renamed from: setFlashStatus */
    public void m68719xbc26b240(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f240934r;
        if (c17337xb9c9eb33 != null) {
            c17337xb9c9eb33.m68842xbc26b240(z17);
        }
    }

    /* renamed from: setIgnorePreviewFrame */
    public void m68720x72cfd79(boolean z17) {
        this.A1 = z17;
    }

    /* renamed from: setMyQrCodeVisible */
    public void m68721x4d5915d6(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf).m68774x77fcf44(z17);
        }
    }

    /* renamed from: setNetworkAvailable */
    public void m68722xedbee0bd(boolean z17) {
    }

    /* renamed from: setOnSingleTapListener */
    public void m68723xb7b2242e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.OnSingleTapListener onSingleTapListener) {
    }

    /* renamed from: setRequestCameraPermission */
    public void m68724xf86a00c1(boolean z17) {
        e04.j1 j1Var = this.L1;
        j1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCameraReporter", "setHasRequestCameraPermission: " + z17);
        j1Var.f327504f = z17;
    }

    /* renamed from: setScanCallback */
    public void m68725xdf4c0b64(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.ScanCallBack scanCallBack) {
        this.f240946z = scanCallBack;
    }

    /* renamed from: setScanMode */
    public void m68726x417b8c42(int i17) {
        this.f240937u = i17;
    }

    /* renamed from: setScanProductCallback */
    public void m68727x4e821655(d04.h hVar) {
        this.E = hVar;
    }

    /* renamed from: setScanProductOnItemClickListener */
    public void m68728x1558ddda(d04.i iVar) {
        this.F = iVar;
    }

    /* renamed from: setScanRequest */
    public void m68729x4095a790(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1 c17264x215089a1) {
        this.f240941x0 = c17264x215089a1;
    }

    /* renamed from: setScanSource */
    public void m68730xdb0e8efa(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.m68897xdb0e8efa(i17);
        }
    }

    /* renamed from: setScrollTabController */
    public void m68731xc4196382(d04.y2 y2Var) {
        this.H = y2Var;
    }

    /* renamed from: setShowScanTips */
    public void m68732x2f5f86f4(boolean z17) {
        this.f240938v = z17;
    }

    /* renamed from: setSuccessMarkClickListener */
    public void m68733x9ee9454e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2 i2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf).m68778x9ee9454e(i2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0201, code lost:
    
        if (r2 >= 3000) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0203, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0210, code lost:
    
        if ((r6 - r10) >= 3000) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.t():void");
    }

    public final void u(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.r1 r1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.m(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f240934r;
        if (c17337xb9c9eb33 != null) {
            android.view.View view = c17337xb9c9eb33.f241325i;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                throw null;
            }
            view.getAlpha();
            if (!z17) {
                android.view.View view2 = c17337xb9c9eb33.f241325i;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                    throw null;
                }
                if (view2.getVisibility() == 0) {
                    android.view.View view3 = c17337xb9c9eb33.f241325i;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                        throw null;
                    }
                    if (view3.getAlpha() < 1.0f) {
                        android.view.View view4 = c17337xb9c9eb33.f241325i;
                        if (view4 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                            throw null;
                        }
                        e04.i3.a(view4, 0.0f, 1.0f, 200L, null);
                    }
                }
            }
            android.view.View view5 = c17337xb9c9eb33.f241325i;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                throw null;
            }
            view5.setEnabled(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.u uVar = this.G;
        if (uVar != null && (r1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) uVar).X) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17328xd29825bc c17328xd29825bc = r1Var.f240536d;
            if (c17328xd29825bc != null) {
                c17328xd29825bc.getVisibility();
                c17328xd29825bc.setVisibility(8);
                c17328xd29825bc.f241251y = true;
            }
            if (r1Var.f240539g == 4) {
                java.lang.String str = r1Var.f240540h;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = zs5.h0.f556935a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeNotRecognizeHelper", "[scanDecode] markCodeNotRecognizeTemp:" + str);
                if (!(str == null || str.length() == 0)) {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0 h0Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.h0.f298581b;
                    e04.f2 f2Var = e04.f2.f327458a;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNoRecognizeDuration:");
                    e04.f2 f2Var2 = e04.f2.f327458a;
                    jz5.g gVar = e04.f2.f327468k;
                    sb6.append(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanDebugUtil", sb6.toString());
                    h0Var.d(str, ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
                }
            }
            r1Var.f240539g = 0;
            r1Var.f240540h = "";
        }
        d04.y2 y2Var = this.H;
        if (y2Var != null) {
            y2Var.a(true);
        }
    }

    public void v(final java.lang.Object obj, final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0 w0Var, boolean z17, final boolean z18) {
        if (!z17) {
            w(obj, w0Var, z18);
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.13
            @Override // java.lang.Runnable
            public void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.w(obj, w0Var, z18);
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
    }

    public final void w(java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0 w0Var, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onScanSuccess");
        C();
        G(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DEFAULT);
        e();
        j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = this.f240935s;
        if (abstractC17340x3097aadf != null) {
            abstractC17340x3097aadf.o(obj, w0Var);
            this.f240935s.i(this.f296834d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f240934r;
        if (c17337xb9c9eb33 != null) {
            if (z17) {
                android.view.View view = c17337xb9c9eb33.f241325i;
                if (view == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                    throw null;
                }
                view.setEnabled(false);
                android.view.View view2 = c17337xb9c9eb33.f241325i;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("galleryButton");
                    throw null;
                }
                e04.i3.a(view2, 1.0f, 0.0f, 200L, null);
            }
            e04.c3 c3Var = c17337xb9c9eb33.f241335v;
            if (c3Var != null) {
                c3Var.a();
            }
            e04.c3 c3Var2 = c17337xb9c9eb33.f241334u;
            if (c3Var2 != null) {
                c3Var2.a();
            }
            android.widget.TextView textView = c17337xb9c9eb33.f241321e;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTitle");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.TextView textView2 = c17337xb9c9eb33.f241323g;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanToast");
                throw null;
            }
            textView2.setVisibility(8);
            c17337xb9c9eb33.f241336w = false;
            c17337xb9c9eb33.f241337x = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17315x949fc5b3 c17315x949fc5b3 = c17337xb9c9eb33.f241324h;
            if (c17315x949fc5b3 != null) {
                c17315x949fc5b3.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("flashSwitcher");
                throw null;
            }
        }
    }

    public void x() {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "onStop");
        a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2046x36f002.C17339x2dbc71fa.f241362l.d();
        uo.n.f511055a.b();
        D(java.lang.System.currentTimeMillis(), true);
    }

    public void y(final boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.a(this.f240937u);
        if (this.f240937u == 12) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240453a.e(12);
        }
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            u(z17);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.14
                @Override // java.lang.Runnable
                public void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.u(z17);
                }
            });
        }
    }

    public void z(boolean z17) {
        int i17;
        java.lang.String str = "";
        if (this.f240938v) {
            if (this.f240929l1 && ((i17 = this.f240937u) == 1 || i17 == 4 || i17 == 8)) {
                str = (!z17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) ? !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B) ? this.B : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i97) : this.C;
            } else {
                int i18 = this.f240937u;
                if (i18 == 1) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ian);
                } else if (i18 == 8) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ho8);
                } else if (i18 == 12) {
                    str = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A) ? this.A : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i9t);
                } else if (i18 == 3) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iay);
                } else if (i18 == 4) {
                    str = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ho9);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "refreshScanTips:" + str);
        this.f240934r.m68847x417ea5d7(str);
    }

    public C17310x947f6bba(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240937u = 1;
        this.f240938v = true;
        this.f240939w = true;
        this.f240943y = null;
        this.I = true;
        this.f240928J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f240931p0 = false;
        this.f240944y0 = false;
        this.f240929l1 = false;
        this.f240932p1 = false;
        this.f240942x1 = false;
        this.f240945y1 = false;
        this.f240947z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f327541b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f240940x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                                if (c17310x947f6bba.W && ((qt5.c) c17310x947f6bba.f296835e).f448191c) {
                                    ((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).p((int) (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f556917q++;
                                    g0Var.f556918r = f17 * g0Var.f556918r;
                                    g0Var.f556919s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f556983a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                n0Var.d(c17310x947f6bba.f240940x, c17310x947f6bba.f240943y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                c17310x947f6bba.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15 anonymousClass15 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        long j18 = c17310x947f6bba2.f240940x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = c17310x947f6bba2.L1;
                        j1Var.f327517s = true;
                        j1Var.f327518t = currentTimeMillis - j1Var.f327499a;
                        e04.i1 i1Var = e04.i1.f327491f;
                        i1Var.toString();
                        j1Var.f327519u = i1Var;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DECODE_SUCCESS;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        c17310x947f6bba3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i17 = 0;
                        while (it.hasNext()) {
                            if (((com.p314xaae8f345.p2891x34da02.C25303x87b156a3) it.next()) != null) {
                                i17++;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i17));
                        final android.os.Bundle bundle22 = new android.os.Bundle();
                        bundle22.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle22.putInt("result_code_point_count", i17);
                        if (c17310x947f6bba3.m68698x7f89ad84() != null) {
                            bundle22.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle22.putAll(bundle3);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = c17310x947f6bba3.f240935s;
                        if (abstractC17340x3097aadf != null && (abstractC17340x3097aadf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf).Q.cancel();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.ScanCallBack scanCallBack = c17310x947f6bba3.f240946z;
                        if (scanCallBack != null) {
                            final long j272 = c17310x947f6bba3.f240940x;
                            final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9) scanCallBack;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                            if (!activityC17284x451cd422.U) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(activityC17284x451cd422.C));
                                return;
                            }
                            if (activityC17284x451cd422.f240692t != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - activityC17284x451cd422.A));
                                final java.util.ArrayList parcelableArrayList2 = bundle22.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList2 == null || parcelableArrayList2.size() <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i182 = bundle22.getInt("result_code_point_count", 0);
                                long j28 = bundle22.getLong("decode_success_cost_time", 0L);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.r(activityC17284x451cd422.C, true, activityC17284x451cd422.f240700y0 ? 3 : 1, i182);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(1, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.D(activityC17284x451cd422.C);
                                activityC17284x451cd422.k7(true, i182 > 1);
                                activityC17284x451cd422.p7(false);
                                int i19 = activityC17284x451cd422.C;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2(parcelableArrayList2, j28);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k = d2Var;
                                try {
                                    java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.d(i19);
                                    d2Var.f240401c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.c(i19);
                                        d2Var2.f240402d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var3 != null) {
                                        d2Var3.f240403e = java.lang.Long.parseLong(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var4 != null) {
                                        d2Var4.f240404f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = activityC17284x451cd422.f240678f.f240998g;
                                final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e802 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) parcelableArrayList2.get(0);
                                if (c25311x69ff7e802 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab2 = (com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab) bundle22.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e802, parcelableArrayList2.size() <= 1, c25309x51dbc9ab2)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.q(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c25311x69ff7e802.f556864e)) ? 1 : 2, 1, activityC17284x451cd422.D1, activityC17284x451cd422.S);
                                bundle22.putInt("qbar_string_scan_source", 0);
                                if (i182 <= 0 || activityC17284x451cd422.f240677e == null) {
                                    activityC17284x451cd422.p7(true);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e802, true, c25309x51dbc9ab2)) {
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd422, j272, bundle22, c25311x69ff7e802);
                                    return;
                                }
                                com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c = (com.p314xaae8f345.p2891x34da02.C25308xdf65b80c) bundle22.getParcelable("decode_success_frame_data");
                                if (c25308xdf65b80c != null) {
                                    activityC17284x451cd422.f240677e.m68712x86db0f04(c25308xdf65b80c);
                                }
                                activityC17284x451cd422.f240698x1 = i182 > 1;
                                activityC17284x451cd422.M1 = null;
                                if (i182 > 1) {
                                    activityC17284x451cd422.f240686p.a(false);
                                    activityC17284x451cd422.f240686p.b(true, null);
                                    activityC17284x451cd422.r7(false);
                                }
                                activityC17284x451cd422.T = true;
                                activityC17284x451cd422.f240677e.m68733x9ee9454e(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f240805a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f240806b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240807c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f240808d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f240809e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList22, final int i1822, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab22, final long j2722, final android.os.Bundle bundle222) {
                                        r2 = parcelableArrayList22;
                                        r3 = i1822;
                                        r4 = c25309x51dbc9ab22;
                                        r5 = j2722;
                                        r7 = bundle222;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2
                                    public void a(int i27, android.view.View view) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e8022 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) arrayList2.get(i27);
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab22 = r4;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e8022, true, c25309x51dbc9ab22)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd4222, r5, r7, c25311x69ff7e8022);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(2, i27, activityC17284x451cd4222.f240700y0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, !com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240462j ? 63 : 83);
                                    }
                                });
                                activityC17284x451cd422.Y6(2);
                                activityC17284x451cd422.s7(false, false);
                                activityC17284x451cd422.h7();
                                activityC17284x451cd422.f240677e.v(parcelableArrayList22, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f240811a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f240812b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 f240813c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240814d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f240815e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f240816f;

                                    public AnonymousClass2(final int i1822, final java.util.ArrayList parcelableArrayList22, final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e8022, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab22, final long j2722, final android.os.Bundle bundle222) {
                                        r2 = i1822;
                                        r3 = parcelableArrayList22;
                                        r4 = c25311x69ff7e8022;
                                        r5 = c25309x51dbc9ab22;
                                        r6 = j2722;
                                        r8 = bundle222;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void b(boolean z18) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240694v.a(false);
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        activityC17284x451cd4222.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab22 = r5;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e8022 = r4;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e8022, true, c25309x51dbc9ab22)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this, r6, r8, c25311x69ff7e8022);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(1, 0, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240700y0);
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (j17 != c17310x947f6bba.f240940x || j17 == 0) {
                    return;
                }
                c17310x947f6bba.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (!c17310x947f6bba.f240929l1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (c17310x947f6bba.f240932p1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) c17310x947f6bba.f296835e).f448190b) {
                        qt5.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e;
                        android.graphics.Point point = ((qt5.c) i0Var).f448195g;
                        vz3.t.f523243a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f448200l, ((xy3.a) i0Var).f448189a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.f39173x3fe91575 = 208336003;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273 c5966x180c3273) {
                int i17 = c5966x180c3273.f136263g.f89566a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (i17 == 1) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar = (xy3.a) c17310x947f6bba.f296835e;
                    if (!aVar.f448201m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar2 = (xy3.a) c17310x947f6bba.f296835e;
                    if (aVar2.f448201m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                qt5.i0 i0Var = c17310x947f6bba.f296835e;
                if (((xy3.a) i0Var).f448203o != ((xy3.a) i0Var).f448204p) {
                    ((xy3.a) i0Var).o(1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 6, c17310x947f6bba.f240929l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 5, c17310x947f6bba.f240929l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i17;
                int i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.f240928J;
                boolean z18 = c17310x947f6bba.I;
                if (!c17310x947f6bba.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var = c17310x947f6bba.H;
                        if (y2Var != null && (i18 = y2Var.f307098d + 1) >= 0 && i18 < y2Var.f307097c.size()) {
                            y2Var.f307098d = i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = y2Var.f307096b;
                            if (c17336x6a4658b0 != null) {
                                c17336x6a4658b0.h(i18, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    } else if (f17 > 1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var2 = c17310x947f6bba.H;
                        if (y2Var2 != null && y2Var2.f307098d - 1 >= 0 && i17 < y2Var2.f307097c.size()) {
                            y2Var2.f307098d = i17;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b02 = y2Var2.f307096b;
                            if (c17336x6a4658b02 != null) {
                                c17336x6a4658b02.h(i17, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.N;
                if (c17310x947f6bba.N) {
                    return true;
                }
                c17310x947f6bba.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }

    public C17310x947f6bba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f240937u = 1;
        this.f240938v = true;
        this.f240939w = true;
        this.f240943y = null;
        this.I = true;
        this.f240928J = false;
        this.K = 0;
        this.M = 120;
        this.N = false;
        this.P = null;
        this.Q = true;
        this.R = true;
        this.S = new e04.g1();
        this.T = new e04.h1();
        this.U = false;
        this.V = 0;
        this.W = true;
        this.f240931p0 = false;
        this.f240944y0 = false;
        this.f240929l1 = false;
        this.f240932p1 = false;
        this.f240942x1 = false;
        this.f240945y1 = false;
        this.f240947z1 = true;
        this.A1 = false;
        e04.l2 l2Var = new e04.l2();
        this.B1 = l2Var;
        this.C1 = 0;
        this.D1 = 0L;
        this.E1 = l2Var.f327541b;
        this.F1 = false;
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this);
            }
        };
        this.L1 = new e04.j1();
        this.M1 = new at5.b() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15
            @Override // at5.b
            public void a(final long j17, final android.os.Bundle bundle) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.3
                    @Override // java.lang.Runnable
                    public void run() {
                        android.os.Bundle bundle2;
                        try {
                            long j18 = j17;
                            if (j18 != com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f240940x || j18 == 0 || (bundle2 = bundle) == null || !bundle2.containsKey("param_zoom_ratio")) {
                                return;
                            }
                            float f17 = bundle.getFloat("param_zoom_ratio", 0.0f);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "zoom to scale %f", java.lang.Float.valueOf(f17));
                            if (f17 > 0.0f) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                                if (c17310x947f6bba.W && ((qt5.c) c17310x947f6bba.f296835e).f448191c) {
                                    ((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).p((int) (((qt5.c) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e).c() * f17));
                                    zs5.g0 g0Var = zs5.g0.F;
                                    g0Var.f556917q++;
                                    g0Var.f556918r = f17 * g0Var.f556918r;
                                    g0Var.f556919s = java.lang.System.currentTimeMillis() - 0;
                                }
                            }
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "zoomToScale exception", new java.lang.Object[0]);
                        }
                    }
                });
            }

            @Override // at5.b
            public void b(final long j17, final java.util.List list, final java.util.List list2, java.util.List list3, final android.os.Bundle bundle) {
                java.lang.String.format("scan code after decode %d", java.lang.Long.valueOf(j17));
                final long currentTimeMillis = java.lang.System.currentTimeMillis();
                zs5.n0 n0Var = zs5.n0.f556983a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                n0Var.d(c17310x947f6bba.f240940x, c17310x947f6bba.f240943y);
                if (list == null || list.isEmpty()) {
                    return;
                }
                c17310x947f6bba.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.15.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15 anonymousClass15 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.AnonymousClass15.this;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        long j18 = c17310x947f6bba2.f240940x;
                        long j19 = j17;
                        if (j18 != j19 || j19 == 0) {
                            return;
                        }
                        e04.j1 j1Var = c17310x947f6bba2.L1;
                        j1Var.f327517s = true;
                        j1Var.f327518t = currentTimeMillis - j1Var.f327499a;
                        e04.i1 i1Var = e04.i1.f327491f;
                        i1Var.toString();
                        j1Var.f327519u = i1Var;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1 f1Var = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.f1.DECODE_SUCCESS;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                        c17310x947f6bba3.G(f1Var);
                        java.util.List list4 = list;
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list4);
                        java.util.Iterator it = list2.iterator();
                        int i172 = 0;
                        while (it.hasNext()) {
                            if (((com.p314xaae8f345.p2891x34da02.C25303x87b156a3) it.next()) != null) {
                                i172++;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUIRectView", "onDecodeSuccess result size: %d, codePointCount: %d", java.lang.Integer.valueOf(list4.size()), java.lang.Integer.valueOf(i172));
                        final android.os.Bundle bundle222 = new android.os.Bundle();
                        bundle222.putParcelableArrayList("result_qbar_result_list", arrayList);
                        bundle222.putInt("result_code_point_count", i172);
                        if (c17310x947f6bba3.m68698x7f89ad84() != null) {
                            bundle222.putFloatArray("result_code_image_rect", new float[]{r9.left, r9.top, r9.right, r9.bottom});
                        }
                        android.os.Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle222.putAll(bundle3);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.AbstractC17340x3097aadf abstractC17340x3097aadf = c17310x947f6bba3.f240935s;
                        if (abstractC17340x3097aadf != null && (abstractC17340x3097aadf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb)) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb) abstractC17340x3097aadf).Q.cancel();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.ScanCallBack scanCallBack = c17310x947f6bba3.f240946z;
                        if (scanCallBack != null) {
                            final long j2722 = c17310x947f6bba3.f240940x;
                            final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9) scanCallBack;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd422 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                            if (!activityC17284x451cd422.U) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess can not process code result currentMode: %d", java.lang.Integer.valueOf(activityC17284x451cd422.C));
                                return;
                            }
                            if (activityC17284x451cd422.f240692t != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "scan code cost time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - activityC17284x451cd422.A));
                                final java.util.ArrayList parcelableArrayList22 = bundle222.getParcelableArrayList("result_qbar_result_list");
                                if (parcelableArrayList22 == null || parcelableArrayList22.size() <= 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "onScanSuccess qbarResult invalid");
                                    return;
                                }
                                final int i1822 = bundle222.getInt("result_code_point_count", 0);
                                long j28 = bundle222.getLong("decode_success_cost_time", 0L);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.r(activityC17284x451cd422.C, true, activityC17284x451cd422.f240700y0 ? 3 : 1, i1822);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(1, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.D(activityC17284x451cd422.C);
                                activityC17284x451cd422.k7(true, i1822 > 1);
                                activityC17284x451cd422.p7(false);
                                int i19 = activityC17284x451cd422.C;
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2(parcelableArrayList22, j28);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k = d2Var;
                                try {
                                    java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.d(i19);
                                    d2Var.f240401c = d17 != null ? java.lang.Long.parseLong(d17) : java.lang.System.currentTimeMillis();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var2 != null) {
                                        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.c(i19);
                                        d2Var2.f240402d = c17 != null ? java.lang.Long.parseLong(c17) : java.lang.System.currentTimeMillis();
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var3 != null) {
                                        d2Var3.f240403e = java.lang.Long.parseLong(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240454b);
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d2 d2Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240463k;
                                    if (d2Var4 != null) {
                                        d2Var4.f240404f = java.lang.System.currentTimeMillis();
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                boolean z17 = activityC17284x451cd422.f240678f.f240998g;
                                final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e8022 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) parcelableArrayList22.get(0);
                                if (c25311x69ff7e8022 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "firstQBarResult is null");
                                    return;
                                }
                                final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab22 = (com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab) bundle222.getParcelable("ScanIdentifyReportInfo.DecodeKey");
                                if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e8022, parcelableArrayList22.size() <= 1, c25309x51dbc9ab22)) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUI", "scan code has deal with");
                                    return;
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.q(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c25311x69ff7e8022.f556864e)) ? 1 : 2, 1, activityC17284x451cd422.D1, activityC17284x451cd422.S);
                                bundle222.putInt("qbar_string_scan_source", 0);
                                if (i1822 <= 0 || activityC17284x451cd422.f240677e == null) {
                                    activityC17284x451cd422.p7(true);
                                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd422, c25311x69ff7e8022, true, c25309x51dbc9ab22)) {
                                        return;
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd422, j2722, bundle222, c25311x69ff7e8022);
                                    return;
                                }
                                com.p314xaae8f345.p2891x34da02.C25308xdf65b80c c25308xdf65b80c = (com.p314xaae8f345.p2891x34da02.C25308xdf65b80c) bundle222.getParcelable("decode_success_frame_data");
                                if (c25308xdf65b80c != null) {
                                    activityC17284x451cd422.f240677e.m68712x86db0f04(c25308xdf65b80c);
                                }
                                activityC17284x451cd422.f240698x1 = i1822 > 1;
                                activityC17284x451cd422.M1 = null;
                                if (i1822 > 1) {
                                    activityC17284x451cd422.f240686p.a(false);
                                    activityC17284x451cd422.f240686p.b(true, null);
                                    activityC17284x451cd422.r7(false);
                                }
                                activityC17284x451cd422.T = true;
                                activityC17284x451cd422.f240677e.m68733x9ee9454e(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.1

                                    /* renamed from: a */
                                    public final /* synthetic */ java.util.ArrayList f240805a;

                                    /* renamed from: b */
                                    public final /* synthetic */ int f240806b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240807c;

                                    /* renamed from: d */
                                    public final /* synthetic */ long f240808d;

                                    /* renamed from: e */
                                    public final /* synthetic */ android.os.Bundle f240809e;

                                    public AnonymousClass1(final java.util.ArrayList parcelableArrayList222, final int i18222, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab222, final long j27222, final android.os.Bundle bundle2222) {
                                        r2 = parcelableArrayList222;
                                        r3 = i18222;
                                        r4 = c25309x51dbc9ab222;
                                        r5 = j27222;
                                        r7 = bundle2222;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i2
                                    public void a(int i27, android.view.View view) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanUI", "onScanSuccess onClick mark index: %d", java.lang.Integer.valueOf(i27));
                                        java.util.ArrayList arrayList2 = r2;
                                        if (i27 >= arrayList2.size() || r3 <= 1) {
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80222 = (com.p314xaae8f345.p2891x34da02.C25311x69ff7e80) arrayList2.get(i27);
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab222 = r4;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e80222, true, c25309x51dbc9ab222)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(activityC17284x451cd4222, r5, r7, c25311x69ff7e80222);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(2, i27, activityC17284x451cd4222.f240700y0);
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1259, !com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240462j ? 63 : 83);
                                    }
                                });
                                activityC17284x451cd422.Y6(2);
                                activityC17284x451cd422.s7(false, false);
                                activityC17284x451cd422.h7();
                                activityC17284x451cd422.f240677e.v(parcelableArrayList222, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0() { // from class: com.tencent.mm.plugin.scanner.ui.BaseScanUI.9.2

                                    /* renamed from: a */
                                    public final /* synthetic */ int f240811a;

                                    /* renamed from: b */
                                    public final /* synthetic */ java.util.ArrayList f240812b;

                                    /* renamed from: c */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 f240813c;

                                    /* renamed from: d */
                                    public final /* synthetic */ com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f240814d;

                                    /* renamed from: e */
                                    public final /* synthetic */ long f240815e;

                                    /* renamed from: f */
                                    public final /* synthetic */ android.os.Bundle f240816f;

                                    public AnonymousClass2(final int i18222, final java.util.ArrayList parcelableArrayList222, final com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80222, final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab222, final long j27222, final android.os.Bundle bundle2222) {
                                        r2 = i18222;
                                        r3 = parcelableArrayList222;
                                        r4 = c25311x69ff7e80222;
                                        r5 = c25309x51dbc9ab222;
                                        r6 = j27222;
                                        r8 = bundle2222;
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void b(boolean z18) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9 anonymousClass92 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.AnonymousClass9.this;
                                        if (!z18 && r2 != 1 && r3.size() != 1) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240694v.a(false);
                                            return;
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 activityC17284x451cd4222 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this;
                                        activityC17284x451cd4222.T = false;
                                        com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab222 = r5;
                                        com.p314xaae8f345.p2891x34da02.C25311x69ff7e80 c25311x69ff7e80222 = r4;
                                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.V6(activityC17284x451cd4222, c25311x69ff7e80222, true, c25309x51dbc9ab222)) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.W6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this, r6, r8, c25311x69ff7e80222);
                                        }
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.n(1, 0, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422.this.f240700y0);
                                    }

                                    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.w0
                                    public void c() {
                                    }
                                }, z17, true);
                            }
                        }
                    }
                });
            }

            @Override // at5.b
            public void c(long j17, long j18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (j17 != c17310x947f6bba.f240940x || j17 == 0) {
                    return;
                }
                c17310x947f6bba.k(j18);
            }

            @Override // at5.b
            public void d(byte[] bArr, com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y yVar) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (!c17310x947f6bba.f240929l1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "enableScanCodeProductMerge false, return");
                    return;
                }
                if (c17310x947f6bba.f240932p1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanUIRectView", "disableScanProductInMergeMode true, return");
                    return;
                }
                try {
                    if (((qt5.c) c17310x947f6bba.f296835e).f448190b) {
                        qt5.i0 i0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this.f296835e;
                        android.graphics.Point point = ((qt5.c) i0Var).f448195g;
                        vz3.t.f523243a.k(yVar, new tz3.d(bArr, point.x, point.y, ((qt5.c) i0Var).f448200l, ((xy3.a) i0Var).f448189a.getParameters().getPreviewFormat(), true));
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanUIRectView", e17, "", new java.lang.Object[0]);
                }
            }
        };
        this.N1 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.16
            {
                this.f39173x3fe91575 = 208336003;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5966x180c3273 c5966x180c3273) {
                int i172 = c5966x180c3273.f136263g.f89566a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                if (i172 == 1) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar = (xy3.a) c17310x947f6bba.f296835e;
                    if (!aVar.f448201m) {
                        aVar.t();
                    }
                } else {
                    int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                    xy3.a aVar2 = (xy3.a) c17310x947f6bba.f296835e;
                    if (aVar2.f448201m) {
                        aVar2.q();
                    }
                }
                return true;
            }
        };
        this.O1 = new android.view.GestureDetector(new android.view.GestureDetector.SimpleOnGestureListener() { // from class: com.tencent.mm.plugin.scanner.ui.ScanUIRectView.17
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
            public boolean onContextClick(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onContextClick = super.onContextClick(motionEvent);
                yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
                return onContextClick;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
                motionEvent.getActionIndex();
                motionEvent.getX(motionEvent.getActionIndex());
                motionEvent.getY(motionEvent.getActionIndex());
                int i172 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.P1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                qt5.i0 i0Var = c17310x947f6bba.f296835e;
                if (((xy3.a) i0Var).f448203o != ((xy3.a) i0Var).f448204p) {
                    ((xy3.a) i0Var).o(1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 6, c17310x947f6bba.f240929l1);
                } else {
                    ((xy3.a) i0Var).o(4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.z(c17310x947f6bba.f240937u, 5, c17310x947f6bba.f240929l1);
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
                int i172;
                int i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.f240928J;
                boolean z18 = c17310x947f6bba.I;
                if (!c17310x947f6bba.N && z18 && java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
                    if (f17 < -1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var = c17310x947f6bba.H;
                        if (y2Var != null && (i18 = y2Var.f307098d + 1) >= 0 && i18 < y2Var.f307097c.size()) {
                            y2Var.f307098d = i18;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b0 = y2Var.f307096b;
                            if (c17336x6a4658b0 != null) {
                                c17336x6a4658b0.h(i18, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    } else if (f17 > 1200.0f && c17310x947f6bba.f240928J) {
                        d04.y2 y2Var2 = c17310x947f6bba.H;
                        if (y2Var2 != null && y2Var2.f307098d - 1 >= 0 && i172 < y2Var2.f307097c.size()) {
                            y2Var2.f307098d = i172;
                            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17336x6a4658b0 c17336x6a4658b02 = y2Var2.f307096b;
                            if (c17336x6a4658b02 != null) {
                                c17336x6a4658b02.h(i172, 3);
                            }
                        }
                        c17310x947f6bba.f240928J = false;
                    }
                }
                return super.onFling(motionEvent, motionEvent2, f17, f18);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
                super.onLongPress(motionEvent);
                yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba c17310x947f6bba = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.C17310x947f6bba.this;
                boolean z17 = c17310x947f6bba.N;
                if (c17310x947f6bba.N) {
                    return true;
                }
                c17310x947f6bba.getClass();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(motionEvent);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
                boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
                yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/scanner/ui/ScanUIRectView$17", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return onSingleTapUp;
            }
        });
    }
}
