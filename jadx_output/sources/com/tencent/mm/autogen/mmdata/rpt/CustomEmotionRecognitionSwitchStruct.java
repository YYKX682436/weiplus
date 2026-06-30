package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class CustomEmotionRecognitionSwitchStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f55765d;

    /* renamed from: e, reason: collision with root package name */
    public long f55766e;

    /* renamed from: f, reason: collision with root package name */
    public long f55767f;

    @Override // jx3.a
    public int g() {
        return 25429;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55765d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55766e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55767f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f55765d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f55766e);
        stringBuffer.append("\r\nStatus:");
        stringBuffer.append(this.f55767f);
        return stringBuffer.toString();
    }
}
