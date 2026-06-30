package ai4;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f86664a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86665b;

    public c0(int i17, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f86664a = i17;
        this.f86665b = userName;
    }

    /* renamed from: equals */
    public boolean m2080xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.c0)) {
            return false;
        }
        ai4.c0 c0Var = (ai4.c0) obj;
        return this.f86664a == c0Var.f86664a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86665b, c0Var.f86665b);
    }

    /* renamed from: hashCode */
    public int m2081x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f86664a) * 31) + this.f86665b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2082x9616526c() {
        return "UnReadNotifyInfo(createTime=" + this.f86664a + ", userName=" + this.f86665b + ')';
    }
}
