package ls5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f402664a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f402665b = "";

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f402666c = new android.os.Bundle();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f402667d = "";

    public f(java.lang.Object obj) {
        this.f402664a = obj;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ls5.e(this, new java.lang.Throwable("DetectTrace"), null), 2, null);
    }

    public final java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (byte b17 : bArr) {
            java.lang.String format = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b17)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            sb6.append(format);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Object obj = this.f402664a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()).g());
        sb6.append('_');
        sb6.append(obj.hashCode());
        return sb6.toString();
    }

    /* renamed from: toString */
    public java.lang.String m146280x9616526c() {
        return "eventName: " + b() + " currentKey:  \n traceString: " + this.f402665b + " traceId: " + this.f402667d;
    }
}
