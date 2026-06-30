package yf;

/* loaded from: classes14.dex */
public final class c0 implements yf.k {

    /* renamed from: a, reason: collision with root package name */
    public final float f542852a;

    /* renamed from: b, reason: collision with root package name */
    public final yf.y f542853b;

    /* renamed from: c, reason: collision with root package name */
    public final yf.a0 f542854c;

    /* renamed from: d, reason: collision with root package name */
    public final int f542855d;

    /* renamed from: e, reason: collision with root package name */
    public final yf.b0 f542856e;

    public c0(float f17, yf.y color, yf.a0 type, int i17, yf.b0 mouthShape) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(color, "color");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mouthShape, "mouthShape");
        this.f542852a = f17;
        this.f542853b = color;
        this.f542854c = type;
        this.f542855d = i17;
        this.f542856e = mouthShape;
    }

    @Override // yf.k
    public java.lang.String a() {
        return "LipStickInfoV2()";
    }

    /* renamed from: equals */
    public boolean m176920xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.c0)) {
            return false;
        }
        yf.c0 c0Var = (yf.c0) obj;
        return java.lang.Float.compare(this.f542852a, c0Var.f542852a) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542853b, c0Var.f542853b) && this.f542854c == c0Var.f542854c && this.f542855d == c0Var.f542855d && this.f542856e == c0Var.f542856e;
    }

    /* renamed from: hashCode */
    public int m176921x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f542852a) * 31) + this.f542853b.m176964x8cdac1b()) * 31) + this.f542854c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f542855d)) * 31) + this.f542856e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m176922x9616526c() {
        return "LipStickInfoV2(alpha=" + this.f542852a + ", color=" + this.f542853b + ", type=" + this.f542854c + ", faceModel=" + this.f542855d + ", mouthShape=" + this.f542856e + ')';
    }
}
