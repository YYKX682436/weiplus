package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderEmptyChatStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56702d = "";

    @Override // jx3.a
    public int g() {
        return 20693;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f56702d);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("myAccountType:0\r\nfromCommentScene:0\r\nchatlistSessionid:");
        stringBuffer.append(this.f56702d);
        stringBuffer.append("\r\ndelSessionCount:0");
        return stringBuffer.toString();
    }
}
