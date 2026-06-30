package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.CmdProcFailedStruct */
/* loaded from: classes12.dex */
public final class C6377x3369aa22 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137234d;

    /* renamed from: e, reason: collision with root package name */
    public long f137235e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137236f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f137237g;

    @Override // jx3.a
    public int g() {
        return 26246;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137234d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137235e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137236f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137237g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("type:");
        stringBuffer.append(this.f137234d);
        stringBuffer.append("\r\nsvrId:");
        stringBuffer.append(this.f137235e);
        stringBuffer.append("\r\ncrash:");
        stringBuffer.append(this.f137236f);
        stringBuffer.append("\r\ncmdId:");
        stringBuffer.append(this.f137237g);
        return stringBuffer.toString();
    }
}
