package ai4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f86676a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86677b;

    public g(java.lang.String statusId, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f86676a = statusId;
        this.f86677b = userName;
    }

    /* renamed from: equals */
    public boolean m2085xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.g)) {
            return false;
        }
        ai4.g gVar = (ai4.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86676a, gVar.f86676a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86677b, gVar.f86677b);
    }

    /* renamed from: hashCode */
    public int m2086x8cdac1b() {
        return (this.f86676a.hashCode() * 31) + this.f86677b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m2087x9616526c() {
        return "DeleteFingerprint(statusId=" + this.f86676a + ", userName=" + this.f86677b + ')';
    }
}
