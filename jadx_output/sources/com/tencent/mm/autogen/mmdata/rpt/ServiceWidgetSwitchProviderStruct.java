package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ServiceWidgetSwitchProviderStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f60268d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f60269e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f60270f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f60271g = "";

    @Override // jx3.a
    public int g() {
        return 15960;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60268d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60269e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f60270f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60271g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("query:");
        stringBuffer.append(this.f60268d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f60269e);
        stringBuffer.append("\r\nisChange:0\r\nappidBefore:");
        stringBuffer.append(this.f60270f);
        stringBuffer.append("\r\nappidAfter:");
        stringBuffer.append(this.f60271g);
        return stringBuffer.toString();
    }
}
