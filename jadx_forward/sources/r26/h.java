package r26;

/* loaded from: classes13.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final r26.h f450422e = new r26.h("", "", false, 1);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f450423a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f450424b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f450425c;

    /* renamed from: d, reason: collision with root package name */
    public final int f450426d;

    public h(java.lang.String prefix, java.lang.String suffix, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        this.f450423a = prefix;
        this.f450424b = suffix;
        this.f450425c = z17;
        this.f450426d = i17;
        if (!(prefix.length() == 0) || suffix.length() == 0) {
        }
        if (r26.j.a(prefix)) {
            return;
        }
        r26.j.a(suffix);
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb6, java.lang.String indent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indent, "indent");
        sb6.append(indent);
        sb6.append("prefix = \"");
        sb6.append(this.f450423a);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("suffix = \"");
        sb6.append(this.f450424b);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("removeLeadingZeros = ");
        sb6.append(this.f450425c);
        sb6.append(',');
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("minLength = ");
        sb6.append(this.f450426d);
        return sb6;
    }

    /* renamed from: toString */
    public java.lang.String m161394x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("NumberHexFormat(\n");
        a(sb6, "    ");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
