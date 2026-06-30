package hv2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f366814a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f366815b;

    /* renamed from: c, reason: collision with root package name */
    public long f366816c;

    /* renamed from: d, reason: collision with root package name */
    public final long f366817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f366818e;

    public a(java.lang.String username, java.lang.String nickname, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f366814a = username;
        this.f366815b = nickname;
        this.f366816c = j17;
        this.f366817d = j18;
    }

    /* renamed from: equals */
    public boolean m134176xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv2.a)) {
            return false;
        }
        hv2.a aVar = (hv2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f366814a, aVar.f366814a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f366815b, aVar.f366815b) && this.f366816c == aVar.f366816c && this.f366817d == aVar.f366817d;
    }

    /* renamed from: hashCode */
    public int m134177x8cdac1b() {
        return (((((this.f366814a.hashCode() * 31) + this.f366815b.hashCode()) * 31) + java.lang.Long.hashCode(this.f366816c)) * 31) + java.lang.Long.hashCode(this.f366817d);
    }

    /* renamed from: toString */
    public java.lang.String m134178x9616526c() {
        return "MentionContact(username='" + this.f366814a + "', nickname='" + this.f366815b + "', start=" + this.f366816c + ", length=" + this.f366817d + ')';
    }
}
