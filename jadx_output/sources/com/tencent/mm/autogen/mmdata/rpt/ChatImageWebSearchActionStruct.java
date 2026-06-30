package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class ChatImageWebSearchActionStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f55627e;

    /* renamed from: f, reason: collision with root package name */
    public int f55628f;

    /* renamed from: g, reason: collision with root package name */
    public int f55629g;

    /* renamed from: j, reason: collision with root package name */
    public int f55632j;

    /* renamed from: n, reason: collision with root package name */
    public int f55636n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55626d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55630h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55631i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55633k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55634l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f55635m = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f55637o = "";

    @Override // jx3.a
    public int g() {
        return 20511;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55626d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55627e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55628f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55629g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55630h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55631i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55632j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55633k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55634l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55635m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55636n);
        stringBuffer.append(",");
        stringBuffer.append(this.f55637o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RequestId:");
        stringBuffer.append(this.f55626d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f55627e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f55628f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f55629g);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f55630h);
        stringBuffer.append("\r\nMsgFromUsername:");
        stringBuffer.append(this.f55631i);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f55632j);
        stringBuffer.append("\r\nChatRoomID:");
        stringBuffer.append(this.f55633k);
        stringBuffer.append("\r\nPicMD5:");
        stringBuffer.append(this.f55634l);
        stringBuffer.append("\r\nTimeStampsInMs:");
        stringBuffer.append(this.f55635m);
        stringBuffer.append("\r\nCgiRet:");
        stringBuffer.append(this.f55636n);
        stringBuffer.append("\r\nCgiAction:");
        stringBuffer.append(this.f55637o);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct p(java.lang.String str) {
        this.f55633k = b("ChatRoomID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct q(java.lang.String str) {
        this.f55631i = b("MsgFromUsername", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct r(java.lang.String str) {
        this.f55630h = b("MsgId", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct s(java.lang.String str) {
        this.f55634l = b("PicMD5", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct t(java.lang.String str) {
        this.f55626d = b("RequestId", str, true);
        return this;
    }
}
