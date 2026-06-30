package w33;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f524248a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f524249b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f524250c;

    public e(java.lang.String id6, java.lang.String nickName, java.lang.String avatar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatar, "avatar");
        this.f524248a = id6;
        this.f524249b = nickName;
        this.f524250c = avatar;
    }

    /* renamed from: equals */
    public boolean m173193xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.e)) {
            return false;
        }
        w33.e eVar = (w33.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524248a, eVar.f524248a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524249b, eVar.f524249b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524250c, eVar.f524250c);
    }

    /* renamed from: hashCode */
    public int m173194x8cdac1b() {
        return (((this.f524248a.hashCode() * 31) + this.f524249b.hashCode()) * 31) + this.f524250c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m173195x9616526c() {
        return "SimpleUserInfo(id=" + this.f524248a + ", nickName=" + this.f524249b + ", avatar=" + this.f524250c + ')';
    }
}
