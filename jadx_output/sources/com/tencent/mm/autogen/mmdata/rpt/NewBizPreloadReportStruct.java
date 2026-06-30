package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class NewBizPreloadReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59653d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59654e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59655f;

    /* renamed from: g, reason: collision with root package name */
    public long f59656g;

    /* renamed from: h, reason: collision with root package name */
    public long f59657h;

    /* renamed from: i, reason: collision with root package name */
    public long f59658i;

    /* renamed from: j, reason: collision with root package name */
    public long f59659j;

    /* renamed from: k, reason: collision with root package name */
    public long f59660k;

    /* renamed from: l, reason: collision with root package name */
    public long f59661l;

    /* renamed from: m, reason: collision with root package name */
    public long f59662m;

    /* renamed from: n, reason: collision with root package name */
    public long f59663n;

    /* renamed from: o, reason: collision with root package name */
    public long f59664o;

    @Override // jx3.a
    public int g() {
        return 28897;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59653d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59654e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59655f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59656g);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59657h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59658i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59659j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59660k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59661l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59662m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59663n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59664o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f59653d);
        stringBuffer.append("\r\nNetType:");
        stringBuffer.append(this.f59654e);
        stringBuffer.append("\r\nProduceAction:");
        stringBuffer.append(this.f59655f);
        stringBuffer.append("\r\nConsumeAction:");
        stringBuffer.append(this.f59656g);
        stringBuffer.append("\r\nFirstScreenTime:0\r\nReceivePageDataTime:0\r\nPageFinishTime:0\r\nPreloadPicAction:");
        stringBuffer.append(this.f59657h);
        stringBuffer.append("\r\nPreloadPicDownloadTime:");
        stringBuffer.append(this.f59658i);
        stringBuffer.append("\r\nPreloadPicSize:");
        stringBuffer.append(this.f59659j);
        stringBuffer.append("\r\nProduceAddCount:");
        stringBuffer.append(this.f59660k);
        stringBuffer.append("\r\nProduceGetCount:");
        stringBuffer.append(this.f59661l);
        stringBuffer.append("\r\nProduceHitRate:");
        stringBuffer.append(this.f59662m);
        stringBuffer.append("\r\nProduceStrip:");
        stringBuffer.append(this.f59663n);
        stringBuffer.append("\r\nProduceToStrip:");
        stringBuffer.append(this.f59664o);
        return stringBuffer.toString();
    }
}
