package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class HideSessionExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58450d = "";

    @Override // jx3.a
    public int g() {
        return 21170;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f58450d);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ShowUpScene:0\r\nChatName:");
        stringBuffer.append(this.f58450d);
        stringBuffer.append("\r\nSessionType:0");
        return stringBuffer.toString();
    }
}
