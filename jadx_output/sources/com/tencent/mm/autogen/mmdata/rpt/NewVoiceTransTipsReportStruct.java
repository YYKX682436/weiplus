package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class NewVoiceTransTipsReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f59726d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59727e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59728f = 0;

    @Override // jx3.a
    public int g() {
        return 20551;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59726d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59727e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59728f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Type:");
        stringBuffer.append(this.f59726d);
        stringBuffer.append("\r\nVoiceID:");
        stringBuffer.append(this.f59727e);
        stringBuffer.append("\r\nDuration:");
        stringBuffer.append(this.f59728f);
        return stringBuffer.toString();
    }
}
