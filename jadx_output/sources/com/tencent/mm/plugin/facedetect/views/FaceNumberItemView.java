package com.tencent.mm.plugin.facedetect.views;

/* loaded from: classes4.dex */
public class FaceNumberItemView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f100135d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Paint f100136e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.RectF f100137f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f100138g;

    /* renamed from: h, reason: collision with root package name */
    public int f100139h;

    /* renamed from: i, reason: collision with root package name */
    public int f100140i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f100141m;

    public FaceNumberItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float width;
        int height;
        int height2;
        float height3;
        super.onDraw(canvas);
        int i17 = this.f100139h;
        if (i17 == 17) {
            width = (getWidth() - this.f100138g.getWidth()) >> 1;
            height = getHeight();
            height2 = this.f100138g.getHeight();
        } else {
            if (i17 == 3) {
                height3 = (getHeight() - this.f100138g.getHeight()) >> 1;
                width = 0.0f;
                canvas.drawBitmap(this.f100138g, width, height3, (android.graphics.Paint) null);
                this.f100137f.set(width, 0.0f, ((this.f100138g.getWidth() * this.f100140i) / 30.0f) + width, getHeight());
                canvas.drawRect(this.f100137f, this.f100136e);
            }
            if (i17 == 5) {
                width = getWidth() - this.f100138g.getWidth();
                height = getHeight();
                height2 = this.f100138g.getHeight();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FaceNumberItemView", "hy: not support gravity! treat as center");
                width = (getWidth() - this.f100138g.getWidth()) >> 1;
                height = getHeight();
                height2 = this.f100138g.getHeight();
            }
        }
        height3 = (height - height2) >> 1;
        canvas.drawBitmap(this.f100138g, width, height3, (android.graphics.Paint) null);
        this.f100137f.set(width, 0.0f, ((this.f100138g.getWidth() * this.f100140i) / 30.0f) + width, getHeight());
        canvas.drawRect(this.f100137f, this.f100136e);
    }

    public void setGravity(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceNumberItemView", "hy: setting gravity");
        this.f100139h = i17;
    }

    public void setImageResource(int i17) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "setImageResource", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/facedetect/views/FaceNumberItemView", "setImageResource", "(I)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        if (i17 != com.tencent.mm.R.drawable.c28) {
            this.f100138g = android.graphics.Bitmap.createScaledBitmap(decodeResource, i65.a.b(getContext(), 48), decodeResource.getHeight(), false);
            return;
        }
        int dimensionPixelSize = (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480404wz) - i65.a.b(getContext(), 8)) / 2;
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
        this.f100138g = createBitmap;
    }

    public FaceNumberItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f100135d = null;
        this.f100136e = null;
        this.f100137f = null;
        this.f100138g = null;
        this.f100139h = 17;
        this.f100140i = 0;
        this.f100141m = new i72.t(this);
        setLayerType(1, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f100136e = paint;
        paint.setColor(context.getResources().getColor(com.tencent.mm.R.color.f478944lk));
        this.f100136e.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_ATOP));
        this.f100137f = new android.graphics.RectF();
    }
}
