package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class VoIP_ilink_msg_detailStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61679d;

    /* renamed from: e, reason: collision with root package name */
    public long f61680e;

    /* renamed from: f, reason: collision with root package name */
    public long f61681f;

    @Override // jx3.a
    public int g() {
        return 29346;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61679d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61680e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61681f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f61679d);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f61680e);
        stringBuffer.append("\r\nis_friend:");
        stringBuffer.append(this.f61681f);
        return stringBuffer.toString();
    }
}
