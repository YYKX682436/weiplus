package fe0;

/* loaded from: classes4.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f342937a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f342938b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f342939c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f342940d;

    /* renamed from: e, reason: collision with root package name */
    public int f342941e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f342942f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f342943g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f342944h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f342945i;

    public j4() {
        this(false, false, false, false, 0, null, false, false, null, 511, null);
    }

    public final void a(boolean z17) {
        this.f342937a = z17;
    }

    public final void b(boolean z17) {
        this.f342938b = z17;
    }

    public final void c(boolean z17) {
        this.f342944h = z17;
    }

    public final void d(boolean z17) {
        this.f342943g = z17;
    }

    /* renamed from: equals */
    public boolean m129396xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe0.j4)) {
            return false;
        }
        fe0.j4 j4Var = (fe0.j4) obj;
        return this.f342937a == j4Var.f342937a && this.f342938b == j4Var.f342938b && this.f342939c == j4Var.f342939c && this.f342940d == j4Var.f342940d && this.f342941e == j4Var.f342941e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342942f, j4Var.f342942f) && this.f342943g == j4Var.f342943g && this.f342944h == j4Var.f342944h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f342945i, j4Var.f342945i);
    }

    /* renamed from: hashCode */
    public int m129397x8cdac1b() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f342937a) * 31) + java.lang.Boolean.hashCode(this.f342938b)) * 31) + java.lang.Boolean.hashCode(this.f342939c)) * 31) + java.lang.Boolean.hashCode(this.f342940d)) * 31) + java.lang.Integer.hashCode(this.f342941e)) * 31;
        java.lang.String str = this.f342942f;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f342943g)) * 31) + java.lang.Boolean.hashCode(this.f342944h)) * 31) + this.f342945i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129398x9616526c() {
        return "SnsJumpData(clearTopActivity=" + this.f342937a + ", loadInit=" + this.f342938b + ", enterByRed=" + this.f342939c + ", notifyOpen=" + this.f342940d + ", unreadCount=" + this.f342941e + ", newFeedId=" + this.f342942f + ", isResume=" + this.f342943g + ", needResendAllFailSns=" + this.f342944h + ", redDotInfo=" + this.f342945i + ')';
    }

    public j4(boolean z17, boolean z18, boolean z19, boolean z27, int i17, java.lang.String str, boolean z28, boolean z29, java.lang.String redDotInfo, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        z27 = (i18 & 8) != 0 ? false : z27;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        str = (i18 & 32) != 0 ? null : str;
        z28 = (i18 & 64) != 0 ? true : z28;
        z29 = (i18 & 128) != 0 ? false : z29;
        redDotInfo = (i18 & 256) != 0 ? "" : redDotInfo;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotInfo, "redDotInfo");
        this.f342937a = z17;
        this.f342938b = z18;
        this.f342939c = z19;
        this.f342940d = z27;
        this.f342941e = i17;
        this.f342942f = str;
        this.f342943g = z28;
        this.f342944h = z29;
        this.f342945i = redDotInfo;
    }
}
