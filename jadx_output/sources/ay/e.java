package ay;

/* loaded from: classes14.dex */
public final class e implements jy.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f15139a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f15140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15141c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15143e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15144f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15145g;

    public e(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, float f17, boolean z27) {
        this.f15139a = str;
        this.f15140b = str2;
        this.f15141c = z17;
        this.f15142d = z18;
        this.f15143e = z19;
        this.f15144f = f17;
        this.f15145g = z27;
    }

    public static ay.e a(ay.e eVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, float f17, boolean z27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = eVar.f15139a;
        }
        if ((i17 & 2) != 0) {
            str2 = eVar.f15140b;
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            z17 = eVar.f15141c;
        }
        boolean z28 = z17;
        if ((i17 & 8) != 0) {
            z18 = eVar.f15142d;
        }
        boolean z29 = z18;
        if ((i17 & 16) != 0) {
            z19 = eVar.f15143e;
        }
        boolean z37 = z19;
        if ((i17 & 32) != 0) {
            f17 = eVar.f15144f;
        }
        float f18 = f17;
        if ((i17 & 64) != 0) {
            z27 = eVar.f15145g;
        }
        eVar.getClass();
        return new ay.e(str, str3, z28, z29, z37, f18, z27);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay.e)) {
            return false;
        }
        ay.e eVar = (ay.e) obj;
        return kotlin.jvm.internal.o.b(this.f15139a, eVar.f15139a) && kotlin.jvm.internal.o.b(this.f15140b, eVar.f15140b) && this.f15141c == eVar.f15141c && this.f15142d == eVar.f15142d && this.f15143e == eVar.f15143e && java.lang.Float.compare(this.f15144f, eVar.f15144f) == 0 && this.f15145g == eVar.f15145g;
    }

    public int hashCode() {
        java.lang.String str = this.f15139a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f15140b;
        return ((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f15141c)) * 31) + java.lang.Boolean.hashCode(this.f15142d)) * 31) + java.lang.Boolean.hashCode(this.f15143e)) * 31) + java.lang.Float.hashCode(this.f15144f)) * 31) + java.lang.Boolean.hashCode(this.f15145g);
    }

    public java.lang.String toString() {
        return "BrandScreenState(headImageUrl=" + this.f15139a + ", roomName=" + this.f15140b + ", ttsBegin=" + this.f15141c + ", aiJoinRoomSuccess=" + this.f15142d + ", showHeadLoadingProgressBar=" + this.f15143e + ", userRecoderVolume=" + this.f15144f + ", isShowConnectStatusText=" + this.f15145g + ')';
    }
}
