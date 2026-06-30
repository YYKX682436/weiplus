package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class MsgHistoryWatchReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59273d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59274e = "";

    @Override // jx3.a
    public int g() {
        return 22335;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f59273d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59274e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:0\r\nChatType:");
        stringBuffer.append(this.f59273d);
        stringBuffer.append("\r\nChatNameStr:");
        stringBuffer.append(this.f59274e);
        return stringBuffer.toString();
    }
}
