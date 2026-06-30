package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class SnsClipPageEntranceExposeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60491d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60492e;

    @Override // jx3.a
    public int g() {
        return 21183;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60491d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60492e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f60491d);
        stringBuffer.append("\r\nexposeType:");
        stringBuffer.append(this.f60492e);
        return stringBuffer.toString();
    }
}
