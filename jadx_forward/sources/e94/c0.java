package e94;

/* loaded from: classes4.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda f331905d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda c17823xedff0bda) {
        this.f331905d = c17823xedff0bda;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda c17823xedff0bda = this.f331905d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda.a(c17823xedff0bda) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda.a(c17823xedff0bda).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        c17823xedff0bda.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        for (int i17 = 0; i17 < 12; i17++) {
            android.view.View childAt = c17823xedff0bda.getChildAt(i17);
            if (i17 != c17823xedff0bda.f245497s) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(childAt, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.start();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        c17823xedff0bda.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        int i18 = 0;
        while (true) {
            if (i18 >= 12) {
                view = null;
                break;
            } else {
                if (i18 == c17823xedff0bda.f245497s) {
                    view = c17823xedff0bda.getChildAt(i18);
                    break;
                }
                i18++;
            }
        }
        if (view == null || c17823xedff0bda.f245495q == null) {
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$5";
        } else {
            android.view.View childAt2 = ((android.view.ViewGroup) view).getChildAt(0);
            android.view.View view2 = c17823xedff0bda.f245495q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            childAt2.getGlobalVisibleRect(rect);
            view2.getGlobalVisibleRect(rect2);
            int i19 = rect.bottom;
            int i27 = i19 - rect.top;
            int i28 = rect2.bottom - (i19 + ((((int) (i27 / 0.75f)) - i27) / 2));
            float b17 = i65.a.b(c17823xedff0bda.f245485d, 40);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", 0.0f, b17);
            ofFloat2.setDuration(200L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", b17, i28);
            ofFloat3.setDuration(300L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 1.0f, 0.93333334f);
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView$5";
            ofFloat4.setDuration(200L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 1.0f, 0.93333334f);
            android.view.View view3 = view;
            ofFloat5.setDuration(200L);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 0.93333334f, 1.3333334f);
            ofFloat6.setDuration(300L);
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 0.93333334f, 1.3333334f);
            ofFloat7.setDuration(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat3).after(ofFloat2);
            animatorSet.play(ofFloat4).with(ofFloat5);
            animatorSet.play(ofFloat6).with(ofFloat7);
            animatorSet.play(ofFloat6).after(ofFloat4);
            animatorSet.play(ofFloat2).with(ofFloat4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            animatorSet.addListener(new e94.e0(c17823xedff0bda));
            animatorSet.setTarget(view3);
            animatorSet.start();
            android.view.View view4 = c17823xedff0bda.f245495q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/twistad/TwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/widget/twistad/TwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = c17823xedff0bda.f245495q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            android.graphics.Rect rect3 = new android.graphics.Rect();
            android.graphics.Rect rect4 = new android.graphics.Rect();
            childAt2.getGlobalVisibleRect(rect3);
            view5.getGlobalVisibleRect(rect4);
            int i29 = rect4.bottom;
            int i37 = i29 - rect4.top;
            int i38 = rect3.bottom - (i29 - ((i37 - ((int) (i37 * 0.75f))) / 2));
            float b18 = i65.a.b(c17823xedff0bda.f245485d, 40) + i38;
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", i38, b18);
            ofFloat8.setDuration(200L);
            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", b18, 0.0f);
            ofFloat9.setDuration(300L);
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 0.75f, 0.7f);
            ofFloat10.setDuration(200L);
            android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 0.75f, 0.7f);
            ofFloat11.setDuration(200L);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 0.7f, 1.0f);
            ofFloat12.setDuration(300L);
            android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 0.7f, 1.0f);
            ofFloat13.setDuration(300L);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.play(ofFloat9).after(ofFloat8);
            animatorSet2.play(ofFloat10).with(ofFloat11);
            animatorSet2.play(ofFloat12).with(ofFloat13);
            animatorSet2.play(ofFloat12).after(ofFloat10);
            animatorSet2.play(ofFloat8).with(ofFloat10);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
            animatorSet2.setTarget(c17823xedff0bda.f245495q);
            animatorSet2.start();
            new l44.d5(c17823xedff0bda.f245495q, view3, c17823xedff0bda.f245485d, c17823xedff0bda.f245496r, 500, -3000).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
