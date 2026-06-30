package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class MagicAdReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59018f;

    /* renamed from: g, reason: collision with root package name */
    public int f59019g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59016d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59017e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59020h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59021i = "";

    @Override // jx3.a
    public int g() {
        return 35978;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59016d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59017e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59018f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59019g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59020h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59021i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PosId:");
        stringBuffer.append(this.f59016d);
        stringBuffer.append("\r\nAid:");
        stringBuffer.append(this.f59017e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f59018f);
        stringBuffer.append("\r\nValue:");
        stringBuffer.append(this.f59019g);
        stringBuffer.append("\r\nExtra:");
        stringBuffer.append(this.f59020h);
        stringBuffer.append("\r\nExtra2:");
        stringBuffer.append(this.f59021i);
        return stringBuffer.toString();
    }
}
