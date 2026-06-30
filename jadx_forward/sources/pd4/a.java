package pd4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pd4.b f435093d;

    public a(pd4.b bVar) {
        this.f435093d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 m70599xcb16a3ea;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout$release$1");
        pd4.b bVar = this.f435093d;
        int childCount = bVar.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e c17973x67e3e70e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) bVar.getChildAt(i17);
            if (c17973x67e3e70e != null && (m70599xcb16a3ea = c17973x67e3e70e.m70599xcb16a3ea()) != null) {
                m70599xcb16a3ea.m();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout$release$1");
    }
}
