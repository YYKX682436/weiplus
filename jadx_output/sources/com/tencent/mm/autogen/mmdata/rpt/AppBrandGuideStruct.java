package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class AppBrandGuideStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55149d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f55150e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f55151f;

    @Override // jx3.a
    public int g() {
        return 36468;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55149d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55150e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55151f);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("AppBrandSessionId:");
        stringBuffer.append(this.f55149d);
        stringBuffer.append("\r\nTaskBarOpenSessionId:");
        stringBuffer.append(this.f55150e);
        stringBuffer.append("\r\nGuideClientTime:");
        stringBuffer.append(this.f55151f);
        return stringBuffer.toString();
    }
}
