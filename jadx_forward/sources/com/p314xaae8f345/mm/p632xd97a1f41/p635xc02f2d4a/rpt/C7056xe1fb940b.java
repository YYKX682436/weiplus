package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.WCPayTransferToPhoneActionReportStruct */
/* loaded from: classes9.dex */
public final class C7056xe1fb940b extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143654d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f143655e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143656f = 0;

    @Override // jx3.a
    public int g() {
        return 18262;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143654d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143655e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143656f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f143654d);
        stringBuffer.append("\r\nReqKey:");
        stringBuffer.append(this.f143655e);
        stringBuffer.append("\r\nEnterSettingScene:");
        stringBuffer.append(this.f143656f);
        return stringBuffer.toString();
    }
}
