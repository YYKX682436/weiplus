package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SavedHelloMsgReportStruct */
/* loaded from: classes5.dex */
public final class C6846x38eaf21f extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141688d;

    /* renamed from: e, reason: collision with root package name */
    public long f141689e;

    @Override // jx3.a
    public int g() {
        return 28239;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141688d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141689e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f141688d);
        stringBuffer.append("\r\ncontentStatus:");
        stringBuffer.append(this.f141689e);
        return stringBuffer.toString();
    }
}
