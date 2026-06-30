package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct */
/* loaded from: classes4.dex */
public final class C6367x7875a8e4 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f137160e;

    /* renamed from: f, reason: collision with root package name */
    public int f137161f;

    /* renamed from: g, reason: collision with root package name */
    public int f137162g;

    /* renamed from: j, reason: collision with root package name */
    public int f137165j;

    /* renamed from: n, reason: collision with root package name */
    public int f137169n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137159d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137163h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137164i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f137166k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f137167l = "";

    /* renamed from: m, reason: collision with root package name */
    public long f137168m = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f137170o = "";

    @Override // jx3.a
    public int g() {
        return 20511;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137159d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137160e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137161f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137162g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137163h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137164i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137165j);
        stringBuffer.append(",");
        stringBuffer.append(this.f137166k);
        stringBuffer.append(",");
        stringBuffer.append(this.f137167l);
        stringBuffer.append(",");
        stringBuffer.append(this.f137168m);
        stringBuffer.append(",");
        stringBuffer.append(this.f137169n);
        stringBuffer.append(",");
        stringBuffer.append(this.f137170o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("RequestId:");
        stringBuffer.append(this.f137159d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f137160e);
        stringBuffer.append("\r\nSource:");
        stringBuffer.append(this.f137161f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f137162g);
        stringBuffer.append("\r\nMsgId:");
        stringBuffer.append(this.f137163h);
        stringBuffer.append("\r\nMsgFromUsername:");
        stringBuffer.append(this.f137164i);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f137165j);
        stringBuffer.append("\r\nChatRoomID:");
        stringBuffer.append(this.f137166k);
        stringBuffer.append("\r\nPicMD5:");
        stringBuffer.append(this.f137167l);
        stringBuffer.append("\r\nTimeStampsInMs:");
        stringBuffer.append(this.f137168m);
        stringBuffer.append("\r\nCgiRet:");
        stringBuffer.append(this.f137169n);
        stringBuffer.append("\r\nCgiAction:");
        stringBuffer.append(this.f137170o);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 p(java.lang.String str) {
        this.f137166k = b("ChatRoomID", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 q(java.lang.String str) {
        this.f137164i = b("MsgFromUsername", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 r(java.lang.String str) {
        this.f137163h = b("MsgId", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 s(java.lang.String str) {
        this.f137167l = b("PicMD5", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 t(java.lang.String str) {
        this.f137159d = b("RequestId", str, true);
        return this;
    }
}
