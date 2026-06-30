package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WalletAutoReportStruct */
/* loaded from: classes9.dex */
public final class C7067x5c786bb1 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143744d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143745e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143746f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143747g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f143748h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f143749i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f143750j = "";

    @Override // jx3.a
    public int g() {
        return 24144;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143744d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143745e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143746f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143747g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143748h);
        stringBuffer.append(",");
        stringBuffer.append(this.f143749i);
        stringBuffer.append(",");
        stringBuffer.append(this.f143750j);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LogType:");
        stringBuffer.append(this.f143744d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f143745e);
        stringBuffer.append("\r\nSequenceId:");
        stringBuffer.append(this.f143746f);
        stringBuffer.append("\r\nURL:");
        stringBuffer.append(this.f143747g);
        stringBuffer.append("\r\nReportTimeStamp:");
        stringBuffer.append(this.f143748h);
        stringBuffer.append("\r\nLogAction:");
        stringBuffer.append(this.f143749i);
        stringBuffer.append("\r\nExtInfo:");
        stringBuffer.append(this.f143750j);
        stringBuffer.append("\r\nscene:0\r\nchannel:0");
        return stringBuffer.toString();
    }
}
