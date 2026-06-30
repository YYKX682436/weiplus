package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ExptAppReportStruct */
/* loaded from: classes9.dex */
public final class C6426x3c8b73d3 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f137660d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f137661e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f137662f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f137663g;

    @Override // jx3.a
    public int g() {
        return 19988;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137660d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137661e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137662f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137663g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ExptAppId:");
        stringBuffer.append(this.f137660d);
        stringBuffer.append("\r\nExptSeq:");
        stringBuffer.append(this.f137661e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f137662f);
        stringBuffer.append("\r\nUseFlag:");
        stringBuffer.append(this.f137663g);
        return stringBuffer.toString();
    }
}
