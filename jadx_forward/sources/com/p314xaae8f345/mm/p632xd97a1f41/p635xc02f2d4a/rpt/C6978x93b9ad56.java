package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TransferActionStruct */
/* loaded from: classes9.dex */
public final class C6978x93b9ad56 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142868d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f142869e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142870f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142871g = "";

    @Override // jx3.a
    public int g() {
        return 16440;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142868d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142869e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142870f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142871g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f142868d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f142869e);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f142870f);
        stringBuffer.append("\r\nTransferId:");
        stringBuffer.append(this.f142871g);
        return stringBuffer.toString();
    }
}
