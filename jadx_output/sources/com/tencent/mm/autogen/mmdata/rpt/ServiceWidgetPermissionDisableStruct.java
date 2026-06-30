package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ServiceWidgetPermissionDisableStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60265d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60266e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60267f = "";

    @Override // jx3.a
    public int g() {
        return 15961;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60265d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60266e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60267f);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f60265d);
        stringBuffer.append("\r\napi:");
        stringBuffer.append(this.f60266e);
        stringBuffer.append("\r\narg:");
        stringBuffer.append(this.f60267f);
        stringBuffer.append("\r\ntimestampMs:0");
        return stringBuffer.toString();
    }
}
