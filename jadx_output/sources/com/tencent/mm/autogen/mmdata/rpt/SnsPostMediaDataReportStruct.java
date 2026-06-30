package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsPostMediaDataReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60689e;

    /* renamed from: g, reason: collision with root package name */
    public long f60691g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60688d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60690f = "";

    @Override // jx3.a
    public int g() {
        return 36181;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60688d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60689e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60690f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60691g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SnsFeedId:");
        stringBuffer.append(this.f60688d);
        stringBuffer.append("\r\nMediaCount:");
        stringBuffer.append(this.f60689e);
        stringBuffer.append("\r\nMetaDataJsonArray:");
        stringBuffer.append(this.f60690f);
        stringBuffer.append("\r\nSnsFeedType:");
        stringBuffer.append(this.f60691g);
        return stringBuffer.toString();
    }
}
