package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WalletAutoReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62211d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62212e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62213f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62214g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62215h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f62216i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62217j = "";

    @Override // jx3.a
    public int g() {
        return 24144;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62211d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62212e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62213f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62214g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62215h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62216i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62217j);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("LogType:");
        stringBuffer.append(this.f62211d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f62212e);
        stringBuffer.append("\r\nSequenceId:");
        stringBuffer.append(this.f62213f);
        stringBuffer.append("\r\nURL:");
        stringBuffer.append(this.f62214g);
        stringBuffer.append("\r\nReportTimeStamp:");
        stringBuffer.append(this.f62215h);
        stringBuffer.append("\r\nLogAction:");
        stringBuffer.append(this.f62216i);
        stringBuffer.append("\r\nExtInfo:");
        stringBuffer.append(this.f62217j);
        stringBuffer.append("\r\nscene:0\r\nchannel:0");
        return stringBuffer.toString();
    }
}
