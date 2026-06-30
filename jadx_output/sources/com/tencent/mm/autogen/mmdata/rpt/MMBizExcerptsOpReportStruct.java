package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class MMBizExcerptsOpReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58792d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58793e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58794f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58795g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58796h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58797i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f58798j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f58799k = 0;

    @Override // jx3.a
    public int g() {
        return 28138;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58792d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58793e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58794f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58795g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58796h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58797i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58798j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58799k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("BizUin:");
        stringBuffer.append(this.f58792d);
        stringBuffer.append("\r\nAppMsgID:");
        stringBuffer.append(this.f58793e);
        stringBuffer.append("\r\nItemIdx:");
        stringBuffer.append(this.f58794f);
        stringBuffer.append("\r\nbeginOffset:");
        stringBuffer.append(this.f58795g);
        stringBuffer.append("\r\nendOffet:");
        stringBuffer.append(this.f58796h);
        stringBuffer.append("\r\ncontent_md5:");
        stringBuffer.append(this.f58797i);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f58798j);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f58799k);
        return stringBuffer.toString();
    }
}
