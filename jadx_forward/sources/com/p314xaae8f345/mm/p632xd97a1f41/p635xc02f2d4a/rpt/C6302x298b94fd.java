package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AndroidOplogReportStruct */
/* loaded from: classes11.dex */
public final class C6302x298b94fd extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136603d;

    /* renamed from: e, reason: collision with root package name */
    public long f136604e;

    /* renamed from: f, reason: collision with root package name */
    public long f136605f;

    /* renamed from: h, reason: collision with root package name */
    public long f136607h;

    /* renamed from: j, reason: collision with root package name */
    public long f136609j;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136606g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136608i = "";

    @Override // jx3.a
    public int g() {
        return 36655;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136603d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136604e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136605f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136606g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136607h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136608i);
        stringBuffer.append(",");
        stringBuffer.append(this.f136609j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OpReportEventType:");
        stringBuffer.append(this.f136603d);
        stringBuffer.append("\r\nCmdId:");
        stringBuffer.append(this.f136604e);
        stringBuffer.append("\r\nOpSucceed:");
        stringBuffer.append(this.f136605f);
        stringBuffer.append("\r\nResultList:");
        stringBuffer.append(this.f136606g);
        stringBuffer.append("\r\nOpAsyncDelay:");
        stringBuffer.append(this.f136607h);
        stringBuffer.append("\r\nFromScene:");
        stringBuffer.append(this.f136608i);
        stringBuffer.append("\r\nOpQueueLength:");
        stringBuffer.append(this.f136609j);
        return stringBuffer.toString();
    }
}
