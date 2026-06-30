package mm2;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f410276a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410277b;

    public a2(java.lang.Object msg, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f410276a = msg;
        this.f410277b = z17;
    }

    /* renamed from: equals */
    public boolean m147900xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.a2)) {
            return false;
        }
        mm2.a2 a2Var = (mm2.a2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410276a, a2Var.f410276a) && this.f410277b == a2Var.f410277b;
    }

    /* renamed from: hashCode */
    public int m147901x8cdac1b() {
        return (this.f410276a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f410277b);
    }

    /* renamed from: toString */
    public java.lang.String m147902x9616526c() {
        return "DanmakuMsg(msg=" + this.f410276a + ", mustShow=" + this.f410277b + ')';
    }
}
