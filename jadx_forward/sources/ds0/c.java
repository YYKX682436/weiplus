package ds0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f324319a;

    /* renamed from: b, reason: collision with root package name */
    public final long f324320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f324321c;

    public c(byte[] data, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f324319a = data;
        this.f324320b = j17;
        this.f324321c = z17;
    }

    /* renamed from: equals */
    public boolean m125977xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds0.c)) {
            return false;
        }
        ds0.c cVar = (ds0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f324319a, cVar.f324319a) && this.f324320b == cVar.f324320b && this.f324321c == cVar.f324321c;
    }

    /* renamed from: hashCode */
    public int m125978x8cdac1b() {
        return (((java.util.Arrays.hashCode(this.f324319a) * 31) + java.lang.Long.hashCode(this.f324320b)) * 31) + java.lang.Boolean.hashCode(this.f324321c);
    }

    /* renamed from: toString */
    public java.lang.String m125979x9616526c() {
        return "EncoderData(data=" + java.util.Arrays.toString(this.f324319a) + ", pts=" + this.f324320b + ", isEnd=" + this.f324321c + ')';
    }
}
