package kz5;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f395548a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f395549b;

    public u0(int i17, java.lang.Object obj) {
        this.f395548a = i17;
        this.f395549b = obj;
    }

    /* renamed from: equals */
    public boolean m144685xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz5.u0)) {
            return false;
        }
        kz5.u0 u0Var = (kz5.u0) obj;
        return this.f395548a == u0Var.f395548a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f395549b, u0Var.f395549b);
    }

    /* renamed from: hashCode */
    public int m144686x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f395548a) * 31;
        java.lang.Object obj = this.f395549b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m144687x9616526c() {
        return "IndexedValue(index=" + this.f395548a + ", value=" + this.f395549b + ')';
    }
}
