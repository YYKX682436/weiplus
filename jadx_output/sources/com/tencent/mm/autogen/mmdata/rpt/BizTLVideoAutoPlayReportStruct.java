package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class BizTLVideoAutoPlayReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f55429d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f55430e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f55431f = "";

    @Override // jx3.a
    public int g() {
        return 21001;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f55429d);
        stringBuffer.append(",0,0,0,0,0,0,0,0,0,0,0,");
        stringBuffer.append(this.f55430e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55431f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizUin:0\r\nVid:");
        stringBuffer.append(this.f55429d);
        stringBuffer.append("\r\nMsgId:0\r\nIdx:0\r\nAbsolutePosition:0\r\nSessionId:0\r\nAutoPlayId:0\r\nEventType:0\r\nPlayDuration:0\r\nVideoDuration:0\r\nBufferDuration:0\r\nNetworkType:0\r\nPlayScene:0\r\nFinderId:");
        stringBuffer.append(this.f55430e);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f55431f);
        return stringBuffer.toString();
    }
}
