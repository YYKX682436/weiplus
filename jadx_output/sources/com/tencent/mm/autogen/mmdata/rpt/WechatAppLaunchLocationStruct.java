package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes7.dex */
public final class WechatAppLaunchLocationStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f62965d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f62966e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f62967f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f62968g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f62969h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f62970i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f62971j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f62972k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f62973l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f62974m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f62975n = 0;

    @Override // jx3.a
    public int g() {
        return 32596;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f62965d);
        stringBuffer.append(",");
        stringBuffer.append(this.f62966e);
        stringBuffer.append(",");
        stringBuffer.append(this.f62967f);
        stringBuffer.append(",");
        stringBuffer.append(this.f62968g);
        stringBuffer.append(",");
        stringBuffer.append(this.f62969h);
        stringBuffer.append(",");
        stringBuffer.append(this.f62970i);
        stringBuffer.append(",");
        stringBuffer.append(this.f62971j);
        stringBuffer.append(",");
        stringBuffer.append(this.f62972k);
        stringBuffer.append(",");
        stringBuffer.append(this.f62973l);
        stringBuffer.append(",");
        stringBuffer.append(this.f62974m);
        stringBuffer.append(",");
        stringBuffer.append(this.f62975n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f62965d);
        stringBuffer.append("\r\nappid:");
        stringBuffer.append(this.f62966e);
        stringBuffer.append("\r\nscene:");
        stringBuffer.append(this.f62967f);
        stringBuffer.append("\r\nlongitude:");
        stringBuffer.append(this.f62968g);
        stringBuffer.append("\r\nlatitude:");
        stringBuffer.append(this.f62969h);
        stringBuffer.append("\r\naccuracy:");
        stringBuffer.append(this.f62970i);
        stringBuffer.append("\r\nspeed:");
        stringBuffer.append(this.f62971j);
        stringBuffer.append("\r\naltitude:");
        stringBuffer.append(this.f62972k);
        stringBuffer.append("\r\nverticalAccuracy:");
        stringBuffer.append(this.f62973l);
        stringBuffer.append("\r\nhorizontalAccuracy:");
        stringBuffer.append(this.f62974m);
        stringBuffer.append("\r\ncacheTime:");
        stringBuffer.append(this.f62975n);
        return stringBuffer.toString();
    }
}
