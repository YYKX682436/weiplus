package gs0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f356513a;

    /* renamed from: b, reason: collision with root package name */
    public final long f356514b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f356515c;

    public d(byte[] bArr, long j17, boolean z17) {
        this.f356513a = bArr;
        this.f356514b = j17;
        this.f356515c = z17;
    }

    /* renamed from: equals */
    public boolean m132140xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0.d)) {
            return false;
        }
        gs0.d dVar = (gs0.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356513a, dVar.f356513a) && this.f356514b == dVar.f356514b && this.f356515c == dVar.f356515c;
    }

    /* renamed from: hashCode */
    public int m132141x8cdac1b() {
        byte[] bArr = this.f356513a;
        return ((((bArr == null ? 0 : java.util.Arrays.hashCode(bArr)) * 31) + java.lang.Long.hashCode(this.f356514b)) * 31) + java.lang.Boolean.hashCode(this.f356515c);
    }

    /* renamed from: toString */
    public java.lang.String m132142x9616526c() {
        return "EncoderData(pcmData=" + java.util.Arrays.toString(this.f356513a) + ", pts=" + this.f356514b + ", isLast=" + this.f356515c + ')';
    }
}
