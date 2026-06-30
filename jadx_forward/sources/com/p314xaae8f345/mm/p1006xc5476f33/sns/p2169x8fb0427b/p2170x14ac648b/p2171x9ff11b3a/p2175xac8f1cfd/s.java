package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y f247003d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar) {
        this.f247003d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y yVar = this.f247003d;
        if (!yVar.C || (yVar.B instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$408", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        yVar.D++;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$408", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.o2 o2Var = yVar.B;
        if (o2Var != null) {
            try {
                android.widget.Button W = o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2) o2Var).W() : o2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4 ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u4) o2Var).r0() : null;
                if (W != null) {
                    W.performClick();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "onClick noBtn found, comp=" + yVar.B);
                }
                R = yVar.B.R();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingFloatBarCompWrapper", "onClick exp=" + e17.toString());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick, clickCount=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            int i17 = yVar.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
            sb6.append(i17);
            sb6.append(", btnClickCount=");
            sb6.append(R);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", sb6.toString());
            yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
        }
        R = 0;
        java.lang.StringBuilder sb62 = new java.lang.StringBuilder("onClick, clickCount=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        int i172 = yVar.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper");
        sb62.append(i172);
        sb62.append(", btnClickCount=");
        sb62.append(R);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingFloatBarCompWrapper", sb62.toString());
        yj0.a.h(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingFloatBarCompWrapper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper$4");
    }
}
