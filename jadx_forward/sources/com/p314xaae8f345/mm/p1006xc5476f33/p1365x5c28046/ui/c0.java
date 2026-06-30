package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f179440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b f179441e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b, java.util.List list) {
        this.f179441e = activityC13279x3d93ec0b;
        this.f179440d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b = this.f179441e;
        activityC13279x3d93ec0b.f179233f.m8151xc67946d3(activityC13279x3d93ec0b.f179234g.w(), activityC13279x3d93ec0b.f179234g.m8008x3d79f549());
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC13279x3d93ec0b.f179232e;
        final java.util.List list = this.f179440d;
        c1163xf1deaba4.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.c0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c0 c0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.c0.this;
                c0Var.getClass();
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b.f179229x0;
                java.util.Set X0 = kz5.n0.X0(kz5.n0.l0(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13292xe0da2002()));
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13279x3d93ec0b activityC13279x3d93ec0b2 = c0Var.f179441e;
                java.util.ArrayList arrayList = activityC13279x3d93ec0b2.f179233f.f402152f;
                for (int i18 = 0; i18 < activityC13279x3d93ec0b2.f179234g.m8008x3d79f549(); i18++) {
                    android.view.View m8007x6a486239 = activityC13279x3d93ec0b2.f179234g.m8007x6a486239(i18);
                    ir.u0 u0Var = (ir.u0) arrayList.get(activityC13279x3d93ec0b2.f179234g.m8032xa86cd69f(m8007x6a486239));
                    if ((u0Var instanceof ir.g) && X0.contains(((ir.g) u0Var).f375369b.mo42933xb5885648())) {
                        final android.view.View findViewById = m8007x6a486239.findViewById(com.p314xaae8f345.mm.R.id.jbx);
                        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                        valueAnimator.setFloatValues(0.0f, 1.0f, 0.0f);
                        valueAnimator.setDuration(3000L);
                        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.emoji.ui.c0$$b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                                android.view.View view = findViewById;
                                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                                arrayList2.add(java.lang.Float.valueOf(floatValue));
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$19", "lambda$animateView$1", "(Landroid/view/View;Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                                yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/EmojiCustomUI$19", "lambda$animateView$1", "(Landroid/view/View;Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            }
                        });
                        valueAnimator.start();
                    }
                }
            }
        });
    }
}
