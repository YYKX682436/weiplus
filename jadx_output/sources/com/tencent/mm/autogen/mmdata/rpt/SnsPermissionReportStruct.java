package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class SnsPermissionReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f60682d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f60683e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f60684f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f60685g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f60686h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f60687i = -1;

    @Override // jx3.a
    public int g() {
        return 18197;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f60682d);
        stringBuffer.append(",");
        stringBuffer.append(this.f60683e);
        stringBuffer.append(",");
        stringBuffer.append(this.f60684f);
        stringBuffer.append(",");
        stringBuffer.append(this.f60685g);
        stringBuffer.append(",");
        stringBuffer.append(this.f60686h);
        stringBuffer.append(",");
        stringBuffer.append(this.f60687i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Username:");
        stringBuffer.append(this.f60682d);
        stringBuffer.append("\r\nPublishId:");
        stringBuffer.append(this.f60683e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f60684f);
        stringBuffer.append("\r\nOnDestroyAction:");
        stringBuffer.append(this.f60685g);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f60686h);
        stringBuffer.append("\r\nStayTime:");
        stringBuffer.append(this.f60687i);
        return stringBuffer.toString();
    }
}
