package a74;

/* loaded from: classes4.dex */
public abstract class a implements v64.c {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        if (m70354x74235b3e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        try {
            boolean c17 = c(view, i17, c17933xe8d1b226, m70354x74235b3e, dVar);
            if (c17) {
                e(i17, c17933xe8d1b226, dVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return c17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
    }

    public abstract boolean c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, v64.d dVar);

    public abstract int d();

    public void e(int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = null;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        } else {
            i64.b1 b1Var = (i64.b1) dVar.a("snsAdStatistic", null);
            if (b1Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            } else {
                if (dVar.containsKey("flipStatus")) {
                    c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, d(), ((java.lang.Integer) dVar.a("flipStatus", 0)).intValue());
                } else {
                    c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, c17933xe8d1b226.f68891x29d1292e, 22, d());
                }
                ca4.m0.f(c11137xb05b06ad, b1Var, c17933xe8d1b226, 22);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            }
        }
        if (c11137xb05b06ad != null) {
            ca4.z0.x0(c11137xb05b06ad);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
    }
}
