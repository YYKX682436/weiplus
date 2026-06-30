package s74;

/* loaded from: classes.dex */
public final class w2 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486112a;

    public w2(java.lang.String str) {
        this.f486112a = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DynamicView.DynamicInfoChecker", "urlDark download  failed!");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
    }

    @Override // za4.e0
    public void c(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DynamicView.DynamicInfoChecker", "onDownloaded urlDark " + this.f486112a + "  path " + path);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicInfoChecker$traversalObjAndPreload$2");
    }
}
