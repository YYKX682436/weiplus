package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class FlutterExceptionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58176d;

    /* renamed from: g, reason: collision with root package name */
    public long f58179g;

    /* renamed from: i, reason: collision with root package name */
    public long f58181i;

    /* renamed from: j, reason: collision with root package name */
    public long f58182j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58177e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58178f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58180h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58183k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58184l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58185m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58186n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f58187o = "";

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f58188p = "";

    @Override // jx3.a
    public int g() {
        return 36290;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58176d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58177e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58178f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58179g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58180h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58181i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58182j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58183k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58184l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58185m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58186n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58187o);
        stringBuffer.append(",");
        stringBuffer.append(this.f58188p);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("killSelf:");
        stringBuffer.append(this.f58176d);
        stringBuffer.append("\r\nerror:");
        stringBuffer.append(this.f58177e);
        stringBuffer.append("\r\nstackTrace:");
        stringBuffer.append(this.f58178f);
        stringBuffer.append("\r\ncrashTime:");
        stringBuffer.append(this.f58179g);
        stringBuffer.append("\r\npluginName:");
        stringBuffer.append(this.f58180h);
        stringBuffer.append("\r\ntimeSinceEngineCreate:");
        stringBuffer.append(this.f58181i);
        stringBuffer.append("\r\ntimeSinceAppStart:");
        stringBuffer.append(this.f58182j);
        stringBuffer.append("\r\nflutter_revision:");
        stringBuffer.append(this.f58183k);
        stringBuffer.append("\r\nwidgetInformation:");
        stringBuffer.append(this.f58184l);
        stringBuffer.append("\r\nlastBuildWidget:");
        stringBuffer.append(this.f58185m);
        stringBuffer.append("\r\nlastSetStateStack:");
        stringBuffer.append(this.f58186n);
        stringBuffer.append("\r\nrev:");
        stringBuffer.append(this.f58187o);
        stringBuffer.append("\r\nwechatImage:");
        stringBuffer.append(this.f58188p);
        return stringBuffer.toString();
    }
}
