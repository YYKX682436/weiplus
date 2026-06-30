package s7;

/* loaded from: classes16.dex */
public class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final s7.r1 f485127a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f485128b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f485129c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f485130d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f485131e;

    /* renamed from: f, reason: collision with root package name */
    public s7.f0 f485132f;

    /* renamed from: g, reason: collision with root package name */
    public s7.f0 f485133g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f485134h;

    public b3(s7.f3 f3Var) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f485130d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setTypeface(android.graphics.Typeface.DEFAULT);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f485131e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setTypeface(android.graphics.Typeface.DEFAULT);
        this.f485127a = s7.r1.a();
    }

    public b3(s7.f3 f3Var, s7.b3 b3Var) {
        this.f485128b = b3Var.f485128b;
        this.f485129c = b3Var.f485129c;
        this.f485130d = new android.graphics.Paint(b3Var.f485130d);
        this.f485131e = new android.graphics.Paint(b3Var.f485131e);
        s7.f0 f0Var = b3Var.f485132f;
        if (f0Var != null) {
            this.f485132f = new s7.f0(f0Var);
        }
        s7.f0 f0Var2 = b3Var.f485133g;
        if (f0Var2 != null) {
            this.f485133g = new s7.f0(f0Var2);
        }
        this.f485134h = b3Var.f485134h;
        try {
            this.f485127a = (s7.r1) b3Var.f485127a.m164025x5a5dd5d();
        } catch (java.lang.CloneNotSupportedException unused) {
            this.f485127a = s7.r1.a();
        }
    }
}
