package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityFlagsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62493d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62494e = "";

    @Override // jx3.a
    public int g() {
        return 21750;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62493d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62494e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("instanceId:");
        stringBuffer.append(this.f62493d);
        stringBuffer.append("\r\nflags:");
        stringBuffer.append(this.f62494e);
        return stringBuffer.toString();
    }
}
