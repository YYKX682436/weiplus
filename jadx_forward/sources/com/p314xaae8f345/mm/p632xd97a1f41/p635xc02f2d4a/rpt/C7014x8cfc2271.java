package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipErrorReportStruct */
/* loaded from: classes12.dex */
public final class C7014x8cfc2271 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f143289d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143290e = "";

    @Override // jx3.a
    public int g() {
        return 26424;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143289d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143290e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("errorCode:");
        stringBuffer.append(this.f143289d);
        stringBuffer.append("\r\nerrorInfo:");
        stringBuffer.append(this.f143290e);
        return stringBuffer.toString();
    }
}
