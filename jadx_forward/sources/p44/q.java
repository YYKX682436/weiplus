package p44;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final p44.q f433365a = new p44.q();

    /* renamed from: b, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f433366b = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.44f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f433367c = new android.view.animation.PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);

    public final void a(android.view.View view, android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        if (animator == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            return;
        }
        android.animation.Animator f17 = f(view);
        if (f17 != null) {
            f17.cancel();
        }
        view.setTag(com.p314xaae8f345.mm.R.id.r0t, animator);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
    }

    public final void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.animation.Animator f17 = f(view);
        if (f17 != null) {
            f17.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
    }

    public final android.animation.AnimatorSet c(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPickedCardFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPickedCardFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            return null;
        }
        if (view2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPickedCardFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            return null;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 90.0f);
        p44.q qVar = f433365a;
        qVar.a(view2, ofFloat);
        ofFloat.setDuration(333L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.4f, 0.0f, 0.68f, 0.06f));
        ofFloat.addUpdateListener(new p44.g(view2));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(-90.0f, 0.0f);
        qVar.a(view, ofFloat2);
        ofFloat2.setDuration(500L);
        ofFloat2.setStartDelay(333L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.14f, 1.0f));
        ofFloat2.addUpdateListener(new p44.h(view));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPickedCardFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        return animatorSet;
    }

    public final android.animation.AnimatorSet d(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createPickedMaskFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPickedMaskFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            return null;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 90.0f);
        ofFloat.setDuration(333L);
        ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.4f, 0.0f, 0.68f, 0.06f));
        ofFloat.addUpdateListener(new p44.i(view));
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(90.0f, 180.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setStartDelay(333L);
        ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.14f, 1.0f));
        ofFloat2.addUpdateListener(new p44.j(view));
        animatorSet.playTogether(ofFloat, ofFloat2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createPickedMaskFlipAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        return animatorSet;
    }

    public final java.util.List e(long j17, float f17, p44.c0 c0Var) {
        android.animation.AnimatorSet animatorSet;
        android.animation.AnimatorSet animatorSet2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createUnPickedCardCycleAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View c17 = c0Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createCardWaveAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createCardWaveAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            animatorSet = null;
        } else {
            animatorSet = new android.animation.AnimatorSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            float a17 = c44.b.a(3);
            float f18 = f17 + a17;
            java.lang.String str = "translationY";
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17, "translationY", f17, f18);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.16f, 0.0f, 0.61f, 0.0f));
            arrayList2.add(ofFloat);
            int i17 = 2;
            char c18 = 0;
            float f19 = f18 - a17;
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c17, "translationY", f18, f19);
            ofFloat2.setDuration(500L);
            android.view.animation.PathInterpolator pathInterpolator = f433367c;
            ofFloat2.setInterpolator(pathInterpolator);
            arrayList2.add(ofFloat2);
            int i18 = 0;
            while (i18 < i17) {
                float[] fArr = new float[i17];
                fArr[c18] = f19;
                float f27 = f19 + a17;
                fArr[1] = f27;
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c17, str, fArr);
                java.lang.String str2 = str;
                ofFloat3.setDuration(500L);
                ofFloat3.setInterpolator(pathInterpolator);
                arrayList2.add(ofFloat3);
                float[] fArr2 = new float[i17];
                fArr2[c18] = f27;
                f19 = f27 - a17;
                fArr2[1] = f19;
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c17, str2, fArr2);
                ofFloat4.setDuration(500L);
                ofFloat4.setInterpolator(pathInterpolator);
                arrayList2.add(ofFloat4);
                i18++;
                str = str2;
                i17 = 2;
                c18 = 0;
            }
            animatorSet.playSequentially(arrayList2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createCardWaveAnimSet", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        }
        p44.q qVar = f433365a;
        if (animatorSet != null) {
            android.view.View c19 = c0Var.c();
            if (c19 != null) {
                qVar.a(c19, animatorSet);
            }
            animatorSet.setStartDelay(j17);
            animatorSet.addListener(new p44.k());
            arrayList.add(animatorSet);
        }
        android.widget.ImageView d17 = c0Var.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createUnPickedShadowCycleAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        if (d17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createUnPickedShadowCycleAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            animatorSet2 = null;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (int i19 = 0; i19 < 3; i19++) {
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(d17, "scaleX", 1.0f, 1.1f);
                ofFloat5.setDuration(500L);
                android.view.animation.PathInterpolator pathInterpolator2 = f433366b;
                ofFloat5.setInterpolator(pathInterpolator2);
                arrayList3.add(ofFloat5);
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(d17, "scaleX", 1.1f, 1.0f);
                ofFloat6.setDuration(500L);
                ofFloat6.setInterpolator(pathInterpolator2);
                arrayList3.add(ofFloat6);
            }
            android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
            animatorSet3.playSequentially(arrayList3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createUnPickedShadowCycleAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            animatorSet2 = animatorSet3;
        }
        if (animatorSet2 != null) {
            android.widget.ImageView d18 = c0Var.d();
            if (d18 != null) {
                qVar.a(d18, animatorSet2);
            }
            animatorSet2.setStartDelay(j17);
            animatorSet2.addListener(new p44.l());
            arrayList.add(animatorSet2);
        }
        android.widget.ImageView a18 = c0Var.a();
        if (a18 != null) {
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(a18, "alpha", 0.2f, 0.7f);
            ofFloat7.setDuration(333L);
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(a18, "alpha", 0.7f, 0.2f);
            ofFloat8.setDuration(500L);
            ofFloat8.setStartDelay(2167L);
            android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
            qVar.a(a18, animatorSet4);
            animatorSet4.playSequentially(ofFloat7, ofFloat8);
            animatorSet4.setStartDelay(j17);
            animatorSet4.addListener(new p44.m());
            arrayList.add(animatorSet4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createUnPickedCardCycleAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        return arrayList;
    }

    public final android.animation.Animator f(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.r0t);
        android.animation.Animator animator = tag instanceof android.animation.Animator ? (android.animation.Animator) tag : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        return animator;
    }

    public final android.animation.Animator g(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        int i17 = 0;
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.c0 c0Var = (p44.c0) obj;
            java.util.List e17 = f433365a.e(i17 * 133, 0.0f, c0Var);
            android.widget.ImageView d17 = c0Var.d();
            if (d17 != null) {
                d17.setAlpha(1.0f);
            }
            arrayList.addAll(e17);
            i17 = i18;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        return animatorSet;
    }
}
