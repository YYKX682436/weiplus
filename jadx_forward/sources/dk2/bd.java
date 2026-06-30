package dk2;

/* loaded from: classes3.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public int f314790a;

    /* renamed from: b, reason: collision with root package name */
    public int f314791b;

    /* renamed from: c, reason: collision with root package name */
    public int f314792c;

    /* renamed from: d, reason: collision with root package name */
    public int f314793d;

    public bd(int i17, int i18, int i19, int i27) {
        this.f314790a = i17;
        this.f314791b = i18;
        this.f314792c = i19;
        this.f314793d = i27;
    }

    /* renamed from: equals */
    public boolean m124548xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.bd)) {
            return false;
        }
        dk2.bd bdVar = (dk2.bd) obj;
        return this.f314790a == bdVar.f314790a && this.f314791b == bdVar.f314791b && this.f314792c == bdVar.f314792c && this.f314793d == bdVar.f314793d;
    }

    /* renamed from: hashCode */
    public int m124549x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f314790a) * 31) + java.lang.Integer.hashCode(this.f314791b)) * 31) + java.lang.Integer.hashCode(this.f314792c)) * 31) + java.lang.Integer.hashCode(this.f314793d);
    }

    /* renamed from: toString */
    public java.lang.String m124550x9616526c() {
        return "VideoQuality(encResEnum=" + this.f314790a + ", capFps=" + this.f314791b + ", encBR=" + this.f314792c + ", encBRMin=" + this.f314793d + ')';
    }
}
