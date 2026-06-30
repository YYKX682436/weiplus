package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class MvVideoEditPlayReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59597d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59598e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59599f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59600g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f59601h;

    /* renamed from: i, reason: collision with root package name */
    public int f59602i;

    /* renamed from: j, reason: collision with root package name */
    public int f59603j;

    /* renamed from: k, reason: collision with root package name */
    public long f59604k;

    /* renamed from: l, reason: collision with root package name */
    public long f59605l;

    /* renamed from: m, reason: collision with root package name */
    public long f59606m;

    /* renamed from: n, reason: collision with root package name */
    public long f59607n;

    @Override // jx3.a
    public int g() {
        return 22278;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59597d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59598e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59599f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59600g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59601h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59602i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59603j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59604k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59605l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59606m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59607n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f59597d);
        stringBuffer.append("\r\ncontextId:");
        stringBuffer.append(this.f59598e);
        stringBuffer.append("\r\nmvObjectId:");
        stringBuffer.append(this.f59599f);
        stringBuffer.append("\r\nmvNonceId:");
        stringBuffer.append(this.f59600g);
        stringBuffer.append("\r\nmvIndex:");
        stringBuffer.append(this.f59601h);
        stringBuffer.append("\r\nisChanged:");
        stringBuffer.append(this.f59602i);
        stringBuffer.append("\r\nisLocal:");
        stringBuffer.append(this.f59603j);
        stringBuffer.append("\r\nFirstFrameTime:");
        stringBuffer.append(this.f59604k);
        stringBuffer.append("\r\nWaitCount:");
        stringBuffer.append(this.f59605l);
        stringBuffer.append("\r\nPlayErrType:");
        stringBuffer.append(this.f59606m);
        stringBuffer.append("\r\nPlayErrCode:");
        stringBuffer.append(this.f59607n);
        return stringBuffer.toString();
    }
}
