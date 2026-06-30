package j91;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f379880a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f379881b;

    public b(java.lang.String talker, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f379880a = talker;
        this.f379881b = userName;
    }

    /* renamed from: equals */
    public boolean m140487xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j91.b)) {
            return false;
        }
        j91.b bVar = (j91.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379880a, bVar.f379880a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f379881b, bVar.f379881b);
    }

    /* renamed from: hashCode */
    public int m140488x8cdac1b() {
        return (this.f379880a.hashCode() * 31) + this.f379881b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m140489x9616526c() {
        return this.f379880a + ',' + this.f379881b;
    }
}
