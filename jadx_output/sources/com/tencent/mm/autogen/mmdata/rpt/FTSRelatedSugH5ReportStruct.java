package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FTSRelatedSugH5ReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f56138e;

    /* renamed from: f, reason: collision with root package name */
    public long f56139f;

    /* renamed from: h, reason: collision with root package name */
    public long f56141h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56137d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56140g = "";

    @Override // jx3.a
    public int g() {
        return 22251;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56137d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56138e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56139f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56140g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56141h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Query:");
        stringBuffer.append(this.f56137d);
        stringBuffer.append("\r\nEnterTime:");
        stringBuffer.append(this.f56138e);
        stringBuffer.append("\r\nStayTime:");
        stringBuffer.append(this.f56139f);
        stringBuffer.append("\r\nInitUrl:");
        stringBuffer.append(this.f56140g);
        stringBuffer.append("\r\nPageCnt:");
        stringBuffer.append(this.f56141h);
        return stringBuffer.toString();
    }
}
