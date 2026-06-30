package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SystemAutorizationPopupWindowStruct */
/* loaded from: classes15.dex */
public final class C6951xed44ba41 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f142556d;

    /* renamed from: e, reason: collision with root package name */
    public long f142557e;

    /* renamed from: f, reason: collision with root package name */
    public long f142558f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142559g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142560h = "";

    @Override // jx3.a
    public int g() {
        return 24958;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142556d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142557e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142558f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142559g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142560h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f142556d);
        stringBuffer.append("\r\nPopupPrivacyType:");
        stringBuffer.append(this.f142557e);
        stringBuffer.append("\r\nPopupBiz:");
        stringBuffer.append(this.f142558f);
        stringBuffer.append("\r\nDeviceID:");
        stringBuffer.append(this.f142559g);
        stringBuffer.append("\r\nCurrentPrivacyFullStatus:");
        stringBuffer.append(this.f142560h);
        return stringBuffer.toString();
    }
}
