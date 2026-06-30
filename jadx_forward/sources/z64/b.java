package z64;

/* loaded from: classes4.dex */
public class b implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        s34.m0 m0Var = c17933xe8d1b226.m70354x74235b3e().f38183x8456dec0;
        if (m0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        try {
            android.content.Context context = view.getContext();
            if (context != null && c17933xe8d1b226.m70347x10413e67(i17) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                boolean z17 = (m70354x74235b3e == null || m70354x74235b3e.f38252xc7fab2e2 != 4 || m70354x74235b3e.f38183x8456dec0 == null) ? false : true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                if (z17) {
                    boolean h17 = l44.s4.h(context, m0Var.f484241a, c17933xe8d1b226.m70347x10413e67(i17).f38104xce64ddf1, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
                    return h17;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.AdFinderProfileAvatarAction", "doAction exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        s34.m0 m0Var;
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        } else {
            try {
                m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
                m0Var = m70354x74235b3e.f38183x8456dec0;
            } catch (java.lang.Exception e17) {
                java.lang.Object[] objArr = {e17.getMessage()};
                int i18 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.AdFinderProfileAvatarAction", e17, "reportAd crash: %s", objArr);
            }
            if (m0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            } else {
                java.lang.String str = m0Var.f484241a;
                java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                if (m70354x74235b3e.f38174xaf3f2677 == null) {
                    java.lang.String str2 = m70354x74235b3e.f38183x8456dec0.f484242b;
                }
                p52.h.f433549a.f(l44.s4.m(c17933xe8d1b226.m70375x338a8cc7(), t07, 1), str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            }
        }
        if (dVar != null && (c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(c11137xb05b06ad, 41);
            ca4.z0.x0(c11137xb05b06ad);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
    }
}
