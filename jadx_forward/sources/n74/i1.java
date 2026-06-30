package n74;

/* loaded from: classes4.dex */
public abstract class i1 {
    public static void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() == 0) {
            view.hashCode();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animHideView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animHideView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    public static void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (view.getVisibility() != 0) {
            view.hashCode();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/helper/FullCardCoverImageHelper", "animShowView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animShowView", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar, int i17, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (nVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new n74.h1(i17, nVar, imageView, nVar.f247607i, imageView2, nVar.f247608j));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkCoverImageState", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        }
    }

    public static void d(java.lang.String str, android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
            imageView.setVisibility(4);
            imageView.setImageDrawable(null);
            imageView.setTag(com.p314xaae8f345.mm.R.id.n1z, "");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
        } else if (!str.equals((java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.n1z))) {
            imageView.setImageDrawable(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkResetCover", "com.tencent.mm.plugin.sns.ad.timeline.helper.FullCardCoverImageHelper");
    }
}
