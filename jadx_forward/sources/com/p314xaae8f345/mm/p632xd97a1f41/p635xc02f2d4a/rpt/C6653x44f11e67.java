package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ImageIdErrorStruct */
/* loaded from: classes11.dex */
public final class C6653x44f11e67 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139995d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f139996e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f139997f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f139998g = "";

    @Override // jx3.a
    public int g() {
        return 29289;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139995d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139996e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139997f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139998g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("mmkvId:");
        stringBuffer.append(this.f139995d);
        stringBuffer.append("\r\ndbId:");
        stringBuffer.append(this.f139996e);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f139997f);
        stringBuffer.append("\r\nextraMsg:");
        stringBuffer.append(this.f139998g);
        return stringBuffer.toString();
    }
}
