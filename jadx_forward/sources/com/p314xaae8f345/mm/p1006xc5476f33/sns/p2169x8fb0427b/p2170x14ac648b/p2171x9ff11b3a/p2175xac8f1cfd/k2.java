package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f246845a;

    /* renamed from: b, reason: collision with root package name */
    public final y9.i f246846b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f246847c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.j2 f246848d;

    public k2(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2 a2Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18) {
        this.f246845a = context;
        if (a2Var == null || a2Var.x() == null) {
            return;
        }
        y9.i iVar = new y9.i(context, 0);
        this.f246846b = iVar;
        iVar.setCanceledOnTouchOutside(true);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cpa, null);
        this.f246847c = inflate;
        if (inflate == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageBottomSheet", "mRootView init fail!");
            return;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.c8x);
        android.view.View x17 = a2Var.x();
        if (x17.getParent() != null) {
            ((android.view.ViewGroup) x17.getParent()).removeView(x17);
        }
        int i17 = (int) a2Var.p().f84356m;
        int i18 = (int) a2Var.p().f84357n;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        boolean z19 = (i17 == Integer.MAX_VALUE || i18 == Integer.MAX_VALUE) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSpecifiedLayoutSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        if (z19) {
            layoutParams.width = i17;
            layoutParams.height = i18;
        }
        linearLayout.addView(x17, layoutParams);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.avh)).setText(str2);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.bz9);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.e2(this));
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564975av4);
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.f2(this));
        if (!z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBottomSheet", "<init>", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageBaseComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oaf);
        imageView.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return;
        }
        android.graphics.Bitmap h17 = za4.t0.h(str3);
        if (h17 == null) {
            za4.t0.c(str3, false, 0, 0, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.g2(this, imageView));
        } else {
            imageView.setImageBitmap(h17);
            imageView.setVisibility(0);
        }
    }

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
        y9.i iVar = this.f246846b;
        if (iVar != null) {
            iVar.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryHide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBottomSheet");
    }
}
