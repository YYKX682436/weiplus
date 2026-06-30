package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class vc {
    public vc(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vc vcVar, final android.content.Context context, android.view.Window window, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        boolean z19 = (i18 & 8) != 0 ? false : z17;
        boolean z27 = (i18 & 16) != 0 ? false : z18;
        vcVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLikeDrawer", "createDrawerToAttachWindow ");
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e c15307x329a684e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e(context);
        c15307x329a684e.m62156x53aed94a(i17);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y9).mo141623x754a37bb()).r()).intValue() == 1) {
            c15307x329a684e.m82804xbcf4cbbe(false);
            c15307x329a684e.m82802x7ea6418d(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
        float a17 = 1 - kx2.a.f394811a.a(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z28 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z28) {
            if (i27 >= i19) {
                i19 = i27;
            }
            i27 = i19;
        }
        c15307x329a684e.m82810x46bc3006((int) (i27 * a17));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        yw2.n nVar = i17 == 1 ? new yw2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb(context, z27)) : i17 == 2 ? new yw2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id(context, z27)) : i17 == 3 ? new yw2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d7(context)) : i17 == 4 ? new yw2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.mh(context)) : new yw2.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.id(context, z27));
        h0Var.f391656d = nVar;
        android.content.Context context2 = c15307x329a684e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        nVar.f548192o = context2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w20 w20Var = nVar.f548184d;
        int mo56041x7520bed6 = w20Var.mo56041x7520bed6();
        if (mo56041x7520bed6 == 1) {
            c15307x329a684e.setId(com.p314xaae8f345.mm.R.id.edz);
        } else if (mo56041x7520bed6 == 2) {
            c15307x329a684e.setId(com.p314xaae8f345.mm.R.id.edo);
        } else if (mo56041x7520bed6 == 3) {
            c15307x329a684e.setId(com.p314xaae8f345.mm.R.id.tci);
        } else if (mo56041x7520bed6 == 4) {
            c15307x329a684e.setId(com.p314xaae8f345.mm.R.id.tk9);
        }
        nVar.f548187g = c15307x329a684e;
        c15307x329a684e.m82809x50955ab0(com.p314xaae8f345.mm.R.C30861xcebc809e.f563132xo);
        c15307x329a684e.m82805x59f38d7d(true);
        c15307x329a684e.h(nVar);
        if (w20Var.mo56041x7520bed6() == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.n(c15307x329a684e, "profile_feed_like_tabulation_half_screen", (r20 & 4) != 0 ? 40 : 128, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("like_panel", 1)), (r20 & 128) != 0 ? null : new yw2.a(new yw2.l(nVar), new yw2.k(nVar)));
        }
        c15307x329a684e.m62151xbf0278d9((yw2.n) h0Var.f391656d);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uc ucVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.uc(context, layoutParams, window, c15307x329a684e, h0Var);
        if (z19) {
            ucVar.mo152xb9724478();
        } else {
            window.getDecorView().post(new java.lang.Runnable(ucVar) { // from class: com.tencent.mm.plugin.finder.view.wc

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f214823d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ucVar, "function");
                    this.f214823d = ucVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f214823d.mo152xb9724478();
                }
            });
        }
        if (context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.view.FinderLikeDrawer$Companion$createDrawerToAttachWindow$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m62157xac79a11b() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15307x329a684e.this.b();
                    ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context).mo273xed6858b4().c(this);
                }
            });
        }
        return c15307x329a684e;
    }
}
