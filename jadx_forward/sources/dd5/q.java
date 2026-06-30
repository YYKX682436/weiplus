package dd5;

/* loaded from: classes8.dex */
public final class q implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310784a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f310785b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310786c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.CharSequence f310787d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310788e;

    public q(java.lang.CharSequence nickname, java.lang.String fromUsername, int i17, java.lang.CharSequence desc, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310784a = nickname;
        this.f310785b = fromUsername;
        this.f310786c = i17;
        this.f310787d = desc;
        this.f310788e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310784a, this.f310787d);
    }

    /* renamed from: equals */
    public boolean m124066xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.q)) {
            return false;
        }
        dd5.q qVar = (dd5.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310784a, qVar.f310784a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310785b, qVar.f310785b) && this.f310786c == qVar.f310786c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310787d, qVar.f310787d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310788e, qVar.f310788e);
    }

    /* renamed from: hashCode */
    public int m124067x8cdac1b() {
        return (((((((this.f310784a.hashCode() * 31) + this.f310785b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f310786c)) * 31) + this.f310787d.hashCode()) * 31) + this.f310788e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124068x9616526c() {
        return "ViewModel(nickname=" + ((java.lang.Object) this.f310784a) + ", fromUsername=" + this.f310785b + ", verifyFlag=" + this.f310786c + ", desc=" + ((java.lang.Object) this.f310787d) + ", msgInfo=" + this.f310788e + ')';
    }
}
