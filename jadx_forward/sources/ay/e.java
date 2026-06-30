package ay;

/* loaded from: classes14.dex */
public final class e implements jy.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f96672a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f96673b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f96674c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f96675d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96676e;

    /* renamed from: f, reason: collision with root package name */
    public final float f96677f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f96678g;

    public e(java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, float f17, boolean z27) {
        this.f96672a = str;
        this.f96673b = str2;
        this.f96674c = z17;
        this.f96675d = z18;
        this.f96676e = z19;
        this.f96677f = f17;
        this.f96678g = z27;
    }

    public static ay.e a(ay.e eVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, boolean z19, float f17, boolean z27, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = eVar.f96672a;
        }
        if ((i17 & 2) != 0) {
            str2 = eVar.f96673b;
        }
        java.lang.String str3 = str2;
        if ((i17 & 4) != 0) {
            z17 = eVar.f96674c;
        }
        boolean z28 = z17;
        if ((i17 & 8) != 0) {
            z18 = eVar.f96675d;
        }
        boolean z29 = z18;
        if ((i17 & 16) != 0) {
            z19 = eVar.f96676e;
        }
        boolean z37 = z19;
        if ((i17 & 32) != 0) {
            f17 = eVar.f96677f;
        }
        float f18 = f17;
        if ((i17 & 64) != 0) {
            z27 = eVar.f96678g;
        }
        eVar.getClass();
        return new ay.e(str, str3, z28, z29, z37, f18, z27);
    }

    /* renamed from: equals */
    public boolean m9282xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay.e)) {
            return false;
        }
        ay.e eVar = (ay.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96672a, eVar.f96672a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f96673b, eVar.f96673b) && this.f96674c == eVar.f96674c && this.f96675d == eVar.f96675d && this.f96676e == eVar.f96676e && java.lang.Float.compare(this.f96677f, eVar.f96677f) == 0 && this.f96678g == eVar.f96678g;
    }

    /* renamed from: hashCode */
    public int m9283x8cdac1b() {
        java.lang.String str = this.f96672a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f96673b;
        return ((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f96674c)) * 31) + java.lang.Boolean.hashCode(this.f96675d)) * 31) + java.lang.Boolean.hashCode(this.f96676e)) * 31) + java.lang.Float.hashCode(this.f96677f)) * 31) + java.lang.Boolean.hashCode(this.f96678g);
    }

    /* renamed from: toString */
    public java.lang.String m9284x9616526c() {
        return "BrandScreenState(headImageUrl=" + this.f96672a + ", roomName=" + this.f96673b + ", ttsBegin=" + this.f96674c + ", aiJoinRoomSuccess=" + this.f96675d + ", showHeadLoadingProgressBar=" + this.f96676e + ", userRecoderVolume=" + this.f96677f + ", isShowConnectStatusText=" + this.f96678g + ')';
    }
}
