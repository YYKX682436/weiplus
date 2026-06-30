package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MessageBatchRevokeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59178d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f59179e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59180f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f59181g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f59182h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59183i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f59184j = 0;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f59185k = "";

    /* renamed from: l, reason: collision with root package name */
    public long f59186l = 0;

    @Override // jx3.a
    public int g() {
        return 36065;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59178d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59179e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59180f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59181g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59182h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59183i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59184j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59185k);
        stringBuffer.append(",");
        stringBuffer.append(this.f59186l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f59178d);
        stringBuffer.append("\r\nResult:");
        stringBuffer.append(this.f59179e);
        stringBuffer.append("\r\nRevokingCount:");
        stringBuffer.append(this.f59180f);
        stringBuffer.append("\r\nSucCount:");
        stringBuffer.append(this.f59181g);
        stringBuffer.append("\r\nFailCount:");
        stringBuffer.append(this.f59182h);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f59183i);
        stringBuffer.append("\r\nInterval:");
        stringBuffer.append(this.f59184j);
        stringBuffer.append("\r\nRevokingBatchId:");
        stringBuffer.append(this.f59185k);
        stringBuffer.append("\r\nRevokingType:");
        stringBuffer.append(this.f59186l);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.MessageBatchRevokeStruct p(java.lang.String str) {
        this.f59185k = b("RevokingBatchId", str, true);
        return this;
    }
}
