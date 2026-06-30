package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class XMLInflateMonitorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63085d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f63086e;

    /* renamed from: f, reason: collision with root package name */
    public long f63087f;

    /* renamed from: g, reason: collision with root package name */
    public long f63088g;

    /* renamed from: h, reason: collision with root package name */
    public long f63089h;

    /* renamed from: i, reason: collision with root package name */
    public long f63090i;

    /* renamed from: j, reason: collision with root package name */
    public long f63091j;

    /* renamed from: k, reason: collision with root package name */
    public long f63092k;

    /* renamed from: l, reason: collision with root package name */
    public long f63093l;

    /* renamed from: m, reason: collision with root package name */
    public long f63094m;

    /* renamed from: n, reason: collision with root package name */
    public long f63095n;

    @Override // jx3.a
    public int g() {
        return 27564;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63085d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63086e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63087f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63088g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63089h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63090i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63091j);
        stringBuffer.append(",");
        stringBuffer.append(this.f63092k);
        stringBuffer.append(",");
        stringBuffer.append(this.f63093l);
        stringBuffer.append(",");
        stringBuffer.append(this.f63094m);
        stringBuffer.append(",");
        stringBuffer.append(this.f63095n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActName:");
        stringBuffer.append(this.f63085d);
        stringBuffer.append("\r\nActStartTime:");
        stringBuffer.append(this.f63086e);
        stringBuffer.append("\r\nDevLevel:");
        stringBuffer.append(this.f63087f);
        stringBuffer.append("\r\nTotalInflateCost:");
        stringBuffer.append(this.f63088g);
        stringBuffer.append("\r\nAsyncInflateCost:");
        stringBuffer.append(this.f63089h);
        stringBuffer.append("\r\nMainThreadInflateCost:");
        stringBuffer.append(this.f63090i);
        stringBuffer.append("\r\nTotalInflateCount:");
        stringBuffer.append(this.f63091j);
        stringBuffer.append("\r\nAsyncInflateCount:");
        stringBuffer.append(this.f63092k);
        stringBuffer.append("\r\nMainThreadInflateCount:");
        stringBuffer.append(this.f63093l);
        stringBuffer.append("\r\nAsyncCostRatio:");
        stringBuffer.append(this.f63094m);
        stringBuffer.append("\r\nAsyncCountRatio:");
        stringBuffer.append(this.f63095n);
        return stringBuffer.toString();
    }
}
