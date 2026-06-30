package ai4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f86678a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f86679b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86680c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86681d;

    public h(int i17, java.lang.String statusId, java.lang.String userName, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusId, "statusId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f86678a = i17;
        this.f86679b = statusId;
        this.f86680c = userName;
        this.f86681d = j17;
    }

    /* renamed from: equals */
    public boolean m2088xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai4.h)) {
            return false;
        }
        ai4.h hVar = (ai4.h) obj;
        return this.f86678a == hVar.f86678a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86679b, hVar.f86679b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f86680c, hVar.f86680c) && this.f86681d == hVar.f86681d;
    }

    /* renamed from: hashCode */
    public int m2089x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f86678a) * 31) + this.f86679b.hashCode()) * 31) + this.f86680c.hashCode()) * 31) + java.lang.Long.hashCode(this.f86681d);
    }

    /* renamed from: toString */
    public java.lang.String m2090x9616526c() {
        return "Fingerprint(eventId=" + this.f86678a + ", statusId=" + this.f86679b + ", userName=" + this.f86680c + ", createTimeMs=" + this.f86681d + ')';
    }
}
