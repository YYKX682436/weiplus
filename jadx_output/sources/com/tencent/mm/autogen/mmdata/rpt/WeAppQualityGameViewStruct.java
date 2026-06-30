package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class WeAppQualityGameViewStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f62495d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f62496e = "";

    @Override // jx3.a
    public int g() {
        return 16022;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62495d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62496e);
        stringBuffer.append(",0,-1,0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62495d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62496e);
        stringBuffer.append("\r\nAppVersion:0\r\nAppState:null\r\nAppType:0\r\nCostTimeMs:0\r\nScene:0\r\nStartTimeStampMs:0\r\nEndTimeStampMs:0");
        return stringBuffer.toString();
    }
}
