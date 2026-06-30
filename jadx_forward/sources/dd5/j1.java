package dd5;

/* loaded from: classes8.dex */
public final class j1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310714a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310715b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310716c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f310717d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310718e;

    public j1(java.lang.CharSequence title, java.lang.CharSequence source, java.lang.String coverUrl, java.lang.String talker, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310714a = title;
        this.f310715b = source;
        this.f310716c = coverUrl;
        this.f310717d = talker;
        this.f310718e = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310714a, this.f310715b);
    }

    /* renamed from: equals */
    public boolean m124039xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.j1)) {
            return false;
        }
        dd5.j1 j1Var = (dd5.j1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310714a, j1Var.f310714a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310715b, j1Var.f310715b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310716c, j1Var.f310716c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310717d, j1Var.f310717d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310718e, j1Var.f310718e);
    }

    /* renamed from: hashCode */
    public int m124040x8cdac1b() {
        return (((((((this.f310714a.hashCode() * 31) + this.f310715b.hashCode()) * 31) + this.f310716c.hashCode()) * 31) + this.f310717d.hashCode()) * 31) + this.f310718e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124041x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310714a) + ", source=" + ((java.lang.Object) this.f310715b) + ", coverUrl=" + this.f310716c + ", talker=" + this.f310717d + ", msgInfo=" + this.f310718e + ')';
    }
}
