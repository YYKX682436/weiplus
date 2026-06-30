package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WebsearchWidgetDisplayTimecostStruct */
/* loaded from: classes.dex */
public final class C7137xe8889e91 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f144477d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f144478e = "";

    @Override // jx3.a
    public int g() {
        return 15831;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144477d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144478e);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("appid:");
        stringBuffer.append(this.f144477d);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f144478e);
        stringBuffer.append("\r\ntimecost:0\r\nhasInitData:0");
        return stringBuffer.toString();
    }
}
