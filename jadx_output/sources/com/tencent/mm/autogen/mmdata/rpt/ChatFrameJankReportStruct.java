package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class ChatFrameJankReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55605e;

    /* renamed from: f, reason: collision with root package name */
    public long f55606f;

    /* renamed from: g, reason: collision with root package name */
    public long f55607g;

    /* renamed from: h, reason: collision with root package name */
    public long f55608h;

    /* renamed from: i, reason: collision with root package name */
    public int f55609i;

    /* renamed from: j, reason: collision with root package name */
    public int f55610j;

    /* renamed from: k, reason: collision with root package name */
    public int f55611k;

    /* renamed from: l, reason: collision with root package name */
    public long f55612l;

    /* renamed from: m, reason: collision with root package name */
    public long f55613m;

    /* renamed from: p, reason: collision with root package name */
    public long f55616p;

    /* renamed from: q, reason: collision with root package name */
    public long f55617q;

    /* renamed from: r, reason: collision with root package name */
    public long f55618r;

    /* renamed from: s, reason: collision with root package name */
    public long f55619s;

    /* renamed from: t, reason: collision with root package name */
    public long f55620t;

    /* renamed from: u, reason: collision with root package name */
    public long f55621u;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55604d = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55614n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55615o = "";

    @Override // jx3.a
    public int g() {
        return 30470;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55604d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55605e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55606f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55607g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55608h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55609i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55610j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55611k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55612l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55613m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55614n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55615o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55616p);
        stringBuffer.append(",");
        stringBuffer.append(this.f55617q);
        stringBuffer.append(",");
        stringBuffer.append(this.f55618r);
        stringBuffer.append(",");
        stringBuffer.append(this.f55619s);
        stringBuffer.append(",");
        stringBuffer.append(this.f55620t);
        stringBuffer.append(",");
        stringBuffer.append(this.f55621u);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f55604d);
        stringBuffer.append("\r\nFrameStartNanos:");
        stringBuffer.append(this.f55605e);
        stringBuffer.append("\r\nFrameDurationUiNanos:");
        stringBuffer.append(this.f55606f);
        stringBuffer.append("\r\nFrameDurationCpuNanos:");
        stringBuffer.append(this.f55607g);
        stringBuffer.append("\r\nFrameOverrunNanos:");
        stringBuffer.append(this.f55608h);
        stringBuffer.append("\r\nDeviceLevel1:");
        stringBuffer.append(this.f55609i);
        stringBuffer.append("\r\nDeviceLevel2:");
        stringBuffer.append(this.f55610j);
        stringBuffer.append("\r\nFullFps:");
        stringBuffer.append(this.f55611k);
        stringBuffer.append("\r\nIntVal1:");
        stringBuffer.append(this.f55612l);
        stringBuffer.append("\r\nIntVal2:");
        stringBuffer.append(this.f55613m);
        stringBuffer.append("\r\nStringVal1:");
        stringBuffer.append(this.f55614n);
        stringBuffer.append("\r\nStringVal2:");
        stringBuffer.append(this.f55615o);
        stringBuffer.append("\r\nAnimationDur:");
        stringBuffer.append(this.f55616p);
        stringBuffer.append("\r\nLayoutMeasureDur:");
        stringBuffer.append(this.f55617q);
        stringBuffer.append("\r\nDrawDur:");
        stringBuffer.append(this.f55618r);
        stringBuffer.append("\r\nSyncDur:");
        stringBuffer.append(this.f55619s);
        stringBuffer.append("\r\nCommandIssueDur:");
        stringBuffer.append(this.f55620t);
        stringBuffer.append("\r\nSwapBuffersDur:");
        stringBuffer.append(this.f55621u);
        return stringBuffer.toString();
    }
}
