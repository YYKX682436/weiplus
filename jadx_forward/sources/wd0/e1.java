package wd0;

/* loaded from: classes8.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public int f526236a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f526237b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f526238c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f526239d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f526240e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vt4 f526241f;

    /* renamed from: g, reason: collision with root package name */
    public int f526242g;

    /* renamed from: h, reason: collision with root package name */
    public wd0.m2 f526243h;

    public e1() {
        this(0, null, null, null, null, null, 0, null, 255, null);
    }

    /* renamed from: equals */
    public boolean m173482xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.e1)) {
            return false;
        }
        wd0.e1 e1Var = (wd0.e1) obj;
        return this.f526236a == e1Var.f526236a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526237b, e1Var.f526237b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526238c, e1Var.f526238c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526239d, e1Var.f526239d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526240e, e1Var.f526240e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526241f, e1Var.f526241f) && this.f526242g == e1Var.f526242g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f526243h, e1Var.f526243h);
    }

    /* renamed from: hashCode */
    public int m173483x8cdac1b() {
        return (((((((((((((java.lang.Integer.hashCode(this.f526236a) * 31) + this.f526237b.hashCode()) * 31) + this.f526238c.hashCode()) * 31) + this.f526239d.hashCode()) * 31) + this.f526240e.hashCode()) * 31) + this.f526241f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f526242g)) * 31) + this.f526243h.m173507x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173484x9616526c() {
        return "FingerprintLoginResult(errCode=" + this.f526236a + ", errMsg=" + this.f526237b + ", account=" + this.f526238c + ", pwd=" + this.f526239d + ", resInfo=" + this.f526240e + ", network_sect_resp=" + this.f526241f + ", MmTlsControlBitFlag=" + this.f526242g + ", loginParam=" + this.f526243h + ')';
    }

    public e1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.vt4 vt4Var, int i18, wd0.m2 m2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i27 = (i19 & 1) != 0 ? 0 : i17;
        java.lang.String errMsg = (i19 & 2) != 0 ? "" : str;
        java.lang.String account = (i19 & 4) != 0 ? "" : str2;
        java.lang.String pwd = (i19 & 8) != 0 ? "" : str3;
        java.lang.String resInfo = (i19 & 16) == 0 ? str4 : "";
        r45.vt4 network_sect_resp = (i19 & 32) != 0 ? new r45.vt4() : vt4Var;
        int i28 = (i19 & 64) == 0 ? i18 : 0;
        wd0.m2 loginParam = (i19 & 128) != 0 ? new wd0.m2(0, null, null, 7, null) : m2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pwd, "pwd");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resInfo, "resInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network_sect_resp, "network_sect_resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loginParam, "loginParam");
        this.f526236a = i27;
        this.f526237b = errMsg;
        this.f526238c = account;
        this.f526239d = pwd;
        this.f526240e = resInfo;
        this.f526241f = network_sect_resp;
        this.f526242g = i28;
        this.f526243h = loginParam;
    }
}
