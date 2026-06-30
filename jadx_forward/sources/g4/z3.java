package g4;

/* loaded from: classes5.dex */
public final class z3 extends g4.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f350186a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f350187b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f350188c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350189d;

    /* renamed from: e, reason: collision with root package name */
    public final int f350190e;

    static {
        new g4.z3(kz5.p0.f395529d, null, null, 0, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.util.List data, java.lang.Object obj, java.lang.Object obj2, int i17, int i18) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f350186a = data;
        this.f350187b = obj;
        this.f350188c = obj2;
        this.f350189d = i17;
        this.f350190e = i18;
        if (!(i17 == Integer.MIN_VALUE || i17 >= 0)) {
            throw new java.lang.IllegalArgumentException("itemsBefore cannot be negative".toString());
        }
        if (!(i18 == Integer.MIN_VALUE || i18 >= 0)) {
            throw new java.lang.IllegalArgumentException("itemsAfter cannot be negative".toString());
        }
    }

    /* renamed from: equals */
    public boolean m130874xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z3)) {
            return false;
        }
        g4.z3 z3Var = (g4.z3) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350186a, z3Var.f350186a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350187b, z3Var.f350187b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350188c, z3Var.f350188c) && this.f350189d == z3Var.f350189d && this.f350190e == z3Var.f350190e;
    }

    /* renamed from: hashCode */
    public int m130875x8cdac1b() {
        java.util.List list = this.f350186a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        java.lang.Object obj = this.f350187b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        java.lang.Object obj2 = this.f350188c;
        return ((((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f350189d)) * 31) + java.lang.Integer.hashCode(this.f350190e);
    }

    /* renamed from: toString */
    public java.lang.String m130876x9616526c() {
        return "Page(data=" + this.f350186a + ", prevKey=" + this.f350187b + ", nextKey=" + this.f350188c + ", itemsBefore=" + this.f350189d + ", itemsAfter=" + this.f350190e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z3(java.util.List data, java.lang.Object obj, java.lang.Object obj2) {
        this(data, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }
}
