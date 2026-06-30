package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class LiveErrorCodeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58583d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58584e = "";

    @Override // jx3.a
    public int g() {
        return 19968;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58583d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58584e);
        stringBuffer.append(",0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomId:");
        stringBuffer.append(this.f58583d);
        stringBuffer.append("\r\nliveId:0\r\nmicId:");
        stringBuffer.append(this.f58584e);
        stringBuffer.append("\r\nliveRole:0\r\ngroupRole:0\r\nlinkStatus:0\r\naudienceMode:0\r\nerrorCode:0");
        return stringBuffer.toString();
    }
}
