package z64;

/* loaded from: classes4.dex */
public class e implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.y yVar = c17933xe8d1b226.m70354x74235b3e().f38279x1b873fc1;
        if (yVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        boolean y17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.y(yVar.f247704a, yVar.f247705b, yVar.f247706c, c17933xe8d1b226, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        return y17;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (dVar != null && (c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(c11137xb05b06ad, 31);
            ca4.z0.x0(c11137xb05b06ad);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
    }
}
