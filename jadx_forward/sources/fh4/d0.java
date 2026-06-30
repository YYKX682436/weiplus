package fh4;

/* loaded from: classes15.dex */
public class d0 extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public int f344205d;

    /* renamed from: e, reason: collision with root package name */
    public float f344206e;

    /* renamed from: f, reason: collision with root package name */
    public float f344207f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.SurfaceHolder f344208g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f344209h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f344210i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f344211m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Paint f344212n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f344213o;

    /* renamed from: p, reason: collision with root package name */
    public int f344214p;

    /* renamed from: q, reason: collision with root package name */
    public int f344215q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f344216r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f344217s;

    /* renamed from: t, reason: collision with root package name */
    public float f344218t;

    /* renamed from: u, reason: collision with root package name */
    public float f344219u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.PaintFlagsDrawFilter f344220v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f344221w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f344222x;

    /* renamed from: y, reason: collision with root package name */
    public float[] f344223y;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.C18552xddf7b248 c18552xddf7b248, android.content.Context context) {
        super(context);
        this.f344205d = 100;
        this.f344206e = 0.0f;
        this.f344207f = 0.0f;
        this.f344217s = false;
        this.f344218t = 0.0f;
        this.f344219u = 0.0f;
        this.f344221w = false;
        this.f344222x = false;
        android.view.SurfaceHolder holder = getHolder();
        this.f344208g = holder;
        holder.addCallback(this);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f344212n = paint;
        paint.setAntiAlias(true);
        this.f344220v = new android.graphics.PaintFlagsDrawFilter(0, 3);
        this.f344216r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.c0(this), true);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        this.f344207f = 0.0f;
        this.f344206e = i19 - (this.f344209h == null ? 190 : r2.getHeight());
        float f17 = this.f344207f;
        this.f344218t = f17;
        this.f344219u = f17;
        this.f344215q = i18;
        android.graphics.Bitmap bitmap = this.f344209h;
        this.f344214p = bitmap != null ? bitmap.getHeight() : 190;
        int i27 = (int) this.f344218t;
        this.f344213o = new android.graphics.Rect(0, i27, this.f344215q, this.f344214p + i27);
        this.f344217s = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563689bo3));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f344209h = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563688bo2));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f344211m = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.f563690bo4));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/talkroom/ui/TalkRoomVolumeMeter$FloatView", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f344210i = decodeResource3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.f344217s = false;
        this.f344216r.d();
        android.graphics.Bitmap bitmap = this.f344209h;
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap.toString());
            this.f344209h.recycle();
            this.f344209h = null;
        }
        android.graphics.Bitmap bitmap2 = this.f344211m;
        if (bitmap2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap2.toString());
            this.f344211m.recycle();
            this.f344211m = null;
        }
        android.graphics.Bitmap bitmap3 = this.f344210i;
        if (bitmap3 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomVoiceMeter", "bitmap recycle %s", bitmap3.toString());
            this.f344210i.recycle();
            this.f344210i = null;
        }
    }
}
