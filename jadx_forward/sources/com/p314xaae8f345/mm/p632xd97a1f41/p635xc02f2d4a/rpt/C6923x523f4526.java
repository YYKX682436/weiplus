package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct */
/* loaded from: classes3.dex */
public final class C6923x523f4526 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142386d;

    /* renamed from: e, reason: collision with root package name */
    public long f142387e;

    /* renamed from: f, reason: collision with root package name */
    public long f142388f;

    /* renamed from: g, reason: collision with root package name */
    public long f142389g;

    @Override // jx3.a
    public int g() {
        return 21321;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142386d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142387e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142388f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142389g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("MsgSvrId:");
        stringBuffer.append(this.f142386d);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f142387e);
        stringBuffer.append("\r\nBanType:");
        stringBuffer.append(this.f142388f);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f142389g);
        return stringBuffer.toString();
    }
}
