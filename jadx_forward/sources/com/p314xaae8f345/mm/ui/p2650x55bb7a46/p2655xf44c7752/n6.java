package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class n6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f282748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f282749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282750f;

    public n6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.ArrayList arrayList) {
        this.f282750f = viewOnClickListenerC21748xb3d38e6b;
        this.f282748d = f9Var;
        this.f282749e = arrayList;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256;
        g4Var.clear();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f282748d;
        boolean J2 = f9Var.J2();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282750f;
        if (J2) {
            int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
            c11126xa77ef256 = viewOnClickListenerC21748xb3d38e6b.V8(f9Var);
        } else {
            c11126xa77ef256 = null;
        }
        if (c11126xa77ef256 != null && c11126xa77ef256.f152792e == 10) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            if (ya2.e1.f542005a.k(viewOnClickListenerC21748xb3d38e6b.mo55332x76847179(), c11126xa77ef256.f152791d, viewOnClickListenerC21748xb3d38e6b.f282184q2, g4Var, 23)) {
                return;
            }
        }
        int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
        boolean z17 = true;
        if (viewOnClickListenerC21748xb3d38e6b.g8(2)) {
            oc5.l0 l0Var = viewOnClickListenerC21748xb3d38e6b.f282196u2;
            if (viewOnClickListenerC21748xb3d38e6b.j9(l0Var.f425984a)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) viewOnClickListenerC21748xb3d38e6b.Z2).e(l0Var.f425984a, l0Var.f425985b, viewOnClickListenerC21748xb3d38e6b.f282184q2, g4Var, 3);
                this.f282749e.add(9);
                oc5.g0 g0Var = viewOnClickListenerC21748xb3d38e6b.f282202w2;
                if (g0Var != null) {
                    long j17 = viewOnClickListenerC21748xb3d38e6b.f282187r2;
                    java.lang.Long l17 = g0Var.f425958i;
                    if (l17 != null && l17.longValue() == j17) {
                        g0Var.f425961l = true;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        if (g0Var.f425960k) {
                            g0Var.f425962m = currentTimeMillis - g0Var.f425959j;
                            g0Var.g(j17, "codeMenuVisible");
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = viewOnClickListenerC21748xb3d38e6b.f282184q2;
        final com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e X8 = viewOnClickListenerC21748xb3d38e6b.X8(f9Var);
        if (X8 == null) {
            z17 = false;
        } else {
            g4Var.q(15, X8.f152795e, viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4l), 0, 0);
            k0Var.F = new db5.j4() { // from class: com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$v
                @Override // db5.j4
                public final void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
                    int i19 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b.f282121p4;
                    imageView.setBackground(null);
                    imageView.setImageDrawable(null);
                    n11.a b17 = n11.a.b();
                    java.lang.String str = com.p314xaae8f345.mm.p954x7e3e6bb0.C11127xcc7d6e4e.this.f152796f;
                    o11.f fVar = new o11.f();
                    fVar.f423612c = true;
                    fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78370x999efabe;
                    fVar.f423629t = true;
                    b17.h(str, imageView, fVar.a());
                }
            };
            viewOnClickListenerC21748xb3d38e6b.I8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.a0.f170154g, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.z.f170372e, X8);
        }
        if (z17 || !((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Ai() || viewOnClickListenerC21748xb3d38e6b.T8(f9Var) == null) {
            return;
        }
        g4Var.g(21, viewOnClickListenerC21748xb3d38e6b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o4y), com.p314xaae8f345.mm.R.raw.f80322xbf1ef89e);
    }
}
