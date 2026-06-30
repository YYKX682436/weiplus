package ub3;

/* loaded from: classes15.dex */
public class e implements ub3.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 f507631a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404) {
        this.f507631a = activityC16330x45b4a404;
    }

    public void a(android.animation.ValueAnimator valueAnimator, android.view.View view) {
        float f17;
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.ActivityC16330x45b4a404 activityC16330x45b4a404 = this.f507631a;
        if (floatValue == 0.0f) {
            activityC16330x45b4a404.N = view.getTranslationX();
            activityC16330x45b4a404.P = view.getTranslationY();
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.j1z);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        float f18 = 1.0f - floatValue;
        view.setTranslationX(activityC16330x45b4a404.N * f18);
        view.setTranslationY((activityC16330x45b4a404.P * f18) - ((activityC16330x45b4a404.f226626z.getHeight() + (activityC16330x45b4a404.P * 8.0f)) * floatValue));
        float f19 = (0.5f * floatValue) + 1.0f;
        view.setScaleX(f19);
        view.setScaleY(f19);
        android.util.Pair pair = (android.util.Pair) ((java.util.LinkedList) activityC16330x45b4a404.f226618v).peek();
        if (pair != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16330x45b4a404.L) && activityC16330x45b4a404.L.equals(pair.first)) {
            android.view.View view2 = activityC16330x45b4a404.E;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuckyMoneyF2FQRCodeUI", "fireworkBottomLayer %f", java.lang.Float.valueOf(floatValue));
        if (floatValue >= 0.9f) {
            float f27 = f18 * 10.0f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(f27));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = activityC16330x45b4a404.f226605i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(1.0f - f27));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            activityC16330x45b4a404.f226605i.setScaleX(floatValue);
            activityC16330x45b4a404.f226605i.setScaleY(floatValue);
            android.view.View view4 = activityC16330x45b4a404.f226605i;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/f2f/ui/LuckyMoneyF2FQRCodeUI$12", "update", "(Landroid/animation/ValueAnimator;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f17 = 1.0f;
        } else {
            f17 = 1.0f;
        }
        if (floatValue == f17) {
            activityC16330x45b4a404.H.a("packet_received.m4a");
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = activityC16330x45b4a404.f226626z;
            c16332x7cb9791e.removeView(c16332x7cb9791e.m66060xfd54e659());
            activityC16330x45b4a404.f226607m = (android.widget.ImageView) activityC16330x45b4a404.f226605i.findViewById(com.p314xaae8f345.mm.R.id.j67);
            activityC16330x45b4a404.f226608n = (android.widget.TextView) activityC16330x45b4a404.f226605i.findViewById(com.p314xaae8f345.mm.R.id.j68);
            activityC16330x45b4a404.f226609o = (android.widget.TextView) activityC16330x45b4a404.f226605i.findViewById(com.p314xaae8f345.mm.R.id.j5p);
            android.util.Pair pair2 = (android.util.Pair) ((java.util.LinkedList) activityC16330x45b4a404.f226618v).poll();
            if (pair2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(activityC16330x45b4a404.f226607m, null, (java.lang.String) pair2.first);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16330x45b4a404, activityC16330x45b4a404.f226608n, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.m((java.lang.String) pair2.first));
                activityC16330x45b4a404.f226609o.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(((java.lang.Integer) pair2.second).intValue() / 100.0d));
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16330x45b4a404.L) && activityC16330x45b4a404.L.equals(pair2.first)) {
                    e51.a.a(activityC16330x45b4a404.C, activityC16330x45b4a404.D1).d(800, 100L);
                    e51.a.a(activityC16330x45b4a404.D, activityC16330x45b4a404.E1).d(800, 100L);
                    activityC16330x45b4a404.H.a("most_lucky.m4a");
                    if (((java.lang.Integer) pair2.second).intValue() >= 19000) {
                        activityC16330x45b4a404.H.a("whistle.m4a");
                    }
                }
            }
            activityC16330x45b4a404.M.start();
        }
    }
}
