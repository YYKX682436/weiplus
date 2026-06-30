package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderReddotExposeStrategyStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57762d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57763e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f57764f;

    /* renamed from: g, reason: collision with root package name */
    public int f57765g;

    /* renamed from: h, reason: collision with root package name */
    public int f57766h;

    /* renamed from: i, reason: collision with root package name */
    public int f57767i;

    /* renamed from: j, reason: collision with root package name */
    public long f57768j;

    /* renamed from: k, reason: collision with root package name */
    public long f57769k;

    @Override // jx3.a
    public int g() {
        return 23303;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57762d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57763e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57764f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57765g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57766h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57767i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57768j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57769k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TipsId:");
        stringBuffer.append(this.f57762d);
        stringBuffer.append("\r\nPath:");
        stringBuffer.append(this.f57763e);
        stringBuffer.append("\r\nExposeCountLimit:");
        stringBuffer.append(this.f57764f);
        stringBuffer.append("\r\nExposeLimitStrategy:");
        stringBuffer.append(this.f57765g);
        stringBuffer.append("\r\nExposeCount:");
        stringBuffer.append(this.f57766h);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f57767i);
        stringBuffer.append("\r\nColdTime:");
        stringBuffer.append(this.f57768j);
        stringBuffer.append("\r\nActionMs:");
        stringBuffer.append(this.f57769k);
        return stringBuffer.toString();
    }
}
