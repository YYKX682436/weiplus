package np1;

/* loaded from: classes11.dex */
public final class a extends r45.yd {
    /* renamed from: equals */
    public boolean m149846xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof np1.a) && this.f472506d == ((np1.a) obj).f472506d;
    }

    /* renamed from: hashCode */
    public int m149847x8cdac1b() {
        int i17 = (this.f472506d + 31) * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472507e;
        int hashCode = (((((i17 + (gVar == null ? 0 : gVar.hashCode())) * 31) + (this.f472508f ? 1 : 0)) * 31) + (this.f472509g ? 1 : 0)) * 31;
        java.lang.String str = this.f472510h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f472512m;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f472511i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m149848x9616526c() {
        return "AudioPanelPlayInfo{isPlaying: " + this.f472508f + ", showFloatingView: " + this.f472509g + ", title: " + this.f472510h + '}';
    }
}
