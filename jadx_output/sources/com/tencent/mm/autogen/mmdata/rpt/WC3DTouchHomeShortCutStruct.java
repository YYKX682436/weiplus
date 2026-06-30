package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class WC3DTouchHomeShortCutStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62064d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62065e = 0;

    @Override // jx3.a
    public int g() {
        return 13071;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62064d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62065e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpType:");
        stringBuffer.append(this.f62064d);
        stringBuffer.append("\r\nSuccess:");
        stringBuffer.append(this.f62065e);
        return stringBuffer.toString();
    }
}
