package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WeAppQualityAndroidPageContainerCostStruct extends jx3.a {

    /* renamed from: g, reason: collision with root package name */
    public cm.p f62379g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62376d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62377e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62378f = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f62380h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f62381i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f62382j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f62383k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f62384l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f62385m = 0;

    @Override // jx3.a
    public int g() {
        return 16895;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62376d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62377e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62378f);
        stringBuffer.append(",");
        cm.p pVar = this.f62379g;
        stringBuffer.append(pVar != null ? pVar.f43172d : -1);
        stringBuffer.append(",");
        stringBuffer.append(this.f62380h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62381i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62382j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62383k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62384l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62385m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("InstanceId:");
        stringBuffer.append(this.f62376d);
        stringBuffer.append("\r\nAppId:");
        stringBuffer.append(this.f62377e);
        stringBuffer.append("\r\nAppVersion:");
        stringBuffer.append(this.f62378f);
        stringBuffer.append("\r\nAppState:");
        stringBuffer.append(this.f62379g);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f62380h);
        stringBuffer.append("\r\nCostTimeMs:");
        stringBuffer.append(this.f62381i);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f62382j);
        stringBuffer.append("\r\nStartTimeStampMs:");
        stringBuffer.append(this.f62383k);
        stringBuffer.append("\r\nEndTimeStampMs:");
        stringBuffer.append(this.f62384l);
        stringBuffer.append("\r\ntype:");
        stringBuffer.append(this.f62385m);
        return stringBuffer.toString();
    }
}
