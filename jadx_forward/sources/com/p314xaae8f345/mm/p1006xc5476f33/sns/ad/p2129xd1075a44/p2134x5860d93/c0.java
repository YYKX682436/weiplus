package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93;

/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.c0 f244866a = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.c0();

    public static /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.c0 c0Var, android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, ym5.w1 w1Var, int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPAGStartPlay$default", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a17 = c0Var.a(context, viewGroup, str, str2, (i19 & 16) != 0 ? null : w1Var, (i19 & 32) != 0 ? 1 : i17, (i19 & 64) != 0 ? 3 : i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay$default", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        return a17;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a(android.content.Context context, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, ym5.w1 w1Var, int i17, int i18) {
        org.p3363xbe4143f1.C29690xfae77312 c17;
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            return null;
        }
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
            return null;
        }
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        if (!(activity != null && activity.isFinishing())) {
            android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
            if (!(activity2 != null && activity2.isDestroyed())) {
                try {
                    boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1;
                    if (z18) {
                        com.p314xaae8f345.mm.rfx.C20942x379cf5ee d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.d("AdPAGHelper", str, str2);
                        if (d17 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2029, 37);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPAGHelper", "doPAGStartPlay, useRfx is true, pagFile is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                            return null;
                        }
                        c20942x379cf5ee = d17;
                        c17 = null;
                    } else {
                        c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.c("AdPAGHelper", str, str2);
                        if (c17 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2029, 37);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdPAGHelper", "doPAGStartPlay, useRfx is false, pagFile is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                            return null;
                        }
                        c20942x379cf5ee = null;
                    }
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
                    c22789xd23e9a9b.o(z18);
                    c22789xd23e9a9b.m82583xcde73672(i17);
                    c22789xd23e9a9b.m82584xebcf33cb(i18);
                    if (z18) {
                        c22789xd23e9a9b.mo82566x3e3ac3e8(c20942x379cf5ee);
                    } else {
                        c22789xd23e9a9b.mo82568x3e3ac3e8(c17);
                    }
                    c22789xd23e9a9b.a(w1Var);
                    int childCount = viewGroup.getChildCount();
                    a84.y0.o(c22789xd23e9a9b, -1, -1);
                    a84.y0.b(viewGroup, c22789xd23e9a9b, childCount);
                    c22789xd23e9a9b.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2134x5860d93.z(c22789xd23e9a9b));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdPAGHelper", "doPAGStartPlay success");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                    return c22789xd23e9a9b;
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdPAGHelper", th6);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
                    return null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdPAGHelper", "doPAGStartPlay, activity is finishing or destroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPAGStartPlay", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGHelper");
        return null;
    }
}
