package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.p525x36ebcb;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t */
/* loaded from: classes13.dex */
public final class C4377x6f575caa extends com.qq.taf.jce.AbstractC2863x16243f65 {

    /* renamed from: channel */
    public java.lang.String f17309x2c0b7d03;

    /* renamed from: fr, reason: collision with root package name */
    public java.lang.String f130242fr;

    /* renamed from: imei */
    public java.lang.String f17310x3160c8;

    /* renamed from: is_login */
    public boolean f17311x70a5814;

    /* renamed from: nettp */
    public java.lang.String f17312x63dc4d9;

    /* renamed from: pf, reason: collision with root package name */
    public java.lang.String f130243pf;

    /* renamed from: session_id */
    public java.lang.String f17313x630ddf64;
    public long uin;
    public int uip;

    /* renamed from: user_id */
    public long f17314xf73aee0f;

    /* renamed from: version */
    public java.lang.String f17315x14f51cd8;

    /* renamed from: x, reason: collision with root package name */
    public double f130244x;

    /* renamed from: y, reason: collision with root package name */
    public double f130245y;

    public C4377x6f575caa() {
        this.f17314xf73aee0f = 0L;
        this.f17313x630ddf64 = "";
        this.uin = 0L;
        this.uip = 0;
        this.f17310x3160c8 = "";
        this.f130244x = 0.0d;
        this.f130245y = 0.0d;
        this.f130243pf = "";
        this.f17315x14f51cd8 = "";
        this.f17311x70a5814 = true;
        this.f130242fr = "";
        this.f17312x63dc4d9 = "";
        this.f17309x2c0b7d03 = "";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "navsns.user_login_t";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17314xf73aee0f = mVar.a(this.f17314xf73aee0f, 0, true);
        this.f17313x630ddf64 = mVar.b(1, true);
        this.uin = mVar.a(this.uin, 2, true);
        this.uip = mVar.a(this.uip, 3, true);
        this.f17310x3160c8 = mVar.b(4, false);
        this.f130244x = mVar.a(this.f130244x, 5, false);
        this.f130245y = mVar.a(this.f130245y, 6, false);
        this.f130243pf = mVar.b(7, false);
        this.f17315x14f51cd8 = mVar.b(8, false);
        this.f17311x70a5814 = mVar.a(9, false);
        this.f130242fr = mVar.b(10, false);
        this.f17312x63dc4d9 = mVar.b(11, false);
        this.f17309x2c0b7d03 = mVar.b(12, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17314xf73aee0f, 0);
        nVar.a(this.f17313x630ddf64, 1);
        nVar.a(this.uin, 2);
        nVar.a(this.uip, 3);
        java.lang.String str = this.f17310x3160c8;
        if (str != null) {
            nVar.a(str, 4);
        }
        nVar.a(this.f130244x, 5);
        nVar.a(this.f130245y, 6);
        java.lang.String str2 = this.f130243pf;
        if (str2 != null) {
            nVar.a(str2, 7);
        }
        java.lang.String str3 = this.f17315x14f51cd8;
        if (str3 != null) {
            nVar.a(str3, 8);
        }
        nVar.a(this.f17311x70a5814, 9);
        java.lang.String str4 = this.f130242fr;
        if (str4 != null) {
            nVar.a(str4, 10);
        }
        java.lang.String str5 = this.f17312x63dc4d9;
        if (str5 != null) {
            nVar.a(str5, 11);
        }
        java.lang.String str6 = this.f17309x2c0b7d03;
        if (str6 != null) {
            nVar.a(str6, 12);
        }
    }

    public C4377x6f575caa(long j17, java.lang.String str, long j18, int i17, java.lang.String str2, double d17, double d18, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f17314xf73aee0f = j17;
        this.f17313x630ddf64 = str;
        this.uin = j18;
        this.uip = i17;
        this.f17310x3160c8 = str2;
        this.f130244x = d17;
        this.f130245y = d18;
        this.f130243pf = str3;
        this.f17315x14f51cd8 = str4;
        this.f17311x70a5814 = z17;
        this.f130242fr = str5;
        this.f17312x63dc4d9 = str6;
        this.f17309x2c0b7d03 = str7;
    }
}
