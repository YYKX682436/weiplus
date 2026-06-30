package il2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f373566a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f373567b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f373568c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f373569d;

    public a(int i17, java.lang.String verifyId, java.lang.String verifyUrl, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyId, "verifyId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyUrl, "verifyUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f373566a = i17;
        this.f373567b = verifyId;
        this.f373568c = verifyUrl;
        this.f373569d = callback;
    }

    /* renamed from: equals */
    public boolean m136725xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il2.a)) {
            return false;
        }
        il2.a aVar = (il2.a) obj;
        return this.f373566a == aVar.f373566a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373567b, aVar.f373567b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373568c, aVar.f373568c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373569d, aVar.f373569d);
    }

    /* renamed from: hashCode */
    public int m136726x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f373566a) * 31) + this.f373567b.hashCode()) * 31) + this.f373568c.hashCode()) * 31) + this.f373569d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m136727x9616526c() {
        return "VerifyData(verifyType=" + this.f373566a + ", verifyId=" + this.f373567b + ", verifyUrl=" + this.f373568c + ", callback=" + this.f373569d + ')';
    }
}
