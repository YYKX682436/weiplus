package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class GlobalMsgSearchResultClickStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58363d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58364e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58365f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58366g = 0;

    @Override // jx3.a
    public int g() {
        return 14756;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58363d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58364e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58365f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58366g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ClickType:");
        stringBuffer.append(this.f58363d);
        stringBuffer.append("\r\nPageType:");
        stringBuffer.append(this.f58364e);
        stringBuffer.append("\r\nShowTalkerEntry:");
        stringBuffer.append(this.f58365f);
        stringBuffer.append("\r\nChatType:");
        stringBuffer.append(this.f58366g);
        return stringBuffer.toString();
    }
}
