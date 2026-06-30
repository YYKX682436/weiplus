package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class StorySinglePreviewReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60962d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60963e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60964f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60965g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60966h = "";

    @Override // jx3.a
    public int g() {
        return 16763;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60962d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60963e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60964f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60965g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60966h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PreviewEnterScene:");
        stringBuffer.append(this.f60962d);
        stringBuffer.append("\r\nProfileSource:");
        stringBuffer.append(this.f60963e);
        stringBuffer.append("\r\nEnterTime:");
        stringBuffer.append(this.f60964f);
        stringBuffer.append("\r\nStoryOwnerUserName:");
        stringBuffer.append(this.f60965g);
        stringBuffer.append("\r\nStoryTid:");
        stringBuffer.append(this.f60966h);
        return stringBuffer.toString();
    }
}
