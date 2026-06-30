package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class LeftSlideOptionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58551d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58552e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f58553f;

    /* renamed from: g, reason: collision with root package name */
    public long f58554g;

    /* renamed from: h, reason: collision with root package name */
    public long f58555h;

    @Override // jx3.a
    public int g() {
        return 11090;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58551d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58552e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58553f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58554g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58555h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f58551d);
        stringBuffer.append("\r\nSessionName:");
        stringBuffer.append(this.f58552e);
        stringBuffer.append("\r\nUnreadCount:");
        stringBuffer.append(this.f58553f);
        stringBuffer.append("\r\nSessionType:");
        stringBuffer.append(this.f58554g);
        stringBuffer.append("\r\nHasEduWindow:");
        stringBuffer.append(this.f58555h);
        return stringBuffer.toString();
    }
}
