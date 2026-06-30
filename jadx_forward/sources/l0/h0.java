package l0;

/* loaded from: classes14.dex */
public final class h0 implements l0.f5 {
    public h0(float f17) {
    }

    @Override // l0.f5
    public float a(p2.f fVar, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        return q2.a.a(f17, f18, 0.5f);
    }

    /* renamed from: equals */
    public boolean m144714xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0.h0)) {
            return false;
        }
        java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
        ((l0.h0) obj).getClass();
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Float.valueOf(0.5f));
    }

    /* renamed from: hashCode */
    public int m144715x8cdac1b() {
        return java.lang.Float.hashCode(0.5f);
    }

    /* renamed from: toString */
    public java.lang.String m144716x9616526c() {
        return "FractionalThreshold(fraction=0.5)";
    }
}
