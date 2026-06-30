package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMChatRoomLogStruct */
/* loaded from: classes.dex */
public final class C6800x63c0d5b8 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141318d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f141319e = 0;

    @Override // jx3.a
    public int g() {
        return 15848;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141318d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141319e);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("chatRoomUserName:");
        stringBuffer.append(this.f141318d);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f141319e);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6800x63c0d5b8 p(java.lang.String str) {
        this.f141318d = b("chatRoomUserName", str, true);
        return this;
    }
}
