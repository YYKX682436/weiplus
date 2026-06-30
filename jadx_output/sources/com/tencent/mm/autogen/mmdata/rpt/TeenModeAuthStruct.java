package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class TeenModeAuthStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61073d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f61074e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f61075f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61076g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61077h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f61078i = "";

    @Override // jx3.a
    public int g() {
        return 24416;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61073d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61074e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61075f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61076g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61077h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61078i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f61073d);
        stringBuffer.append("\r\nuserrole:");
        stringBuffer.append(this.f61074e);
        stringBuffer.append("\r\nrequestType:");
        stringBuffer.append(this.f61075f);
        stringBuffer.append("\r\nrequestID:");
        stringBuffer.append(this.f61076g);
        stringBuffer.append("\r\nrequestResource:");
        stringBuffer.append(this.f61077h);
        stringBuffer.append("\r\nrequestResourceExtra:");
        stringBuffer.append(this.f61078i);
        return stringBuffer.toString();
    }
}
