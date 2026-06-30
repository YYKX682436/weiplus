package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmInstantiateStruct */
/* loaded from: classes.dex */
public final class C7116x6912f34f extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f144359d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f144360e = "";

    @Override // jx3.a
    public int g() {
        return 27227;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144359d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144360e);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f144359d);
        stringBuffer.append("\r\nInstanceId:");
        stringBuffer.append(this.f144360e);
        stringBuffer.append("\r\nWasmCacheType:0");
        return stringBuffer.toString();
    }
}
