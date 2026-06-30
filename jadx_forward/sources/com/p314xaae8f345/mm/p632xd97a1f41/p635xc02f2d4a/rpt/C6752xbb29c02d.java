package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MsgHistoryResendActionReportStruct */
/* loaded from: classes9.dex */
public final class C6752xbb29c02d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140803d;

    /* renamed from: e, reason: collision with root package name */
    public long f140804e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140805f = "";

    @Override // jx3.a
    public int g() {
        return 22336;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f140803d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140804e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140805f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:0\r\nChatType:");
        stringBuffer.append(this.f140803d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f140804e);
        stringBuffer.append("\r\nChatNameStr:");
        stringBuffer.append(this.f140805f);
        return stringBuffer.toString();
    }
}
