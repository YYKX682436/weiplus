package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WeAppPackageDeleteActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62330d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62331e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62332f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f62333g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62334h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f62335i = "";

    @Override // jx3.a
    public int g() {
        return 15402;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62330d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62331e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62332f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62333g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62334h);
        stringBuffer.append(",0,0,0,0,0,0,");
        stringBuffer.append(this.f62335i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("DeleteReason:");
        stringBuffer.append(this.f62330d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f62331e);
        stringBuffer.append("\r\nDebugType:");
        stringBuffer.append(this.f62332f);
        stringBuffer.append("\r\nDeleteCount:");
        stringBuffer.append(this.f62333g);
        stringBuffer.append("\r\nAbtestStatus:");
        stringBuffer.append(this.f62334h);
        stringBuffer.append("\r\nLRUDeleteSize:0\r\nweappDirSizeBeforeLRUDelete:0\r\nweappDirSizePercentBeforeLRUDelete:0\r\nweappDirSizeAfterLRUDelete:0\r\nweappDirSizePercentAfterLRUDelete:0\r\nExpiredDeleteSize:0\r\nAppIdList:");
        stringBuffer.append(this.f62335i);
        return stringBuffer.toString();
    }
}
