package ok4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f427499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f427501c;

    /* renamed from: d, reason: collision with root package name */
    public final int f427502d;

    /* renamed from: e, reason: collision with root package name */
    public final int f427503e;

    /* renamed from: f, reason: collision with root package name */
    public final int f427504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f427505g;

    /* renamed from: h, reason: collision with root package name */
    public final long f427506h;

    /* renamed from: i, reason: collision with root package name */
    public final int f427507i;

    /* renamed from: j, reason: collision with root package name */
    public final int f427508j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f427509k;

    public b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, long j17, int i38, int i39, boolean z17) {
        this.f427499a = i17;
        this.f427500b = i18;
        this.f427501c = i19;
        this.f427502d = i27;
        this.f427503e = i28;
        this.f427504f = i29;
        this.f427505g = i37;
        this.f427506h = j17;
        this.f427507i = i38;
        this.f427508j = i39;
        this.f427509k = z17;
    }

    /* renamed from: equals */
    public boolean m151607xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok4.b)) {
            return false;
        }
        ok4.b bVar = (ok4.b) obj;
        return this.f427499a == bVar.f427499a && this.f427500b == bVar.f427500b && this.f427501c == bVar.f427501c && this.f427502d == bVar.f427502d && this.f427503e == bVar.f427503e && this.f427504f == bVar.f427504f && this.f427505g == bVar.f427505g && this.f427506h == bVar.f427506h && this.f427507i == bVar.f427507i && this.f427508j == bVar.f427508j && this.f427509k == bVar.f427509k;
    }

    /* renamed from: hashCode */
    public int m151608x8cdac1b() {
        return (((((((((((((((((((java.lang.Integer.hashCode(this.f427499a) * 31) + java.lang.Integer.hashCode(this.f427500b)) * 31) + java.lang.Integer.hashCode(this.f427501c)) * 31) + java.lang.Integer.hashCode(this.f427502d)) * 31) + java.lang.Integer.hashCode(this.f427503e)) * 31) + java.lang.Integer.hashCode(this.f427504f)) * 31) + java.lang.Integer.hashCode(this.f427505g)) * 31) + java.lang.Long.hashCode(this.f427506h)) * 31) + java.lang.Integer.hashCode(this.f427507i)) * 31) + java.lang.Integer.hashCode(this.f427508j)) * 31) + java.lang.Boolean.hashCode(this.f427509k);
    }

    /* renamed from: toString */
    public java.lang.String m151609x9616526c() {
        return "Measurement(playDuration=" + this.f427499a + ", startWaitTime=" + this.f427500b + ", moovWaitTime=" + this.f427501c + ", bufferingCount=" + this.f427502d + ", avgBufferingDuration=" + this.f427503e + ", pageTime=" + this.f427504f + ", errorCode=" + this.f427505g + ", timeBeforeFirstFrame=" + this.f427506h + ", seekFlags=" + this.f427507i + ", maxProgressMilliseconds=" + this.f427508j + ", completed=" + this.f427509k + ')';
    }
}
