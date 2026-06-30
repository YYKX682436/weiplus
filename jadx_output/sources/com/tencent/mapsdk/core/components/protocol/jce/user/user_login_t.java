package com.tencent.mapsdk.core.components.protocol.jce.user;

/* loaded from: classes13.dex */
public final class user_login_t extends com.qq.taf.jce.MapJceStruct {
    public java.lang.String channel;

    /* renamed from: fr, reason: collision with root package name */
    public java.lang.String f48709fr;
    public java.lang.String imei;
    public boolean is_login;
    public java.lang.String nettp;

    /* renamed from: pf, reason: collision with root package name */
    public java.lang.String f48710pf;
    public java.lang.String session_id;
    public long uin;
    public int uip;
    public long user_id;
    public java.lang.String version;

    /* renamed from: x, reason: collision with root package name */
    public double f48711x;

    /* renamed from: y, reason: collision with root package name */
    public double f48712y;

    public user_login_t() {
        this.user_id = 0L;
        this.session_id = "";
        this.uin = 0L;
        this.uip = 0;
        this.imei = "";
        this.f48711x = 0.0d;
        this.f48712y = 0.0d;
        this.f48710pf = "";
        this.version = "";
        this.is_login = true;
        this.f48709fr = "";
        this.nettp = "";
        this.channel = "";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "navsns.user_login_t";
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.user_id = mVar.a(this.user_id, 0, true);
        this.session_id = mVar.b(1, true);
        this.uin = mVar.a(this.uin, 2, true);
        this.uip = mVar.a(this.uip, 3, true);
        this.imei = mVar.b(4, false);
        this.f48711x = mVar.a(this.f48711x, 5, false);
        this.f48712y = mVar.a(this.f48712y, 6, false);
        this.f48710pf = mVar.b(7, false);
        this.version = mVar.b(8, false);
        this.is_login = mVar.a(9, false);
        this.f48709fr = mVar.b(10, false);
        this.nettp = mVar.b(11, false);
        this.channel = mVar.b(12, false);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.user_id, 0);
        nVar.a(this.session_id, 1);
        nVar.a(this.uin, 2);
        nVar.a(this.uip, 3);
        java.lang.String str = this.imei;
        if (str != null) {
            nVar.a(str, 4);
        }
        nVar.a(this.f48711x, 5);
        nVar.a(this.f48712y, 6);
        java.lang.String str2 = this.f48710pf;
        if (str2 != null) {
            nVar.a(str2, 7);
        }
        java.lang.String str3 = this.version;
        if (str3 != null) {
            nVar.a(str3, 8);
        }
        nVar.a(this.is_login, 9);
        java.lang.String str4 = this.f48709fr;
        if (str4 != null) {
            nVar.a(str4, 10);
        }
        java.lang.String str5 = this.nettp;
        if (str5 != null) {
            nVar.a(str5, 11);
        }
        java.lang.String str6 = this.channel;
        if (str6 != null) {
            nVar.a(str6, 12);
        }
    }

    public user_login_t(long j17, java.lang.String str, long j18, int i17, java.lang.String str2, double d17, double d18, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.user_id = j17;
        this.session_id = str;
        this.uin = j18;
        this.uip = i17;
        this.imei = str2;
        this.f48711x = d17;
        this.f48712y = d18;
        this.f48710pf = str3;
        this.version = str4;
        this.is_login = z17;
        this.f48709fr = str5;
        this.nettp = str6;
        this.channel = str7;
    }
}
