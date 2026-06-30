package zv3;

/* loaded from: classes10.dex */
public final class f implements zv3.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f557974d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f557975e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f557976f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Canvas f557977g;

    public f(float[] drawingRect, float[] fArr, java.util.List editorItems, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorItems, "editorItems");
        this.f557974d = editorItems;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f557975e = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/retriever/SimpleFrameRetriever", "<init>", "([F[FLjava/util/List;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/ui/editor/retriever/SimpleFrameRetriever", "<init>", "([F[FLjava/util/List;II)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        this.f557976f = createBitmap;
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        this.f557977g = canvas;
        canvas.translate(-drawingRect[0], -drawingRect[1]);
    }

    public void a() {
        try {
            java.util.Iterator it = this.f557974d.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).b();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SimpleFrameRetriever", e17, "destroy error", new java.lang.Object[0]);
        }
    }

    public android.graphics.Bitmap d(long j17) {
        java.util.List<av3.a> list = this.f557974d;
        if (list.size() == 0) {
            return null;
        }
        android.graphics.Canvas canvas = this.f557977g;
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        for (av3.a aVar : list) {
            aVar.f(j17);
            aVar.c(canvas, this.f557975e);
        }
        return this.f557976f;
    }

    public void e() {
        try {
            java.util.Iterator it = this.f557974d.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).d();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SimpleFrameRetriever", e17, "start error", new java.lang.Object[0]);
        }
    }
}
