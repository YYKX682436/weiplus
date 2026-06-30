package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct */
/* loaded from: classes9.dex */
public final class C7053xf3ca9650 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143649d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f143650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f143651f = 0;

    @Override // jx3.a
    public int g() {
        return 15661;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143649d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143650e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143651f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickScene:");
        stringBuffer.append(this.f143649d);
        stringBuffer.append("\r\nReportValue:");
        stringBuffer.append(this.f143650e);
        stringBuffer.append("\r\nEntryScene:");
        stringBuffer.append(this.f143651f);
        return stringBuffer.toString();
    }
}
