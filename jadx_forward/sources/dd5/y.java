package dd5;

/* loaded from: classes8.dex */
public final class y implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310869a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310871c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310872d;

    public y(java.lang.CharSequence title, java.lang.CharSequence desc, int i17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310869a = title;
        this.f310870b = desc;
        this.f310871c = i17;
        this.f310872d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310869a, this.f310870b);
    }

    /* renamed from: equals */
    public boolean m124098xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.y)) {
            return false;
        }
        dd5.y yVar = (dd5.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310869a, yVar.f310869a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310870b, yVar.f310870b) && this.f310871c == yVar.f310871c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310872d, yVar.f310872d);
    }

    /* renamed from: hashCode */
    public int m124099x8cdac1b() {
        return (((((this.f310869a.hashCode() * 31) + this.f310870b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f310871c)) * 31) + this.f310872d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124100x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310869a) + ", desc=" + ((java.lang.Object) this.f310870b) + ", iconResId=" + this.f310871c + ", msgInfo=" + this.f310872d + ')';
    }
}
