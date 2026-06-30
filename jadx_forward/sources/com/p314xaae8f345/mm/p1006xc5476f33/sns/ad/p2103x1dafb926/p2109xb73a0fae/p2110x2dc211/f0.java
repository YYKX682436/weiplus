package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211;

/* loaded from: classes4.dex */
public class f0 implements e94.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f244624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 f244625b;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var, boolean z17) {
        this.f244625b = i0Var;
        this.f244624a = z17;
    }

    @Override // e94.f0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var = this.f244625b;
        boolean r17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.r(i0Var);
        boolean z17 = this.f244624a;
        if (!r17 && !z17) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.b(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.start();
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.h(i0Var), "alpha", com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.h(i0Var).getAlpha(), 0.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.start();
        }
        if (!z17) {
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.i(i0Var)) {
                android.view.View m17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.m(i0Var);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.m(i0Var), "alpha", 0.0f, 1.0f);
            ofFloat3.setDuration(500L);
            ofFloat3.start();
        }
        android.view.View q17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).q();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(q17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        q17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(q17, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper$8", "onStartFlip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|8|(1:10)(1:20)|11|12|(1:14)(1:18)|15|16))|23|6|7|8|(0)(0)|11|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageEggCardHelper", "twist report exp=" + r3.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005e A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0056, B:10:0x005e, B:20:0x0072), top: B:7:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #0 {all -> 0x0085, blocks: (B:8:0x0056, B:10:0x005e, B:20:0x0072), top: B:7:0x0056 }] */
    @Override // e94.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.f0.b():void");
    }

    @Override // e94.f0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0 i0Var = this.f244625b;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.a(i0Var).getF147381t()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.a(i0Var).m78735x28280f95().m81450x8e764904(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.a(i0Var).b8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.a(i0Var).e8();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17823xedff0bda c17823xedff0bda = i0Var.f244635b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
        c17823xedff0bda.setVisibility(8);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).P();
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).e0()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).i0(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).m0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.d(i0Var).removeCallbacksAndMessages(null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.b0 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var);
                c17.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                boolean z17 = c17.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowDoubleHBCard", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingEggCardComponent");
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.d(i0Var).sendEmptyMessageDelayed(3, 7000L);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.d(i0Var).sendEmptyMessageDelayed(1, 3000L);
                }
            } else {
                i0Var.L(true, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.i0.c(i0Var).R();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onEndFlip", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper$8");
    }
}
