package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class j0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f182275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f182276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c f182278g;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c, r45.gp0 gp0Var, android.widget.ImageView imageView, int i17) {
        this.f182278g = activityC13591xdaafa82c;
        this.f182275d = gp0Var;
        this.f182276e = imageView;
        this.f182277f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1) this.f182278g.f182161p.get(this.f182275d.T);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteImgDetailUI", "scanImage locationInWindow: %s, %s, imageWidth: %s, imageHeight: %s, touch: %s, %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(a1Var.f182226k), java.lang.Integer.valueOf(a1Var.f182227l), java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
            float rawX = motionEvent.getRawX() - iArr[0];
            int i17 = this.f182277f;
            float f17 = rawX - i17;
            float rawY = (motionEvent.getRawY() - iArr[1]) - i17;
            int i18 = a1Var.f182226k;
            int i19 = a1Var.f182227l;
            android.widget.ImageView imageView = this.f182276e;
            android.graphics.PointF pointF = null;
            if (imageView != null && i18 > 0 && i19 > 0) {
                float[] fArr = {f17, rawY};
                android.graphics.Matrix imageMatrix = imageView.getImageMatrix();
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                android.graphics.Rect bounds = drawable != null ? drawable.getBounds() : null;
                int width = bounds != null ? bounds.width() : i18;
                int height = bounds != null ? bounds.height() : i19;
                if (imageMatrix != null) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    if (imageMatrix.invert(matrix)) {
                        float[] fArr2 = new float[2];
                        matrix.mapPoints(fArr2, fArr);
                        pointF = new android.graphics.PointF(fArr2[0], fArr2[1]);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanViewUtils", "invertMapPoint invert matrix failed");
                    }
                }
                if (pointF != null) {
                    pointF.x /= width;
                    pointF.y /= height;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanViewUtils", "convertScreenToImageCoordinate screenCoordinate x: %s, y: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s, show: %s, %s", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]), pointF, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
                }
            }
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            if (pointF != null) {
                c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(pointF.x));
                c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(pointF.y));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteImgDetailUI", "get touchCoordinate is invalid");
                c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
                c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(motionEvent.getRawX()));
                c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(motionEvent.getRawY()));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
