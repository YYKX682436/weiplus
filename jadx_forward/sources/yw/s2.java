package yw;

/* loaded from: classes7.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f547988a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f547989b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f547990c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f547991d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f547992e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f547993f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f547994g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Long f547995h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f547996i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f547997j;

    public s2(long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.List list, java.lang.Integer num4, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num5, java.lang.String str) {
        this.f547988a = j17;
        this.f547989b = num;
        this.f547990c = num2;
        this.f547991d = num3;
        this.f547992e = list;
        this.f547993f = num4;
        this.f547994g = l17;
        this.f547995h = l18;
        this.f547996i = num5;
        this.f547997j = str;
    }

    /* renamed from: equals */
    public boolean m177884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw.s2)) {
            return false;
        }
        yw.s2 s2Var = (yw.s2) obj;
        return this.f547988a == s2Var.f547988a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547989b, s2Var.f547989b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547990c, s2Var.f547990c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547991d, s2Var.f547991d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547992e, s2Var.f547992e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547993f, s2Var.f547993f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547994g, s2Var.f547994g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547995h, s2Var.f547995h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547996i, s2Var.f547996i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547997j, s2Var.f547997j);
    }

    /* renamed from: hashCode */
    public int m177885x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f547988a) * 31;
        java.lang.Integer num = this.f547989b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f547990c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f547991d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.util.List list = this.f547992e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.Integer num4 = this.f547993f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Long l17 = this.f547994g;
        int hashCode7 = (hashCode6 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f547995h;
        int hashCode8 = (hashCode7 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.Integer num5 = this.f547996i;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.String str = this.f547997j;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177886x9616526c() {
        return "BizTLResortEventInfo(sessionId=" + this.f547988a + ", unreadMsgCount=" + this.f547989b + ", unExposeMsgCount=" + this.f547990c + ", unValidExposeMsgCount=" + this.f547991d + ", unreadMsgTimeStampList=" + this.f547992e + ", covBoxIndex=" + this.f547993f + ", digestMsgBizUin=" + this.f547994g + ", digestMsgId=" + this.f547995h + ", digestMsgIdx=" + this.f547996i + ", digestWording=" + this.f547997j + ')';
    }

    public /* synthetic */ s2(long j17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.util.List list, java.lang.Integer num4, java.lang.Long l17, java.lang.Long l18, java.lang.Integer num5, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, (i17 & 2) != 0 ? -1 : num, (i17 & 4) != 0 ? -1 : num2, (i17 & 8) != 0 ? -1 : num3, (i17 & 16) != 0 ? null : list, (i17 & 32) != 0 ? -1 : num4, (i17 & 64) != 0 ? 0L : l17, (i17 & 128) != 0 ? 0L : l18, (i17 & 256) != 0 ? -1 : num5, (i17 & 512) != 0 ? null : str);
    }
}
