package dd5;

/* loaded from: classes8.dex */
public final class c2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310637a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310638b;

    /* renamed from: c, reason: collision with root package name */
    public final o15.a f310639c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310640d;

    public c2(java.lang.CharSequence title, java.lang.CharSequence desc, o15.a location, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        this.f310637a = title;
        this.f310638b = desc;
        this.f310639c = location;
        this.f310640d = msgInfo;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310637a, this.f310638b);
    }

    /* renamed from: equals */
    public boolean m124006xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.c2)) {
            return false;
        }
        dd5.c2 c2Var = (dd5.c2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310637a, c2Var.f310637a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310638b, c2Var.f310638b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310639c, c2Var.f310639c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310640d, c2Var.f310640d);
    }

    /* renamed from: hashCode */
    public int m124007x8cdac1b() {
        return (((((this.f310637a.hashCode() * 31) + this.f310638b.hashCode()) * 31) + this.f310639c.hashCode()) * 31) + this.f310640d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124008x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310637a) + ", desc=" + ((java.lang.Object) this.f310638b) + ", location=" + this.f310639c + ", msgInfo=" + this.f310640d + ')';
    }
}
