package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayTransferToPhoneActionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62121d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f62122e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62123f = 0;

    @Override // jx3.a
    public int g() {
        return 18262;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62121d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62122e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62123f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f62121d);
        stringBuffer.append("\r\nReqKey:");
        stringBuffer.append(this.f62122e);
        stringBuffer.append("\r\nEnterSettingScene:");
        stringBuffer.append(this.f62123f);
        return stringBuffer.toString();
    }
}
