package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes5.dex */
public class n0 extends android.graphics.drawable.Drawable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f91768e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f91769a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f91770b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f91771c = new android.graphics.Paint();

    /* renamed from: d, reason: collision with root package name */
    public int f91772d = 0;

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        if (bounds.width() <= 0 || bounds.height() <= 0) {
            return;
        }
        int i17 = bounds.top;
        android.graphics.Rect rect = this.f91769a;
        int min = java.lang.Math.min(i17 + rect.top, bounds.bottom);
        int min2 = java.lang.Math.min(bounds.left + rect.left, bounds.right);
        int max = java.lang.Math.max(bounds.right - rect.right, bounds.left);
        int max2 = java.lang.Math.max(bounds.bottom - rect.bottom, bounds.top);
        android.graphics.Paint paint = this.f91771c;
        if (this.f91772d != 0) {
            int i18 = rect.left;
            android.graphics.Rect rect2 = this.f91770b;
            if (i18 > 0) {
                rect2.set(bounds.left, min, min2, max2);
                paint.setColor(this.f91772d);
                canvas.drawRect(rect2, paint);
            }
            if (rect.right > 0) {
                rect2.set(max, min, bounds.right, max2);
                paint.setColor(this.f91772d);
                canvas.drawRect(rect2, paint);
            }
            if (rect.bottom > 0) {
                rect2.set(min2, max2, max, bounds.bottom);
                paint.setColor(this.f91772d);
                canvas.drawRect(rect2, paint);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
