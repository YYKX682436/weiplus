package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes16.dex */
public final class FlutterCrashReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58140d;

    /* renamed from: g, reason: collision with root package name */
    public long f58143g;

    /* renamed from: i, reason: collision with root package name */
    public long f58145i;

    /* renamed from: j, reason: collision with root package name */
    public long f58146j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58141e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58142f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58144h = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58147k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f58148l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58149m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f58150n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f58151o = "";

    @Override // jx3.a
    public int g() {
        return 29367;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58140d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58141e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58142f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58143g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58144h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58145i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58146j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58147k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58148l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58149m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58150n);
        stringBuffer.append(",");
        stringBuffer.append(this.f58151o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("killSelf:");
        stringBuffer.append(this.f58140d);
        stringBuffer.append("\r\nerror:");
        stringBuffer.append(this.f58141e);
        stringBuffer.append("\r\nstackTrace:");
        stringBuffer.append(this.f58142f);
        stringBuffer.append("\r\ncrashTime:");
        stringBuffer.append(this.f58143g);
        stringBuffer.append("\r\npluginName:");
        stringBuffer.append(this.f58144h);
        stringBuffer.append("\r\ntimeSinceEngineCreate:");
        stringBuffer.append(this.f58145i);
        stringBuffer.append("\r\ntimeSinceAppStart:");
        stringBuffer.append(this.f58146j);
        stringBuffer.append("\r\nflutter_revision:");
        stringBuffer.append(this.f58147k);
        stringBuffer.append("\r\nwidgetInformation:");
        stringBuffer.append(this.f58148l);
        stringBuffer.append("\r\nlastBuildWidget:");
        stringBuffer.append(this.f58149m);
        stringBuffer.append("\r\nlastSetStateStack:");
        stringBuffer.append(this.f58150n);
        stringBuffer.append("\r\nrev:");
        stringBuffer.append(this.f58151o);
        return stringBuffer.toString();
    }
}
