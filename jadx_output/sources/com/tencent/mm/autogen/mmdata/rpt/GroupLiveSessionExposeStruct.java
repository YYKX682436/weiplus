package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class GroupLiveSessionExposeStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58373e;

    /* renamed from: f, reason: collision with root package name */
    public long f58374f;

    /* renamed from: g, reason: collision with root package name */
    public long f58375g;

    /* renamed from: i, reason: collision with root package name */
    public long f58377i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58372d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58376h = "";

    @Override // jx3.a
    public int g() {
        return 21799;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58372d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58373e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58374f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58375g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58376h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58377i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f58372d);
        stringBuffer.append("\r\nReddotType:");
        stringBuffer.append(this.f58373e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58374f);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f58375g);
        stringBuffer.append("\r\nLiveIDList:");
        stringBuffer.append(this.f58376h);
        stringBuffer.append("\r\nChatRoomIsMute:");
        stringBuffer.append(this.f58377i);
        return stringBuffer.toString();
    }
}
