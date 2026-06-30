package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class MagicEmojiTriggerStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f59095f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f59093d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59094e = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f59096g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f59097h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f59098i = "";

    @Override // jx3.a
    public int g() {
        return 22135;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f59093d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59094e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59095f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f59096g);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59097h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59098i);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:0\r\nContent:");
        stringBuffer.append(this.f59093d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f59094e);
        stringBuffer.append("\r\nNewMessage_Timestamp:");
        stringBuffer.append(this.f59095f);
        stringBuffer.append("\r\nPlay_Start_Timestamp:0\r\nPlay_End_Timestamp:0\r\nToChatName:");
        stringBuffer.append(this.f59096g);
        stringBuffer.append("\r\nIs_Play_Success:0\r\nFail_Reason:0\r\nValid_Period:0\r\nChatSessionid:");
        stringBuffer.append(this.f59097h);
        stringBuffer.append("\r\nemoji_combo:");
        stringBuffer.append(this.f59098i);
        stringBuffer.append("\r\nMsgType:0\r\nAppMsgInnerType:0");
        return stringBuffer.toString();
    }
}
