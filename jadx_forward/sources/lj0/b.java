package lj0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400332a;

    /* renamed from: b, reason: collision with root package name */
    public final long f400333b;

    /* renamed from: c, reason: collision with root package name */
    public final long f400334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f400335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400336e;

    /* renamed from: f, reason: collision with root package name */
    public final int f400337f;

    /* renamed from: g, reason: collision with root package name */
    public final int f400338g;

    /* renamed from: h, reason: collision with root package name */
    public final int f400339h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f400340i;

    public b(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27, int i28, java.lang.String str2) {
        this.f400332a = str;
        this.f400333b = j17;
        this.f400334c = j18;
        this.f400335d = i17;
        this.f400336e = i18;
        this.f400337f = i19;
        this.f400338g = i27;
        this.f400339h = i28;
        this.f400340i = str2;
    }

    /* renamed from: equals */
    public boolean m145836xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj0.b)) {
            return false;
        }
        lj0.b bVar = (lj0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400332a, bVar.f400332a) && this.f400333b == bVar.f400333b && this.f400334c == bVar.f400334c && this.f400335d == bVar.f400335d && this.f400336e == bVar.f400336e && this.f400337f == bVar.f400337f && this.f400338g == bVar.f400338g && this.f400339h == bVar.f400339h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400340i, bVar.f400340i);
    }

    /* renamed from: hashCode */
    public int m145837x8cdac1b() {
        java.lang.String str = this.f400332a;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f400333b)) * 31) + java.lang.Long.hashCode(this.f400334c)) * 31) + java.lang.Integer.hashCode(this.f400335d)) * 31) + java.lang.Integer.hashCode(this.f400336e)) * 31) + java.lang.Integer.hashCode(this.f400337f)) * 31) + java.lang.Integer.hashCode(this.f400338g)) * 31) + java.lang.Integer.hashCode(this.f400339h)) * 31;
        java.lang.String str2 = this.f400340i;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m145838x9616526c() {
        return "MiniGameVideoReportInfo(appId=" + this.f400332a + ", uiArea=" + this.f400333b + ", positionId=" + this.f400334c + ", actionId=" + this.f400335d + ", opType=" + this.f400336e + ", actionStatus=" + this.f400337f + ", miniGameVersion=" + this.f400338g + ", appState=" + this.f400339h + ", extInfo=" + this.f400340i + ')';
    }

    public /* synthetic */ b(java.lang.String str, long j17, long j18, int i17, int i18, int i19, int i27, int i28, java.lang.String str2, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i29 & 1) != 0 ? null : str, (i29 & 2) != 0 ? 601L : j17, (i29 & 4) != 0 ? 0L : j18, (i29 & 8) != 0 ? 0 : i17, (i29 & 16) != 0 ? 0 : i18, (i29 & 32) != 0 ? 0 : i19, (i29 & 64) != 0 ? 0 : i27, (i29 & 128) == 0 ? i28 : 0, (i29 & 256) == 0 ? str2 : null);
    }
}
