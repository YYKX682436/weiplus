package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.GroupLiveSessionExposeStruct */
/* loaded from: classes11.dex */
public final class C6637x652e1c84 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f139906e;

    /* renamed from: f, reason: collision with root package name */
    public long f139907f;

    /* renamed from: g, reason: collision with root package name */
    public long f139908g;

    /* renamed from: i, reason: collision with root package name */
    public long f139910i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139905d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f139909h = "";

    @Override // jx3.a
    public int g() {
        return 21799;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f139905d);
        stringBuffer.append(",");
        stringBuffer.append(this.f139906e);
        stringBuffer.append(",");
        stringBuffer.append(this.f139907f);
        stringBuffer.append(",");
        stringBuffer.append(this.f139908g);
        stringBuffer.append(",");
        stringBuffer.append(this.f139909h);
        stringBuffer.append(",");
        stringBuffer.append(this.f139910i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f139905d);
        stringBuffer.append("\r\nReddotType:");
        stringBuffer.append(this.f139906e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f139907f);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f139908g);
        stringBuffer.append("\r\nLiveIDList:");
        stringBuffer.append(this.f139909h);
        stringBuffer.append("\r\nChatRoomIsMute:");
        stringBuffer.append(this.f139910i);
        return stringBuffer.toString();
    }
}
