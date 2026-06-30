package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.z f174906d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.z zVar) {
        this.f174906d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.z zVar = this.f174906d;
        android.graphics.Point point = zVar.f174908b;
        mp1.b bVar = zVar.f174907a;
        if (point == null) {
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(point.x);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(point.y);
        float f17 = zVar.f174911e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, ballPos(x:%d, y:%d), lastSwipePosX:%f", valueOf, valueOf2, java.lang.Float.valueOf(f17));
        dp1.x xVar = zVar.f174909c;
        if (xVar.mo50330x8c409d27() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page mask view is null");
            bVar.a();
            return;
        }
        if (xVar.mo50329xc2a54588() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page content view is null");
            bVar.a();
            return;
        }
        if (xVar.a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page root view is null");
            bVar.a();
            return;
        }
        android.graphics.Bitmap mo50328x12501425 = xVar.mo50328x12501425();
        if (mo50328x12501425 == null || mo50328x12501425.isRecycled() || mo50328x12501425.getWidth() == 0 || mo50328x12501425.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page get bitmap is null");
            bVar.a();
            return;
        }
        rp1.n2 n2Var = new rp1.n2(xVar.mo50327x19263085(), mo50328x12501425);
        n2Var.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi == null || !Bi.Y()) {
            int i17 = point.x;
            int i18 = point.y;
            int i19 = qp1.c0.f447226b;
            n2Var.f480030q = i17;
            n2Var.f480031r = i18;
            n2Var.f480027n = i19 / 2;
            n2Var.f480028o = i19;
            n2Var.f480029p = i19;
        } else {
            int i27 = point.x;
            int i28 = point.y;
            int i29 = qp1.c0.f447232h;
            android.graphics.Point point2 = zVar.f174910d;
            int i37 = point2 != null ? point2.x : qp1.c0.f447226b;
            int i38 = point2 != null ? point2.y : qp1.c0.f447226b;
            n2Var.f480030q = i27;
            n2Var.f480031r = i28;
            n2Var.f480027n = i29;
            n2Var.f480028o = i37;
            n2Var.f480029p = i38;
        }
        n2Var.m162839x4b34b00f((int) f17);
        n2Var.m162840xc6cf6336(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.d0(Bi, n2Var, bVar, xVar));
        android.view.ViewGroup a17 = xVar.a();
        a17.addView(n2Var, a17.getChildCount());
        android.view.View mo50329xc2a54588 = xVar.mo50329xc2a54588();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo50329xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo50329xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo50329xc2a54588, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        int i39 = n2Var.f480034u;
        n2Var.f480035v = i39 > 0;
        int i47 = n2Var.f480030q;
        if (i39 < i47) {
            i47 = i39;
        }
        android.animation.PropertyValuesHolder ofInt = android.animation.PropertyValuesHolder.ofInt("canvasTranslationX", i39, i47);
        int i48 = n2Var.f480030q;
        if (n2Var.f480035v) {
            int i49 = n2Var.f480034u;
            i48 = i49 < i48 ? i48 - i49 : 0;
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("translationX", 0, i48), android.animation.PropertyValuesHolder.ofInt("translationY", 0, n2Var.f480031r), android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, n2Var.f480028o / n2Var.f480032s), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, n2Var.f480029p / n2Var.f480033t), ofInt, android.animation.PropertyValuesHolder.ofInt("bgAlpha", 255, 0));
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.setInterpolator(linearInterpolator);
        ofPropertyValuesHolder.addUpdateListener(new rp1.l2(n2Var));
        ofPropertyValuesHolder.addListener(new rp1.m2(n2Var));
        ofPropertyValuesHolder.start();
    }
}
