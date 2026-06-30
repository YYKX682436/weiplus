package gb4;

/* loaded from: classes4.dex */
public class n extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 f351602a;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 c17928xf2aba9c9) {
        this.f351602a = c17928xf2aba9c9;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
        java.lang.String action = intent.getAction();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceive, action=");
        sb6.append(action);
        sb6.append(", isSphereCom=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9 c17928xf2aba9c9 = this.f351602a;
        sb6.append(c17928xf2aba9c9.H);
        sb6.append(", isFullScreen=");
        sb6.append(c17928xf2aba9c9.I);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContentFragmentSphereImageView", sb6.toString());
        if ("com.tencent.mm.adlanding.sphereimage.next_page_view_show".equals(action)) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c17928xf2aba9c9.mo7430x19263085();
            if (mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
                boolean E7 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) mo7430x19263085).E7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContentFragmentSphereImageView", "hasNextPage=" + E7);
                if (E7) {
                    android.view.View view = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500L);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e.startAnimation(alphaAnimation);
                }
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none".equals(action)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e.getVisibility() == 0) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e, "alpha", 0.5f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half".equals(action)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e.getVisibility() == 0) {
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e, "alpha", 1.0f, 0.5f);
                ofFloat2.setDuration(300L);
                ofFloat2.start();
            }
        } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_hide".equals(action) && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e.getVisibility() == 0) {
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(250L);
            alphaAnimation2.setFillAfter(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.p2177xd1075a44.p2178x73463188.p2179xbb6ca34f.C17928xf2aba9c9.m0(c17928xf2aba9c9).f351608e.startAnimation(alphaAnimation2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
    }
}
