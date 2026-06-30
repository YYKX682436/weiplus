package x21;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f533084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f533085b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f533086c;

    /* renamed from: d, reason: collision with root package name */
    public final int f533087d;

    /* renamed from: e, reason: collision with root package name */
    public final long f533088e;

    /* renamed from: f, reason: collision with root package name */
    public final float f533089f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f533090g;

    public m(java.lang.String filePath, int i17, java.nio.ByteBuffer bufferData, int i18, long j17, float f17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferData, "bufferData");
        this.f533084a = filePath;
        this.f533085b = i17;
        this.f533086c = bufferData;
        this.f533087d = i18;
        this.f533088e = j17;
        this.f533089f = f17;
        this.f533090g = z17;
    }

    /* renamed from: equals */
    public boolean m174924xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x21.m)) {
            return false;
        }
        x21.m mVar = (x21.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533084a, mVar.f533084a) && this.f533085b == mVar.f533085b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533086c, mVar.f533086c) && this.f533087d == mVar.f533087d && this.f533088e == mVar.f533088e && java.lang.Float.compare(this.f533089f, mVar.f533089f) == 0 && this.f533090g == mVar.f533090g;
    }

    /* renamed from: hashCode */
    public int m174925x8cdac1b() {
        return (((((((((((this.f533084a.hashCode() * 31) + java.lang.Integer.hashCode(this.f533085b)) * 31) + this.f533086c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f533087d)) * 31) + java.lang.Long.hashCode(this.f533088e)) * 31) + java.lang.Float.hashCode(this.f533089f)) * 31) + java.lang.Boolean.hashCode(this.f533090g);
    }

    /* renamed from: toString */
    public java.lang.String m174926x9616526c() {
        return "RawAudioInfo(filePath=" + this.f533084a + ", indexPos=" + this.f533085b + ", bufferData=" + this.f533086c + ", sampleRate=" + this.f533087d + ", pts=" + this.f533088e + ", progress=" + this.f533089f + ", comp=" + this.f533090g + ')';
    }
}
