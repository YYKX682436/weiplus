package dd5;

/* loaded from: classes8.dex */
public final class u implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310828a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310829b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310830c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310831d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310832e;

    public u(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String avatarUrl, java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310828a = title;
        this.f310829b = source;
        this.f310830c = avatarUrl;
        this.f310831d = talker;
        this.f310832e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310828a, this.f310829b);
    }

    /* renamed from: equals */
    public boolean m124082xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.u)) {
            return false;
        }
        dd5.u uVar = (dd5.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310828a, uVar.f310828a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310829b, uVar.f310829b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310830c, uVar.f310830c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310831d, uVar.f310831d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310832e, uVar.f310832e);
    }

    /* renamed from: hashCode */
    public int m124083x8cdac1b() {
        return (((((((this.f310828a.hashCode() * 31) + this.f310829b.hashCode()) * 31) + this.f310830c.hashCode()) * 31) + this.f310831d.hashCode()) * 31) + this.f310832e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124084x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310828a) + ", source=" + ((java.lang.Object) this.f310829b) + ", avatarUrl=" + this.f310830c + ", talker=" + this.f310831d + ", msgInfo=" + this.f310832e + ')';
    }
}
