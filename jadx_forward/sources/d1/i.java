package d1;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f307166a;

    /* renamed from: b, reason: collision with root package name */
    public final float f307167b;

    /* renamed from: c, reason: collision with root package name */
    public final float f307168c;

    /* renamed from: d, reason: collision with root package name */
    public final float f307169d;

    /* renamed from: e, reason: collision with root package name */
    public final long f307170e;

    /* renamed from: f, reason: collision with root package name */
    public final long f307171f;

    /* renamed from: g, reason: collision with root package name */
    public final long f307172g;

    /* renamed from: h, reason: collision with root package name */
    public final long f307173h;

    static {
        int i17 = d1.a.f307151b;
        d1.j.a(0.0f, 0.0f, 0.0f, 0.0f, d1.a.f307150a);
    }

    public i(float f17, float f18, float f19, float f27, long j17, long j18, long j19, long j27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f307166a = f17;
        this.f307167b = f18;
        this.f307168c = f19;
        this.f307169d = f27;
        this.f307170e = j17;
        this.f307171f = j18;
        this.f307172g = j19;
        this.f307173h = j27;
    }

    /* renamed from: equals */
    public boolean m123322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1.i)) {
            return false;
        }
        d1.i iVar = (d1.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307166a), java.lang.Float.valueOf(iVar.f307166a)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307167b), java.lang.Float.valueOf(iVar.f307167b)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307168c), java.lang.Float.valueOf(iVar.f307168c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f307169d), java.lang.Float.valueOf(iVar.f307169d)) && d1.a.a(this.f307170e, iVar.f307170e) && d1.a.a(this.f307171f, iVar.f307171f) && d1.a.a(this.f307172g, iVar.f307172g) && d1.a.a(this.f307173h, iVar.f307173h);
    }

    /* renamed from: hashCode */
    public int m123323x8cdac1b() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f307166a) * 31) + java.lang.Float.hashCode(this.f307167b)) * 31) + java.lang.Float.hashCode(this.f307168c)) * 31) + java.lang.Float.hashCode(this.f307169d)) * 31;
        int i17 = d1.a.f307151b;
        return ((((((hashCode + java.lang.Long.hashCode(this.f307170e)) * 31) + java.lang.Long.hashCode(this.f307171f)) * 31) + java.lang.Long.hashCode(this.f307172g)) * 31) + java.lang.Long.hashCode(this.f307173h);
    }

    /* renamed from: toString */
    public java.lang.String m123324x9616526c() {
        java.lang.String str = d1.c.a(this.f307166a, 1) + ", " + d1.c.a(this.f307167b, 1) + ", " + d1.c.a(this.f307168c, 1) + ", " + d1.c.a(this.f307169d, 1);
        long j17 = this.f307170e;
        long j18 = this.f307171f;
        boolean a17 = d1.a.a(j17, j18);
        long j19 = this.f307172g;
        long j27 = this.f307173h;
        if (!a17 || !d1.a.a(j18, j19) || !d1.a.a(j19, j27)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) d1.a.d(j17)) + ", topRight=" + ((java.lang.Object) d1.a.d(j18)) + ", bottomRight=" + ((java.lang.Object) d1.a.d(j19)) + ", bottomLeft=" + ((java.lang.Object) d1.a.d(j27)) + ')';
        }
        if (d1.a.b(j17) == d1.a.c(j17)) {
            return "RoundRect(rect=" + str + ", radius=" + d1.c.a(d1.a.b(j17), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + d1.c.a(d1.a.b(j17), 1) + ", y=" + d1.c.a(d1.a.c(j17), 1) + ')';
    }
}
