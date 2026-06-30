package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class DismissChatroomReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55856d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f55857e;

    /* renamed from: f, reason: collision with root package name */
    public long f55858f;

    /* renamed from: g, reason: collision with root package name */
    public long f55859g;

    @Override // jx3.a
    public int g() {
        return 24180;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55856d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55857e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55858f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55859g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomUsername:");
        stringBuffer.append(this.f55856d);
        stringBuffer.append("\r\nmemberCount:");
        stringBuffer.append(this.f55857e);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55858f);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f55859g);
        return stringBuffer.toString();
    }
}
