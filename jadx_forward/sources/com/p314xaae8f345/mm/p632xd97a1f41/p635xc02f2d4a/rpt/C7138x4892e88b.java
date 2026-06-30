package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WebviewFullSnapshotActionReportStruct */
/* loaded from: classes8.dex */
public final class C7138x4892e88b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144479d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f144480e;

    /* renamed from: f, reason: collision with root package name */
    public long f144481f;

    /* renamed from: g, reason: collision with root package name */
    public long f144482g;

    @Override // jx3.a
    public int g() {
        return 26496;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144479d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144480e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144481f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144482g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PageUrl:");
        stringBuffer.append(this.f144479d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f144480e);
        stringBuffer.append("\r\neditedFlag:");
        stringBuffer.append(this.f144481f);
        stringBuffer.append("\r\nTriggerSource:");
        stringBuffer.append(this.f144482g);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7138x4892e88b p(java.lang.String str) {
        this.f144479d = b("PageUrl", str, true);
        return this;
    }
}
