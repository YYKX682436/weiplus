package gf5;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f353000a;

    /* renamed from: b, reason: collision with root package name */
    public final int f353001b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f353002c;

    public y(int i17, int i18, gf5.z type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f353000a = i17;
        this.f353001b = i18;
        this.f353002c = type;
    }

    /* renamed from: equals */
    public boolean m131505xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.y)) {
            return false;
        }
        gf5.y yVar = (gf5.y) obj;
        return this.f353000a == yVar.f353000a && this.f353001b == yVar.f353001b && this.f353002c == yVar.f353002c;
    }

    /* renamed from: hashCode */
    public int m131506x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f353000a) * 31) + java.lang.Integer.hashCode(this.f353001b)) * 31) + this.f353002c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131507x9616526c() {
        return "TokenSpan(start=" + this.f353000a + ", end=" + this.f353001b + ", type=" + this.f353002c + ')';
    }
}
