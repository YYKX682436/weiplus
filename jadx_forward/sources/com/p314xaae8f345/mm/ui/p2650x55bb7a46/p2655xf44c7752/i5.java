package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class i5 implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282556a;

    public i5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282556a = viewOnClickListenerC21748xb3d38e6b;
    }

    @Override // db5.d8
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282556a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var != null) {
            if (k1Var.f282639x.a(viewOnClickListenerC21748xb3d38e6b.I7()) != null) {
                return;
            }
        }
        if (viewOnClickListenerC21748xb3d38e6b.f282204x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "%d handle single click event. isFinishing = %b  isDestoryed = %b  destroyCalled = %b", java.lang.Integer.valueOf(viewOnClickListenerC21748xb3d38e6b.hashCode()), java.lang.Boolean.valueOf(viewOnClickListenerC21748xb3d38e6b.isFinishing()), java.lang.Boolean.valueOf(viewOnClickListenerC21748xb3d38e6b.isDestroyed()), java.lang.Boolean.valueOf(viewOnClickListenerC21748xb3d38e6b.V1));
            if (viewOnClickListenerC21748xb3d38e6b.isFinishing() || viewOnClickListenerC21748xb3d38e6b.isDestroyed() || viewOnClickListenerC21748xb3d38e6b.V1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "call click on finishing or finished, just return");
                return;
            }
            if (viewOnClickListenerC21748xb3d38e6b.o8()) {
                viewOnClickListenerC21748xb3d38e6b.P3 = false;
                if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ja.H()) {
                    ((c35.m) i95.n0.c(c35.m.class)).getClass();
                }
                if (viewOnClickListenerC21748xb3d38e6b.x8()) {
                    viewOnClickListenerC21748xb3d38e6b.k8();
                    h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var2 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = k1Var2 != null ? k1Var2.w() : null;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var3 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                    ((g90.s) vVar).hj(viewOnClickListenerC21748xb3d38e6b, w17, 1, 1, viewOnClickListenerC21748xb3d38e6b.c7(k1Var3 != null ? k1Var3.w() : null));
                    return;
                }
                viewOnClickListenerC21748xb3d38e6b.o9(false);
                h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var4 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 w18 = k1Var4 != null ? k1Var4.w() : null;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var5 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                ((g90.s) vVar2).hj(viewOnClickListenerC21748xb3d38e6b, w18, 1, 2, viewOnClickListenerC21748xb3d38e6b.c7(k1Var5 != null ? k1Var5.w() : null));
                return;
            }
            boolean p86 = viewOnClickListenerC21748xb3d38e6b.p8();
            com.p314xaae8f345.mm.ui.p2731xc84c5534.i0 i0Var = com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.PressToClose;
            if (!p86 || !viewOnClickListenerC21748xb3d38e6b.B2) {
                if (viewOnClickListenerC21748xb3d38e6b.M2 != 1) {
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(viewOnClickListenerC21748xb3d38e6b).b(i0Var);
                    viewOnClickListenerC21748xb3d38e6b.onBackPressed();
                    return;
                }
                return;
            }
            viewOnClickListenerC21748xb3d38e6b.P3 = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_click_image_close_gallery_enable, 0) == 1) {
                if (viewOnClickListenerC21748xb3d38e6b.M2 != 1) {
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(viewOnClickListenerC21748xb3d38e6b).b(i0Var);
                    viewOnClickListenerC21748xb3d38e6b.onBackPressed();
                    h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var6 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 w19 = k1Var6 != null ? k1Var6.w() : null;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var7 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                    ((g90.s) vVar3).hj(viewOnClickListenerC21748xb3d38e6b, w19, 1, 3, viewOnClickListenerC21748xb3d38e6b.c7(k1Var7 != null ? k1Var7.w() : null));
                    return;
                }
                return;
            }
            if (viewOnClickListenerC21748xb3d38e6b.x8()) {
                viewOnClickListenerC21748xb3d38e6b.k8();
                h90.v vVar4 = (h90.v) i95.n0.c(h90.v.class);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var8 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 w27 = k1Var8 != null ? k1Var8.w() : null;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var9 = viewOnClickListenerC21748xb3d38e6b.f282144g;
                ((g90.s) vVar4).hj(viewOnClickListenerC21748xb3d38e6b, w27, 1, 1, viewOnClickListenerC21748xb3d38e6b.c7(k1Var9 != null ? k1Var9.w() : null));
                return;
            }
            viewOnClickListenerC21748xb3d38e6b.o9(false);
            h90.v vVar5 = (h90.v) i95.n0.c(h90.v.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var10 = viewOnClickListenerC21748xb3d38e6b.f282144g;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 w28 = k1Var10 != null ? k1Var10.w() : null;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var11 = viewOnClickListenerC21748xb3d38e6b.f282144g;
            ((g90.s) vVar5).hj(viewOnClickListenerC21748xb3d38e6b, w28, 1, 2, viewOnClickListenerC21748xb3d38e6b.c7(k1Var11 != null ? k1Var11.w() : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // db5.d8
    public void b() {
        ?? r07;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282556a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1 k1Var = viewOnClickListenerC21748xb3d38e6b.f282144g;
        if (k1Var == null || k1Var.w() == null) {
            return;
        }
        viewOnClickListenerC21748xb3d38e6b.getClass();
        com.p314xaae8f345.mm.ui.p2731xc84c5534.C22471x941a9a3f.c(viewOnClickListenerC21748xb3d38e6b).b(com.p314xaae8f345.mm.ui.p2731xc84c5534.i0.PullDownToClose);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 w17 = viewOnClickListenerC21748xb3d38e6b.f282144g.w();
        if (w17 != null && (w17.m78014x7b98c171() || w17.J2())) {
            boolean z17 = viewOnClickListenerC21748xb3d38e6b.B2;
            if (viewOnClickListenerC21748xb3d38e6b.A2) {
                r07 = 3;
            } else {
                r07 = z17;
                if (w17.m124847x74d37ac6() != viewOnClickListenerC21748xb3d38e6b.O2) {
                    r07 = 2;
                }
            }
            int i17 = r07;
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).ij(viewOnClickListenerC21748xb3d38e6b, w17, 1, 1, i17, viewOnClickListenerC21748xb3d38e6b.d7(w17));
        }
        viewOnClickListenerC21748xb3d38e6b.Y8();
    }
}
