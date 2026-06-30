package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.p1314x373aa5;

/* renamed from: com.tencent.mm.plugin.card.ui.view.CircularImageView */
/* loaded from: classes5.dex */
public class C13078xb50e8ea1 extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f176962d;

    public C13078xb50e8ea1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        android.graphics.Bitmap bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CircularImageView", "getRoundBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/card/ui/view/CircularImageView", "getRoundBitmap", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        android.graphics.Paint paint = this.f176962d;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFlags(1);
        canvas2.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        canvas2.drawARGB(0, 0, 0, 0);
        float f17 = 20;
        canvas2.drawRoundRect(rectF, f17, f17, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
        canvas2.drawBitmap(bitmap, rect, rect, paint);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, getWidth(), getHeight());
        paint.reset();
        canvas.drawBitmap(createBitmap, rect2, rect3, paint);
        canvas.save();
    }

    public C13078xb50e8ea1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f176962d = new android.graphics.Paint();
    }
}
