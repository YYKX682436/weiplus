package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class WowCompliancePopupWindowReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62987d;

    /* renamed from: e, reason: collision with root package name */
    public long f62988e;

    /* renamed from: f, reason: collision with root package name */
    public long f62989f;

    @Override // jx3.a
    public int g() {
        return 25208;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62987d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62988e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62989f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f62987d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62988e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62989f);
        return stringBuffer.toString();
    }
}
