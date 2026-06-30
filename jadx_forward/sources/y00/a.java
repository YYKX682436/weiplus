package y00;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f540023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f540024b;

    /* renamed from: c, reason: collision with root package name */
    public final long f540025c;

    public a(long j17, java.lang.String xml, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        this.f540023a = j17;
        this.f540024b = xml;
        this.f540025c = j18;
    }

    /* renamed from: equals */
    public boolean m176247xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00.a)) {
            return false;
        }
        y00.a aVar = (y00.a) obj;
        return this.f540023a == aVar.f540023a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540024b, aVar.f540024b) && this.f540025c == aVar.f540025c;
    }

    /* renamed from: hashCode */
    public int m176248x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f540023a) * 31) + this.f540024b.hashCode()) * 31) + java.lang.Long.hashCode(this.f540025c);
    }

    /* renamed from: toString */
    public java.lang.String m176249x9616526c() {
        return "EcsKfProductCardData(msgSvrId=" + this.f540023a + ", xml=" + this.f540024b + ", updateTimeMs=" + this.f540025c + ')';
    }
}
