package v22;

/* loaded from: classes10.dex */
public final class a implements zv3.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f514326a;

    /* renamed from: b, reason: collision with root package name */
    public long f514327b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Matrix f514328c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f514329d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Canvas f514330e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f514331f;

    /* renamed from: g, reason: collision with root package name */
    public final wu3.o0 f514332g;

    public a(android.graphics.RectF preViewRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preViewRect, "preViewRect");
        int i17 = t22.o.f496636d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f514326a = arrayList;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        this.f514328c = matrix;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f514329d = paint;
        this.f514332g = new wu3.o0(arrayList);
        float f17 = i17;
        matrix.setPolyToPoly(new float[]{preViewRect.left, preViewRect.top, preViewRect.right, preViewRect.bottom}, 0, new float[]{0.0f, 0.0f, f17, f17}, 0, 2);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever", "<init>", "(Landroid/graphics/RectF;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever", "<init>", "(Landroid/graphics/RectF;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f514331f = createBitmap;
        this.f514330e = new android.graphics.Canvas(createBitmap);
    }

    @Override // zv3.b
    public zv3.a a() {
        if (((java.util.ArrayList) this.f514326a).size() <= 0) {
            return null;
        }
        android.graphics.Canvas canvas = this.f514330e;
        int save = canvas.save();
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        canvas.concat(this.f514328c);
        this.f514327b = this.f514332g.a(canvas, this.f514329d);
        canvas.restoreToCount(save);
        return new zv3.a(this.f514331f, this.f514327b);
    }
}
