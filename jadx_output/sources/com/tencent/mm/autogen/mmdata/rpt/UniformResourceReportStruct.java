package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class UniformResourceReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61386d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61387e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61388f;

    /* renamed from: g, reason: collision with root package name */
    public long f61389g;

    /* renamed from: h, reason: collision with root package name */
    public long f61390h;

    /* renamed from: i, reason: collision with root package name */
    public int f61391i;

    /* renamed from: j, reason: collision with root package name */
    public int f61392j;

    /* renamed from: k, reason: collision with root package name */
    public int f61393k;

    /* renamed from: l, reason: collision with root package name */
    public long f61394l;

    /* renamed from: m, reason: collision with root package name */
    public int f61395m;

    /* renamed from: n, reason: collision with root package name */
    public long f61396n;

    @Override // jx3.a
    public int g() {
        return 30863;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61386d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61387e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61388f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61389g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61390h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61391i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61392j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61393k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61394l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61395m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61396n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ProjectId:");
        stringBuffer.append(this.f61386d);
        stringBuffer.append("\r\nResourceName:");
        stringBuffer.append(this.f61387e);
        stringBuffer.append("\r\nVersion:");
        stringBuffer.append(this.f61388f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f61389g);
        stringBuffer.append("\r\nState:");
        stringBuffer.append(this.f61390h);
        stringBuffer.append("\r\nErrNo:");
        stringBuffer.append(this.f61391i);
        stringBuffer.append("\r\nErrCode:");
        stringBuffer.append(this.f61392j);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f61393k);
        stringBuffer.append("\r\nReportTime:");
        stringBuffer.append(this.f61394l);
        stringBuffer.append("\r\nNetWorkState:");
        stringBuffer.append(this.f61395m);
        stringBuffer.append("\r\nRemoteVersion:");
        stringBuffer.append(this.f61396n);
        return stringBuffer.toString();
    }
}
