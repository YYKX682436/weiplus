package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/AdLandingPageRandomPickCardView;", "Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView;", "", "getSelectCardId", "getSelectCardTitle", "cardId", "Ljz5/f0;", "setSelectWithAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView */
/* loaded from: classes4.dex */
public final class C17718xe7d637dc extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f244238v = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f244239q;

    /* renamed from: r, reason: collision with root package name */
    public android.animation.Animator f244240r;

    /* renamed from: s, reason: collision with root package name */
    public android.animation.Animator f244241s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.Animator f244242t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.Animator f244243u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17718xe7d637dc(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m69359xb5886c64(), "cancelLastAnim");
        android.animation.Animator animator = this.f244240r;
        if (animator != null) {
            animator.cancel();
        }
        android.animation.Animator animator2 = this.f244241s;
        if (animator2 != null) {
            animator2.cancel();
        }
        android.animation.Animator animator3 = this.f244242t;
        if (animator3 != null) {
            animator3.cancel();
        }
        android.animation.Animator animator4 = this.f244243u;
        if (animator4 != null) {
            animator4.cancel();
        }
        java.util.List<p44.c0> m69357xc1ad766d = m69357xc1ad766d();
        if (!(m69357xc1ad766d == null || m69357xc1ad766d.isEmpty())) {
            java.util.Iterator<p44.c0> it = m69357xc1ad766d().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelLastAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
    }

    /* renamed from: getSelectCardId */
    public final java.lang.String m69353xbe3e06dd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        java.lang.String str = this.f244239q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        return str;
    }

    /* renamed from: getSelectCardTitle */
    public final java.lang.String m69354xb4bfb956() {
        java.lang.String e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        java.lang.String str = "";
        if (this.f244239q == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            return "";
        }
        for (p44.c0 c0Var : m69357xc1ad766d()) {
            if (r26.i0.q(this.f244239q, c0Var.f(), false, 2, null)) {
                p44.s h17 = c0Var.h();
                if (h17 != null && (e17 = h17.e()) != null) {
                    str = e17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
                return str;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCardTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public void h(p44.c0 vh6, p44.s itemData, p44.u cardInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vh6, "vh");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardInfo, "cardInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m69359xb5886c64(), "initItem, pos=" + vh6.i() + ", id=" + vh6.f());
        android.widget.TextView g17 = vh6.g();
        if (g17 != null) {
            g17.setText(itemData.e());
            g17.setTextSize(0, k(12));
            if (itemData.g()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                int i17 = cardInfo.f433389c;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                g17.setTextColor(i17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                int i18 = cardInfo.f433387a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
                g17.setTextColor(i18);
            }
        }
        android.widget.ImageView d17 = vh6.d();
        if (d17 != null) {
            int k17 = k(42);
            if (d17.getLayoutParams() == null) {
                c44.a.o();
                d17.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k17, -2));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = d17.getLayoutParams();
                layoutParams.width = k17;
                d17.setLayoutParams(layoutParams);
            }
            int k18 = k(6);
            if (d17.getLayoutParams() == null) {
                c44.a.o();
                d17.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, k18));
            } else {
                android.view.ViewGroup.LayoutParams layoutParams2 = d17.getLayoutParams();
                layoutParams2.height = k18;
                d17.setLayoutParams(layoutParams2);
            }
            d17.setImageResource(com.p314xaae8f345.mm.R.raw.f81089xcebe0cab);
        }
        android.widget.ImageView e17 = vh6.e();
        if (e17 != null) {
            a84.z.f(itemData.f76387xccc36214, e17);
            e17.setRotationY(0.0f);
        }
        android.widget.ImageView b17 = vh6.b();
        if (b17 != null) {
            a84.z.f(cardInfo.f76388xc65d0d62, b17);
            b17.setRotationY(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public int k(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        int m69356x1d9f755c = (int) ((m69356x1d9f755c() * i17) / 375.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativeDp", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        return m69356x1d9f755c;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.AbstractC17721xf81e3d99
    public void l(p44.c0 vh6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetItemForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vh6, "vh");
        super.l(vh6);
        if (!f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(m69359xb5886c64(), "no pickedCard");
            android.widget.TextView g17 = vh6.g();
            if (g17 != null) {
                g17.setAlpha(0.0f);
            }
            android.widget.ImageView d17 = vh6.d();
            if (d17 != null) {
                d17.setAlpha(1.0f);
            }
            android.widget.ImageView e17 = vh6.e();
            if (e17 != null) {
                e17.setAlpha(0.0f);
            }
            android.widget.ImageView b17 = vh6.b();
            if (b17 != null) {
                b17.setAlpha(1.0f);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetItemForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
    }

    public final android.animation.Animator n(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m69359xb5886c64(), "startUnPickedAnim, size=" + list.size());
        android.animation.Animator g17 = p44.q.f433365a.g(list);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startUnPickedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        return g17;
    }

    /* renamed from: setSelectWithAnim */
    public final void m69355xb7362615(java.lang.String str) {
        android.animation.AnimatorSet animatorSet;
        p44.q qVar;
        boolean z17;
        float f17;
        java.lang.Float f18;
        android.animation.AnimatorSet d17;
        java.lang.String str2 = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSelectWithAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectWithAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            return;
        }
        this.f244239q = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m69359xb5886c64(), "setSelectWithAnim, cardId=".concat(str2));
        p44.q qVar2 = p44.q.f433365a;
        java.util.List<p44.c0> m69357xc1ad766d = m69357xc1ad766d();
        p44.d dVar = new p44.d(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAdLandingPageSelectedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        boolean z18 = true;
        if (m69357xc1ad766d == null || m69357xc1ad766d.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdLandingPageSelectedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (p44.c0 c0Var : m69357xc1ad766d) {
                android.view.View c17 = c0Var.c();
                if (c17 != null) {
                    p44.s h17 = c0Var.h();
                    if ((h17 == null || h17.g() != z18) ? false : z18) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c0Var.f(), str2)) {
                            android.widget.ImageView e17 = c0Var.e();
                            if (e17 != null) {
                                f18 = java.lang.Float.valueOf(e17.getAlpha());
                                f17 = 0.0f;
                            } else {
                                f17 = 0.0f;
                                f18 = null;
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(f18, f17)) {
                                android.widget.ImageView b17 = c0Var.b();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.a(b17 != null ? java.lang.Float.valueOf(b17.getAlpha()) : null, 1.0f)) {
                                    android.widget.ImageView d18 = c0Var.d();
                                    if (d18 != null) {
                                        d18.setAlpha(0.0f);
                                    }
                                    android.animation.AnimatorSet c18 = qVar2.c(c0Var.e(), c0Var.b());
                                    if (c18 != null) {
                                        arrayList.add(c18);
                                    }
                                    android.widget.ImageView a17 = c0Var.a();
                                    if (a17 != null && (d17 = p44.q.f433365a.d(a17)) != null) {
                                        arrayList.add(d17);
                                    }
                                }
                            }
                            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c17, "translationY", 0.0f, -c44.b.a(8));
                            ofFloat.setDuration(333L);
                            qVar = qVar2;
                            ofFloat.setInterpolator(new android.view.animation.PathInterpolator(0.32f, 0.94f, 0.6f, 1.0f));
                            arrayList.add(ofFloat);
                            android.widget.TextView g17 = c0Var.g();
                            if (g17 != null) {
                                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(g17, "alpha", 0.6f, 1.0f);
                                ofFloat2.setDuration(333L);
                                ofFloat2.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
                                arrayList.add(ofFloat2);
                            }
                            android.widget.ImageView a18 = c0Var.a();
                            if (a18 != null) {
                                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(a18, "alpha", 0.7f, 1.0f);
                                ofFloat3.setDuration(333L);
                                ofFloat3.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
                                arrayList.add(ofFloat3);
                            }
                        } else {
                            qVar = qVar2;
                            if (!(c17.getTranslationY() == 0.0f)) {
                                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c17, "translationY", c17.getTranslationY(), 0.0f);
                                ofFloat4.setDuration(333L);
                                ofFloat4.setInterpolator(new android.view.animation.PathInterpolator(0.32f, 0.94f, 0.6f, 1.0f));
                                arrayList.add(ofFloat4);
                                android.widget.TextView g18 = c0Var.g();
                                if (g18 != null) {
                                    android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(g18, "alpha", g18.getAlpha(), 0.6f);
                                    ofFloat5.setDuration(333L);
                                    ofFloat5.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
                                    arrayList.add(ofFloat5);
                                }
                                android.widget.ImageView a19 = c0Var.a();
                                if (a19 != null) {
                                    z17 = true;
                                    android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(a19, "alpha", a19.getAlpha(), 0.7f);
                                    ofFloat6.setDuration(333L);
                                    ofFloat6.setInterpolator(new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
                                    arrayList.add(ofFloat6);
                                    str2 = str;
                                    z18 = z17;
                                    qVar2 = qVar;
                                }
                            }
                        }
                        z17 = true;
                        str2 = str;
                        z18 = z17;
                        qVar2 = qVar;
                    }
                }
                qVar = qVar2;
                z17 = z18;
                str2 = str;
                z18 = z17;
                qVar2 = qVar;
            }
            if (!arrayList.isEmpty()) {
                animatorSet = new android.animation.AnimatorSet();
                animatorSet.addListener(dVar);
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdLandingPageSelectedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
                this.f244242t = animatorSet;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectWithAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAdLandingPageSelectedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder");
        }
        animatorSet = null;
        this.f244242t = animatorSet;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSelectWithAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPageRandomPickCardView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17718xe7d637dc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        m69366xca0293d8("AdLandingPageRandomPickCardView");
    }
}
