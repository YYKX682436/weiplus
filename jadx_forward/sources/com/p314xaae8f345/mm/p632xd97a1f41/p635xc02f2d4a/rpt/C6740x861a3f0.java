package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct */
/* loaded from: classes9.dex */
public final class C6740x861a3f0 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140733d;

    /* renamed from: e, reason: collision with root package name */
    public long f140734e;

    /* renamed from: f, reason: collision with root package name */
    public long f140735f;

    /* renamed from: g, reason: collision with root package name */
    public long f140736g;

    /* renamed from: h, reason: collision with root package name */
    public long f140737h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f140738i = 0;

    @Override // jx3.a
    public int g() {
        return 18712;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140733d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140734e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140735f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140736g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140737h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140738i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f140733d);
        stringBuffer.append("\r\nSelfSendMsg:");
        stringBuffer.append(this.f140734e);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f140735f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f140736g);
        stringBuffer.append("\r\nCopyLen:");
        stringBuffer.append(this.f140737h);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f140738i);
        return stringBuffer.toString();
    }
}
