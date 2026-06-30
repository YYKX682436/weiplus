package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct */
/* loaded from: classes8.dex */
public final class C6633xea2e527d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139873d;

    /* renamed from: e, reason: collision with root package name */
    public long f139874e;

    /* renamed from: f, reason: collision with root package name */
    public long f139875f;

    /* renamed from: g, reason: collision with root package name */
    public long f139876g;

    /* renamed from: h, reason: collision with root package name */
    public long f139877h;

    /* renamed from: k, reason: collision with root package name */
    public long f139880k;

    /* renamed from: m, reason: collision with root package name */
    public long f139882m;

    /* renamed from: o, reason: collision with root package name */
    public long f139884o;

    /* renamed from: r, reason: collision with root package name */
    public long f139887r;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f139878i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f139879j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f139881l = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f139883n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f139885p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f139886q = "";

    @Override // jx3.a
    public int g() {
        return 20488;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139873d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139874e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139875f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139876g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139877h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139878i);
        stringBuffer.append(",");
        stringBuffer.append(this.f139879j);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f139880k);
        stringBuffer.append(",");
        stringBuffer.append(this.f139881l);
        stringBuffer.append(",");
        stringBuffer.append(this.f139882m);
        stringBuffer.append(",");
        stringBuffer.append(this.f139883n);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f139884o);
        stringBuffer.append(",");
        stringBuffer.append(this.f139885p);
        stringBuffer.append(",");
        stringBuffer.append(this.f139886q);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f139887r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SceneID:");
        stringBuffer.append(this.f139873d);
        stringBuffer.append("\r\nUIArea:");
        stringBuffer.append(this.f139874e);
        stringBuffer.append("\r\nPositionID:");
        stringBuffer.append(this.f139875f);
        stringBuffer.append("\r\nActionID:");
        stringBuffer.append(this.f139876g);
        stringBuffer.append("\r\nSourceID:");
        stringBuffer.append(this.f139877h);
        stringBuffer.append("\r\nGameID:");
        stringBuffer.append(this.f139878i);
        stringBuffer.append("\r\nActionStatus:");
        stringBuffer.append(this.f139879j);
        stringBuffer.append("\r\nGiftID:0\r\nGiftType:0\r\nfrom_account_type:");
        stringBuffer.append(this.f139880k);
        stringBuffer.append("\r\nfrom_username:");
        stringBuffer.append(this.f139881l);
        stringBuffer.append("\r\nto_account_type:");
        stringBuffer.append(this.f139882m);
        stringBuffer.append("\r\nto_username:");
        stringBuffer.append(this.f139883n);
        stringBuffer.append("\r\nRedDot:0\r\nTotalNum:");
        stringBuffer.append(this.f139884o);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f139885p);
        stringBuffer.append("\r\nExternInfo:");
        stringBuffer.append(this.f139886q);
        stringBuffer.append("\r\nTime:0\r\nGameType:0\r\nssid:");
        stringBuffer.append(this.f139887r);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d p(java.lang.String str) {
        this.f139886q = b("ExternInfo", str, true);
        return this;
    }
}
