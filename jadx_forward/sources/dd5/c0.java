package dd5;

/* loaded from: classes8.dex */
public final class c0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f310630a;

    /* renamed from: b, reason: collision with root package name */
    public final long f310631b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f310632c;

    public c0(java.lang.String md52, long j17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f310630a = md52;
        this.f310631b = j17;
        this.f310632c = emojiInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        java.lang.String Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Bi(this.f310630a);
        if (Bi == null || r26.n0.N(Bi)) {
            return kz5.p0.f395529d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Bi);
        return kz5.b0.c(Bi);
    }

    /* renamed from: equals */
    public boolean m124002xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.c0)) {
            return false;
        }
        dd5.c0 c0Var = (dd5.c0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310630a, c0Var.f310630a) && this.f310631b == c0Var.f310631b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310632c, c0Var.f310632c);
    }

    /* renamed from: hashCode */
    public int m124003x8cdac1b() {
        return (((this.f310630a.hashCode() * 31) + java.lang.Long.hashCode(this.f310631b)) * 31) + this.f310632c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124004x9616526c() {
        return "ViewModel(md5=" + this.f310630a + ", msgId=" + this.f310631b + ", emojiInfo=" + this.f310632c + ')';
    }
}
