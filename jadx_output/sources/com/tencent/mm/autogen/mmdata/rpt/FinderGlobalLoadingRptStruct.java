package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderGlobalLoadingRptStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56921d;

    /* renamed from: e, reason: collision with root package name */
    public long f56922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56923f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56924g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56925h = "";

    @Override // jx3.a
    public int g() {
        return 21680;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56921d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56922e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56923f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56924g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56925h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InnerVersion:");
        stringBuffer.append(this.f56921d);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f56922e);
        stringBuffer.append("\r\ndata:");
        stringBuffer.append(this.f56923f);
        stringBuffer.append("\r\ntag:");
        stringBuffer.append(this.f56924g);
        stringBuffer.append("\r\nmajorData:");
        stringBuffer.append(this.f56925h);
        return stringBuffer.toString();
    }
}
