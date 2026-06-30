package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WASettingVoipAuthorizeManagerReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f62061f;

    /* renamed from: g, reason: collision with root package name */
    public long f62062g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62059d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62060e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62063h = "";

    @Override // jx3.a
    public int g() {
        return 37090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62059d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62060e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62061f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62062g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62063h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("pageId:");
        stringBuffer.append(this.f62059d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f62060e);
        stringBuffer.append("\r\nenterSource:");
        stringBuffer.append(this.f62061f);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f62062g);
        stringBuffer.append("\r\ntemplateId:");
        stringBuffer.append(this.f62063h);
        return stringBuffer.toString();
    }
}
