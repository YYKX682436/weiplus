package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class WebviewFullSnapshotActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62946d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62947e;

    /* renamed from: f, reason: collision with root package name */
    public long f62948f;

    /* renamed from: g, reason: collision with root package name */
    public long f62949g;

    @Override // jx3.a
    public int g() {
        return 26496;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62946d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62947e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62948f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62949g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PageUrl:");
        stringBuffer.append(this.f62946d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f62947e);
        stringBuffer.append("\r\neditedFlag:");
        stringBuffer.append(this.f62948f);
        stringBuffer.append("\r\nTriggerSource:");
        stringBuffer.append(this.f62949g);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct p(java.lang.String str) {
        this.f62946d = b("PageUrl", str, true);
        return this;
    }
}
