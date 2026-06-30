package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class ActivityBrowseClickStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public long f55022g;

    /* renamed from: h, reason: collision with root package name */
    public long f55023h;

    /* renamed from: j, reason: collision with root package name */
    public long f55025j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55019d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55020e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55021f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55024i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55026k = "";

    @Override // jx3.a
    public int g() {
        return 21851;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55019d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55020e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55021f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55022g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55023h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55024i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55025j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55026k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f55019d);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f55020e);
        stringBuffer.append("\r\nFinderContexId:");
        stringBuffer.append(this.f55021f);
        stringBuffer.append("\r\ncommentScene:");
        stringBuffer.append(this.f55022g);
        stringBuffer.append("\r\nEventCode:");
        stringBuffer.append(this.f55023h);
        stringBuffer.append("\r\nEventTime:");
        stringBuffer.append(this.f55024i);
        stringBuffer.append("\r\nEventTarget:");
        stringBuffer.append(this.f55025j);
        stringBuffer.append("\r\nActivityId:");
        stringBuffer.append(this.f55026k);
        return stringBuffer.toString();
    }
}
