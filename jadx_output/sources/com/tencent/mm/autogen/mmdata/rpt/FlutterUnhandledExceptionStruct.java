package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FlutterUnhandledExceptionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f58205d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f58206e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f58207f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f58208g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f58209h = "";

    @Override // jx3.a
    public int g() {
        return 30204;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58205d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58206e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58207f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58208g);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58209h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StackTrace:");
        stringBuffer.append(this.f58205d);
        stringBuffer.append("\r\nError:");
        stringBuffer.append(this.f58206e);
        stringBuffer.append("\r\nFlutterRevision:");
        stringBuffer.append(this.f58207f);
        stringBuffer.append("\r\nPluginName:");
        stringBuffer.append(this.f58208g);
        stringBuffer.append("\r\nCrashTime:0\r\nPid:");
        stringBuffer.append(this.f58209h);
        return stringBuffer.toString();
    }
}
