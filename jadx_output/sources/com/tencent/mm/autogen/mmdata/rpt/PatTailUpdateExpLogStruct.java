package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class PatTailUpdateExpLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59848d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f59849e = "";

    @Override // jx3.a
    public int g() {
        return 21884;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,");
        stringBuffer.append(this.f59848d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59849e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:0\r\nscene:0\r\nPatTime:0\r\nUsername:");
        stringBuffer.append(this.f59848d);
        stringBuffer.append("\r\nChatroomName:");
        stringBuffer.append(this.f59849e);
        stringBuffer.append("\r\nErrorCode:0\r\nactionTS:0");
        return stringBuffer.toString();
    }
}
