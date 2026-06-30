package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class RecommendActionFlowStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59878d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f59879e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59880f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f59881g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59882h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f59883i = 0;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59884j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59885k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f59886l = "";

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f59887m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f59888n = 0;

    @Override // jx3.a
    public int g() {
        return 30924;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59878d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59879e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59880f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59881g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59882h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59883i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59884j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59885k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59886l);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f59887m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59888n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f59878d);
        stringBuffer.append("\r\nactionTime:");
        stringBuffer.append(this.f59879e);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f59880f);
        stringBuffer.append("\r\ncategory:");
        stringBuffer.append(this.f59881g);
        stringBuffer.append("\r\nsearchId:");
        stringBuffer.append(this.f59882h);
        stringBuffer.append("\r\noffset:");
        stringBuffer.append(this.f59883i);
        stringBuffer.append("\r\nrequestId:");
        stringBuffer.append(this.f59884j);
        stringBuffer.append("\r\nnetType:");
        stringBuffer.append(this.f59885k);
        stringBuffer.append("\r\nversion:");
        stringBuffer.append(this.f59886l);
        stringBuffer.append("\r\nisPreload:0\r\nisPrefetch:0\r\nurl:");
        stringBuffer.append(this.f59887m);
        stringBuffer.append("\r\nerrorCode:");
        stringBuffer.append(this.f59888n);
        return stringBuffer.toString();
    }
}
