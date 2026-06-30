package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AppBrandGuideStruct */
/* loaded from: classes5.dex */
public final class C6312x88875c0b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136682d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f136683e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f136684f;

    @Override // jx3.a
    public int g() {
        return 36468;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136682d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136683e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136684f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppBrandSessionId:");
        stringBuffer.append(this.f136682d);
        stringBuffer.append("\r\nTaskBarOpenSessionId:");
        stringBuffer.append(this.f136683e);
        stringBuffer.append("\r\nGuideClientTime:");
        stringBuffer.append(this.f136684f);
        return stringBuffer.toString();
    }
}
