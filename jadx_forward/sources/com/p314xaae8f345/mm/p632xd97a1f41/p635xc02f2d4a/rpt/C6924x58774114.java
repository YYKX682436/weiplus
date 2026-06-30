package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.StatusAffDBTecLogStruct */
/* loaded from: classes11.dex */
public final class C6924x58774114 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142390d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f142391e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f142392f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142393g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f142394h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f142395i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f142396j = 0;

    @Override // jx3.a
    public int g() {
        return 31845;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142390d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142391e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142392f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142393g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142394h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142395i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142396j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f142390d);
        stringBuffer.append("\r\nTaskType:");
        stringBuffer.append(this.f142391e);
        stringBuffer.append("\r\nTaskRetryNum:");
        stringBuffer.append(this.f142392f);
        stringBuffer.append("\r\nTaskId:");
        stringBuffer.append(this.f142393g);
        stringBuffer.append("\r\nTaskUseTimeMs:");
        stringBuffer.append(this.f142394h);
        stringBuffer.append("\r\nOldDBNum:");
        stringBuffer.append(this.f142395i);
        stringBuffer.append("\r\nTransferDBNum:");
        stringBuffer.append(this.f142396j);
        return stringBuffer.toString();
    }
}
