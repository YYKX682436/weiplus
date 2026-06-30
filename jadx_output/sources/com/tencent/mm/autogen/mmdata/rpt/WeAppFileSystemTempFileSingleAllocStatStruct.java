package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppFileSystemTempFileSingleAllocStatStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public cm.g f62271f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62269d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62270e = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62272g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62273h = 0;

    @Override // jx3.a
    public int g() {
        return 17688;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62269d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62270e);
        stringBuffer.append(",");
        cm.g gVar = this.f62271f;
        stringBuffer.append(gVar != null ? gVar.f43085d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62272g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62273h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62269d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62270e);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62271f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62272g);
        stringBuffer.append("\r\nFileAllocSize:");
        stringBuffer.append(this.f62273h);
        return stringBuffer.toString();
    }
}
