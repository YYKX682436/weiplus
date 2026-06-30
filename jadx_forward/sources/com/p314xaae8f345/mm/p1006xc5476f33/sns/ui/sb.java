package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sb implements vb4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f251981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f251982b;

    public sb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f251982b = activityC18007x6d5e9773;
        this.f251981a = c1163xf1deaba4;
    }

    @Override // vb4.c
    public void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.f248225q3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251982b;
        android.widget.ImageView imageView = activityC18007x6d5e9773.f248278t;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$5800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        float f18 = 1.0f - f17;
        imageView.setAlpha(f18);
        android.view.View U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.U6(activityC18007x6d5e9773);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        U6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }

    @Override // vb4.c
    /* renamed from: onAnimationEnd */
    public void mo69472xbb3aa236() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251982b;
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.f248225q3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        activityC18007x6d5e9773.W1 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$5902", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC18007x6d5e9773.f248233d, "sns enter anim end");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.e7(activityC18007x6d5e9773)) {
            str = "onAnimationEnd";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            android.view.View view = activityC18007x6d5e9773.M1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            str = "onAnimationEnd";
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        android.view.View view2 = activityC18007x6d5e9773.M1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        view2.startAnimation(alphaAnimation);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.V6(activityC18007x6d5e9773)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f251981a;
            c1163xf1deaba4.setVisibility(0);
            android.view.View childAt = c1163xf1deaba4.getChildAt(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.01f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(childAt, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(150L);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, i65.a.b(activityC18007x6d5e9773, 15), 0.0f);
            translateAnimation.setDuration(150L);
            translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.rb(this));
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            animationSet.addAnimation(alphaAnimation2);
            animationSet.addAnimation(translateAnimation);
            c1163xf1deaba4.startAnimation(animationSet);
        } else {
            android.view.View U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.U6(activityC18007x6d5e9773);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(U6, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        activityC18007x6d5e9773.b8();
        activityC18007x6d5e9773.e8();
        if (!activityC18007x6d5e9773.f248275r2 && activityC18007x6d5e9773.getF147381t()) {
            activityC18007x6d5e9773.m78735x28280f95().m81450x8e764904(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        vb4.f fVar = activityC18007x6d5e9773.U1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
        if (fVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            int i17 = activityC18007x6d5e9773.I;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            sb6.append(i17);
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            vb4.f fVar2 = activityC18007x6d5e9773.U1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            fVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            int i18 = fVar2.f516344n;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportAnimUpdateCount", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            vb4.f fVar3 = activityC18007x6d5e9773.U1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$6000", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            fVar3.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            int i19 = (int) (fVar3.f516346p - fVar3.f516345o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportCostTime", "com.tencent.mm.plugin.sns.ui.animation.SnsAdNativeEnterAnimation");
            ca4.e0.b("landing_page_report_anim_cost", sb7, i18, i19, "snsId=" + activityC18007x6d5e9773.Q);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }

    @Override // vb4.c
    /* renamed from: onAnimationStart */
    public void mo69473xd7e2f2fd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251982b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC18007x6d5e9773.f248233d, "sns enter anim start");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.V6(activityC18007x6d5e9773)) {
            android.view.View U6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.U6(activityC18007x6d5e9773);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(U6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(U6, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f251981a.setVisibility(4);
        } else {
            android.view.View U62 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.U6(activityC18007x6d5e9773);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(U62, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            U62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(U62, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingPagesUI$22", "onAnimationStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$22");
    }
}
