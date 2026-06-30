package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1877x4371eec6;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar */
/* loaded from: classes13.dex */
public class C16558x49131e89 extends android.view.View {

    /* renamed from: h, reason: collision with root package name */
    public static final int f230920h = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3);

    /* renamed from: i, reason: collision with root package name */
    public static final int f230921i = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 5);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f230922d;

    /* renamed from: e, reason: collision with root package name */
    public int f230923e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f230924f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f230925g;

    static {
        android.graphics.Color.parseColor("#F5B3B2");
        android.graphics.Color.parseColor("#EB6866");
        android.graphics.Color.parseColor("#E64340");
    }

    public C16558x49131e89(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f230922d = new java.util.ArrayList(5);
        this.f230923e = 0;
        this.f230925g = null;
        a();
    }

    public final void a() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f230924f = paint;
        paint.setColor(-65536);
        this.f230924f.setAntiAlias(true);
        this.f230925g = new ii3.a(this, android.os.Looper.getMainLooper());
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.i("MicroMsg.MMSightProgressBar", "init, pointRadius: %s, pointDistance: %s", java.lang.Integer.valueOf(f230920h), java.lang.Integer.valueOf(f230921i));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        float f17;
        int i17;
        int i18;
        super.onDraw(canvas);
        java.util.List list = this.f230922d;
        int save = canvas.save();
        java.util.ArrayList<ii3.c> arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        this.f230923e = size;
        int i19 = size % 2;
        int i27 = f230921i;
        int i28 = f230920h;
        if (i19 == 0) {
            f17 = i27 / 2.0f;
            i17 = size / 2;
            i18 = (i17 - 1) * i27;
        } else {
            f17 = i28 / 2.0f;
            i17 = size / 2;
            i18 = i17 * i27;
        }
        float f18 = -(f17 + i18 + (i17 * i28));
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.d("MicroMsg.MMSightProgressBar", "draw, translateX: %s, currentPointCount: %s", java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(this.f230923e));
        canvas.translate(f18, 0.0f);
        for (ii3.c cVar : arrayList) {
            android.graphics.Paint paint = this.f230924f;
            cVar.getClass();
            paint.setColor(0);
            cVar.getClass();
            cVar.getClass();
            cVar.f373160a = 0 + (((i28 * 2) + i27) * 0);
            cVar.getClass();
            cVar.f373161b = 0;
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.Log.d("MicroMsg.MMSightProgressPoint", "draw, index: %s, pointX: %s", 0, java.lang.Float.valueOf(cVar.f373160a));
            canvas.drawCircle(cVar.f373160a, cVar.f373161b, i28, paint);
            paint.setShader(null);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: setProgressCallback */
    public void m66988x61e5c614(ii3.b bVar) {
    }

    public C16558x49131e89(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f230922d = new java.util.ArrayList(5);
        this.f230923e = 0;
        this.f230925g = null;
        a();
    }
}
