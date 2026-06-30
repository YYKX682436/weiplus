package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class ForwardReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58230d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58231e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f58232f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f58233g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f58234h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f58235i = 0;

    @Override // jx3.a
    public int g() {
        return 29201;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58230d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58231e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58232f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58233g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58234h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58235i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("StartActivityCostTime:");
        stringBuffer.append(this.f58230d);
        stringBuffer.append("\r\nCostTime:");
        stringBuffer.append(this.f58231e);
        stringBuffer.append("\r\nPageId:");
        stringBuffer.append(this.f58232f);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f58233g);
        stringBuffer.append("\r\nMsgType:");
        stringBuffer.append(this.f58234h);
        stringBuffer.append("\r\nisMultiSelect:");
        stringBuffer.append(this.f58235i);
        return stringBuffer.toString();
    }
}
