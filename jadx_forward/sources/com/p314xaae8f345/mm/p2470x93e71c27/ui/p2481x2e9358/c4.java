package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class c4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271750d;

    public c4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271750d = c19666xfd6e2f33;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int s17;
        hv4.l lVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33.f271483x6;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271750d;
        c19666xfd6e2f33.getClass();
        try {
            int s18 = c19666xfd6e2f33.f271526h.s(14);
            if (s18 != -1 && s18 == c19666xfd6e2f33.f271526h.m75408xf19ef016()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
                java.lang.String c17 = y4Var == null ? c19666xfd6e2f33.f271502d : y4Var.c();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f c6810x8178771f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f();
                c6810x8178771f.f141368d = c6810x8178771f.b("RoomName", c17, true);
                if (c19666xfd6e2f33.A.getVisibility() == 0) {
                    c6810x8178771f.f141369e = 1L;
                } else {
                    c6810x8178771f.f141369e = 0L;
                }
                c6810x8178771f.f141370f = c6810x8178771f.b("AppList", "19", true);
                c6810x8178771f.f141371g = s18 + 1;
                c6810x8178771f.k();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "handleExposureReport Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
        try {
            int s19 = c19666xfd6e2f33.f271526h.s(11);
            if (s19 != -1 && s19 == c19666xfd6e2f33.f271526h.m75408xf19ef016()) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var2 = c19666xfd6e2f33.f271488a3;
                java.lang.String c18 = y4Var2 == null ? c19666xfd6e2f33.f271502d : y4Var2.c();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f c6810x8178771f2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f();
                c6810x8178771f2.f141368d = c6810x8178771f2.b("RoomName", c18, true);
                if (c19666xfd6e2f33.A.getVisibility() == 0) {
                    c6810x8178771f2.f141369e = 1L;
                } else {
                    c6810x8178771f2.f141369e = 0L;
                }
                c6810x8178771f2.f141370f = c6810x8178771f2.b("AppList", "11", true);
                c6810x8178771f2.f141371g = s19 + 1;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.i(46)) {
                    c6810x8178771f2.f141372h = c6810x8178771f2.b("HasReddotAppList", "11", true);
                }
                c6810x8178771f2.k();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "handleExposureReport Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
        }
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = c19666xfd6e2f33.f271526h;
            if (c19664x489a3083 != null && (s17 = c19664x489a3083.s(7)) != -1 && s17 == c19666xfd6e2f33.f271526h.m75408xf19ef016()) {
                boolean i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.i(55);
                if (i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(182, 215);
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("redenvelope_entry_has_reddot", java.lang.Boolean.valueOf(i17));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("redenvelope_entry", "view_exp", hashMap, 34068);
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "handle Luckymoney ExposureReport Exception:%s %s", e19.getClass().getSimpleName(), e19.getMessage());
        }
        c19666xfd6e2f33.f271526h.animate().setListener(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
