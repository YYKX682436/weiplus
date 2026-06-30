package d33;

/* loaded from: classes10.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f307806a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f307807b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Matrix f307808c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f307809d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f307810e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f307811f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f307812g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f307813h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f307814i;

    /* renamed from: j, reason: collision with root package name */
    public float f307815j;

    /* renamed from: k, reason: collision with root package name */
    public float f307816k;

    public t0(long j17, java.lang.String mediaPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        this.f307806a = j17;
        this.f307807b = mediaPath;
        this.f307808c = new android.graphics.Matrix();
        this.f307809d = new android.graphics.Matrix();
        this.f307810e = new android.graphics.Matrix();
        this.f307811f = new android.graphics.Rect();
        this.f307812g = new android.graphics.Rect();
        this.f307813h = new android.graphics.Rect();
        this.f307814i = new android.graphics.Rect();
        this.f307815j = 1.0f;
        this.f307816k = 1.0f;
    }

    /* renamed from: equals */
    public boolean m123415xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d33.t0)) {
            return false;
        }
        d33.t0 t0Var = (d33.t0) obj;
        return this.f307806a == t0Var.f307806a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f307807b, t0Var.f307807b);
    }

    /* renamed from: hashCode */
    public int m123416x8cdac1b() {
        return (java.lang.Long.hashCode(this.f307806a) * 31) + this.f307807b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123417x9616526c() {
        return "CropInfo(mediaId=" + this.f307806a + ", mediaPath=" + this.f307807b + ')';
    }
}
