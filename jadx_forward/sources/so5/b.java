package so5;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.Size f492325a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f492326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f492327c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f492328d;

    public b(android.util.Size realFrameSize, android.util.Size frameSize, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(realFrameSize, "realFrameSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSize, "frameSize");
        this.f492325a = realFrameSize;
        this.f492326b = frameSize;
        this.f492327c = i17;
        this.f492328d = z17;
    }

    /* renamed from: equals */
    public boolean m164999xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.b)) {
            return false;
        }
        so5.b bVar = (so5.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492325a, bVar.f492325a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f492326b, bVar.f492326b) && this.f492327c == bVar.f492327c && this.f492328d == bVar.f492328d;
    }

    /* renamed from: hashCode */
    public int m165000x8cdac1b() {
        return (((((this.f492325a.hashCode() * 31) + this.f492326b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f492327c)) * 31) + java.lang.Boolean.hashCode(this.f492328d);
    }

    /* renamed from: toString */
    public java.lang.String m165001x9616526c() {
        return "DecoderFrameInfo(realFrameSize=" + this.f492325a + ", frameSize=" + this.f492326b + ", rotateInDegree=" + this.f492327c + ", isLandscapeMode=" + this.f492328d + ')';
    }
}
