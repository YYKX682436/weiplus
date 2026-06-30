package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class BindPhoneGuidancePageReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55383d;

    /* renamed from: e, reason: collision with root package name */
    public long f55384e;

    /* renamed from: f, reason: collision with root package name */
    public long f55385f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f55386g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55387h = "";

    @Override // jx3.a
    public int g() {
        return 23947;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55383d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55384e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55385f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55386g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55387h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionType:");
        stringBuffer.append(this.f55383d);
        stringBuffer.append("\r\nPageID:");
        stringBuffer.append(this.f55384e);
        stringBuffer.append("\r\nModuleID:");
        stringBuffer.append(this.f55385f);
        stringBuffer.append("\r\nActionInfo:");
        stringBuffer.append(this.f55386g);
        stringBuffer.append("\r\nGuidanceScene:");
        stringBuffer.append(this.f55387h);
        return stringBuffer.toString();
    }
}
