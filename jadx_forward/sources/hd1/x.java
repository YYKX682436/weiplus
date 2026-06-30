package hd1;

/* loaded from: classes7.dex */
public final class x extends hd1.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f361973a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f361974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, java.lang.String errMsg) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        this.f361973a = i17;
        this.f361974b = errMsg;
    }

    /* renamed from: equals */
    public boolean m133218xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1.x)) {
            return false;
        }
        hd1.x xVar = (hd1.x) obj;
        return this.f361973a == xVar.f361973a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f361974b, xVar.f361974b);
    }

    /* renamed from: hashCode */
    public int m133219x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f361973a) * 31) + this.f361974b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133220x9616526c() {
        return "Failure(errCode=" + this.f361973a + ", errMsg=" + this.f361974b + ')';
    }
}
