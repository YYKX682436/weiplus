package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class XFilesActionNewStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63079d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63080e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63081f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f63082g;

    /* renamed from: h, reason: collision with root package name */
    public long f63083h;

    /* renamed from: i, reason: collision with root package name */
    public long f63084i;

    @Override // jx3.a
    public int g() {
        return 25696;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63079d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63080e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63081f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63082g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63083h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63084i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ContextId:");
        stringBuffer.append(this.f63079d);
        stringBuffer.append("\r\nFileId:");
        stringBuffer.append(this.f63080e);
        stringBuffer.append("\r\nFileFormat:");
        stringBuffer.append(this.f63081f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f63082g);
        stringBuffer.append("\r\nInstallQB:");
        stringBuffer.append(this.f63083h);
        stringBuffer.append("\r\nFilePageType:");
        stringBuffer.append(this.f63084i);
        return stringBuffer.toString();
    }
}
