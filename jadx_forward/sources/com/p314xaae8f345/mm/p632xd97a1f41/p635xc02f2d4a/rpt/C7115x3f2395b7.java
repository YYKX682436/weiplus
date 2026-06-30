package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct */
/* loaded from: classes7.dex */
public final class C7115x3f2395b7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f144352d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f144353e;

    /* renamed from: f, reason: collision with root package name */
    public long f144354f;

    /* renamed from: g, reason: collision with root package name */
    public long f144355g;

    /* renamed from: h, reason: collision with root package name */
    public long f144356h;

    /* renamed from: i, reason: collision with root package name */
    public long f144357i;

    /* renamed from: j, reason: collision with root package name */
    public long f144358j;

    @Override // jx3.a
    public int g() {
        return 27225;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144352d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144353e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144354f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144355g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144356h);
        stringBuffer.append(",");
        stringBuffer.append(this.f144357i);
        stringBuffer.append(",");
        stringBuffer.append(this.f144358j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f144352d);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f144353e);
        stringBuffer.append("\r\nWasmBytesSize:");
        stringBuffer.append(this.f144354f);
        stringBuffer.append("\r\nCacheBytesSize:");
        stringBuffer.append(this.f144355g);
        stringBuffer.append("\r\nWasmCompileCost:");
        stringBuffer.append(this.f144356h);
        stringBuffer.append("\r\nWasmCompileFuncListCount:");
        stringBuffer.append(this.f144357i);
        stringBuffer.append("\r\nWasmCompileResult:");
        stringBuffer.append(this.f144358j);
        return stringBuffer.toString();
    }
}
