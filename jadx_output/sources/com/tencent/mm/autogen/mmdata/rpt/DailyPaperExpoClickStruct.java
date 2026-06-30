package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class DailyPaperExpoClickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f55769e;

    /* renamed from: f, reason: collision with root package name */
    public long f55770f;

    /* renamed from: j, reason: collision with root package name */
    public long f55774j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55768d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55771g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f55772h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55773i = "";

    @Override // jx3.a
    public int g() {
        return 21559;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55768d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55769e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55770f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55771g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55772h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55773i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55774j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f55768d);
        stringBuffer.append("\r\nactiontimestampms:");
        stringBuffer.append(this.f55769e);
        stringBuffer.append("\r\natcion:");
        stringBuffer.append(this.f55770f);
        stringBuffer.append("\r\nDailyPaperId:");
        stringBuffer.append(this.f55771g);
        stringBuffer.append("\r\nDailyPaperWording:");
        stringBuffer.append(this.f55772h);
        stringBuffer.append("\r\nSessionBuffer:");
        stringBuffer.append(this.f55773i);
        stringBuffer.append("\r\nTagClickable:");
        stringBuffer.append(this.f55774j);
        return stringBuffer.toString();
    }
}
