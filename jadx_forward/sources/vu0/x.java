package vu0;

/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final tu0.a f521704a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521705b;

    /* renamed from: c, reason: collision with root package name */
    public final int f521706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f521707d;

    public x(tu0.a audioEncodeFormat, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioEncodeFormat, "audioEncodeFormat");
        this.f521704a = audioEncodeFormat;
        this.f521705b = i17;
        this.f521706c = i18;
        this.f521707d = i19;
    }

    /* renamed from: equals */
    public boolean m172640xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.x)) {
            return false;
        }
        vu0.x xVar = (vu0.x) obj;
        return this.f521704a == xVar.f521704a && this.f521705b == xVar.f521705b && this.f521706c == xVar.f521706c && this.f521707d == xVar.f521707d;
    }

    /* renamed from: hashCode */
    public int m172641x8cdac1b() {
        return (((((this.f521704a.hashCode() * 31) + java.lang.Integer.hashCode(this.f521705b)) * 31) + java.lang.Integer.hashCode(this.f521706c)) * 31) + java.lang.Integer.hashCode(this.f521707d);
    }

    /* renamed from: toString */
    public java.lang.String m172642x9616526c() {
        return "AudioDataFormat(audioEncodeFormat=" + this.f521704a + ", sampleFormat=" + this.f521705b + ", sampleRate=" + this.f521706c + ", channelCount=" + this.f521707d + ')';
    }

    public /* synthetic */ x(tu0.a aVar, int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i27 & 1) != 0 ? tu0.a.f503603e : aVar, (i27 & 2) != 0 ? 2 : i17, (i27 & 4) != 0 ? 16000 : i18, (i27 & 8) != 0 ? 1 : i19);
    }
}
