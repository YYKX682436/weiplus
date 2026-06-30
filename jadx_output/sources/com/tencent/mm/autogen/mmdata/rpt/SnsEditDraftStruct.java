package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsEditDraftStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60538d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60539e = 0;

    @Override // jx3.a
    public int g() {
        return 15988;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60538d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60539e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60538d);
        stringBuffer.append("\r\nClickTimeStampMs:");
        stringBuffer.append(this.f60539e);
        return stringBuffer.toString();
    }
}
