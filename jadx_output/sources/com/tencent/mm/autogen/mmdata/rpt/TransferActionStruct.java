package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class TransferActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61335d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f61336e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f61337f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61338g = "";

    @Override // jx3.a
    public int g() {
        return 16440;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61335d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61336e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61337f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61338g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f61335d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61336e);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f61337f);
        stringBuffer.append("\r\nTransferId:");
        stringBuffer.append(this.f61338g);
        return stringBuffer.toString();
    }
}
