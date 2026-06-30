package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct */
/* loaded from: classes4.dex */
public final class C6939x4c0e7154 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142495d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f142496e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142497f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142498g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142499h = "";

    @Override // jx3.a
    public int g() {
        return 16763;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142495d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142496e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142497f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142498g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142499h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PreviewEnterScene:");
        stringBuffer.append(this.f142495d);
        stringBuffer.append("\r\nProfileSource:");
        stringBuffer.append(this.f142496e);
        stringBuffer.append("\r\nEnterTime:");
        stringBuffer.append(this.f142497f);
        stringBuffer.append("\r\nStoryOwnerUserName:");
        stringBuffer.append(this.f142498g);
        stringBuffer.append("\r\nStoryTid:");
        stringBuffer.append(this.f142499h);
        return stringBuffer.toString();
    }
}
