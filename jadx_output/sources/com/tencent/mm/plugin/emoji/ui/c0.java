package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiCustomUI f97908e;

    public c0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, java.util.List list) {
        this.f97908e = emojiCustomUI;
        this.f97907d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI = this.f97908e;
        emojiCustomUI.f97700f.notifyItemRangeChanged(emojiCustomUI.f97701g.w(), emojiCustomUI.f97701g.getChildCount());
        androidx.recyclerview.widget.RecyclerView recyclerView = emojiCustomUI.f97699e;
        final java.util.List list = this.f97907d;
        recyclerView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.ui.c0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.emoji.ui.c0 c0Var = com.tencent.mm.plugin.emoji.ui.c0.this;
                c0Var.getClass();
                int i17 = com.tencent.mm.plugin.emoji.ui.EmojiCustomUI.f97696x0;
                java.util.Set X0 = kz5.n0.X0(kz5.n0.l0(list, new com.tencent.mm.plugin.emoji.ui.EmojiCustomUI$$m()));
                com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI2 = c0Var.f97908e;
                java.util.ArrayList arrayList = emojiCustomUI2.f97700f.f320619f;
                for (int i18 = 0; i18 < emojiCustomUI2.f97701g.getChildCount(); i18++) {
                    android.view.View childAt = emojiCustomUI2.f97701g.getChildAt(i18);
                    ir.u0 u0Var = (ir.u0) arrayList.get(emojiCustomUI2.f97701g.getPosition(childAt));
                    if ((u0Var instanceof ir.g) && X0.contains(((ir.g) u0Var).f293836b.getMd5())) {
                        final android.view.View findViewById = childAt.findViewById(com.tencent.mm.R.id.jbx);
                        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                        valueAnimator.setFloatValues(0.0f, 1.0f, 0.0f);
                        valueAnimator.setDuration(3000L);
                        valueAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.plugin.emoji.ui.c0$$b
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                                android.view.View view = findViewById;
                                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
