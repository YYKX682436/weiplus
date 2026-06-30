package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendFileActionReportStruct */
/* loaded from: classes9.dex */
public final class C6853x996853e3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141717d;

    /* renamed from: e, reason: collision with root package name */
    public long f141718e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141719f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141720g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f141721h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f141722i;

    @Override // jx3.a
    public int g() {
        return 22579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141717d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141718e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141719f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141720g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141721h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141722i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f141717d);
        stringBuffer.append("\r\nFileSize:");
        stringBuffer.append(this.f141718e);
        stringBuffer.append("\r\nFileExt:");
        stringBuffer.append(this.f141719f);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f141720g);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f141721h);
        stringBuffer.append("\r\nLogVersionlog:");
        stringBuffer.append(this.f141722i);
        return stringBuffer.toString();
    }
}
