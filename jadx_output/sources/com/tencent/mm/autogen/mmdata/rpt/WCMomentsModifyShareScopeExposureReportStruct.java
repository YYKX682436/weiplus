package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class WCMomentsModifyShareScopeExposureReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62081d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62082e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62083f = "";

    @Override // jx3.a
    public int g() {
        return 26579;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62081d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62082e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62083f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f62081d);
        stringBuffer.append("\r\nisClickModifiy:");
        stringBuffer.append(this.f62082e);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f62083f);
        return stringBuffer.toString();
    }
}
