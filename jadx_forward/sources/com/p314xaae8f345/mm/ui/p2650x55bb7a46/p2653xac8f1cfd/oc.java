package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.u0.class)
/* loaded from: classes12.dex */
public class oc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.u0, k70.w, y60.e {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f281168h;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f281169e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f281170f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k4 f281171g;

    public oc() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f281169e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GetImageComponent$1
            {
                this.f39173x3fe91575 = -1102125916;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94 c5245x7a3faa94) {
                am.j2 j2Var;
                boolean z17;
                boolean z18;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006;
                android.view.View D;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94 c5245x7a3faa942 = c5245x7a3faa94;
                if (c5245x7a3faa942 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5245x7a3faa94) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = c5245x7a3faa942.f135577g.f88428a;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oc ocVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oc.this;
                    if (f9Var == null) {
                        ocVar.getClass();
                    } else {
                        int mo75757x2ce24761 = ocVar.f280113d.p().mo75757x2ce24761();
                        int mo75762xe81a1f0f = ocVar.f280113d.p().mo75762xe81a1f0f();
                        int max = java.lang.Math.max(mo75757x2ce24761, 0);
                        int max2 = java.lang.Math.max(mo75762xe81a1f0f, 0);
                        if (max < 0 || max2 >= ocVar.f280113d.p().s().mo8143x7444f759()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.GetImageComponent", "invalid position [%d - %d], cnt: %d", java.lang.Integer.valueOf(max), java.lang.Integer.valueOf(max2), java.lang.Integer.valueOf(ocVar.f280113d.p().s().mo8143x7444f759()));
                        } else {
                            java.lang.String b17 = ic5.f.f371970c.b(f9Var);
                            int i17 = max;
                            while (true) {
                                j2Var = c5245x7a3faa942.f135578h;
                                if (i17 > max2) {
                                    break;
                                }
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ocVar.f280113d.p().s().mo75871xfb80e389(i17);
                                if (f9Var2 != null) {
                                    java.lang.String b18 = ic5.f.f371970c.b(f9Var2);
                                    int length = b17.length();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= length) {
                                            z17 = true;
                                            break;
                                        }
                                        int codePointAt = b17.codePointAt(i18);
                                        if (!java.lang.Character.isWhitespace(codePointAt)) {
                                            z17 = false;
                                            break;
                                        }
                                        i18 += java.lang.Character.charCount(codePointAt);
                                    }
                                    if (!z17 && b17.equals(b18)) {
                                        android.view.View C = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) ocVar.f280113d.f542251m).C0().C(i17, max);
                                        if (C == null || (c22100x47612006 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) C.findViewById(com.p314xaae8f345.mm.R.id.sr8)) == null || (D = c22100x47612006.D(f9Var)) == null) {
                                            z18 = false;
                                        } else {
                                            int[] iArr = new int[2];
                                            D.getLocationOnScreen(iArr);
                                            j2Var.f88532a = iArr[0];
                                            j2Var.f88533b = iArr[1];
                                            j2Var.f88534c = D.getWidth();
                                            j2Var.f88535d = D.getHeight();
                                            j2Var.f88536e = i65.a.h(ocVar.f280113d.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                                            j2Var.f88537f = D;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.GetImageComponent", "getMediaGroupPhotoInfo, topView: %s", java.lang.Integer.valueOf(D.hashCode()));
                                            z18 = true;
                                        }
                                        if (z18) {
                                        }
                                    }
                                    if (f9Var2.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                                        android.view.View C2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b) ocVar.f280113d.f542251m).C0().C(i17, max);
                                        if (C2 == null) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.GetImageComponent", "[getPhotoInfo] getChildAt(%d)", java.lang.Integer.valueOf((i17 - max) + ocVar.f280113d.m()));
                                        } else {
                                            android.view.View findViewById = (f9Var.J2() || f9Var.m78014x7b98c171() || f9Var.Y2() || f9Var.M2()) ? C2.findViewById(com.p314xaae8f345.mm.R.id.bkg) : f9Var.o2() ? C2.findViewById(com.p314xaae8f345.mm.R.id.bjs) : null;
                                            if (findViewById != null) {
                                                int[] iArr2 = new int[2];
                                                findViewById.getLocationOnScreen(iArr2);
                                                j2Var.f88532a = iArr2[0];
                                                j2Var.f88533b = iArr2[1];
                                                j2Var.f88534c = findViewById.getWidth();
                                                j2Var.f88535d = findViewById.getHeight();
                                                j2Var.f88536e = i65.a.h(ocVar.f280113d.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                                                j2Var.f88537f = findViewById;
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.GetImageComponent", "getPhotoInfo img: %s", java.lang.Integer.valueOf(findViewById.hashCode()));
                                            }
                                        }
                                    }
                                }
                                i17++;
                            }
                            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oc.f281168h) {
                                j2Var.f88537f = null;
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f281170f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jc(this), false);
        this.f281171g = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.j4.f282594a;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        this.f281169e.mo48813x58998cd();
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).getClass();
        f281168h = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.p2522x740fd51b.C20090xa8c2549e()) == 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        this.f281170f.d();
        this.f281169e.mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k4 k4Var = this.f281171g;
        k4Var.f282676c.clear();
        ((lt0.f) k4Var.f282674a).c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i4(k4Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        this.f281170f.d();
        this.f281169e.mo48814x2efc64();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k4 k4Var = this.f281171g;
        k4Var.f282676c.clear();
        ((lt0.f) k4Var.f282674a).c(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i4(k4Var));
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        yb5.d dVar;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || bitmap == null || (dVar = this.f280113d) == null) {
            return;
        }
        dVar.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kc(this));
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!iq3.a.a()) {
            ((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).d(this);
        }
        boolean z17 = i19 == 0 && i27 == 0;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, z17, false);
        ((fq3.n) ((gq3.e) i95.n0.c(gq3.e.class))).f347073y.a(j17, j18, z17);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(str, j18);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f280113d.f542241c.a(sb5.z.class));
        java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
        if (hashMap.containsKey(java.lang.Long.valueOf(j18))) {
            if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(j18))) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(j18));
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null) {
                    java.lang.Object tag = view.getTag();
                    if (tag instanceof ze5.w6) {
                        android.app.Activity g17 = kVar.K.g();
                        ze5.w6 w6Var = (ze5.w6) tag;
                        if (true != z17) {
                            return;
                        }
                        j15.a ij6 = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).ij(Li);
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b1.Di().y4(Li, w6Var.f553817c.m80096x9e033a17(), Li.z0(), i65.a.g(g17), ij6.q(), ij6.n(), true, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, w6Var.f553817c.holder.c(), com.p314xaae8f345.mm.R.C30861xcebc809e.bgu, 1, true, null);
                    }
                }
            }
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        n11.a.b().n(i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f281170f;
        if (i17 == 0) {
            b4Var.d();
            b4Var.c(1000L, 1000L);
        } else if (i17 == 2) {
            b4Var.d();
        }
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Bi(j18, str, false, true);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d6886 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886();
        am.ao aoVar = c5833x5f3d6886.f136140g;
        aoVar.f87705a = true;
        aoVar.f87706b = this.f280113d.u().d1();
        c5833x5f3d6886.b(android.os.Looper.getMainLooper());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d6886 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886();
        am.ao aoVar = c5833x5f3d6886.f136140g;
        aoVar.f87705a = false;
        aoVar.f87706b = this.f280113d.u().d1();
        c5833x5f3d6886.b(android.os.Looper.getMainLooper());
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        this.f281170f.d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
    }
}
