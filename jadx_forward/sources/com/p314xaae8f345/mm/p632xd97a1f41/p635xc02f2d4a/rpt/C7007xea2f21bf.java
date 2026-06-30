package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoIP_ilink_msg_detailStruct */
/* loaded from: classes8.dex */
public final class C7007xea2f21bf extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143212d;

    /* renamed from: e, reason: collision with root package name */
    public long f143213e;

    /* renamed from: f, reason: collision with root package name */
    public long f143214f;

    @Override // jx3.a
    public int g() {
        return 29346;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143212d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143213e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143214f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f143212d);
        stringBuffer.append("\r\nroomid:");
        stringBuffer.append(this.f143213e);
        stringBuffer.append("\r\nis_friend:");
        stringBuffer.append(this.f143214f);
        return stringBuffer.toString();
    }
}
