package oh2;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f426943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f426944b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f426945c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f426946d;

    /* renamed from: e, reason: collision with root package name */
    public final float f426947e;

    /* renamed from: f, reason: collision with root package name */
    public final float f426948f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f426949g;

    /* renamed from: h, reason: collision with root package name */
    public oh2.i f426950h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f426951i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Paint f426952j;

    /* renamed from: k, reason: collision with root package name */
    public final float f426953k;

    /* renamed from: l, reason: collision with root package name */
    public int f426954l;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f426955m;

    /* renamed from: n, reason: collision with root package name */
    public int f426956n;

    /* renamed from: o, reason: collision with root package name */
    public final float f426957o;

    /* renamed from: p, reason: collision with root package name */
    public final float f426958p;

    /* renamed from: q, reason: collision with root package name */
    public final int f426959q;

    /* renamed from: r, reason: collision with root package name */
    public int f426960r;

    public r(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f426943a = context;
        this.f426944b = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f426945c = new java.util.LinkedHashMap();
        this.f426946d = new java.util.LinkedHashMap();
        float a17 = a(4.0f);
        this.f426947e = a17;
        this.f426948f = a(4.0f);
        this.f426949g = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(a17);
        paint.setAntiAlias(true);
        this.f426951i = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setColor(android.graphics.Color.parseColor("#17ABFE"));
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeWidth(a17);
        paint2.setAntiAlias(true);
        this.f426952j = paint2;
        this.f426953k = a(100.0f) / 1000.0f;
        this.f426955m = new android.graphics.Rect();
        this.f426956n = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        this.f426957o = a(48.0f);
        a(40.0f);
        a(40.0f);
        this.f426958p = 0.1f;
        this.f426959q = 100;
    }

    public final float a(float f17) {
        return i65.a.a(this.f426943a, f17);
    }
}
