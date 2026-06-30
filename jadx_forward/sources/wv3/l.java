package wv3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f531598a;

    /* renamed from: b, reason: collision with root package name */
    public final wv3.k f531599b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f531600c;

    public l(java.lang.String id6, wv3.k type, java.lang.String original) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(original, "original");
        this.f531598a = id6;
        this.f531599b = type;
        this.f531600c = original;
    }

    /* renamed from: equals */
    public boolean m174549xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3.l)) {
            return false;
        }
        wv3.l lVar = (wv3.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531598a, lVar.f531598a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531599b, lVar.f531599b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f531600c, lVar.f531600c);
    }

    /* renamed from: hashCode */
    public int m174550x8cdac1b() {
        return (((this.f531598a.hashCode() * 31) + this.f531599b.hashCode()) * 31) + this.f531600c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174551x9616526c() {
        return "WCMusicIdInfo(id=" + this.f531598a + ", type=" + this.f531599b + ", original=" + this.f531600c + ')';
    }
}
