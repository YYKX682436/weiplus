package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class AndroidOplogReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55070d;

    /* renamed from: e, reason: collision with root package name */
    public long f55071e;

    /* renamed from: f, reason: collision with root package name */
    public long f55072f;

    /* renamed from: h, reason: collision with root package name */
    public long f55074h;

    /* renamed from: j, reason: collision with root package name */
    public long f55076j;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55073g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55075i = "";

    @Override // jx3.a
    public int g() {
        return 36655;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55070d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55071e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55072f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55073g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55074h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55075i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55076j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpReportEventType:");
        stringBuffer.append(this.f55070d);
        stringBuffer.append("\r\nCmdId:");
        stringBuffer.append(this.f55071e);
        stringBuffer.append("\r\nOpSucceed:");
        stringBuffer.append(this.f55072f);
        stringBuffer.append("\r\nResultList:");
        stringBuffer.append(this.f55073g);
        stringBuffer.append("\r\nOpAsyncDelay:");
        stringBuffer.append(this.f55074h);
        stringBuffer.append("\r\nFromScene:");
        stringBuffer.append(this.f55075i);
        stringBuffer.append("\r\nOpQueueLength:");
        stringBuffer.append(this.f55076j);
        return stringBuffer.toString();
    }
}
