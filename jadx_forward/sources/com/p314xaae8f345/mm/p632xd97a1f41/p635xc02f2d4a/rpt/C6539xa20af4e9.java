package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderLocationRequestStruct */
/* loaded from: classes3.dex */
public final class C6539xa20af4e9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f138944d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138945e = "";

    @Override // jx3.a
    public int g() {
        return 19954;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138944d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138945e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f138944d);
        stringBuffer.append("\r\nSessionId:");
        stringBuffer.append(this.f138945e);
        return stringBuffer.toString();
    }
}
