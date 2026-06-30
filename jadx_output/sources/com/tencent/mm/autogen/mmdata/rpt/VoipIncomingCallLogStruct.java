package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class VoipIncomingCallLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61783d;

    /* renamed from: e, reason: collision with root package name */
    public long f61784e;

    /* renamed from: f, reason: collision with root package name */
    public long f61785f;

    @Override // jx3.a
    public int g() {
        return 23523;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61783d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61784e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61785f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f61783d);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f61784e);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f61785f);
        return stringBuffer.toString();
    }
}
