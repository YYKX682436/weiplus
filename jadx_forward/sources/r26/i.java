package r26;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final r26.i f450427d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f450428a;

    /* renamed from: b, reason: collision with root package name */
    public final r26.g f450429b;

    /* renamed from: c, reason: collision with root package name */
    public final r26.h f450430c;

    static {
        r26.g gVar = r26.g.f450413i;
        r26.h hVar = r26.h.f450422e;
        f450427d = new r26.i(false, gVar, hVar);
        new r26.i(true, gVar, hVar);
    }

    public i(boolean z17, r26.g bytes, r26.h number) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytes, "bytes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(number, "number");
        this.f450428a = z17;
        this.f450429b = bytes;
        this.f450430c = number;
    }

    /* renamed from: toString */
    public java.lang.String m161396x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("HexFormat(\n    upperCase = ");
        sb6.append(this.f450428a);
        sb6.append(",\n    bytes = BytesHexFormat(\n");
        this.f450429b.a(sb6, "        ");
        sb6.append('\n');
        sb6.append("    ),");
        sb6.append('\n');
        sb6.append("    number = NumberHexFormat(");
        sb6.append('\n');
        this.f450430c.a(sb6, "        ");
        sb6.append('\n');
        sb6.append("    )");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
