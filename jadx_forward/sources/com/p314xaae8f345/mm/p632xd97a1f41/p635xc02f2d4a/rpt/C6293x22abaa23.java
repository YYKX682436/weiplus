package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AccountExpiredActionStruct */
/* loaded from: classes11.dex */
public final class C6293x22abaa23 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f136548d;

    /* renamed from: e, reason: collision with root package name */
    public long f136549e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f136550f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f136551g = "";

    @Override // jx3.a
    public int g() {
        return 22500;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136548d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136549e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136550f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136551g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("errType:");
        stringBuffer.append(this.f136548d);
        stringBuffer.append("\r\nerrCode:");
        stringBuffer.append(this.f136549e);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f136550f);
        stringBuffer.append("\r\nlastKickReason:");
        stringBuffer.append(this.f136551g);
        return stringBuffer.toString();
    }
}
