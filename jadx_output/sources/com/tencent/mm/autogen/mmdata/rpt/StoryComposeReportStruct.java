package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class StoryComposeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60867d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60868e = "";

    @Override // jx3.a
    public int g() {
        return 16688;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,0,0,");
        stringBuffer.append(this.f60867d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60868e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ComposeTime:0\r\nComposeErrorType:0\r\nUploadTime:0\r\nUploadErrorType:0\r\nComposeErrorTypeStr:");
        stringBuffer.append(this.f60867d);
        stringBuffer.append("\r\nUploadErrorTypeStr:");
        stringBuffer.append(this.f60868e);
        return stringBuffer.toString();
    }
}
