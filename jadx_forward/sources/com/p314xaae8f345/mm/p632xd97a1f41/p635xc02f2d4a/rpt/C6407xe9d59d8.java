package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.EmoticonBoardReddotNotificationStruct */
/* loaded from: classes15.dex */
public final class C6407xe9d59d8 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f137541d;

    /* renamed from: e, reason: collision with root package name */
    public int f137542e;

    /* renamed from: g, reason: collision with root package name */
    public int f137544g;

    /* renamed from: i, reason: collision with root package name */
    public int f137546i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137543f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137545h = "";

    @Override // jx3.a
    public int g() {
        return 19435;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137541d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137542e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137543f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137544g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137545h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137546i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f137541d);
        stringBuffer.append("\r\nIsRed:");
        stringBuffer.append(this.f137542e);
        stringBuffer.append("\r\nEnterPid:");
        stringBuffer.append(this.f137543f);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f137544g);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f137545h);
        stringBuffer.append("\r\nNewPage:");
        stringBuffer.append(this.f137546i);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6407xe9d59d8 p(java.lang.String str) {
        this.f137545h = b("Pid", str, true);
        return this;
    }
}
