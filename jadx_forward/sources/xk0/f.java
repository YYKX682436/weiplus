package xk0;

/* loaded from: classes10.dex */
public class f implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f536482d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f536483e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f536484f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f536485g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f536486h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f536487i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.PointF f536488m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f536492q;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.PointF f536494s;

    /* renamed from: t, reason: collision with root package name */
    public float f536495t;

    /* renamed from: u, reason: collision with root package name */
    public float f536496u;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.PointF f536500y;

    /* renamed from: z, reason: collision with root package name */
    public float f536501z;

    /* renamed from: n, reason: collision with root package name */
    public int f536489n = 0;

    /* renamed from: o, reason: collision with root package name */
    public float f536490o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f536491p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public boolean f536493r = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f536497v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f536498w = true;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f536499x = null;

    public f(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, android.graphics.Rect rect, android.graphics.Rect rect2) {
        new java.util.ArrayList();
        this.f536483e = str;
        this.f536484f = interfaceC4987x84e327cb;
        this.f536482d = context;
        this.f536486h = rect;
        this.f536487i = rect2;
        this.f536488m = new android.graphics.PointF();
        this.f536494s = new android.graphics.PointF();
    }

    /* renamed from: clear */
    public void mo175635x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", "[clear]");
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f536485g.toString());
        this.f536485g.recycle();
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public xk0.f m175636x5a5dd5d() {
        xk0.f fVar;
        java.lang.CloneNotSupportedException e17;
        try {
            fVar = (xk0.f) super.clone();
            try {
                android.graphics.PointF pointF = this.f536488m;
                fVar.f536488m = new android.graphics.PointF(pointF.x, pointF.y);
                fVar.f536484f = this.f536484f;
            } catch (java.lang.CloneNotSupportedException e18) {
                e17 = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EmojiItem", e17, "", new java.lang.Object[0]);
                return fVar;
            }
        } catch (java.lang.CloneNotSupportedException e19) {
            fVar = null;
            e17 = e19;
        }
        return fVar;
    }

    public void g(float f17, float f18, float f19, int i17) {
        this.f536485g = j(p());
        android.graphics.Rect rect = this.f536486h;
        this.f536495t = (rect.width() * 1.2f) / this.f536485g.getWidth();
        float f27 = this.f536495t * f19;
        this.f536495t = f27;
        float width = ((rect.width() * 0.1f) / this.f536485g.getWidth()) * f19;
        this.f536496u = width;
        if (this.f536498w) {
            this.f536491p = (float) (width + ((f27 - width) * 0.28d));
        } else {
            this.f536491p = 1.0f;
        }
        this.f536489n = i17;
        this.f536490o *= this.f536491p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s, mScale:%s", java.lang.Float.valueOf(f27), java.lang.Float.valueOf(this.f536496u), java.lang.Float.valueOf(this.f536491p), java.lang.Float.valueOf(this.f536490o));
        v(f17, f18);
    }

    public void h(float f17, float f18, int i17, float f19, int i18) {
        this.f536485g = j(p());
        float f27 = i18;
        this.f536495t = (1.2f * f27) / r0.getWidth();
        this.f536496u = (f27 * 0.1f) / this.f536485g.getWidth();
        this.f536491p = 1.0f;
        this.f536489n = i17;
        this.f536490o = f19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s, mScale:%s, mRotation:%s", java.lang.Float.valueOf(this.f536495t), java.lang.Float.valueOf(this.f536496u), java.lang.Float.valueOf(this.f536491p), java.lang.Float.valueOf(this.f536490o), java.lang.Integer.valueOf(this.f536489n));
        v(f17, f18);
    }

    public void i(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EmojiItem", "[draw] null == bitmap || bitmap isRecycled");
            return;
        }
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        float f17 = this.f536495t;
        float f18 = this.f536490o;
        if (f17 < f18) {
            this.f536490o = f17;
        } else {
            float f19 = this.f536496u;
            if (f19 > f18) {
                this.f536490o = f19;
            }
        }
        canvas.save();
        android.graphics.PointF pointF = this.f536488m;
        canvas.translate(pointF.x, pointF.y);
        canvas.rotate(this.f536489n);
        float f27 = this.f536490o;
        canvas.scale(f27, f27);
        canvas.setDensity(this.f536485g.getDensity());
        if (s()) {
            canvas.drawBitmap(this.f536485g, (-o()) / 2, (-n()) / 2, (android.graphics.Paint) null);
        } else {
            canvas.clipRect(((-o()) / 2) + 40.0f, ((-n()) / 2) + 40.0f, (this.f536485g.getWidth() / 2) - 40.0f, (this.f536485g.getHeight() / 2) - 40.0f);
            canvas.drawBitmap(this.f536485g, (-o()) / 2, (-n()) / 2, (android.graphics.Paint) null);
        }
        this.f536485g.getDensity();
        m();
        o();
        m();
        canvas.restore();
        canvas.setDrawFilter(null);
    }

    public android.graphics.Bitmap j(android.graphics.Bitmap bitmap) {
        int width = (int) (bitmap.getWidth() + (m() * 2.0f));
        int height = (int) (bitmap.getHeight() + (m() * 2.0f));
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        createBitmap.setDensity(bitmap.getDensity());
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawBitmap(bitmap, m(), m(), (android.graphics.Paint) null);
        android.content.Context context = this.f536482d;
        android.content.res.Resources resources = context.getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f77963x64899a52));
        arrayList2.add(resources);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        byte[] ninePatchChunk = decodeResource.getNinePatchChunk();
        android.content.res.Resources resources2 = context.getResources();
        android.content.res.Resources resources3 = context.getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f77963x64899a52));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource2, "com/tencent/mm/items/EmojiItem", "drawBox", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.drawable.NinePatchDrawable ninePatchDrawable = new android.graphics.drawable.NinePatchDrawable(resources2, decodeResource2, ninePatchChunk, new android.graphics.Rect(), null);
        ninePatchDrawable.setBounds(0, 0, width, height);
        ninePatchDrawable.draw(canvas);
        return createBitmap;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public float m() {
        return 40.0f;
    }

    public int n() {
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    public int o() {
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    public android.graphics.Bitmap p() {
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f536485g = this.f536484f.a0(this.f536482d, 480);
        }
        if (this.f536485g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiItem", "[getEmojiBitmap] NULL!");
            this.f536485g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(120, 120, android.graphics.Bitmap.Config.ARGB_4444, false);
            new android.graphics.Canvas(this.f536485g).drawColor(-7829368);
        }
        return this.f536485g;
    }

    public java.lang.String q() {
        return this.f536483e;
    }

    public void r(android.graphics.Rect rect, boolean z17) {
        float f17 = this.f536490o;
        float m17 = m();
        if (z17) {
            m17 = 0.0f;
        }
        double o17 = ((o() / 2) - m17) * 1.0f * f17;
        double n17 = ((n() / 2) - m17) * 1.0f * f17;
        double d17 = (((this.f536489n + this.f536501z) - 180.0f) * 3.141592653589793d) / 180.0d;
        double sqrt = (float) java.lang.Math.sqrt((o17 * o17) + (n17 * n17));
        int cos = (int) (this.f536488m.x + ((float) (java.lang.Math.cos(d17) * sqrt)));
        int sin = (int) (this.f536488m.y + ((float) (java.lang.Math.sin(d17) * sqrt)));
        double d18 = ((this.f536489n - this.f536501z) * 3.141592653589793d) / 180.0d;
        int cos2 = (int) (this.f536488m.x + ((float) (java.lang.Math.cos(d18) * sqrt)));
        int sin2 = (int) (this.f536488m.y + ((float) (java.lang.Math.sin(d18) * sqrt)));
        double d19 = (((this.f536489n - this.f536501z) + 180.0f) * 3.141592653589793d) / 180.0d;
        double d27 = ((this.f536489n + this.f536501z) * 3.141592653589793d) / 180.0d;
        rect.set(java.lang.Math.min(cos, (int) (this.f536488m.x + ((float) (sqrt * java.lang.Math.cos(d19))))), java.lang.Math.min(sin, sin2), java.lang.Math.max(cos2, (int) (this.f536488m.x + ((float) (java.lang.Math.cos(d27) * sqrt)))), java.lang.Math.max((int) (this.f536488m.y + ((float) (java.lang.Math.sin(d19) * sqrt))), (int) (this.f536488m.y + ((float) (sqrt * java.lang.Math.sin(d27))))));
    }

    public boolean s() {
        if (this.f536493r) {
            return this.f536492q;
        }
        return false;
    }

    public boolean t() {
        android.graphics.Bitmap bitmap = this.f536485g;
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiItem", "bitmap recycle %s", this.f536485g.toString());
        this.f536485g.recycle();
        return true;
    }

    public void u() {
        float f17 = this.f536491p;
        double o17 = ((o() * 1.0f) / 2.0f) * f17;
        double n17 = ((n() * 1.0f) / 2.0f) * f17;
        java.lang.Math.sqrt((o17 * o17) + (n17 * n17));
        this.f536501z = (float) java.lang.Math.toDegrees(java.lang.Math.atan(n17 / o17));
    }

    public void v(float f17, float f18) {
        this.f536488m.set(f17, f18);
        u();
    }

    public void w(boolean z17) {
        this.f536492q = z17;
        if (this.f536493r) {
            return;
        }
        this.f536492q = false;
    }

    public void x(float f17, float f18) {
        this.f536500y = new android.graphics.PointF(f17, f18);
    }

    public void y(float f17, float f18, float f19, int i17) {
        this.f536488m.offset(f17, f18);
        if (0.0f != f19) {
            this.f536490o = f19;
        }
        this.f536489n = i17;
    }

    public f(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2) {
        new java.util.ArrayList();
        this.f536483e = str;
        this.f536482d = context;
        this.f536486h = rect;
        this.f536487i = rect2;
        this.f536488m = new android.graphics.PointF();
        this.f536494s = new android.graphics.PointF();
    }
}
