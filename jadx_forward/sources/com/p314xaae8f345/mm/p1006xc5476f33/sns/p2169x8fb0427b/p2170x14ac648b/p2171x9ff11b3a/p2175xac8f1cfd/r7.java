package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 f246999d;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 x7Var) {
        this.f246999d = x7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.x7 x7Var = this.f246999d;
        x7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        ab4.z m07 = x7Var.m0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m07.G)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click without streamVideoUrl!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
        } else {
            android.content.Context context = x7Var.A;
            if (context instanceof android.app.Activity) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28.class);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.AdLandingPageSightVideoComponent", "use new stream video play UI");
                intent.putExtra("KFromTimeLine", true);
                intent.putExtra("KMediaId", com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(m07.G));
                intent.putExtra("KThumUrl", m07.f14x2d49476);
                intent.putExtra("KStremVideoUrl", m07.G);
                intent.putExtra("ForceLandscape", true);
                intent.putExtra("ShareBtnHidden", 1);
                intent.putExtra("KComponentCid", x7Var.z());
                android.app.Activity activity = (android.app.Activity) context;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(2004);
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent", "onStreamVideoAreaClick", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                x7Var.H++;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sns.AdLandingPageSightVideoComponent", "on long video button click but context not activity!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStreamVideoAreaClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageSightVideoComponent$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageSightVideoComponent$8");
    }
}
