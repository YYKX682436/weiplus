package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoipIncomingCallLogStruct */
/* loaded from: classes5.dex */
public final class C7017x5499cf15 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143316d;

    /* renamed from: e, reason: collision with root package name */
    public long f143317e;

    /* renamed from: f, reason: collision with root package name */
    public long f143318f;

    @Override // jx3.a
    public int g() {
        return 23523;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143316d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143317e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143318f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f143316d);
        stringBuffer.append("\r\nroomkey:");
        stringBuffer.append(this.f143317e);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f143318f);
        return stringBuffer.toString();
    }
}
