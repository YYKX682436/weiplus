package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class WxaRecentTaskPanelReportStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f63045f;

    /* renamed from: i, reason: collision with root package name */
    public long f63048i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f63043d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63044e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63046g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f63047h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f63049j = "";

    @Override // jx3.a
    public int g() {
        return 35188;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63043d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63044e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63045f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63046g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63047h);
        stringBuffer.append(",");
        stringBuffer.append(this.f63048i);
        stringBuffer.append(",");
        stringBuffer.append(this.f63049j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppId:");
        stringBuffer.append(this.f63043d);
        stringBuffer.append("\r\nTaskSessionId:");
        stringBuffer.append(this.f63044e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f63045f);
        stringBuffer.append("\r\nActionNote:");
        stringBuffer.append(this.f63046g);
        stringBuffer.append("\r\nActionScene:");
        stringBuffer.append(this.f63047h);
        stringBuffer.append("\r\nActionTime:");
        stringBuffer.append(this.f63048i);
        stringBuffer.append("\r\nExtraData:");
        stringBuffer.append(this.f63049j);
        return stringBuffer.toString();
    }
}
