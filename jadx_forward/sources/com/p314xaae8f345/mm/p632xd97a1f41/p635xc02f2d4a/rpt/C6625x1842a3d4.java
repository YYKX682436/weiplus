package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct */
/* loaded from: classes9.dex */
public final class C6625x1842a3d4 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f139769d;

    /* renamed from: f, reason: collision with root package name */
    public long f139771f;

    /* renamed from: g, reason: collision with root package name */
    public long f139772g;

    /* renamed from: i, reason: collision with root package name */
    public long f139774i;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139770e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139773h = "";

    @Override // jx3.a
    public int g() {
        return 27331;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139769d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139770e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139771f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139772g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139773h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139774i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f139769d);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f139770e);
        stringBuffer.append("\r\nForwardType:");
        stringBuffer.append(this.f139771f);
        stringBuffer.append("\r\nMsgCnt:");
        stringBuffer.append(this.f139772g);
        stringBuffer.append("\r\nMsgTypes:");
        stringBuffer.append(this.f139773h);
        stringBuffer.append("\r\nBizSource:");
        stringBuffer.append(this.f139774i);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6625x1842a3d4 p(java.lang.String str) {
        this.f139773h = b("MsgTypes", str, true);
        return this;
    }
}
