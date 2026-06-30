package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class Skyline_Dart_Crash_ReporterStruct extends jx3.a {

    /* renamed from: n, reason: collision with root package name */
    public long f60431n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60421d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60422e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60423f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60424g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f60425h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f60426i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f60427j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f60428k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f60429l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f60430m = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f60432o = "";

    @Override // jx3.a
    public int g() {
        return 27412;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60421d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60422e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60423f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60424g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60425h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60426i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60427j);
        stringBuffer.append(",");
        stringBuffer.append(this.f60428k);
        stringBuffer.append(",");
        stringBuffer.append(this.f60429l);
        stringBuffer.append(",");
        stringBuffer.append(this.f60430m);
        stringBuffer.append(",");
        stringBuffer.append(this.f60431n);
        stringBuffer.append(",");
        stringBuffer.append(this.f60432o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Runtime:");
        stringBuffer.append(this.f60421d);
        stringBuffer.append("\r\nCurrentActivity:");
        stringBuffer.append(this.f60422e);
        stringBuffer.append("\r\nCurrentThread:");
        stringBuffer.append(this.f60423f);
        stringBuffer.append("\r\nExtraCrashMsg:");
        stringBuffer.append(this.f60424g);
        stringBuffer.append("\r\nDeviceParameters:");
        stringBuffer.append(this.f60425h);
        stringBuffer.append("\r\nCustomParameters:");
        stringBuffer.append(this.f60426i);
        stringBuffer.append("\r\nApplicationParameters:");
        stringBuffer.append(this.f60427j);
        stringBuffer.append("\r\nDateTime:");
        stringBuffer.append(this.f60428k);
        stringBuffer.append("\r\nContext:");
        stringBuffer.append(this.f60429l);
        stringBuffer.append("\r\nCrashContent:");
        stringBuffer.append(this.f60430m);
        stringBuffer.append("\r\nKillSelf:");
        stringBuffer.append(this.f60431n);
        stringBuffer.append("\r\nRevision:");
        stringBuffer.append(this.f60432o);
        return stringBuffer.toString();
    }
}
