package e21;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final xg3.q0 f328049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f328050b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f328051c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f328052d;

    public f0(xg3.q0 op6, int i17, java.lang.String title, java.lang.String content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f328049a = op6;
        this.f328050b = i17;
        this.f328051c = title;
        this.f328052d = content;
    }

    /* renamed from: equals */
    public boolean m126800xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e21.f0)) {
            return false;
        }
        e21.f0 f0Var = (e21.f0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f328049a, f0Var.f328049a) && this.f328050b == f0Var.f328050b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f328051c, f0Var.f328051c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f328052d, f0Var.f328052d);
    }

    /* renamed from: hashCode */
    public int m126801x8cdac1b() {
        return (((((this.f328049a.hashCode() * 31) + java.lang.Integer.hashCode(this.f328050b)) * 31) + this.f328051c.hashCode()) * 31) + this.f328052d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m126802x9616526c() {
        return "OplogResultRet(op=" + this.f328049a + ", ret=" + this.f328050b + ", title=" + this.f328051c + ", content=" + this.f328052d + ')';
    }
}
