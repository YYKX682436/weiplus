package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes3.dex */
public final class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 f255395d;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5) {
        this.f255395d = activityC18624x35d9f9b5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5 activityC18624x35d9f9b5 = this.f255395d;
        if (activityC18624x35d9f9b5.f255016e) {
            return;
        }
        activityC18624x35d9f9b5.f255016e = true;
        int intExtra = activityC18624x35d9f9b5.getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1);
        int intExtra2 = activityC18624x35d9f9b5.getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            activityC18624x35d9f9b5.m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.l4(activityC18624x35d9f9b5), 300L);
            return;
        }
        android.view.View m78513xc2a54588 = activityC18624x35d9f9b5.m78513xc2a54588();
        if (m78513xc2a54588 != null) {
            m78513xc2a54588.setClipToOutline(true);
        }
        m78513xc2a54588.setTranslationX(intExtra);
        m78513xc2a54588.setTranslationY(intExtra2);
        int h17 = i65.a.h(activityC18624x35d9f9b5, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int h18 = i65.a.h(activityC18624x35d9f9b5, com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        m78513xc2a54588.setPivotX(0.0f);
        m78513xc2a54588.setPivotY(0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m78513xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m78513xc2a54588.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m78513xc2a54588, "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity", "handleEnterAnimInner", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.ViewPropertyAnimator alpha = m78513xc2a54588.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f);
        alpha.setInterpolator(ta5.h.f498412a.a());
        alpha.setDuration(200L);
        alpha.start();
        alpha.setUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.n4(m78513xc2a54588, h18, h18, h17));
        alpha.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.o4(activityC18624x35d9f9b5));
    }
}
