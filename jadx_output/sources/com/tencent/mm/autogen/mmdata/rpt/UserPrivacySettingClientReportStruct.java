package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes.dex */
public final class UserPrivacySettingClientReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61522d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f61523e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f61524f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f61525g = "";

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f61526h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61527i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61528j = "";

    @Override // jx3.a
    public int g() {
        return 24370;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61522d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61523e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61524f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61525g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61526h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61527i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61528j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f61522d);
        stringBuffer.append("\r\nAppID:");
        stringBuffer.append(this.f61523e);
        stringBuffer.append("\r\nAppName:");
        stringBuffer.append(this.f61524f);
        stringBuffer.append("\r\nAppType:");
        stringBuffer.append(this.f61525g);
        stringBuffer.append("\r\nScopeList:");
        stringBuffer.append(this.f61526h);
        stringBuffer.append("\r\nDeviceID:");
        stringBuffer.append(this.f61527i);
        stringBuffer.append("\r\nCurrentPrivacyFullStatus:");
        stringBuffer.append(this.f61528j);
        return stringBuffer.toString();
    }
}
