package zn0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f555934a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f555935b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f555936c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f555937d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f555938e;

    public u(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.f555934a = l17;
        this.f555935b = l18;
        this.f555936c = str;
        this.f555937d = num;
        this.f555938e = str2;
    }

    /* renamed from: equals */
    public boolean m179189xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.u)) {
            return false;
        }
        zn0.u uVar = (zn0.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555934a, uVar.f555934a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555935b, uVar.f555935b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555936c, uVar.f555936c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555937d, uVar.f555937d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555938e, uVar.f555938e);
    }

    /* renamed from: hashCode */
    public int m179190x8cdac1b() {
        java.lang.Long l17 = this.f555934a;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.f555935b;
        int hashCode2 = (hashCode + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.String str = this.f555936c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f555937d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f555938e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m179191x9616526c() {
        return "FinderLivePublishMediaStreamReporterExtInfo(liveId=" + this.f555934a + ", feedId=" + this.f555935b + ", sdkUserId=" + this.f555936c + ", sdkRoomId=" + this.f555937d + ", anchorNickname=" + this.f555938e + ')';
    }
}
