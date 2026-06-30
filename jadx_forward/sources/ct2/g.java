package ct2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f303788a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f303789b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f303790c;

    public g(java.lang.String session, java.lang.String productId, java.lang.String source, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        session = (i17 & 1) != 0 ? "" : session;
        productId = (i17 & 2) != 0 ? "" : productId;
        source = (i17 & 4) != 0 ? "" : source;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f303788a = session;
        this.f303789b = productId;
        this.f303790c = source;
    }

    /* renamed from: equals */
    public boolean m122707xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct2.g)) {
            return false;
        }
        ct2.g gVar = (ct2.g) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303788a, gVar.f303788a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303789b, gVar.f303789b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303790c, gVar.f303790c);
    }

    /* renamed from: hashCode */
    public int m122708x8cdac1b() {
        return (((this.f303788a.hashCode() * 31) + this.f303789b.hashCode()) * 31) + this.f303790c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m122709x9616526c() {
        return "session:" + this.f303788a + ",productId:" + this.f303789b + ",source:" + this.f303790c;
    }
}
