package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class TipsMsgReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61308d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61309e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61310f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f61311g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f61312h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f61313i = 0;

    @Override // jx3.a
    public int g() {
        return 30697;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61308d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61309e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61310f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61311g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61312h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61313i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ReceiveTime:");
        stringBuffer.append(this.f61308d);
        stringBuffer.append("\r\nAppid:");
        stringBuffer.append(this.f61309e);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f61310f);
        stringBuffer.append("\r\nBusiType:");
        stringBuffer.append(this.f61311g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f61312h);
        stringBuffer.append("\r\nState:");
        stringBuffer.append(this.f61313i);
        return stringBuffer.toString();
    }
}
