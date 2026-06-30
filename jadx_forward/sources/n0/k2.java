package n0;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f415118a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f415119b;

    public k2(java.lang.Object obj, java.lang.Object obj2) {
        this.f415118a = obj;
        this.f415119b = obj2;
    }

    /* renamed from: equals */
    public boolean m148734xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0.k2)) {
            return false;
        }
        n0.k2 k2Var = (n0.k2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415118a, k2Var.f415118a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415119b, k2Var.f415119b);
    }

    /* renamed from: hashCode */
    public int m148735x8cdac1b() {
        java.lang.Object obj = this.f415118a;
        int i17 = 0;
        int ordinal = (obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f415119b;
        if (obj2 instanceof java.lang.Enum) {
            i17 = ((java.lang.Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i17 = obj2.hashCode();
        }
        return ordinal + i17;
    }

    /* renamed from: toString */
    public java.lang.String m148736x9616526c() {
        return "JoinedKey(left=" + this.f415118a + ", right=" + this.f415119b + ')';
    }
}
