package te2;

/* loaded from: classes3.dex */
public final class z3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.v62 f500089a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f500090b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f500091c;

    /* renamed from: d, reason: collision with root package name */
    public final te2.v3 f500092d;

    public z3(r45.v62 originData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originData, "originData");
        this.f500089a = originData;
        java.lang.String m75945x2fec8307 = originData.m75945x2fec8307(0);
        this.f500090b = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = originData.m75945x2fec8307(4);
        this.f500091c = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        this.f500092d = te2.v3.f500024d;
    }

    /* renamed from: equals */
    public boolean m166343xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te2.z3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500089a, ((te2.z3) obj).f500089a);
    }

    /* renamed from: hashCode */
    public int m166344x8cdac1b() {
        return this.f500089a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166345x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("id = " + this.f500090b);
        sb6.append(", ");
        sb6.append("micId = " + this.f500091c);
        sb6.append(", ");
        sb6.append("state = " + this.f500092d);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
