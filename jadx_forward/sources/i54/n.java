package i54;

/* loaded from: classes4.dex */
public final class n implements eb4.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h54.d f370348d;

    public n(h54.d dVar) {
        this.f370348d = dVar;
    }

    @Override // eb4.k
    public final void e(java.lang.String str, java.lang.String str2, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState$doAction$1");
        java.util.Map a17 = h54.i.f360629a.a(map);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("the ret is ");
        sb6.append(str2 == null ? "" : str2);
        sb6.append(", value is ");
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdForm.QueryFinder", sb6.toString());
        if (str2 == null) {
            str2 = "";
        }
        this.f370348d.a(str2, a17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callJs", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.form.impl.FormJsApiQueryFinderFollowState$doAction$1");
    }
}
