package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes4.dex */
public final class OpenIMSucceedContactLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59795d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f59796e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f59797f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f59798g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f59799h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f59800i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f59801j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f59802k = 0;

    @Override // jx3.a
    public int g() {
        return 15855;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59795d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59796e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59797f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59798g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59799h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59800i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59801j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59802k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f59795d);
        stringBuffer.append("\r\nuserName:");
        stringBuffer.append(this.f59796e);
        stringBuffer.append("\r\nsucceedStatus:");
        stringBuffer.append(this.f59797f);
        stringBuffer.append("\r\nuserStatus:");
        stringBuffer.append(this.f59798g);
        stringBuffer.append("\r\nshowSucceedMethod:");
        stringBuffer.append(this.f59799h);
        stringBuffer.append("\r\nclickSucceedAction:");
        stringBuffer.append(this.f59800i);
        stringBuffer.append("\r\nwatchMessageRecord:");
        stringBuffer.append(this.f59801j);
        stringBuffer.append("\r\nsendMessageStatus:");
        stringBuffer.append(this.f59802k);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct p(java.lang.String str) {
        this.f59795d = b("sessionid", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct q(java.lang.String str) {
        this.f59796e = b("userName", str, true);
        return this;
    }
}
