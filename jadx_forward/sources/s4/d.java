package s4;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.RectF f484384a = new android.graphics.RectF();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f484385b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f484386c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f484387d;

    /* renamed from: e, reason: collision with root package name */
    public float f484388e;

    /* renamed from: f, reason: collision with root package name */
    public float f484389f;

    /* renamed from: g, reason: collision with root package name */
    public float f484390g;

    /* renamed from: h, reason: collision with root package name */
    public float f484391h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f484392i;

    /* renamed from: j, reason: collision with root package name */
    public int f484393j;

    /* renamed from: k, reason: collision with root package name */
    public float f484394k;

    /* renamed from: l, reason: collision with root package name */
    public float f484395l;

    /* renamed from: m, reason: collision with root package name */
    public float f484396m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f484397n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Path f484398o;

    /* renamed from: p, reason: collision with root package name */
    public float f484399p;

    /* renamed from: q, reason: collision with root package name */
    public float f484400q;

    /* renamed from: r, reason: collision with root package name */
    public int f484401r;

    /* renamed from: s, reason: collision with root package name */
    public int f484402s;

    /* renamed from: t, reason: collision with root package name */
    public int f484403t;

    /* renamed from: u, reason: collision with root package name */
    public int f484404u;

    public d() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f484385b = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f484386c = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f484387d = paint3;
        this.f484388e = 0.0f;
        this.f484389f = 0.0f;
        this.f484390g = 0.0f;
        this.f484391h = 5.0f;
        this.f484399p = 1.0f;
        this.f484403t = 255;
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public void a(int i17) {
        this.f484393j = i17;
        this.f484404u = this.f484392i[i17];
    }
}
