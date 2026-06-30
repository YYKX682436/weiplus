package vd2;

/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f517277a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517278b;

    public h1(java.lang.String username, java.lang.String noticeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        this.f517277a = username;
        this.f517278b = noticeId;
    }

    /* renamed from: equals */
    public boolean m171628xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2.h1)) {
            return false;
        }
        vd2.h1 h1Var = (vd2.h1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517277a, h1Var.f517277a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517278b, h1Var.f517278b);
    }

    /* renamed from: hashCode */
    public int m171629x8cdac1b() {
        return (this.f517277a.hashCode() * 31) + this.f517278b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171630x9616526c() {
        return "CacheKey(username=" + this.f517277a + ", noticeId=" + this.f517278b + ')';
    }
}
