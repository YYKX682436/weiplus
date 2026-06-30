package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppOpenForceSyncOrAsyncGetResourceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f62313d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62314e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62315f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f62316g;

    /* renamed from: h, reason: collision with root package name */
    public long f62317h;

    /* renamed from: i, reason: collision with root package name */
    public long f62318i;

    /* renamed from: j, reason: collision with root package name */
    public long f62319j;

    @Override // jx3.a
    public int g() {
        return 30477;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62313d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62314e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62315f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62316g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62317h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62318i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62319j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62313d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f62314e);
        stringBuffer.append("\r\nUsername:");
        stringBuffer.append(this.f62315f);
        stringBuffer.append("\r\nDebugMode:");
        stringBuffer.append(this.f62316g);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62317h);
        stringBuffer.append("\r\nResourceType:");
        stringBuffer.append(this.f62318i);
        stringBuffer.append("\r\nForceTypeAndReason:");
        stringBuffer.append(this.f62319j);
        return stringBuffer.toString();
    }
}
