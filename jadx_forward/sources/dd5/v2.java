package dd5;

/* loaded from: classes8.dex */
public final class v2 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f310849a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f310850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310851c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310852d;

    /* renamed from: e, reason: collision with root package name */
    public final long f310853e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f310854f;

    public v2(java.lang.CharSequence title, java.lang.CharSequence desc, int i17, int i18, long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f310849a = title;
        this.f310850b = desc;
        this.f310851c = i17;
        this.f310852d = i18;
        this.f310853e = j17;
        this.f310854f = talker;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return kz5.c0.i(this.f310849a, this.f310850b);
    }

    /* renamed from: equals */
    public boolean m124090xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.v2)) {
            return false;
        }
        dd5.v2 v2Var = (dd5.v2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310849a, v2Var.f310849a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310850b, v2Var.f310850b) && this.f310851c == v2Var.f310851c && this.f310852d == v2Var.f310852d && this.f310853e == v2Var.f310853e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f310854f, v2Var.f310854f);
    }

    /* renamed from: hashCode */
    public int m124091x8cdac1b() {
        return (((((((((this.f310849a.hashCode() * 31) + this.f310850b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f310851c)) * 31) + java.lang.Integer.hashCode(this.f310852d)) * 31) + java.lang.Long.hashCode(this.f310853e)) * 31) + this.f310854f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m124092x9616526c() {
        return "ViewModel(title=" + ((java.lang.Object) this.f310849a) + ", desc=" + ((java.lang.Object) this.f310850b) + ", iconResId=" + this.f310851c + ", iconBgResId=" + this.f310852d + ", msgId=" + this.f310853e + ", talker=" + this.f310854f + ')';
    }
}
