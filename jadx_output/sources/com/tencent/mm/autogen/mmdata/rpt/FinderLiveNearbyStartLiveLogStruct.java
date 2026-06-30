package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes3.dex */
public final class FinderLiveNearbyStartLiveLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f57180d;

    /* renamed from: e, reason: collision with root package name */
    public long f57181e;

    /* renamed from: f, reason: collision with root package name */
    public long f57182f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57183g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57184h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57185i = "";

    @Override // jx3.a
    public int g() {
        return 21631;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57180d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57181e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57182f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f57183g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57184h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57185i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PageType:");
        stringBuffer.append(this.f57180d);
        stringBuffer.append("\r\nActionTS:");
        stringBuffer.append(this.f57181e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f57182f);
        stringBuffer.append("\r\nClickid:0\r\nSessionId:0\r\nContextID:");
        stringBuffer.append(this.f57183g);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57184h);
        stringBuffer.append("\r\nSession_Id:");
        stringBuffer.append(this.f57185i);
        return stringBuffer.toString();
    }
}
