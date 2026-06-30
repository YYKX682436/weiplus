package p54;

/* loaded from: classes.dex */
public final class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f433621d;

    public f(yz5.l lVar) {
        this.f433621d = lVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialogInner$sheet$1$2");
        if (menuItem != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DownloadDialog", "the item id is " + menuItem.getItemId() + ", item content is " + ((java.lang.Object) menuItem.getTitle()) + ", the index is " + i17);
            this.f433621d.mo146xb9724478(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ad.landingpage.helper.download.DownloadDialogHelper$showRetentionDialogInner$sheet$1$2");
    }
}
