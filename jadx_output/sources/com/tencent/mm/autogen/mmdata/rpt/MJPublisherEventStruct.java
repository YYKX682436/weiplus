package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class MJPublisherEventStruct extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public int f58720i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f58715d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f58716e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f58717f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58718g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58719h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58721j = "";

    @Override // jx3.a
    public int g() {
        return 29694;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58715d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58716e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58717f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58718g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58719h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58720i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58721j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublisherSessionID:");
        stringBuffer.append(this.f58715d);
        stringBuffer.append("\r\nEntryType:");
        stringBuffer.append(this.f58716e);
        stringBuffer.append("\r\nMaasSDKVersion:");
        stringBuffer.append(this.f58717f);
        stringBuffer.append("\r\nEventName:");
        stringBuffer.append(this.f58718g);
        stringBuffer.append("\r\nDetails:");
        stringBuffer.append(this.f58719h);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f58720i);
        stringBuffer.append("\r\nPostId:");
        stringBuffer.append(this.f58721j);
        return stringBuffer.toString();
    }
}
