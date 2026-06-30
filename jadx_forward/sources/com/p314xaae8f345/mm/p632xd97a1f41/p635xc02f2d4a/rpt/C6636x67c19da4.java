package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GlobalWebSearchClickRateStruct */
/* loaded from: classes8.dex */
public final class C6636x67c19da4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139900d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f139901e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f139902f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f139903g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f139904h = 0;

    @Override // jx3.a
    public int g() {
        return 12639;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139900d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139901e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139902f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139903g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139904h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Query:");
        stringBuffer.append(this.f139900d);
        stringBuffer.append("\r\nHasWebSearchEntryShown:");
        stringBuffer.append(this.f139901e);
        stringBuffer.append("\r\nClickType:");
        stringBuffer.append(this.f139902f);
        stringBuffer.append("\r\nStyle:");
        stringBuffer.append(this.f139903g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f139904h);
        return stringBuffer.toString();
    }
}
