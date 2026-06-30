package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MagicEmojiTriggerStruct */
/* loaded from: classes7.dex */
public final class C6725xb1b08174 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f140628f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f140626d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f140627e = 0;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f140629g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f140630h = "";

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f140631i = "";

    @Override // jx3.a
    public int g() {
        return 22135;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("0,");
        stringBuffer.append(this.f140626d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140627e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140628f);
        stringBuffer.append(",0,0,");
        stringBuffer.append(this.f140629g);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f140630h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140631i);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Sessionid:0\r\nContent:");
        stringBuffer.append(this.f140626d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f140627e);
        stringBuffer.append("\r\nNewMessage_Timestamp:");
        stringBuffer.append(this.f140628f);
        stringBuffer.append("\r\nPlay_Start_Timestamp:0\r\nPlay_End_Timestamp:0\r\nToChatName:");
        stringBuffer.append(this.f140629g);
        stringBuffer.append("\r\nIs_Play_Success:0\r\nFail_Reason:0\r\nValid_Period:0\r\nChatSessionid:");
        stringBuffer.append(this.f140630h);
        stringBuffer.append("\r\nemoji_combo:");
        stringBuffer.append(this.f140631i);
        stringBuffer.append("\r\nMsgType:0\r\nAppMsgInnerType:0");
        return stringBuffer.toString();
    }
}
