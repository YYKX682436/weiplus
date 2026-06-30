package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderStreamTrackStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f57872d;

    /* renamed from: j, reason: collision with root package name */
    public long f57878j;

    /* renamed from: e, reason: collision with root package name */
    public long f57873e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57874f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57875g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f57876h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f57877i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f57879k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f57880l = -1;

    /* renamed from: m, reason: collision with root package name */
    public long f57881m = -1;

    @Override // jx3.a
    public int g() {
        return 22138;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57872d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57873e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57874f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57875g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57876h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57877i);
        stringBuffer.append(",");
        stringBuffer.append(this.f57878j);
        stringBuffer.append(",");
        stringBuffer.append(this.f57879k);
        stringBuffer.append(",");
        stringBuffer.append(this.f57880l);
        stringBuffer.append(",");
        stringBuffer.append(this.f57881m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("innerversion:");
        stringBuffer.append(this.f57872d);
        stringBuffer.append("\r\nactionCode:");
        stringBuffer.append(this.f57873e);
        stringBuffer.append("\r\nactionName:");
        stringBuffer.append(this.f57874f);
        stringBuffer.append("\r\nactionExt:");
        stringBuffer.append(this.f57875g);
        stringBuffer.append("\r\nresult:");
        stringBuffer.append(this.f57876h);
        stringBuffer.append("\r\nresultExt:");
        stringBuffer.append(this.f57877i);
        stringBuffer.append("\r\ncommentScene:");
        stringBuffer.append(this.f57878j);
        stringBuffer.append("\r\nsnn:");
        stringBuffer.append(this.f57879k);
        stringBuffer.append("\r\ncost:");
        stringBuffer.append(this.f57880l);
        stringBuffer.append("\r\nactionTime:");
        stringBuffer.append(this.f57881m);
        return stringBuffer.toString();
    }
}
