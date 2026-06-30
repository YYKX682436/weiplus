package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class SimilarEmoticonSearchLongpressStruct extends jx3.a {

    /* renamed from: k, reason: collision with root package name */
    public long f60417k;

    /* renamed from: m, reason: collision with root package name */
    public long f60419m;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60410d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60411e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f60412f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60413g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60414h = "";

    /* renamed from: i, reason: collision with root package name */
    public long f60415i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60416j = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60418l = "";

    /* renamed from: n, reason: collision with root package name */
    public long f60420n = 0;

    @Override // jx3.a
    public int g() {
        return 19651;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60410d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60411e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60412f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60413g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60414h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60415i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60416j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60417k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60418l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60419m);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60420n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f60410d);
        stringBuffer.append("\r\nSearchId:");
        stringBuffer.append(this.f60411e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f60412f);
        stringBuffer.append("\r\nClickMD5:");
        stringBuffer.append(this.f60413g);
        stringBuffer.append("\r\nQueryMD5:");
        stringBuffer.append(this.f60414h);
        stringBuffer.append("\r\nOffset:");
        stringBuffer.append(this.f60415i);
        stringBuffer.append("\r\nPos:");
        stringBuffer.append(this.f60416j);
        stringBuffer.append("\r\nClientTimestamp:");
        stringBuffer.append(this.f60417k);
        stringBuffer.append("\r\nRequestId:");
        stringBuffer.append(this.f60418l);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f60419m);
        stringBuffer.append("\r\nTab:0\r\nIsSelf:");
        stringBuffer.append(this.f60420n);
        return stringBuffer.toString();
    }
}
