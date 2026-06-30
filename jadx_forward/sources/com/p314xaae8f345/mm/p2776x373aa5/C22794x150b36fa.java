package com.p314xaae8f345.mm.p2776x373aa5;

/* renamed from: com.tencent.mm.view.NinePatchCropImageView */
/* loaded from: classes5.dex */
public class C22794x150b36fa extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f294904f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.NinePatch f294905g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f294906h;

    public C22794x150b36fa(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f294904f = new android.graphics.Paint();
        this.f294905g = null;
        this.f294906h = null;
        n();
    }

    public final void n() {
        android.graphics.PorterDuffXfermode porterDuffXfermode = new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN);
        android.graphics.Paint paint = this.f294904f;
        paint.setXfermode(porterDuffXfermode);
        paint.setAntiAlias(true);
        this.f294906h = getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        if (this.f294905g == null) {
            super.onDraw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(null, null);
        android.graphics.drawable.Drawable drawable = this.f294906h;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            this.f294906h.draw(canvas);
        }
        super.onDraw(canvas);
        getWidth();
        getHeight();
        android.graphics.Paint paint = this.f294904f;
        this.f294905g.draw(canvas, new android.graphics.Rect(0, 0, getWidth(), getHeight()), paint);
        canvas.restoreToCount(saveLayer);
    }

    /* renamed from: setEraseEdge */
    public void m82622xf230e341(boolean z17) {
    }

    /* renamed from: setNinePatchId */
    public void m82623x81e824af(int i17) {
        android.content.res.Resources resources = getContext().getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/view/NinePatchCropImageView", "setNinePatchId", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/view/NinePatchCropImageView", "setNinePatchId", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        if (decodeResource != null) {
            this.f294905g = new android.graphics.NinePatch(decodeResource, decodeResource.getNinePatchChunk(), null);
        }
    }

    public C22794x150b36fa(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f294904f = new android.graphics.Paint();
        this.f294905g = null;
        this.f294906h = null;
        n();
    }
}
