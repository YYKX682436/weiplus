package g1;

/* loaded from: classes13.dex */
public final class n extends g1.j {

    /* renamed from: a, reason: collision with root package name */
    public final float f349046a;

    /* renamed from: b, reason: collision with root package name */
    public final float f349047b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f17, float f18, int i17, int i18, e1.q0 q0Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null);
        f17 = (i19 & 1) != 0 ? 0.0f : f17;
        f18 = (i19 & 2) != 0 ? 4.0f : f18;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        i18 = (i19 & 8) != 0 ? 0 : i18;
        this.f349046a = f17;
        this.f349047b = f18;
        this.f349048c = i17;
        this.f349049d = i18;
    }

    /* renamed from: equals */
    public boolean m130623xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.n)) {
            return false;
        }
        g1.n nVar = (g1.n) obj;
        if (!(this.f349046a == nVar.f349046a)) {
            return false;
        }
        if (!(this.f349047b == nVar.f349047b)) {
            return false;
        }
        if (!(this.f349048c == nVar.f349048c)) {
            return false;
        }
        if (!(this.f349049d == nVar.f349049d)) {
            return false;
        }
        nVar.getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(null, null);
    }

    /* renamed from: hashCode */
    public int m130624x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f349046a) * 31) + java.lang.Float.hashCode(this.f349047b)) * 31) + java.lang.Integer.hashCode(this.f349048c)) * 31) + java.lang.Integer.hashCode(this.f349049d)) * 31) + 0;
    }

    /* renamed from: toString */
    public java.lang.String m130625x9616526c() {
        return "Stroke(width=" + this.f349046a + ", miter=" + this.f349047b + ", cap=" + ((java.lang.Object) e1.f1.a(this.f349048c)) + ", join=" + ((java.lang.Object) e1.g1.a(this.f349049d)) + ", pathEffect=null)";
    }
}
