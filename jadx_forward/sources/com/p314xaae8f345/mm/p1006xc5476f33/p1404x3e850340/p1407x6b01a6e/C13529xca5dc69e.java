package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceNumberItemView */
/* loaded from: classes4.dex */
public class C13529xca5dc69e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f181668d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f181669e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.RectF f181670f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f181671g;

    /* renamed from: h, reason: collision with root package name */
    public int f181672h;

    /* renamed from: i, reason: collision with root package name */
    public int f181673i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f181674m;

    public C13529xca5dc69e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width;
        int height;
        int height2;
        float height3;
        super.onDraw(canvas);
        int i17 = this.f181672h;
        if (i17 == 17) {
            width = (getWidth() - this.f181671g.getWidth()) >> 1;
            height = getHeight();
            height2 = this.f181671g.getHeight();
        } else {
            if (i17 == 3) {
                height3 = (getHeight() - this.f181671g.getHeight()) >> 1;
                width = 0.0f;
                canvas.drawBitmap(this.f181671g, width, height3, (android.graphics.Paint) null);
                this.f181670f.set(width, 0.0f, ((this.f181671g.getWidth() * this.f181673i) / 30.0f) + width, getHeight());
                canvas.drawRect(this.f181670f, this.f181669e);
            }
            if (i17 == 5) {
                width = getWidth() - this.f181671g.getWidth();
                height = getHeight();
                height2 = this.f181671g.getHeight();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceNumberItemView", "hy: not support gravity! treat as center");
                width = (getWidth() - this.f181671g.getWidth()) >> 1;
                height = getHeight();
                height2 = this.f181671g.getHeight();
            }
        }
        height3 = (height - height2) >> 1;
        canvas.drawBitmap(this.f181671g, width, height3, (android.graphics.Paint) null);
        this.f181670f.set(width, 0.0f, ((this.f181671g.getWidth() * this.f181673i) / 30.0f) + width, getHeight());
        canvas.drawRect(this.f181670f, this.f181669e);
    }

    /* renamed from: setGravity */
    public void m55283xc1f6fb8c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceNumberItemView", "hy: setting gravity");
        this.f181672h = i17;
    }

    /* renamed from: setImageResource */
    public void m55284x8d516947(int i17) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "setImageResource", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "setImageResource", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        if (i17 != com.p314xaae8f345.mm.R.C30861xcebc809e.c28) {
            this.f181671g = android.graphics.Bitmap.createScaledBitmap(decodeResource, i65.a.b(getContext(), 48), decodeResource.getHeight(), false);
            return;
        }
        int dimensionPixelSize = (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561937wz) - i65.a.b(getContext(), 8)) / 2;
        int width = decodeResource.getWidth() + (dimensionPixelSize * 2);
        int height = decodeResource.getHeight() + 0;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "pad", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "pad", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawARGB(0, 255, 255, 255);
        canvas.drawBitmap(decodeResource, dimensionPixelSize, 0, (android.graphics.Paint) null);
        this.f181671g = createBitmap;
    }

    public C13529xca5dc69e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f181668d = null;
        this.f181669e = null;
        this.f181670f = null;
        this.f181671g = null;
        this.f181672h = 17;
        this.f181673i = 0;
        this.f181674m = new i72.t(this);
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f181669e = paint;
        paint.setColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560477lk));
        this.f181669e.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP));
        this.f181670f = new android.graphics.RectF();
    }
}
