package yu0;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f547352a;

    /* renamed from: b, reason: collision with root package name */
    public final tu0.a f547353b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f547354c;

    public n(int i17, tu0.a encodeType, com.p314xaae8f345.mm.vfs.r6 audioPartFile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encodeType, "encodeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioPartFile, "audioPartFile");
        this.f547352a = i17;
        this.f547353b = encodeType;
        this.f547354c = audioPartFile;
    }

    /* renamed from: equals */
    public boolean m177670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0.n)) {
            return false;
        }
        yu0.n nVar = (yu0.n) obj;
        return this.f547352a == nVar.f547352a && this.f547353b == nVar.f547353b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547354c, nVar.f547354c);
    }

    /* renamed from: hashCode */
    public int m177671x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f547352a) * 31) + this.f547353b.hashCode()) * 31) + this.f547354c.m82468x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m177672x9616526c() {
        return "PartRequestAudioParams(audioDurationMs=" + this.f547352a + ", encodeType=" + this.f547353b + ", audioPartFile=" + this.f547354c + ')';
    }
}
