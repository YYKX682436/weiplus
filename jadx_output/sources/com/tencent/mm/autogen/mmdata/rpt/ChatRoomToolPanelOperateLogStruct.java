package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class ChatRoomToolPanelOperateLogStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55654e;

    /* renamed from: f, reason: collision with root package name */
    public long f55655f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55653d = "";

    /* renamed from: g, reason: collision with root package name */
    public long f55656g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f55657h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55658i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f55659j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f55660k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55661l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f55662m = "";

    @Override // jx3.a
    public int g() {
        return 19436;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55653d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55654e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55655f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55656g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55657h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55658i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55659j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55660k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55661l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55662m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomusrname:");
        stringBuffer.append(this.f55653d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55654e);
        stringBuffer.append("\r\ntopCount:");
        stringBuffer.append(this.f55655f);
        stringBuffer.append("\r\nusedCount:");
        stringBuffer.append(this.f55656g);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f55657h);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f55658i);
        stringBuffer.append("\r\nappname:");
        stringBuffer.append(this.f55659j);
        stringBuffer.append("\r\nisTop:");
        stringBuffer.append(this.f55660k);
        stringBuffer.append("\r\ntopAppList:");
        stringBuffer.append(this.f55661l);
        stringBuffer.append("\r\nusedAppList:");
        stringBuffer.append(this.f55662m);
        return stringBuffer.toString();
    }
}
