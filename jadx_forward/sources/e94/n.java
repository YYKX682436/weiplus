package e94;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 f331917d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5) {
        this.f331917d = c17819x3076c6d5;
    }

    @Override // java.lang.Runnable
    public void run() {
        t84.c cVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new e94.m(this));
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5.f245434J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5 = this.f331917d;
        c17819x3076c6d5.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        for (int i18 = 0; i18 < 12; i18++) {
            t84.c cVar2 = (t84.c) c17819x3076c6d5.e(i18);
            if (i18 != c17819x3076c6d5.B) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar2, "alpha", 1.0f, 0.0f);
                ofFloat.setDuration(500L);
                ofFloat.start();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOtherCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        c17819x3076c6d5.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i19 = 0;
        while (true) {
            if (i19 >= 12) {
                cVar = null;
                break;
            } else {
                if (i19 == c17819x3076c6d5.B) {
                    cVar = (t84.c) c17819x3076c6d5.e(i19);
                    break;
                }
                i19++;
            }
        }
        if (cVar == null || (view = c17819x3076c6d5.f245444z) == null) {
            str = "run";
            str2 = "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6";
            str3 = "access$800";
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            android.graphics.Rect rect = new android.graphics.Rect();
            android.graphics.Rect rect2 = new android.graphics.Rect();
            cVar.g(rect);
            int i27 = rect.left;
            int i28 = c17819x3076c6d5.f245442x;
            int i29 = i27 + i28;
            rect.left = i29;
            int i37 = rect.top + i28;
            rect.top = i37;
            rect.right = i29 + c17819x3076c6d5.f245440v;
            rect.bottom = i37 + c17819x3076c6d5.f245441w;
            view.getGlobalVisibleRect(rect2);
            int i38 = rect.bottom;
            int i39 = i38 - rect.top;
            int i47 = rect2.bottom - (i38 + ((((int) (i39 / 0.75f)) - i39) / 2));
            float b17 = i65.a.b(c17819x3076c6d5.f245435q, 40);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", 0.0f, b17);
            t84.c cVar3 = cVar;
            ofFloat2.setDuration(200L);
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", b17, i47);
            ofFloat3.setDuration(300L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 1.0f, 0.93333334f);
            ofFloat4.setDuration(200L);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 1.0f, 0.93333334f);
            str = "run";
            ofFloat5.setDuration(200L);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleX", 0.93333334f, 1.3333334f);
            ofFloat6.setDuration(300L);
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "scaleY", 0.93333334f, 1.3333334f);
            str2 = "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$6";
            str3 = "access$800";
            ofFloat7.setDuration(300L);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(ofFloat3).after(ofFloat2);
            animatorSet.play(ofFloat4).with(ofFloat5);
            animatorSet.play(ofFloat6).with(ofFloat7);
            animatorSet.play(ofFloat6).after(ofFloat4);
            animatorSet.play(ofFloat2).with(ofFloat4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet.addListener(new e94.p(c17819x3076c6d5));
            animatorSet.setTarget(cVar3);
            animatorSet.start();
            android.view.View view2 = c17819x3076c6d5.f245444z;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/twistad/GLTwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/twistad/GLTwistRoateCardsView", "doMainCardAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = c17819x3076c6d5.f245444z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            android.graphics.Rect rect3 = new android.graphics.Rect();
            android.graphics.Rect rect4 = new android.graphics.Rect();
            cVar3.g(rect3);
            view3.getGlobalVisibleRect(rect4);
            int i48 = rect4.bottom;
            int i49 = i48 - rect4.top;
            int i57 = rect3.bottom - (i48 - ((i49 - ((int) (i49 * 0.75f))) / 2));
            float b18 = i65.a.b(c17819x3076c6d5.f245435q, 40) + i57;
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat((java.lang.Object) null, "translationY", i57, b18);
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
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTargetAnimView", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            animatorSet2.setTarget(c17819x3076c6d5.f245444z);
            animatorSet2.start();
            new l44.d5(c17819x3076c6d5.f245444z, cVar3, c17819x3076c6d5.f245435q, c17819x3076c6d5.A, 500, -5000).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }
}
