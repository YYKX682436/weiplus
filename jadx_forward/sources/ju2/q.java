package ju2;

/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f383363a;

    /* renamed from: b, reason: collision with root package name */
    public final long f383364b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f383365c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f383366d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f383367e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Float f383368f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f383369g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f383370h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f383371i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Integer f383372j;

    public q(int i17, long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Float f17, java.lang.Integer num4, java.lang.String str, java.lang.Integer num5, java.lang.Integer num6, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        j17 = (i18 & 2) != 0 ? 0L : j17;
        num = (i18 & 4) != 0 ? null : num;
        num2 = (i18 & 8) != 0 ? null : num2;
        num3 = (i18 & 16) != 0 ? null : num3;
        f17 = (i18 & 32) != 0 ? null : f17;
        num4 = (i18 & 64) != 0 ? null : num4;
        str = (i18 & 128) != 0 ? null : str;
        num5 = (i18 & 256) != 0 ? null : num5;
        num6 = (i18 & 512) != 0 ? null : num6;
        this.f383363a = i17;
        this.f383364b = j17;
        this.f383365c = num;
        this.f383366d = num2;
        this.f383367e = num3;
        this.f383368f = f17;
        this.f383369g = num4;
        this.f383370h = str;
        this.f383371i = num5;
        this.f383372j = num6;
    }

    /* renamed from: equals */
    public boolean m141398xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju2.q)) {
            return false;
        }
        ju2.q qVar = (ju2.q) obj;
        return this.f383363a == qVar.f383363a && this.f383364b == qVar.f383364b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383365c, qVar.f383365c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383366d, qVar.f383366d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383367e, qVar.f383367e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383368f, qVar.f383368f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383369g, qVar.f383369g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383370h, qVar.f383370h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383371i, qVar.f383371i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383372j, qVar.f383372j);
    }

    /* renamed from: hashCode */
    public int m141399x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f383363a) * 31) + java.lang.Long.hashCode(this.f383364b)) * 31;
        java.lang.Integer num = this.f383365c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f383366d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f383367e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Float f17 = this.f383368f;
        int hashCode5 = (hashCode4 + (f17 == null ? 0 : f17.hashCode())) * 31;
        java.lang.Integer num4 = this.f383369g;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.String str = this.f383370h;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num5 = this.f383371i;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.Integer num6 = this.f383372j;
        return hashCode8 + (num6 != null ? num6.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141400x9616526c() {
        return "FinderThanksButtonConfig(iconType=" + this.f383363a + ", magicEmojiId=" + this.f383364b + ", backgroundColor=" + this.f383365c + ", titleTextColor=" + this.f383366d + ", thankedTitleTextColor=" + this.f383367e + ", titleTextSize=" + this.f383368f + ", titleTextWeight=" + this.f383369g + ", defaultTitleStr=" + this.f383370h + ", defaultThankImgColor=" + this.f383371i + ", defaultThankImgResId=" + this.f383372j + ')';
    }
}
