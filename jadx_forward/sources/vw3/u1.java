package vw3;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f522663a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f522664b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f522665c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f522666d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f522667e;

    /* renamed from: f, reason: collision with root package name */
    public final int f522668f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f522669g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f522670h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f522671i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f522672j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f522673k;

    public u1(java.lang.String nsCountryCode, java.lang.String nsPhoneNUmber, java.lang.String nsFormatdPhoneNumber, java.lang.String smsUpMobile, java.lang.String smsUpcode, int i17, java.lang.String headImgUrl, java.lang.String nickName, java.lang.String mobile_verify_count_down_sec, java.lang.String reg_style, java.lang.String switchToWxId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nsCountryCode, "nsCountryCode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nsPhoneNUmber, "nsPhoneNUmber");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nsFormatdPhoneNumber, "nsFormatdPhoneNumber");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smsUpMobile, "smsUpMobile");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smsUpcode, "smsUpcode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headImgUrl, "headImgUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile_verify_count_down_sec, "mobile_verify_count_down_sec");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reg_style, "reg_style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(switchToWxId, "switchToWxId");
        this.f522663a = nsCountryCode;
        this.f522664b = nsPhoneNUmber;
        this.f522665c = nsFormatdPhoneNumber;
        this.f522666d = smsUpMobile;
        this.f522667e = smsUpcode;
        this.f522668f = i17;
        this.f522669g = headImgUrl;
        this.f522670h = nickName;
        this.f522671i = mobile_verify_count_down_sec;
        this.f522672j = reg_style;
        this.f522673k = switchToWxId;
    }

    /* renamed from: equals */
    public boolean m172850xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3.u1)) {
            return false;
        }
        vw3.u1 u1Var = (vw3.u1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522663a, u1Var.f522663a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522664b, u1Var.f522664b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522665c, u1Var.f522665c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522666d, u1Var.f522666d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522667e, u1Var.f522667e) && this.f522668f == u1Var.f522668f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522669g, u1Var.f522669g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522670h, u1Var.f522670h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522671i, u1Var.f522671i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522672j, u1Var.f522672j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f522673k, u1Var.f522673k);
    }

    /* renamed from: hashCode */
    public int m172851x8cdac1b() {
        return (((((((((((((((((((this.f522663a.hashCode() * 31) + this.f522664b.hashCode()) * 31) + this.f522665c.hashCode()) * 31) + this.f522666d.hashCode()) * 31) + this.f522667e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f522668f)) * 31) + this.f522669g.hashCode()) * 31) + this.f522670h.hashCode()) * 31) + this.f522671i.hashCode()) * 31) + this.f522672j.hashCode()) * 31) + this.f522673k.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172852x9616526c() {
        return "MyAccountData(nsCountryCode=" + this.f522663a + ", nsPhoneNUmber=" + this.f522664b + ", nsFormatdPhoneNumber=" + this.f522665c + ", smsUpMobile=" + this.f522666d + ", smsUpcode=" + this.f522667e + ", iRegisterControlFlag=" + this.f522668f + ", headImgUrl=" + this.f522669g + ", nickName=" + this.f522670h + ", mobile_verify_count_down_sec=" + this.f522671i + ", reg_style=" + this.f522672j + ", switchToWxId=" + this.f522673k + ')';
    }
}
