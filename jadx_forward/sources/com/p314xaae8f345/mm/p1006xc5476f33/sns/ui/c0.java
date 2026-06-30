package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 f249599a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 activityC17938x24b60f25) {
        this.f249599a = activityC17938x24b60f25;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a4
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickDetail", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickDetail", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a4
    public void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRemoveItem", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.a4
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 activityC17938x24b60f25 = this.f249599a;
        r45.jj4 mo70574x2d3ab571 = activityC17938x24b60f25.f248343o.mo70574x2d3ab571();
        if (mo70574x2d3ab571 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistBrowseUI", "set bg the meida id " + mo70574x2d3ab571.f459388d + " path:");
        m21.w.d(723);
        if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), mo70574x2d3ab571.f459388d) + ca4.z0.J(mo70574x2d3ab571))) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().p(mo70574x2d3ab571);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(activityC17938x24b60f25, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17994x10b0558a.class);
        intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
        intent.addFlags(67108864);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 activityC17938x24b60f252 = this.f249599a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC17938x24b60f252, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17938x24b60f252.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC17938x24b60f252, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$2", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC17938x24b60f25.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$2");
    }
}
