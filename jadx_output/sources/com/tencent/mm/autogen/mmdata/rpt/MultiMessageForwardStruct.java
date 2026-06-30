package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class MultiMessageForwardStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public long f59346i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59341d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59342e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59343f = 2;

    /* renamed from: g, reason: collision with root package name */
    public long f59344g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59345h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f59347j = "";

    @Override // jx3.a
    public int g() {
        return 20559;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59341d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59342e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59343f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59344g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59345h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59346i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59347j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("HasConfirmed:");
        stringBuffer.append(this.f59341d);
        stringBuffer.append("\r\nOper:");
        stringBuffer.append(this.f59342e);
        stringBuffer.append("\r\nHasSideNote:");
        stringBuffer.append(this.f59343f);
        stringBuffer.append("\r\nFinalShareCount:");
        stringBuffer.append(this.f59344g);
        stringBuffer.append("\r\nFinalShareCountByType:");
        stringBuffer.append(this.f59345h);
        stringBuffer.append("\r\nForwardScene:");
        stringBuffer.append(this.f59346i);
        stringBuffer.append("\r\nToUsername:");
        stringBuffer.append(this.f59347j);
        return stringBuffer.toString();
    }
}
