package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class BizRecentReadReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55416d;

    /* renamed from: e, reason: collision with root package name */
    public long f55417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55418f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f55419g;

    /* renamed from: h, reason: collision with root package name */
    public long f55420h;

    /* renamed from: i, reason: collision with root package name */
    public long f55421i;

    /* renamed from: j, reason: collision with root package name */
    public long f55422j;

    @Override // jx3.a
    public int g() {
        return 27214;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55416d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55417e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55418f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55419g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55420h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55421i);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f55422j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actionType:");
        stringBuffer.append(this.f55416d);
        stringBuffer.append("\r\nsessionId:");
        stringBuffer.append(this.f55417e);
        stringBuffer.append("\r\nbizuin:");
        stringBuffer.append(this.f55418f);
        stringBuffer.append("\r\nmsgid:");
        stringBuffer.append(this.f55419g);
        stringBuffer.append("\r\nitemidx:");
        stringBuffer.append(this.f55420h);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f55421i);
        stringBuffer.append("\r\nauthorid:0\r\nexposeMsTime:0\r\nclickMsTime:");
        stringBuffer.append(this.f55422j);
        return stringBuffer.toString();
    }
}
