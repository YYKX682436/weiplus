package z;

/* loaded from: classes13.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f550147a = 300;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f550148b = new java.util.LinkedHashMap();

    public final z.b1 a(java.lang.Object obj, int i17) {
        z.b1 b1Var = new z.b1(obj, null, 2, null);
        this.f550148b.put(java.lang.Integer.valueOf(i17), b1Var);
        return b1Var;
    }

    /* renamed from: equals */
    public boolean m178145xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z.c1) {
            z.c1 c1Var = (z.c1) obj;
            c1Var.getClass();
            if (this.f550147a == c1Var.f550147a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550148b, c1Var.f550148b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178146x8cdac1b() {
        return (((this.f550147a * 31) + 0) * 31) + this.f550148b.hashCode();
    }
}
