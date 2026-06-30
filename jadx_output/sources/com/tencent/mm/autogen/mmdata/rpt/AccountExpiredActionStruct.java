package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class AccountExpiredActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55015d;

    /* renamed from: e, reason: collision with root package name */
    public long f55016e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55017f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55018g = "";

    @Override // jx3.a
    public int g() {
        return 22500;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55015d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55016e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55017f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55018g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("errType:");
        stringBuffer.append(this.f55015d);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f55016e);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f55017f);
        stringBuffer.append("\r\nlastKickReason:");
        stringBuffer.append(this.f55018g);
        return stringBuffer.toString();
    }
}
