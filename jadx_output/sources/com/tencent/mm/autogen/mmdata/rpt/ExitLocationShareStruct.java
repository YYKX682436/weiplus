package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ExitLocationShareStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56123d = "";

    @Override // jx3.a
    public int g() {
        return 26734;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f56123d);
        stringBuffer.append(",0,0,0,0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:0\r\nIsSender:0\r\nSessionID:");
        stringBuffer.append(this.f56123d);
        stringBuffer.append("\r\nEnterTime:0\r\nExitTime:0\r\nFloorWidgetShowCount:0\r\nFloorWidgetClkCount:0\r\nInitSenderAndReceiverDistanceRange:0");
        return stringBuffer.toString();
    }
}
