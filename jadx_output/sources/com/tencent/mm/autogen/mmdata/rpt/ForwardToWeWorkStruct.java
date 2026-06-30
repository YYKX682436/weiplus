package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class ForwardToWeWorkStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58236d;

    /* renamed from: f, reason: collision with root package name */
    public long f58238f;

    /* renamed from: g, reason: collision with root package name */
    public long f58239g;

    /* renamed from: i, reason: collision with root package name */
    public long f58241i;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58237e = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58240h = "";

    @Override // jx3.a
    public int g() {
        return 27331;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58236d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58237e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58238f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58239g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58240h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58241i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f58236d);
        stringBuffer.append("\r\nChatName:");
        stringBuffer.append(this.f58237e);
        stringBuffer.append("\r\nForwardType:");
        stringBuffer.append(this.f58238f);
        stringBuffer.append("\r\nMsgCnt:");
        stringBuffer.append(this.f58239g);
        stringBuffer.append("\r\nMsgTypes:");
        stringBuffer.append(this.f58240h);
        stringBuffer.append("\r\nBizSource:");
        stringBuffer.append(this.f58241i);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.ForwardToWeWorkStruct p(java.lang.String str) {
        this.f58240h = b("MsgTypes", str, true);
        return this;
    }
}
