package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.MJPublisherEventStruct */
/* loaded from: classes5.dex */
public final class C6689x587c8cb0 extends jx3.a {

    /* renamed from: i, reason: collision with root package name */
    public int f140253i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140248d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140249e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140250f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140251g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140252h = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140254j = "";

    @Override // jx3.a
    public int g() {
        return 29694;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140248d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140249e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140250f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140251g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140252h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140253i);
        stringBuffer.append(",");
        stringBuffer.append(this.f140254j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("PublisherSessionID:");
        stringBuffer.append(this.f140248d);
        stringBuffer.append("\r\nEntryType:");
        stringBuffer.append(this.f140249e);
        stringBuffer.append("\r\nMaasSDKVersion:");
        stringBuffer.append(this.f140250f);
        stringBuffer.append("\r\nEventName:");
        stringBuffer.append(this.f140251g);
        stringBuffer.append("\r\nDetails:");
        stringBuffer.append(this.f140252h);
        stringBuffer.append("\r\nEnterScene:");
        stringBuffer.append(this.f140253i);
        stringBuffer.append("\r\nPostId:");
        stringBuffer.append(this.f140254j);
        return stringBuffer.toString();
    }
}
