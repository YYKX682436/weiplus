package b31;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f99134a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99135b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f99136c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99137d;

    /* renamed from: e, reason: collision with root package name */
    public final int f99138e;

    /* renamed from: f, reason: collision with root package name */
    public final long f99139f;

    public e(int i17, java.lang.String userName, java.lang.String voiceId, int i18, int i19, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        this.f99134a = i17;
        this.f99135b = userName;
        this.f99136c = voiceId;
        this.f99137d = i18;
        this.f99138e = i19;
        this.f99139f = j17;
    }

    /* renamed from: equals */
    public boolean m9742xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31.e)) {
            return false;
        }
        b31.e eVar = (b31.e) obj;
        return this.f99134a == eVar.f99134a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99135b, eVar.f99135b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f99136c, eVar.f99136c) && this.f99137d == eVar.f99137d && this.f99138e == eVar.f99138e && this.f99139f == eVar.f99139f;
    }

    /* renamed from: hashCode */
    public int m9743x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f99134a) * 31) + this.f99135b.hashCode()) * 31) + this.f99136c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f99137d)) * 31) + java.lang.Integer.hashCode(this.f99138e)) * 31) + java.lang.Long.hashCode(this.f99139f);
    }

    /* renamed from: toString */
    public java.lang.String m9744x9616526c() {
        return "StopParams(startScene=" + this.f99134a + ", userName=" + this.f99135b + ", voiceId=" + this.f99136c + ", textCount=" + this.f99137d + ", stopType=" + this.f99138e + ", recordLength=" + this.f99139f + ')';
    }
}
