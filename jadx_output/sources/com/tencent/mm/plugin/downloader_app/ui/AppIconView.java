package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes4.dex */
public class AppIconView extends androidx.appcompat.widget.AppCompatImageView {

    /* renamed from: m, reason: collision with root package name */
    public static final android.graphics.PorterDuffXfermode f97351m = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f97352f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f97353g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f97354h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f97355i;

    public AppIconView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        if (this.f97354h == null) {
            this.f97354h = new android.graphics.Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f97353g == null) {
            this.f97353g = new android.graphics.RectF(this.f97354h);
        }
        if (this.f97352f != null && this.f97355i != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            android.graphics.Bitmap bitmap = this.f97355i;
            android.graphics.Rect rect = this.f97354h;
            canvas.drawBitmap(bitmap, rect, rect, paint);
            paint.setXfermode(f97351m);
            canvas.drawBitmap(this.f97352f, (android.graphics.Rect) null, this.f97354h, paint);
            canvas.restoreToCount(saveLayer);
            paint.setXfermode(null);
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478686e3));
        canvas.drawRoundRect(this.f97353g, 32.0f, 32.0f, paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.f97353g = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        this.f97354h = new android.graphics.Rect(0, 0, i17, i18);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/AppIconView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/downloader_app/ui/AppIconView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478685e2));
        canvas.drawRoundRect(this.f97353g, 32.0f, 32.0f, paint);
        this.f97355i = createBitmap;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f97352f = bitmap;
        super.setImageBitmap(bitmap);
    }
}
