package gp2;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f355753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f355754b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f355755c;

    public g(int i17, int i18, boolean z17) {
        this.f355753a = i17;
        this.f355754b = i18;
        this.f355755c = z17;
    }

    /* renamed from: equals */
    public boolean m131968xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp2.g)) {
            return false;
        }
        gp2.g gVar = (gp2.g) obj;
        return this.f355753a == gVar.f355753a && this.f355754b == gVar.f355754b && this.f355755c == gVar.f355755c;
    }

    /* renamed from: hashCode */
    public int m131969x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f355753a) * 31) + java.lang.Integer.hashCode(this.f355754b)) * 31) + java.lang.Boolean.hashCode(this.f355755c);
    }

    /* renamed from: toString */
    public java.lang.String m131970x9616526c() {
        return "LivePreviewMuteStateData(pos=" + this.f355753a + ", containerHashCode=" + this.f355754b + ", isMute=" + this.f355755c + ')';
    }
}
