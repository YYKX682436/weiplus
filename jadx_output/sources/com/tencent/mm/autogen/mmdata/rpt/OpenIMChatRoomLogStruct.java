package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class OpenIMChatRoomLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59785d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59786e = 0;

    @Override // jx3.a
    public int g() {
        return 15848;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59785d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59786e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("chatRoomUserName:");
        stringBuffer.append(this.f59785d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f59786e);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct p(java.lang.String str) {
        this.f59785d = b("chatRoomUserName", str, true);
        return this;
    }
}
