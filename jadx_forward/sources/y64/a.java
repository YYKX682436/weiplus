package y64;

/* loaded from: classes4.dex */
public class a extends v64.b {
    @Override // v64.b
    public void c(v64.c cVar, android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        y64.b bVar = (y64.b) cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        if (bVar != null) {
            bVar.b(view, i17, c17933xe8d1b226, dVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
    }

    @Override // v64.b
    public v64.c d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        v64.c cVar = null;
        if (c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdAvatarClicker", "the sns info or adxml is null!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        } else {
            int i17 = c17933xe8d1b226.m70354x74235b3e().f38252xc7fab2e2;
            if (i17 == 2) {
                cVar = new z64.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 3) {
                cVar = new z64.e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 4) {
                cVar = new z64.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 5) {
                cVar = new z64.c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 6) {
                cVar = new z64.d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        return cVar;
    }
}
