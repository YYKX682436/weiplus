package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct */
/* loaded from: classes4.dex */
public final class C6890xef7a7bf4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142071d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f142072e = 0;

    @Override // jx3.a
    public int g() {
        return 15988;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142071d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142072e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f142071d);
        stringBuffer.append("\r\nClickTimeStampMs:");
        stringBuffer.append(this.f142072e);
        return stringBuffer.toString();
    }
}
