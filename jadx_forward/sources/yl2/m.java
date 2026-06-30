package yl2;

/* loaded from: classes3.dex */
public final class m extends yl2.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f544577a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f544578b;

    /* renamed from: c, reason: collision with root package name */
    public final yl2.q f544579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.lang.String verifyUrl, yl2.q qVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyUrl, "verifyUrl");
        this.f544577a = i17;
        this.f544578b = verifyUrl;
        this.f544579c = qVar;
    }

    /* renamed from: equals */
    public boolean m177266xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.m)) {
            return false;
        }
        yl2.m mVar = (yl2.m) obj;
        return this.f544577a == mVar.f544577a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544578b, mVar.f544578b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544579c, mVar.f544579c);
    }

    /* renamed from: hashCode */
    public int m177267x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f544577a) * 31) + this.f544578b.hashCode()) * 31;
        yl2.q qVar = this.f544579c;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m177268x9616526c() {
        return "NeedAuth(precheckType=" + this.f544577a + ", verifyUrl=" + this.f544578b + ", liveVerifyResult=" + this.f544579c + ')';
    }
}
