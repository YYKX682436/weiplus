package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityWasmCachePrecompileStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62819d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f62820e;

    /* renamed from: f, reason: collision with root package name */
    public long f62821f;

    /* renamed from: g, reason: collision with root package name */
    public long f62822g;

    /* renamed from: h, reason: collision with root package name */
    public long f62823h;

    /* renamed from: i, reason: collision with root package name */
    public long f62824i;

    /* renamed from: j, reason: collision with root package name */
    public long f62825j;

    @Override // jx3.a
    public int g() {
        return 27225;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62819d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62820e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62821f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62822g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62823h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62824i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62825j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f62819d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62820e);
        stringBuffer.append("\r\nWasmBytesSize:");
        stringBuffer.append(this.f62821f);
        stringBuffer.append("\r\nCacheBytesSize:");
        stringBuffer.append(this.f62822g);
        stringBuffer.append("\r\nWasmCompileCost:");
        stringBuffer.append(this.f62823h);
        stringBuffer.append("\r\nWasmCompileFuncListCount:");
        stringBuffer.append(this.f62824i);
        stringBuffer.append("\r\nWasmCompileResult:");
        stringBuffer.append(this.f62825j);
        return stringBuffer.toString();
    }
}
