package ai4;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f86709a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86710b;

    public n0(int i17, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f86709a = i17;
        this.f86710b = userName;
    }

    /* renamed from: equals */
    public boolean m2101xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.n0)) {
            return false;
        }
        ai4.n0 n0Var = (ai4.n0) obj;
        return this.f86709a == n0Var.f86709a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86710b, n0Var.f86710b);
    }

    /* renamed from: hashCode */
    public int m2102x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f86709a) * 31) + this.f86710b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2103x9616526c() {
        return "UnReadNotifyInfo(createTime=" + this.f86709a + ", userName=" + this.f86710b + ')';
    }
}
