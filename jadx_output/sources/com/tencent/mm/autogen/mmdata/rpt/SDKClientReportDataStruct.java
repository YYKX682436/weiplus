package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class SDKClientReportDataStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60118d;

    /* renamed from: f, reason: collision with root package name */
    public long f60120f;

    /* renamed from: g, reason: collision with root package name */
    public long f60121g;

    /* renamed from: h, reason: collision with root package name */
    public long f60122h;

    /* renamed from: o, reason: collision with root package name */
    public long f60129o;

    /* renamed from: p, reason: collision with root package name */
    public long f60130p;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60119e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60123i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60124j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60125k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60126l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f60127m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f60128n = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f60131q = "";

    @Override // jx3.a
    public int g() {
        return 0;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60118d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60119e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60120f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60121g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60122h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60123i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60124j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60125k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60126l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60127m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60128n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60129o);
        stringBuffer.append(",");
        stringBuffer.append(this.f60130p);
        stringBuffer.append(",");
        stringBuffer.append(this.f60131q);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BusinessID:");
        stringBuffer.append(this.f60118d);
        stringBuffer.append("\r\nVersion:");
        stringBuffer.append(this.f60119e);
        stringBuffer.append("\r\nNetworkType:");
        stringBuffer.append(this.f60120f);
        stringBuffer.append("\r\nUserModFlag:");
        stringBuffer.append(this.f60121g);
        stringBuffer.append("\r\nReportSDKItemType:");
        stringBuffer.append(this.f60122h);
        stringBuffer.append("\r\nReportSDKItemID:");
        stringBuffer.append(this.f60123i);
        stringBuffer.append("\r\nSDKSessionID:");
        stringBuffer.append(this.f60124j);
        stringBuffer.append("\r\nCurPageJson:");
        stringBuffer.append(this.f60125k);
        stringBuffer.append("\r\nRefPageJson:");
        stringBuffer.append(this.f60126l);
        stringBuffer.append("\r\nSourcePageJson:");
        stringBuffer.append(this.f60127m);
        stringBuffer.append("\r\nEventID:");
        stringBuffer.append(this.f60128n);
        stringBuffer.append("\r\nEventServerTimeMs:");
        stringBuffer.append(this.f60129o);
        stringBuffer.append("\r\nEventClientTimeMs:");
        stringBuffer.append(this.f60130p);
        stringBuffer.append("\r\nEventDataJson:");
        stringBuffer.append(this.f60131q);
        return stringBuffer.toString();
    }
}
