package rm5;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f479065a;

    /* renamed from: b, reason: collision with root package name */
    public final int f479066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f479067c;

    /* renamed from: d, reason: collision with root package name */
    public final int f479068d;

    public p(int i17, int i18, int i19, int i27) {
        this.f479065a = i17;
        this.f479066b = i18;
        this.f479067c = i19;
        this.f479068d = i27;
    }

    /* renamed from: equals */
    public boolean m162735xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.p)) {
            return false;
        }
        rm5.p pVar = (rm5.p) obj;
        return this.f479065a == pVar.f479065a && this.f479066b == pVar.f479066b && this.f479067c == pVar.f479067c && this.f479068d == pVar.f479068d;
    }

    /* renamed from: hashCode */
    public int m162736x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f479065a) * 31) + java.lang.Integer.hashCode(this.f479066b)) * 31) + java.lang.Integer.hashCode(this.f479067c)) * 31) + java.lang.Integer.hashCode(this.f479068d);
    }

    /* renamed from: toString */
    public java.lang.String m162737x9616526c() {
        return "VideoClipInfo(width=" + this.f479065a + ", height=" + this.f479066b + ", rotate=" + this.f479067c + ", durationMs=" + this.f479068d + ')';
    }
}
