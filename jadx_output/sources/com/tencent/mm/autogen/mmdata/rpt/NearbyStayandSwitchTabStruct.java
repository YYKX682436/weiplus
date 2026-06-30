package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class NearbyStayandSwitchTabStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59646f;

    /* renamed from: g, reason: collision with root package name */
    public long f59647g;

    /* renamed from: h, reason: collision with root package name */
    public long f59648h;

    /* renamed from: k, reason: collision with root package name */
    public long f59651k;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59644d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59645e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59649i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59650j = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59652l = "";

    @Override // jx3.a
    public int g() {
        return 21835;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59644d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59645e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59646f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59647g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59648h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59649i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59650j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59651k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59652l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f59644d);
        stringBuffer.append("\r\nPageName:");
        stringBuffer.append(this.f59645e);
        stringBuffer.append("\r\nStayTimeMs:");
        stringBuffer.append(this.f59646f);
        stringBuffer.append("\r\nEnterTimeMs:");
        stringBuffer.append(this.f59647g);
        stringBuffer.append("\r\nExitTimeMs:");
        stringBuffer.append(this.f59648h);
        stringBuffer.append("\r\nClickTabContextID:");
        stringBuffer.append(this.f59649i);
        stringBuffer.append("\r\nSid:");
        stringBuffer.append(this.f59650j);
        stringBuffer.append("\r\nreportType:");
        stringBuffer.append(this.f59651k);
        stringBuffer.append("\r\nContextID:");
        stringBuffer.append(this.f59652l);
        return stringBuffer.toString();
    }
}
