package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class WCPayJSAPIPayCallbackManageStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f62104d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f62105e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f62106f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62107g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62108h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62109i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62110j = "";

    @Override // jx3.a
    public int g() {
        return 16310;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62104d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62105e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62106f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62107g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62108h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62109i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62110j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PayType:");
        stringBuffer.append(this.f62104d);
        stringBuffer.append("\r\nCallbackType:");
        stringBuffer.append(this.f62105e);
        stringBuffer.append("\r\nSourceH5Url:");
        stringBuffer.append(this.f62106f);
        stringBuffer.append("\r\nSourceAppUsername:");
        stringBuffer.append(this.f62107g);
        stringBuffer.append("\r\nSourceAppPath:");
        stringBuffer.append(this.f62108h);
        stringBuffer.append("\r\nTargetAppUsername:");
        stringBuffer.append(this.f62109i);
        stringBuffer.append("\r\nTargetAppPath:");
        stringBuffer.append(this.f62110j);
        return stringBuffer.toString();
    }
}
