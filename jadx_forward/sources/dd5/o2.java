package dd5;

/* loaded from: classes8.dex */
public final class o2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310771b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310772c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310773d;

    public o2(java.lang.CharSequence title, java.lang.CharSequence desc, java.lang.String coverUrl, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310770a = title;
        this.f310771b = desc;
        this.f310772c = coverUrl;
        this.f310773d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310770a, this.f310771b);
    }

    /* renamed from: equals */
    public boolean m124060xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.o2)) {
            return false;
        }
        dd5.o2 o2Var = (dd5.o2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310770a, o2Var.f310770a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310771b, o2Var.f310771b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310772c, o2Var.f310772c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310773d, o2Var.f310773d);
    }

    /* renamed from: hashCode */
    public int m124061x8cdac1b() {
        return (((((this.f310770a.hashCode() * 31) + this.f310771b.hashCode()) * 31) + this.f310772c.hashCode()) * 31) + this.f310773d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124062x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310770a) + ", desc=" + ((java.lang.Object) this.f310771b) + ", coverUrl=" + this.f310772c + ", msgInfo=" + this.f310773d + ')';
    }
}
