package in5;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final in5.c f374691a;

    /* renamed from: b, reason: collision with root package name */
    public final long f374692b;

    /* renamed from: c, reason: collision with root package name */
    public int f374693c;

    public x0(in5.c convertData, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertData, "convertData");
        this.f374691a = convertData;
        this.f374692b = j17;
    }

    /* renamed from: equals */
    public boolean m136801xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5.x0)) {
            return false;
        }
        in5.x0 x0Var = (in5.x0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374691a, x0Var.f374691a) && this.f374692b == x0Var.f374692b;
    }

    /* renamed from: hashCode */
    public int m136802x8cdac1b() {
        return (this.f374691a.hashCode() * 31) + java.lang.Long.hashCode(this.f374692b);
    }

    /* renamed from: toString */
    public java.lang.String m136803x9616526c() {
        return "WxRVDataItem(convertData=" + this.f374691a + ", exposeTimestamp=" + this.f374692b + ')';
    }

    public /* synthetic */ x0(in5.c cVar, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(cVar, (i17 & 2) != 0 ? hq.d.a() : j17);
    }
}
