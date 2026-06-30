package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class SnsChoosePostBussinessReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60470d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f60471e;

    /* renamed from: f, reason: collision with root package name */
    public long f60472f;

    @Override // jx3.a
    public int g() {
        return 21182;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60470d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60471e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60472f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f60470d);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f60471e);
        stringBuffer.append("\r\nclickType:");
        stringBuffer.append(this.f60472f);
        return stringBuffer.toString();
    }
}
