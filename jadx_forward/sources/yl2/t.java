package yl2;

/* loaded from: classes3.dex */
public final class t extends yl2.w {

    /* renamed from: a, reason: collision with root package name */
    public final int f544605a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f544606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, java.lang.String verifyUrl) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyUrl, "verifyUrl");
        this.f544605a = i17;
        this.f544606b = verifyUrl;
    }

    /* renamed from: equals */
    public boolean m177270xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.t)) {
            return false;
        }
        yl2.t tVar = (yl2.t) obj;
        return this.f544605a == tVar.f544605a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544606b, tVar.f544606b);
    }

    /* renamed from: hashCode */
    public int m177271x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f544605a) * 31) + this.f544606b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177272x9616526c() {
        return "NeedVerify(precheckType=" + this.f544605a + ", verifyUrl=" + this.f544606b + ')';
    }
}
