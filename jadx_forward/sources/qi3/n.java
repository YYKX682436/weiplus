package qi3;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f445281a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f445282b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f445283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f445284d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f445285e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f445286f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f445287g;

    public n(java.lang.String fromUserName, java.lang.String toUserName, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 8) != 0 ? 0 : i17;
        str4 = (i18 & 64) != 0 ? null : str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUserName, "fromUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUserName, "toUserName");
        this.f445281a = fromUserName;
        this.f445282b = toUserName;
        this.f445283c = str;
        this.f445284d = i17;
        this.f445285e = str2;
        this.f445286f = str3;
        this.f445287g = str4;
    }

    /* renamed from: equals */
    public boolean m160193xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi3.n)) {
            return false;
        }
        qi3.n nVar = (qi3.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445281a, nVar.f445281a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445282b, nVar.f445282b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445283c, nVar.f445283c) && this.f445284d == nVar.f445284d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445285e, nVar.f445285e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445286f, nVar.f445286f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445287g, nVar.f445287g);
    }

    /* renamed from: hashCode */
    public int m160194x8cdac1b() {
        int hashCode = ((this.f445281a.hashCode() * 31) + this.f445282b.hashCode()) * 31;
        java.lang.String str = this.f445283c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f445284d)) * 31;
        java.lang.String str2 = this.f445285e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f445286f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f445287g;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m160195x9616526c() {
        return "BypSendParams(fromUserName=" + this.f445281a + ", toUserName=" + this.f445282b + ", sessionId=" + this.f445283c + ", bizType=" + this.f445284d + ", msgSource=" + this.f445285e + ", cliMsgId=" + this.f445286f + ", fileName=" + this.f445287g + ')';
    }
}
