package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderEnterMentionListStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f56703d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f56704e = "";

    @Override // jx3.a
    public int g() {
        return 19760;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f56703d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56704e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("EnterTimeStampMs:0\r\nFinerUsername:");
        stringBuffer.append(this.f56703d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f56704e);
        return stringBuffer.toString();
    }
}
