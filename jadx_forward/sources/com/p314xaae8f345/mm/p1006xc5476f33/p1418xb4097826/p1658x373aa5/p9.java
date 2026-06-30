package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class p9 {
    public p9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 a(final android.content.Context context, android.view.Window window, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFavDrawer", "createDrawerToAttachWindow ");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46 c15282xfe3c9a46 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46(context);
        c15282xfe3c9a46.m62054x53aed94a(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) {
            c15282xfe3c9a46.m82804xbcf4cbbe(false);
            c15282xfe3c9a46.m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        float a17 = 1 - kx2.a.f394811a.a(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        c15282xfe3c9a46.m82810x46bc3006((int) (i19 * a17));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (i17 == 0) {
            h0Var.f391656d = new yw2.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8(context));
        } else {
            h0Var.f391656d = new yw2.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8(context));
        }
        yw2.f fVar = (yw2.f) h0Var.f391656d;
        fVar.getClass();
        android.content.Context context2 = c15282xfe3c9a46.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        fVar.f548174p = context2;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8) fVar.f548165d).getClass();
        c15282xfe3c9a46.setId(com.p314xaae8f345.mm.R.id.edy);
        fVar.f548169h = c15282xfe3c9a46;
        c15282xfe3c9a46.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563132xo);
        c15282xfe3c9a46.m82805x59f38d7d(true);
        c15282xfe3c9a46.h(fVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.n(c15282xfe3c9a46, "profile_feed_like_tabulation_half_screen", (r20 & 4) != 0 ? 40 : 128, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("like_panel", 2)), (r20 & 128) != 0 ? null : new yw2.a(new yw2.d(fVar), new yw2.c(fVar)));
        c15282xfe3c9a46.m62052xbf0278d9((yw2.f) h0Var.f391656d);
        window.getDecorView().post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o9(context, layoutParams, window, c15282xfe3c9a46, h0Var));
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderFavDrawer$Companion$createDrawerToAttachWindow$2
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62055xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15282xfe3c9a46.this.b();
                    ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo273xed6858b4().c(this);
                }
            });
        }
        return c15282xfe3c9a46;
    }
}
