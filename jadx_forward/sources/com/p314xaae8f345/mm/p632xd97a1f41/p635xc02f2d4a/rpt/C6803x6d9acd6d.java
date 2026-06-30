package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct */
/* loaded from: classes4.dex */
public final class C6803x6d9acd6d extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141328d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141329e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f141330f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f141331g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f141332h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f141333i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f141334j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f141335k = 0;

    @Override // jx3.a
    public int g() {
        return 15855;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141328d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141329e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141330f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141331g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141332h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141333i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141334j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141335k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f141328d);
        stringBuffer.append("\r\nuserName:");
        stringBuffer.append(this.f141329e);
        stringBuffer.append("\r\nsucceedStatus:");
        stringBuffer.append(this.f141330f);
        stringBuffer.append("\r\nuserStatus:");
        stringBuffer.append(this.f141331g);
        stringBuffer.append("\r\nshowSucceedMethod:");
        stringBuffer.append(this.f141332h);
        stringBuffer.append("\r\nclickSucceedAction:");
        stringBuffer.append(this.f141333i);
        stringBuffer.append("\r\nwatchMessageRecord:");
        stringBuffer.append(this.f141334j);
        stringBuffer.append("\r\nsendMessageStatus:");
        stringBuffer.append(this.f141335k);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d p(java.lang.String str) {
        this.f141328d = b("sessionid", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6803x6d9acd6d q(java.lang.String str) {
        this.f141329e = b("userName", str, true);
        return this;
    }
}
