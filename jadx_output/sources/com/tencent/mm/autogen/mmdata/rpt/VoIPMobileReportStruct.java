package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes14.dex */
public final class VoIPMobileReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f61639d;

    /* renamed from: f, reason: collision with root package name */
    public int f61641f;

    /* renamed from: g, reason: collision with root package name */
    public int f61642g;

    /* renamed from: h, reason: collision with root package name */
    public int f61643h;

    /* renamed from: i, reason: collision with root package name */
    public int f61644i;

    /* renamed from: j, reason: collision with root package name */
    public int f61645j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61640e = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f61646k = "";

    @Override // jx3.a
    public int g() {
        return 30377;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61639d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61640e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61641f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61642g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61643h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61644i);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f61645j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61646k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SDKMode:");
        stringBuffer.append(this.f61639d);
        stringBuffer.append("\r\nRoomUin:");
        stringBuffer.append(this.f61640e);
        stringBuffer.append("\r\nRoomType:");
        stringBuffer.append(this.f61641f);
        stringBuffer.append("\r\nRoomRole:");
        stringBuffer.append(this.f61642g);
        stringBuffer.append("\r\nRoomState:");
        stringBuffer.append(this.f61643h);
        stringBuffer.append("\r\nState:");
        stringBuffer.append(this.f61644i);
        stringBuffer.append("\r\nError:0\r\nExtension1:");
        stringBuffer.append(this.f61645j);
        stringBuffer.append("\r\nExtension2:");
        stringBuffer.append(this.f61646k);
        return stringBuffer.toString();
    }
}
