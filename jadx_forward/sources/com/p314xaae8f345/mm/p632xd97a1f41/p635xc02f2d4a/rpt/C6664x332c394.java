package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.LeftSlideOptionStruct */
/* loaded from: classes11.dex */
public final class C6664x332c394 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140084d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140085e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f140086f;

    /* renamed from: g, reason: collision with root package name */
    public long f140087g;

    /* renamed from: h, reason: collision with root package name */
    public long f140088h;

    @Override // jx3.a
    public int g() {
        return 11090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140084d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140085e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140086f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140087g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140088h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f140084d);
        stringBuffer.append("\r\nSessionName:");
        stringBuffer.append(this.f140085e);
        stringBuffer.append("\r\nUnreadCount:");
        stringBuffer.append(this.f140086f);
        stringBuffer.append("\r\nSessionType:");
        stringBuffer.append(this.f140087g);
        stringBuffer.append("\r\nHasEduWindow:");
        stringBuffer.append(this.f140088h);
        return stringBuffer.toString();
    }
}
