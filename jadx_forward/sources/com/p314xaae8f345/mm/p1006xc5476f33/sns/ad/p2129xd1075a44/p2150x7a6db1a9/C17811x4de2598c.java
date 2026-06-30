package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView */
/* loaded from: classes4.dex */
public class C17811x4de2598c extends android.widget.FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f245353o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f245354d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f245355e;

    /* renamed from: f, reason: collision with root package name */
    public s34.p f245356f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 f245357g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b f245358h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f245359i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f245360m;

    /* renamed from: n, reason: collision with root package name */
    public a94.q f245361n;

    public C17811x4de2598c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z17;
        this.f245359i = false;
        this.f245360m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f245354d = context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_shake_anim_gl, 0);
            z17 = Ni > 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "isUseGLCardView, exptValue=" + Ni);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCardAnimView", "isUseGLCardView, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isUseGLCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            z17 = false;
        }
        this.f245359i = z17;
        android.content.Context context2 = this.f245354d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        if (this.f245359i) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b(context2);
            this.f245358h = c17810x696dfd0b;
            addView(c17810x696dfd0b, new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 15);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 c17809xf60523a6 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6(context2);
            this.f245357g = c17809xf60523a6;
            addView(c17809xf60523a6, new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        android.content.Context context3 = this.f245354d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context3);
        this.f245355e = c22789xd23e9a9b;
        c22789xd23e9a9b.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1);
        this.f245355e.a(new a94.n(this));
        addView(this.f245355e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c c17811x4de2598c) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = c17811x4de2598c.f245355e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return c22789xd23e9a9b;
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c c17811x4de2598c) {
        int[] c17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        c17811x4de2598c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        boolean z17 = false;
        try {
            c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.c(c17811x4de2598c.f245354d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "w=" + c17[0] + ", h=" + c17[1]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCardAnimView", "isForceLocalLowPag, exp=" + th6.toString());
        }
        if (c17[0] * c17[1] <= 921600 || c17811x4de2598c.d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "isLowPerformanceDevice, ret=true");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1572, 9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            z17 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "isLowPerformanceDevice, ret=false");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isForceLocalLowPag", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        return z17;
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f245355e;
        if (c22789xd23e9a9b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCardAnimView", "initPagAnimViewData, mPAGAnimView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } else {
            c22789xd23e9a9b.post(new a94.o(this, str, str2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPagAnimViewData", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        }
    }

    public final boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        try {
            boolean z17 = true;
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_ad_shake_pag_black_list, "", true);
            java.lang.String m17 = wo.w0.m();
            if (android.text.TextUtils.isEmpty(Zi) || android.text.TextUtils.isEmpty(m17) || !Zi.toLowerCase().contains(m17.toLowerCase())) {
                z17 = false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "isInBlackList, blackList=" + Zi + ", curDev=" + m17 + ", ret=" + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return z17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCardAnimView", "isInBlackList, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInBlackList", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
            return false;
        }
    }

    public void e() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "startCardAnim");
        if (this.f245359i) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b = this.f245358h;
            c17810x696dfd0b.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            c17810x696dfd0b.f245351x = true;
            int b17 = i65.a.b(c17810x696dfd0b.f245344q, 140);
            t84.c cVar = (t84.c) c17810x696dfd0b.e(0);
            t84.c cVar2 = (t84.c) c17810x696dfd0b.e(4);
            int i17 = -b17;
            c17810x696dfd0b.k(cVar, 0, 500, i17);
            c17810x696dfd0b.k(cVar2, 0, 500, b17);
            t84.c cVar3 = (t84.c) c17810x696dfd0b.e(2);
            c17810x696dfd0b.f245349v = cVar3;
            cVar3.j(1.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(cVar3, "translationY", -((c17810x696dfd0b.getHeight() / 2) + (c17810x696dfd0b.f245346s / 2) + c17810x696dfd0b.f245347t), 0.0f);
            long j17 = 500;
            ofFloat.setDuration(j17);
            ofFloat.addListener(new a94.h(c17810x696dfd0b, cVar3));
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleX", 0.33333334f, 1.0f);
            ofFloat2.setDuration(j17);
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleY", 0.33333334f, 1.0f);
            ofFloat3.setDuration(j17);
            ofFloat.addListener(new a94.j(c17810x696dfd0b));
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleX", 1.0f, 3.3333333f);
            ofFloat4.setDuration(j17);
            android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(cVar3, "scaleY", 1.0f, 3.3333333f);
            ofFloat5.setDuration(j17);
            android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(c17810x696dfd0b.f245348u, "scaleX", 0.33333334f, 1.0f);
            ofFloat6.setDuration(j17);
            android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(c17810x696dfd0b.f245348u, "scaleY", 0.33333334f, 1.0f);
            ofFloat7.setDuration(j17);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.play(ofFloat4).with(ofFloat5).with(ofFloat6).with(ofFloat7).after(ofFloat2);
            animatorSet.setStartDelay(100L);
            animatorSet.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
            t84.c cVar4 = (t84.c) c17810x696dfd0b.e(1);
            t84.c cVar5 = (t84.c) c17810x696dfd0b.e(3);
            c17810x696dfd0b.k(cVar4, 50, 500, i17);
            c17810x696dfd0b.k(cVar5, 50, 500, b17);
            str2 = "startCardAnim";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        } else {
            str = "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17809xf60523a6 c17809xf60523a6 = this.f245357g;
            c17809xf60523a6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            c17809xf60523a6.f245341n = true;
            int b18 = i65.a.b(c17809xf60523a6.f245334d, 140);
            android.view.View childAt = c17809xf60523a6.getChildAt(0);
            android.view.View childAt2 = c17809xf60523a6.getChildAt(4);
            int i18 = -b18;
            c17809xf60523a6.d(childAt, 0, 500, i18);
            c17809xf60523a6.d(childAt2, 0, 500, b18);
            android.view.View childAt3 = c17809xf60523a6.getChildAt(2);
            c17809xf60523a6.f245339i = childAt3;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(childAt3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            childAt3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(childAt3, "com/tencent/mm/plugin/sns/ad/widget/shakead/CardAnimView", "startCardAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            android.animation.ObjectAnimator ofFloat8 = android.animation.ObjectAnimator.ofFloat(childAt3, "translationY", -((c17809xf60523a6.getHeight() / 2) + (c17809xf60523a6.f245336f / 2) + c17809xf60523a6.f245337g), 0.0f);
            long j18 = 500;
            ofFloat8.setDuration(j18);
            ofFloat8.addListener(new a94.c(c17809xf60523a6, childAt3));
            android.animation.ObjectAnimator ofFloat9 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleX", 0.33333334f, 1.0f);
            ofFloat9.setDuration(j18);
            android.animation.ObjectAnimator ofFloat10 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleY", 0.33333334f, 1.0f);
            ofFloat10.setDuration(j18);
            ofFloat8.addListener(new a94.e(c17809xf60523a6));
            android.animation.ObjectAnimator ofFloat11 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleX", 1.0f, 3.3333333f);
            ofFloat11.setDuration(j18);
            android.animation.ObjectAnimator ofFloat12 = android.animation.ObjectAnimator.ofFloat(childAt3, "scaleY", 1.0f, 3.3333333f);
            ofFloat12.setDuration(j18);
            android.animation.ObjectAnimator ofFloat13 = android.animation.ObjectAnimator.ofFloat(c17809xf60523a6.f245338h, "scaleX", 0.33333334f, 1.0f);
            ofFloat13.setDuration(j18);
            android.animation.ObjectAnimator ofFloat14 = android.animation.ObjectAnimator.ofFloat(c17809xf60523a6.f245338h, "scaleY", 0.33333334f, 1.0f);
            ofFloat14.setDuration(j18);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat8, ofFloat9, ofFloat10);
            animatorSet2.play(ofFloat11).with(ofFloat12).with(ofFloat13).with(ofFloat14).after(ofFloat9);
            animatorSet2.setStartDelay(100L);
            animatorSet2.start();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("playMainCardAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
            android.view.View childAt4 = c17809xf60523a6.getChildAt(1);
            android.view.View childAt5 = c17809xf60523a6.getChildAt(3);
            c17809xf60523a6.d(childAt4, 50, 500, i18);
            c17809xf60523a6.d(childAt5, 50, 500, b18);
            str2 = "startCardAnim";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, str);
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "startPAGAnim");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f245355e;
        if (c22789xd23e9a9b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        } else {
            c22789xd23e9a9b.post(new a94.p(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPAGAnim", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        }
    }

    /* renamed from: setAnimCardView */
    public void m69683xd2703488(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "setAnimCardView");
        if (this.f245359i) {
            this.f245358h.m69681xd2703488(view);
        } else {
            this.f245357g.m69678xd2703488(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnimCardView", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }

    /* renamed from: setOnCardAnimListener */
    public void m69684xf9c29916(a94.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
        this.f245361n = qVar;
        if (this.f245359i) {
            this.f245358h.m69682xf9c29916(qVar);
        } else {
            this.f245357g.m69679xf9c29916(qVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCardAnimListener", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView");
    }
}
