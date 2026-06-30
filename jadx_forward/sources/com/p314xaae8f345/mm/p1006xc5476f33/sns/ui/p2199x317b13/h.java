package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class h implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k f250873a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k kVar) {
        this.f250873a = kVar;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.CardAdTimeLineItem", "download img %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.k kVar = this.f250873a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0((java.lang.String) kVar.K0.getTag(), str) && str.equals(za4.t0.l("adId", (java.lang.String) kVar.K0.getTag())) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null)) != null) {
            android.view.View view = kVar.K0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kVar.L0.setImageBitmap(J2);
            kVar.L0.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }
}
