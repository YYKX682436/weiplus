package r26;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final r26.g f450413i = new r26.g(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

    /* renamed from: a, reason: collision with root package name */
    public final int f450414a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f450416c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f450417d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f450418e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f450419f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f450420g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f450421h;

    public g(int i17, int i18, java.lang.String groupSeparator, java.lang.String byteSeparator, java.lang.String bytePrefix, java.lang.String byteSuffix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupSeparator, "groupSeparator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteSeparator, "byteSeparator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bytePrefix, "bytePrefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteSuffix, "byteSuffix");
        this.f450414a = i17;
        this.f450415b = i18;
        this.f450416c = groupSeparator;
        this.f450417d = byteSeparator;
        this.f450418e = bytePrefix;
        this.f450419f = byteSuffix;
        boolean z17 = false;
        this.f450420g = i17 == Integer.MAX_VALUE && i18 == Integer.MAX_VALUE;
        if (bytePrefix.length() == 0) {
            if ((byteSuffix.length() == 0) && byteSeparator.length() <= 1) {
                z17 = true;
            }
        }
        this.f450421h = z17;
        if (r26.j.a(groupSeparator) || r26.j.a(byteSeparator) || r26.j.a(bytePrefix)) {
            return;
        }
        r26.j.a(byteSuffix);
    }

    public final java.lang.StringBuilder a(java.lang.StringBuilder sb6, java.lang.String indent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sb6, "sb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indent, "indent");
        sb6.append(indent);
        sb6.append("bytesPerLine = ");
        sb6.append(this.f450414a);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytesPerGroup = ");
        sb6.append(this.f450415b);
        sb6.append(",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("groupSeparator = \"");
        sb6.append(this.f450416c);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("byteSeparator = \"");
        sb6.append(this.f450417d);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("bytePrefix = \"");
        sb6.append(this.f450418e);
        sb6.append("\",");
        sb6.append('\n');
        sb6.append(indent);
        sb6.append("byteSuffix = \"");
        sb6.append(this.f450419f);
        sb6.append("\"");
        return sb6;
    }

    /* renamed from: toString */
    public java.lang.String m161392x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("BytesHexFormat(\n");
        a(sb6, "    ");
        sb6.append('\n');
        sb6.append(")");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
