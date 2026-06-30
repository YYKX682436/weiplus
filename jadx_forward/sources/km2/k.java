package km2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390647a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f390648b;

    /* renamed from: c, reason: collision with root package name */
    public final long f390649c;

    /* renamed from: d, reason: collision with root package name */
    public final int f390650d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f390651e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ja0 f390652f;

    /* renamed from: g, reason: collision with root package name */
    public long f390653g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f390654h;

    /* renamed from: i, reason: collision with root package name */
    public final long f390655i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f390656j;

    /* renamed from: k, reason: collision with root package name */
    public final int f390657k;

    public k(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, r45.ja0 ja0Var, long j18, boolean z18, long j19, java.lang.String str3, int i18) {
        this.f390647a = str;
        this.f390648b = str2;
        this.f390649c = j17;
        this.f390650d = i17;
        this.f390651e = z17;
        this.f390652f = ja0Var;
        this.f390653g = j18;
        this.f390654h = z18;
        this.f390655i = j19;
        this.f390656j = str3;
        this.f390657k = i18;
    }

    /* renamed from: equals */
    public boolean m143670xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.k)) {
            return false;
        }
        km2.k kVar = (km2.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390647a, kVar.f390647a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390648b, kVar.f390648b) && this.f390649c == kVar.f390649c && this.f390650d == kVar.f390650d && this.f390651e == kVar.f390651e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390652f, kVar.f390652f) && this.f390653g == kVar.f390653g && this.f390654h == kVar.f390654h && this.f390655i == kVar.f390655i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390656j, kVar.f390656j) && this.f390657k == kVar.f390657k;
    }

    /* renamed from: hashCode */
    public int m143671x8cdac1b() {
        java.lang.String str = this.f390647a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f390648b;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f390649c)) * 31) + java.lang.Integer.hashCode(this.f390650d)) * 31) + java.lang.Boolean.hashCode(this.f390651e)) * 31;
        r45.ja0 ja0Var = this.f390652f;
        int hashCode3 = (((((((hashCode2 + (ja0Var == null ? 0 : ja0Var.hashCode())) * 31) + java.lang.Long.hashCode(this.f390653g)) * 31) + java.lang.Boolean.hashCode(this.f390654h)) * 31) + java.lang.Long.hashCode(this.f390655i)) * 31;
        java.lang.String str3 = this.f390656j;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f390657k);
    }

    /* renamed from: toString */
    public java.lang.String m143672x9616526c() {
        return "FinderLiveBattlePlayerInfo(username=" + this.f390647a + ", userSdkId=" + this.f390648b + ", wecoinHot=" + this.f390649c + ", winningStreakCount=" + this.f390650d + ", isAccepted=" + this.f390651e + ", critQuestInfo=" + this.f390652f + ", extraRewardWecoin=" + this.f390653g + ", isApplicant=" + this.f390654h + ", count=" + this.f390655i + ", boardKey=" + this.f390656j + ", boardType=" + this.f390657k + ')';
    }

    public /* synthetic */ k(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, r45.ja0 ja0Var, long j18, boolean z18, long j19, java.lang.String str3, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) != 0 ? 0L : j17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? null : ja0Var, (i19 & 64) != 0 ? 0L : j18, (i19 & 128) != 0 ? false : z18, (i19 & 256) == 0 ? j19 : 0L, (i19 & 512) == 0 ? str3 : null, (i19 & 1024) == 0 ? i18 : 0);
    }
}
