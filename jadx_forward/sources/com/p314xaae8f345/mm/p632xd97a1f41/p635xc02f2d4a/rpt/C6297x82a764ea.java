package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidCertErrorStruct */
/* loaded from: classes9.dex */
public final class C6297x82a764ea extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136569d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f136570e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f136571f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f136572g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f136573h = "";

    @Override // jx3.a
    public int g() {
        return 15894;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136569d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136570e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136571f);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f136572g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136573h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f136569d);
        stringBuffer.append("\r\naction_result:");
        stringBuffer.append(this.f136570e);
        stringBuffer.append("\r\naction_code:");
        stringBuffer.append(this.f136571f);
        stringBuffer.append("\r\nsession:0\r\naction_ext:");
        stringBuffer.append(this.f136572g);
        stringBuffer.append("\r\nsession2:");
        stringBuffer.append(this.f136573h);
        return stringBuffer.toString();
    }
}
