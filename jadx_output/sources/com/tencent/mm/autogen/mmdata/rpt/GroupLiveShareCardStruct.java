package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class GroupLiveShareCardStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f58379e;

    /* renamed from: f, reason: collision with root package name */
    public long f58380f;

    /* renamed from: g, reason: collision with root package name */
    public long f58381g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58378d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58382h = "";

    @Override // jx3.a
    public int g() {
        return 22469;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58378d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58379e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58380f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58381g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58382h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f58378d);
        stringBuffer.append("\r\nReddotType:");
        stringBuffer.append(this.f58379e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58380f);
        stringBuffer.append("\r\nActionTs:");
        stringBuffer.append(this.f58381g);
        stringBuffer.append("\r\nLiveIDList:");
        stringBuffer.append(this.f58382h);
        return stringBuffer.toString();
    }
}
