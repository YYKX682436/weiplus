package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.AppIconView */
/* loaded from: classes4.dex */
public class C13239x6402dbdf extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: m, reason: collision with root package name */
    public static final android.graphics.PorterDuffXfermode f178884m = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN);

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f178885f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f178886g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f178887h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f178888i;

    public C13239x6402dbdf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        if (this.f178887h == null) {
            this.f178887h = new android.graphics.Rect(0, 0, getWidth(), getHeight());
        }
        if (this.f178886g == null) {
            this.f178886g = new android.graphics.RectF(this.f178887h);
        }
        if (this.f178885f != null && this.f178888i != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            android.graphics.Bitmap bitmap = this.f178888i;
            android.graphics.Rect rect = this.f178887h;
            canvas.drawBitmap(bitmap, rect, rect, paint);
            paint.setXfermode(f178884m);
            canvas.drawBitmap(this.f178885f, (android.graphics.Rect) null, this.f178887h, paint);
            canvas.restoreToCount(saveLayer);
            paint.setXfermode(null);
        }
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560219e3));
        canvas.drawRoundRect(this.f178886g, 32.0f, 32.0f, paint);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        this.f178886g = new android.graphics.RectF(0.0f, 0.0f, i17, i18);
        this.f178887h = new android.graphics.Rect(0, 0, i17, i18);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/AppIconView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/downloader_app/ui/AppIconView", "makeSrc", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560218e2));
        canvas.drawRoundRect(this.f178886g, 32.0f, 32.0f, paint);
        this.f178888i = createBitmap;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f178885f = bitmap;
        super.setImageBitmap(bitmap);
    }
}
