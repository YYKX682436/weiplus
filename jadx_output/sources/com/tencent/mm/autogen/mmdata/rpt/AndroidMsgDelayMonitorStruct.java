package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class AndroidMsgDelayMonitorStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55051d;

    /* renamed from: e, reason: collision with root package name */
    public long f55052e;

    /* renamed from: g, reason: collision with root package name */
    public long f55054g;

    /* renamed from: h, reason: collision with root package name */
    public int f55055h;

    /* renamed from: i, reason: collision with root package name */
    public int f55056i;

    /* renamed from: j, reason: collision with root package name */
    public int f55057j;

    /* renamed from: k, reason: collision with root package name */
    public int f55058k;

    /* renamed from: l, reason: collision with root package name */
    public int f55059l;

    /* renamed from: m, reason: collision with root package name */
    public int f55060m;

    /* renamed from: n, reason: collision with root package name */
    public int f55061n;

    /* renamed from: o, reason: collision with root package name */
    public int f55062o;

    /* renamed from: p, reason: collision with root package name */
    public int f55063p;

    /* renamed from: q, reason: collision with root package name */
    public int f55064q;

    /* renamed from: t, reason: collision with root package name */
    public long f55067t;

    /* renamed from: u, reason: collision with root package name */
    public long f55068u;

    /* renamed from: v, reason: collision with root package name */
    public long f55069v;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55053f = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f55065r = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f55066s = "";

    @Override // jx3.a
    public int g() {
        return 28549;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55051d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55052e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55053f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55054g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55055h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55056i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55057j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55058k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55059l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55060m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55061n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55062o);
        stringBuffer.append(",");
        stringBuffer.append(this.f55063p);
        stringBuffer.append(",");
        stringBuffer.append(this.f55064q);
        stringBuffer.append(",");
        stringBuffer.append(this.f55065r);
        stringBuffer.append(",");
        stringBuffer.append(this.f55066s);
        stringBuffer.append(",");
        stringBuffer.append(this.f55067t);
        stringBuffer.append(",");
        stringBuffer.append(this.f55068u);
        stringBuffer.append(",");
        stringBuffer.append(this.f55069v);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgType:");
        stringBuffer.append(this.f55051d);
        stringBuffer.append("\r\nMsgDelaySecond:");
        stringBuffer.append(this.f55052e);
        stringBuffer.append("\r\nMsgTalker:");
        stringBuffer.append(this.f55053f);
        stringBuffer.append("\r\nInnerVersion:");
        stringBuffer.append(this.f55054g);
        stringBuffer.append("\r\nProcessStatus:");
        stringBuffer.append(this.f55055h);
        stringBuffer.append("\r\nFromCurrentProcessMin:");
        stringBuffer.append(this.f55056i);
        stringBuffer.append("\r\nFromLastProcessMin:");
        stringBuffer.append(this.f55057j);
        stringBuffer.append("\r\nFromLastDeepBackgroundMin:");
        stringBuffer.append(this.f55058k);
        stringBuffer.append("\r\nFromLastForegroundMin:");
        stringBuffer.append(this.f55059l);
        stringBuffer.append("\r\nFromLastScreenMin:");
        stringBuffer.append(this.f55060m);
        stringBuffer.append("\r\nFromLastNetworkMin:");
        stringBuffer.append(this.f55061n);
        stringBuffer.append("\r\nFromLastTickMin:");
        stringBuffer.append(this.f55062o);
        stringBuffer.append("\r\nTickRate:");
        stringBuffer.append(this.f55063p);
        stringBuffer.append("\r\nNetworkTickRate:");
        stringBuffer.append(this.f55064q);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f55065r);
        stringBuffer.append("\r\nExtInfo:");
        stringBuffer.append(this.f55066s);
        stringBuffer.append("\r\nAppMsgType:");
        stringBuffer.append(this.f55067t);
        stringBuffer.append("\r\nMsgReceivedSecond:");
        stringBuffer.append(this.f55068u);
        stringBuffer.append("\r\nMsgProcessCost:");
        stringBuffer.append(this.f55069v);
        return stringBuffer.toString();
    }
}
