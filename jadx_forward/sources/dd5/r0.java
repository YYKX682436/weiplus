package dd5;

/* loaded from: classes9.dex */
public final class r0 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f310804a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310805b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f310806c;

    /* renamed from: d, reason: collision with root package name */
    public final te5.i f310807d;

    public r0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, java.lang.CharSequence title, java.lang.String fileSize, te5.i favFileBubbleModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileSize, "fileSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favFileBubbleModel, "favFileBubbleModel");
        this.f310804a = msgInfo;
        this.f310805b = title;
        this.f310806c = fileSize;
        this.f310807d = favFileBubbleModel;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310805b, this.f310806c);
    }

    /* renamed from: equals */
    public boolean m124071xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.r0)) {
            return false;
        }
        dd5.r0 r0Var = (dd5.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310804a, r0Var.f310804a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310805b, r0Var.f310805b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310806c, r0Var.f310806c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310807d, r0Var.f310807d);
    }

    /* renamed from: hashCode */
    public int m124072x8cdac1b() {
        return (((((this.f310804a.hashCode() * 31) + this.f310805b.hashCode()) * 31) + this.f310806c.hashCode()) * 31) + this.f310807d.m166367x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m124073x9616526c() {
        return "ViewModel(msgInfo=" + this.f310804a + ", title=" + ((java.lang.Object) this.f310805b) + ", fileSize=" + this.f310806c + ", favFileBubbleModel=" + this.f310807d + ')';
    }
}
