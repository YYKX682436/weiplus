package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class FinderLiveNearbyActionLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f57177d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f57178e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f57179f = "";

    @Override // jx3.a
    public int g() {
        return 21674;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,0,");
        stringBuffer.append(this.f57177d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f57178e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57179f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionTS:0\r\nAction:0\r\nSessionId:");
        stringBuffer.append(this.f57177d);
        stringBuffer.append("\r\nClickid:0\r\nContextId:");
        stringBuffer.append(this.f57178e);
        stringBuffer.append("\r\nClickTabContextId:");
        stringBuffer.append(this.f57179f);
        return stringBuffer.toString();
    }
}
