package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TipsMsgReportStruct */
/* loaded from: classes7.dex */
public final class C6974x5cb02dd2 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142841d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142842e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f142843f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f142844g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f142845h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f142846i = 0;

    @Override // jx3.a
    public int g() {
        return 30697;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142841d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142842e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142843f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142844g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142845h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142846i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReceiveTime:");
        stringBuffer.append(this.f142841d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f142842e);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f142843f);
        stringBuffer.append("\r\nBusiType:");
        stringBuffer.append(this.f142844g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f142845h);
        stringBuffer.append("\r\nState:");
        stringBuffer.append(this.f142846i);
        return stringBuffer.toString();
    }
}
