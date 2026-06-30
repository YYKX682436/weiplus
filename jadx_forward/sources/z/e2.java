package z;

/* loaded from: classes14.dex */
public final class e2 implements z.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f550177a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f550178b;

    public e2(java.lang.Object obj, java.lang.Object obj2) {
        this.f550177a = obj;
        this.f550178b = obj2;
    }

    public boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f550177a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, this.f550178b);
    }

    /* renamed from: equals */
    public boolean m178151xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof z.d2) {
            z.e2 e2Var = (z.e2) ((z.d2) obj);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550177a, e2Var.f550177a)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f550178b, e2Var.f550178b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m178152x8cdac1b() {
        java.lang.Object obj = this.f550177a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f550178b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
