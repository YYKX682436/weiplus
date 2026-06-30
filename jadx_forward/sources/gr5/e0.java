package gr5;

/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final gr5.e0 f356450c;

    /* renamed from: a, reason: collision with root package name */
    public final int f356451a;

    /* renamed from: b, reason: collision with root package name */
    public final gr5.c0 f356452b;

    static {
        gr5.c0.f356445a.getClass();
        f356450c = new gr5.e0(3, gr5.b0.f356444b);
    }

    public e0(int i17, gr5.c0 decider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decider, "decider");
        this.f356451a = i17;
        this.f356452b = decider;
    }

    /* renamed from: equals */
    public boolean m132099xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr5.e0)) {
            return false;
        }
        gr5.e0 e0Var = (gr5.e0) obj;
        return this.f356451a == e0Var.f356451a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356452b, e0Var.f356452b);
    }

    /* renamed from: hashCode */
    public int m132100x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f356451a) * 31) + this.f356452b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132101x9616526c() {
        return "ReadMode(sizeType=" + this.f356451a + ", decider=" + this.f356452b + ')';
    }
}
