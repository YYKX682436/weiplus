package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes13.dex */
public final class RoomTodoShareStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f60112e;

    /* renamed from: h, reason: collision with root package name */
    public long f60115h;

    /* renamed from: i, reason: collision with root package name */
    public long f60116i;

    /* renamed from: j, reason: collision with root package name */
    public long f60117j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60111d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f60113f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60114g = "";

    @Override // jx3.a
    public int g() {
        return 19440;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60111d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60112e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60113f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60114g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60115h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60116i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60117j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f60111d);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f60112e);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f60113f);
        stringBuffer.append("\r\nappname:");
        stringBuffer.append(this.f60114g);
        stringBuffer.append("\r\ntodo:");
        stringBuffer.append(this.f60115h);
        stringBuffer.append("\r\nopenHelp:");
        stringBuffer.append(this.f60116i);
        stringBuffer.append("\r\nexit:");
        stringBuffer.append(this.f60117j);
        return stringBuffer.toString();
    }
}
