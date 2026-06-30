package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.NewVoiceTransTipsReportStruct */
/* loaded from: classes9.dex */
public final class C6794x3956ffd7 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f141259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141260e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141261f = 0;

    @Override // jx3.a
    public int g() {
        return 20551;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141259d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141260e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141261f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f141259d);
        stringBuffer.append("\r\nVoiceID:");
        stringBuffer.append(this.f141260e);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f141261f);
        return stringBuffer.toString();
    }
}
