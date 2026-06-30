package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.PatSuffixActionReportStruct */
/* loaded from: classes5.dex */
public final class C6812xec41ec53 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141377d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f141378e;

    /* renamed from: f, reason: collision with root package name */
    public int f141379f;

    /* renamed from: g, reason: collision with root package name */
    public int f141380g;

    @Override // jx3.a
    public int g() {
        return 20379;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141377d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141378e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141379f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141380g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f141377d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f141378e);
        stringBuffer.append("\r\nErrorCode:");
        stringBuffer.append(this.f141379f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f141380g);
        return stringBuffer.toString();
    }
}
