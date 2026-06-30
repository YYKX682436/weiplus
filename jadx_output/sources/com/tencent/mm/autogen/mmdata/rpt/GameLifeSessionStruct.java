package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class GameLifeSessionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58340d;

    /* renamed from: e, reason: collision with root package name */
    public long f58341e;

    /* renamed from: f, reason: collision with root package name */
    public long f58342f;

    /* renamed from: g, reason: collision with root package name */
    public long f58343g;

    /* renamed from: h, reason: collision with root package name */
    public long f58344h;

    /* renamed from: k, reason: collision with root package name */
    public long f58347k;

    /* renamed from: m, reason: collision with root package name */
    public long f58349m;

    /* renamed from: o, reason: collision with root package name */
    public long f58351o;

    /* renamed from: r, reason: collision with root package name */
    public long f58354r;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f58345i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58346j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58348l = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58350n = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f58352p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f58353q = "";

    @Override // jx3.a
    public int g() {
        return 20488;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58340d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58341e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58342f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58343g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58344h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58345i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58346j);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58347k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58348l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58349m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58350n);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58351o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58352p);
        stringBuffer.append(",");
        stringBuffer.append(this.f58353q);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f58354r);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SceneID:");
        stringBuffer.append(this.f58340d);
        stringBuffer.append("\r\nUIArea:");
        stringBuffer.append(this.f58341e);
        stringBuffer.append("\r\nPositionID:");
        stringBuffer.append(this.f58342f);
        stringBuffer.append("\r\nActionID:");
        stringBuffer.append(this.f58343g);
        stringBuffer.append("\r\nSourceID:");
        stringBuffer.append(this.f58344h);
        stringBuffer.append("\r\nGameID:");
        stringBuffer.append(this.f58345i);
        stringBuffer.append("\r\nActionStatus:");
        stringBuffer.append(this.f58346j);
        stringBuffer.append("\r\nGiftID:0\r\nGiftType:0\r\nfrom_account_type:");
        stringBuffer.append(this.f58347k);
        stringBuffer.append("\r\nfrom_username:");
        stringBuffer.append(this.f58348l);
        stringBuffer.append("\r\nto_account_type:");
        stringBuffer.append(this.f58349m);
        stringBuffer.append("\r\nto_username:");
        stringBuffer.append(this.f58350n);
        stringBuffer.append("\r\nRedDot:0\r\nTotalNum:");
        stringBuffer.append(this.f58351o);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f58352p);
        stringBuffer.append("\r\nExternInfo:");
        stringBuffer.append(this.f58353q);
        stringBuffer.append("\r\nTime:0\r\nGameType:0\r\nssid:");
        stringBuffer.append(this.f58354r);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct p(java.lang.String str) {
        this.f58353q = b("ExternInfo", str, true);
        return this;
    }
}
