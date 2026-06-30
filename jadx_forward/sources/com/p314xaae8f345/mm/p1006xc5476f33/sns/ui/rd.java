package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class rd implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td f251947b;

    public rd(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar, java.lang.String str) {
        this.f251947b = tdVar;
        this.f251946a = str;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadError, snsId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td tdVar = this.f251947b;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.c(tdVar) == null ? "" : java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.td.c(tdVar).f68891x29d1292e));
        sb6.append(", url=");
        sb6.append(this.f251946a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdPressGestureCtrl", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdPressGestureCtrl", "onDownloaded succ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.SnsAdPressGestureCtrl$3");
    }
}
