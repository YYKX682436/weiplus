package cn2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f125074a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125075b;

    /* renamed from: c, reason: collision with root package name */
    public long f125076c;

    /* renamed from: d, reason: collision with root package name */
    public final long f125077d;

    public j(long j17, int i17, long j18, long j19, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 1) != 0 ? 500L : j17;
        i17 = (i18 & 2) != 0 ? -500 : i17;
        j18 = (i18 & 4) != 0 ? 2000L : j18;
        j19 = (i18 & 8) != 0 ? 500L : j19;
        this.f125074a = j17;
        this.f125075b = i17;
        this.f125076c = j18;
        this.f125077d = j19;
    }

    /* renamed from: equals */
    public boolean m15347xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.j)) {
            return false;
        }
        cn2.j jVar = (cn2.j) obj;
        return this.f125074a == jVar.f125074a && this.f125075b == jVar.f125075b && this.f125076c == jVar.f125076c && this.f125077d == jVar.f125077d;
    }

    /* renamed from: hashCode */
    public int m15348x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f125074a) * 31) + java.lang.Integer.hashCode(this.f125075b)) * 31) + java.lang.Long.hashCode(this.f125076c)) * 31) + java.lang.Long.hashCode(this.f125077d);
    }

    /* renamed from: toString */
    public java.lang.String m15349x9616526c() {
        return "NormalAnimParams(startDuration=" + this.f125074a + ", startFromTranslationX=" + this.f125075b + ", beforeNextCheckDuration=" + this.f125076c + ", alphaOutDuration=" + this.f125077d + ')';
    }
}
