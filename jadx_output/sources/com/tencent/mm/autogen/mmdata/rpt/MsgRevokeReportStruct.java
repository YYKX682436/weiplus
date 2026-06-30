package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MsgRevokeReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59289d;

    /* renamed from: e, reason: collision with root package name */
    public long f59290e;

    /* renamed from: f, reason: collision with root package name */
    public long f59291f;

    /* renamed from: g, reason: collision with root package name */
    public long f59292g;

    /* renamed from: h, reason: collision with root package name */
    public long f59293h;

    /* renamed from: i, reason: collision with root package name */
    public long f59294i;

    /* renamed from: j, reason: collision with root package name */
    public long f59295j;

    /* renamed from: k, reason: collision with root package name */
    public long f59296k;

    @Override // jx3.a
    public int g() {
        return 27627;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59289d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59290e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59291f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59292g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59293h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59294i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59295j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59296k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RevokeType:");
        stringBuffer.append(this.f59289d);
        stringBuffer.append("\r\nMsgID:");
        stringBuffer.append(this.f59290e);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f59291f);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f59292g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f59293h);
        stringBuffer.append("\r\nInnerType:");
        stringBuffer.append(this.f59294i);
        stringBuffer.append("\r\ntext_utf8_cnt:");
        stringBuffer.append(this.f59295j);
        stringBuffer.append("\r\nmsg_send_ts:");
        stringBuffer.append(this.f59296k);
        return stringBuffer.toString();
    }
}
