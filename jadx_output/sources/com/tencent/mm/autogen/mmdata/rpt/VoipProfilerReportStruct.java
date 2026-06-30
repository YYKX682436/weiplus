package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoipProfilerReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f61804d;

    /* renamed from: e, reason: collision with root package name */
    public int f61805e;

    /* renamed from: f, reason: collision with root package name */
    public int f61806f;

    /* renamed from: g, reason: collision with root package name */
    public int f61807g;

    /* renamed from: h, reason: collision with root package name */
    public int f61808h;

    /* renamed from: i, reason: collision with root package name */
    public int f61809i;

    /* renamed from: j, reason: collision with root package name */
    public int f61810j;

    /* renamed from: k, reason: collision with root package name */
    public int f61811k;

    /* renamed from: l, reason: collision with root package name */
    public int f61812l;

    /* renamed from: m, reason: collision with root package name */
    public int f61813m;

    /* renamed from: n, reason: collision with root package name */
    public int f61814n;

    /* renamed from: o, reason: collision with root package name */
    public int f61815o;

    /* renamed from: p, reason: collision with root package name */
    public int f61816p;

    /* renamed from: q, reason: collision with root package name */
    public int f61817q;

    /* renamed from: r, reason: collision with root package name */
    public int f61818r;

    /* renamed from: s, reason: collision with root package name */
    public int f61819s;

    /* renamed from: t, reason: collision with root package name */
    public int f61820t;

    /* renamed from: u, reason: collision with root package name */
    public int f61821u;

    /* renamed from: v, reason: collision with root package name */
    public int f61822v;

    /* renamed from: w, reason: collision with root package name */
    public int f61823w;

    /* renamed from: x, reason: collision with root package name */
    public int f61824x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f61825y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f61826z = "";
    public java.lang.String A = "";
    public java.lang.String B = "";

    @Override // jx3.a
    public int g() {
        return 25088;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61804d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61805e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61806f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61807g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61808h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61809i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61810j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61811k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61812l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61813m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61814n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61815o);
        stringBuffer.append(",");
        stringBuffer.append(this.f61816p);
        stringBuffer.append(",");
        stringBuffer.append(this.f61817q);
        stringBuffer.append(",");
        stringBuffer.append(this.f61818r);
        stringBuffer.append(",");
        stringBuffer.append(this.f61819s);
        stringBuffer.append(",");
        stringBuffer.append(this.f61820t);
        stringBuffer.append(",");
        stringBuffer.append(this.f61821u);
        stringBuffer.append(",");
        stringBuffer.append(this.f61822v);
        stringBuffer.append(",");
        stringBuffer.append(this.f61823w);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61824x);
        stringBuffer.append(",0,0,0,0,0,");
        stringBuffer.append(this.f61825y);
        stringBuffer.append(",");
        stringBuffer.append(this.f61826z);
        stringBuffer.append(",");
        stringBuffer.append(this.A);
        stringBuffer.append(",");
        stringBuffer.append(this.B);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("TotalTime:");
        stringBuffer.append(this.f61804d);
        stringBuffer.append("\r\nRating:");
        stringBuffer.append(this.f61805e);
        stringBuffer.append("\r\nEncodeFpsMax:");
        stringBuffer.append(this.f61806f);
        stringBuffer.append("\r\nEncodeFpsMin:");
        stringBuffer.append(this.f61807g);
        stringBuffer.append("\r\nEncodeLackFrameTimes:");
        stringBuffer.append(this.f61808h);
        stringBuffer.append("\r\nEncodeAvgFps:");
        stringBuffer.append(this.f61809i);
        stringBuffer.append("\r\nLocalRenderFpsMax:");
        stringBuffer.append(this.f61810j);
        stringBuffer.append("\r\nLocalRenderFpsMin:");
        stringBuffer.append(this.f61811k);
        stringBuffer.append("\r\nLocalRenderLackFrameTimes:");
        stringBuffer.append(this.f61812l);
        stringBuffer.append("\r\nLocalRenderAvgFps:");
        stringBuffer.append(this.f61813m);
        stringBuffer.append("\r\nRemoteRenderFpsMax:");
        stringBuffer.append(this.f61814n);
        stringBuffer.append("\r\nRemoteRenderFpsMin:");
        stringBuffer.append(this.f61815o);
        stringBuffer.append("\r\nRemoteRenderFpsAvf:");
        stringBuffer.append(this.f61816p);
        stringBuffer.append("\r\nRemoteRenderLackFrameTimes:");
        stringBuffer.append(this.f61817q);
        stringBuffer.append("\r\nEncodeFirstFrameCost:");
        stringBuffer.append(this.f61818r);
        stringBuffer.append("\r\nLocalRenderFirstFrameCost:");
        stringBuffer.append(this.f61819s);
        stringBuffer.append("\r\nRemoteRenderFirstFrameCost:");
        stringBuffer.append(this.f61820t);
        stringBuffer.append("\r\nGphiaMemoryGL:");
        stringBuffer.append(this.f61821u);
        stringBuffer.append("\r\nGphiaMemoryEGL:");
        stringBuffer.append(this.f61822v);
        stringBuffer.append("\r\nGphiaMemoryGFX:");
        stringBuffer.append(this.f61823w);
        stringBuffer.append("\r\nBatteryTemprateRaise:0\r\nCPULoad:");
        stringBuffer.append(this.f61824x);
        stringBuffer.append("\r\nBatteryTemprateInit:0\r\nBatteryTemprateMaxTick:0\r\nBatteryTemprateRaiseAvg:0\r\nBatteryTemprateRaiseMax:0\r\nBatteryTemprateRaiseMaxTick:0\r\nPhoneTemprateInfo:");
        stringBuffer.append(this.f61825y);
        stringBuffer.append("\r\nCpuLoadInfo:");
        stringBuffer.append(this.f61826z);
        stringBuffer.append("\r\nCpuTemprateInfo:");
        stringBuffer.append(this.A);
        stringBuffer.append("\r\nBatteryTemprateInfo:");
        stringBuffer.append(this.B);
        return stringBuffer.toString();
    }
}
