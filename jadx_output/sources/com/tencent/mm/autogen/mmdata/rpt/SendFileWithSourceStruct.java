package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class SendFileWithSourceStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60205e;

    /* renamed from: g, reason: collision with root package name */
    public long f60207g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60204d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60206f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60208h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60209i = "";

    @Override // jx3.a
    public int g() {
        return 34826;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60204d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60205e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60206f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60207g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60208h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60209i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f60204d);
        stringBuffer.append("\r\nFileSize:");
        stringBuffer.append(this.f60205e);
        stringBuffer.append("\r\nFileExt:");
        stringBuffer.append(this.f60206f);
        stringBuffer.append("\r\nFileSource:");
        stringBuffer.append(this.f60207g);
        stringBuffer.append("\r\nFileId:");
        stringBuffer.append(this.f60208h);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f60209i);
        return stringBuffer.toString();
    }
}
