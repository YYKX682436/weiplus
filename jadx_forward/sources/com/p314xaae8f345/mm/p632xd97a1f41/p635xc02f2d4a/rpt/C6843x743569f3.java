package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RoomTodoShareStruct */
/* loaded from: classes13.dex */
public final class C6843x743569f3 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f141645e;

    /* renamed from: h, reason: collision with root package name */
    public long f141648h;

    /* renamed from: i, reason: collision with root package name */
    public long f141649i;

    /* renamed from: j, reason: collision with root package name */
    public long f141650j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141644d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141646f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141647g = "";

    @Override // jx3.a
    public int g() {
        return 19440;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141644d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141645e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141646f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141647g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141648h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141649i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141650j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("roomid:");
        stringBuffer.append(this.f141644d);
        stringBuffer.append("\r\nrole:");
        stringBuffer.append(this.f141645e);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f141646f);
        stringBuffer.append("\r\nappname:");
        stringBuffer.append(this.f141647g);
        stringBuffer.append("\r\ntodo:");
        stringBuffer.append(this.f141648h);
        stringBuffer.append("\r\nopenHelp:");
        stringBuffer.append(this.f141649i);
        stringBuffer.append("\r\nexit:");
        stringBuffer.append(this.f141650j);
        return stringBuffer.toString();
    }
}
