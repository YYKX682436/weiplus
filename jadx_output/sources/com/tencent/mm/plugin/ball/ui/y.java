package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.z f93373d;

    public y(com.tencent.mm.plugin.ball.ui.z zVar) {
        this.f93373d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.ui.z zVar = this.f93373d;
        android.graphics.Point point = zVar.f93375b;
        mp1.b bVar = zVar.f93374a;
        if (point == null) {
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(point.x);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(point.y);
        float f17 = zVar.f93378e;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, ballPos(x:%d, y:%d), lastSwipePosX:%f", valueOf, valueOf2, java.lang.Float.valueOf(f17));
        dp1.x xVar = zVar.f93376c;
        if (xVar.getMaskView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page mask view is null");
            bVar.a();
            return;
        }
        if (xVar.getContentView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page content view is null");
            bVar.a();
            return;
        }
        if (xVar.a() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page root view is null");
            bVar.a();
            return;
        }
        android.graphics.Bitmap bitmap = xVar.getBitmap();
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallSwipeTransformationHelper", "doMaskAnimation, page get bitmap is null");
            bVar.a();
            return;
        }
        rp1.n2 n2Var = new rp1.n2(xVar.getActivity(), bitmap);
        n2Var.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi == null || !Bi.Y()) {
            int i17 = point.x;
            int i18 = point.y;
            int i19 = qp1.c0.f365693b;
            n2Var.f398497q = i17;
            n2Var.f398498r = i18;
            n2Var.f398494n = i19 / 2;
            n2Var.f398495o = i19;
            n2Var.f398496p = i19;
        } else {
            int i27 = point.x;
            int i28 = point.y;
            int i29 = qp1.c0.f365699h;
            android.graphics.Point point2 = zVar.f93377d;
            int i37 = point2 != null ? point2.x : qp1.c0.f365693b;
            int i38 = point2 != null ? point2.y : qp1.c0.f365693b;
            n2Var.f398497q = i27;
            n2Var.f398498r = i28;
            n2Var.f398494n = i29;
            n2Var.f398495o = i37;
            n2Var.f398496p = i38;
        }
        n2Var.setContentStartPosX((int) f17);
        n2Var.setListener(new com.tencent.mm.plugin.ball.ui.d0(Bi, n2Var, bVar, xVar));
        android.view.ViewGroup a17 = xVar.a();
        a17.addView(n2Var, a17.getChildCount());
        android.view.View contentView = xVar.getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper", "doMaskAnimation", "(Lcom/tencent/mm/plugin/ball/adapter/IFloatBallPageAdapter;Landroid/graphics/Point;Landroid/graphics/Point;FLcom/tencent/mm/plugin/ball/listener/OnFloatBallTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.LinearInterpolator linearInterpolator = new android.view.animation.LinearInterpolator();
        int i39 = n2Var.f398501u;
        n2Var.f398502v = i39 > 0;
        int i47 = n2Var.f398497q;
        if (i39 < i47) {
            i47 = i39;
        }
        android.animation.PropertyValuesHolder ofInt = android.animation.PropertyValuesHolder.ofInt("canvasTranslationX", i39, i47);
        int i48 = n2Var.f398497q;
        if (n2Var.f398502v) {
            int i49 = n2Var.f398501u;
            i48 = i49 < i48 ? i48 - i49 : 0;
        }
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("translationX", 0, i48), android.animation.PropertyValuesHolder.ofInt("translationY", 0, n2Var.f398498r), android.animation.PropertyValuesHolder.ofFloat("scaleX", 1.0f, n2Var.f398495o / n2Var.f398499s), android.animation.PropertyValuesHolder.ofFloat("scaleY", 1.0f, n2Var.f398496p / n2Var.f398500t), ofInt, android.animation.PropertyValuesHolder.ofInt("bgAlpha", 255, 0));
        ofPropertyValuesHolder.setDuration(300);
        ofPropertyValuesHolder.setInterpolator(linearInterpolator);
        ofPropertyValuesHolder.addUpdateListener(new rp1.l2(n2Var));
        ofPropertyValuesHolder.addListener(new rp1.m2(n2Var));
        ofPropertyValuesHolder.start();
    }
}
