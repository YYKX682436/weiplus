package l0;

/* loaded from: classes14.dex */
public final class g0 implements l0.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final float f395741a;

    public g0(float f17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f395741a = f17;
    }

    @Override // l0.f5
    public float a(p2.f fVar, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        return f17 + (fVar.R(this.f395741a) * java.lang.Math.signum(f18 - f17));
    }

    /* renamed from: equals */
    public boolean m144708xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0.g0) && p2.h.a(this.f395741a, ((l0.g0) obj).f395741a);
    }

    /* renamed from: hashCode */
    public int m144709x8cdac1b() {
        return java.lang.Float.hashCode(this.f395741a);
    }

    /* renamed from: toString */
    public java.lang.String m144710x9616526c() {
        return "FixedThreshold(offset=" + ((java.lang.Object) p2.h.b(this.f395741a)) + ')';
    }
}
