package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class StatusAffDBTecLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f60857d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f60858e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f60859f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f60860g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f60861h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f60862i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f60863j = 0;

    @Override // jx3.a
    public int g() {
        return 31845;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60857d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60858e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60859f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60860g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60861h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60862i);
        stringBuffer.append(",");
        stringBuffer.append(this.f60863j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f60857d);
        stringBuffer.append("\r\nTaskType:");
        stringBuffer.append(this.f60858e);
        stringBuffer.append("\r\nTaskRetryNum:");
        stringBuffer.append(this.f60859f);
        stringBuffer.append("\r\nTaskId:");
        stringBuffer.append(this.f60860g);
        stringBuffer.append("\r\nTaskUseTimeMs:");
        stringBuffer.append(this.f60861h);
        stringBuffer.append("\r\nOldDBNum:");
        stringBuffer.append(this.f60862i);
        stringBuffer.append("\r\nTransferDBNum:");
        stringBuffer.append(this.f60863j);
        return stringBuffer.toString();
    }
}
