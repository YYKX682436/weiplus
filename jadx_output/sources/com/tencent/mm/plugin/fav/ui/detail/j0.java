package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class j0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f100742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f100743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f100744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100745g;

    public j0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, r45.gp0 gp0Var, android.widget.ImageView imageView, int i17) {
        this.f100745g = favoriteImgDetailUI;
        this.f100742d = gp0Var;
        this.f100743e = imageView;
        this.f100744f = i17;
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
            com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = (com.tencent.mm.plugin.fav.ui.detail.a1) this.f100745g.f100628p.get(this.f100742d.T);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteImgDetailUI", "scanImage locationInWindow: %s, %s, imageWidth: %s, imageHeight: %s, touch: %s, %s", java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(a1Var.f100693k), java.lang.Integer.valueOf(a1Var.f100694l), java.lang.Float.valueOf(motionEvent.getRawX()), java.lang.Float.valueOf(motionEvent.getRawY()));
            float rawX = motionEvent.getRawX() - iArr[0];
            int i17 = this.f100744f;
            float f17 = rawX - i17;
            float rawY = (motionEvent.getRawY() - iArr[1]) - i17;
            int i18 = a1Var.f100693k;
            int i19 = a1Var.f100694l;
            android.widget.ImageView imageView = this.f100743e;
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
                        com.tencent.mars.xlog.Log.e("MicroMsg.ScanViewUtils", "invertMapPoint invert matrix failed");
                    }
                }
                if (pointF != null) {
                    pointF.x /= width;
                    pointF.y /= height;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanViewUtils", "convertScreenToImageCoordinate screenCoordinate x: %s, y: %s, imageCoordinate: %s, imageWidth: %s, imageHeight: %s, show: %s, %s", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]), pointF, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
                }
            }
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            if (pointF != null) {
                c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(pointF.x));
                c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(pointF.y));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteImgDetailUI", "get touchCoordinate is invalid");
                c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
                c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(motionEvent.getRawX()));
                c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(motionEvent.getRawY()));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/fav/ui/detail/FavoriteImgDetailUI$12", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
