package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DailyPaperExpoClickStruct */
/* loaded from: classes10.dex */
public final class C6385xcd4de298 extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f137302e;

    /* renamed from: f, reason: collision with root package name */
    public long f137303f;

    /* renamed from: j, reason: collision with root package name */
    public long f137307j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f137301d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137304g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f137305h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137306i = "";

    @Override // jx3.a
    public int g() {
        return 21559;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137301d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137302e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137303f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137304g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137305h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137306i);
        stringBuffer.append(",");
        stringBuffer.append(this.f137307j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f137301d);
        stringBuffer.append("\r\nactiontimestampms:");
        stringBuffer.append(this.f137302e);
        stringBuffer.append("\r\natcion:");
        stringBuffer.append(this.f137303f);
        stringBuffer.append("\r\nDailyPaperId:");
        stringBuffer.append(this.f137304g);
        stringBuffer.append("\r\nDailyPaperWording:");
        stringBuffer.append(this.f137305h);
        stringBuffer.append("\r\nSessionBuffer:");
        stringBuffer.append(this.f137306i);
        stringBuffer.append("\r\nTagClickable:");
        stringBuffer.append(this.f137307j);
        return stringBuffer.toString();
    }
}
