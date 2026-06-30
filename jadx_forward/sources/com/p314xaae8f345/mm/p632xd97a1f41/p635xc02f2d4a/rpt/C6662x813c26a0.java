package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct */
/* loaded from: classes12.dex */
public final class C6662x813c26a0 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f140076d;

    /* renamed from: e, reason: collision with root package name */
    public long f140077e;

    /* renamed from: g, reason: collision with root package name */
    public long f140079g;

    /* renamed from: h, reason: collision with root package name */
    public long f140080h;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140078f = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140081i = "";

    @Override // jx3.a
    public int g() {
        return 29105;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140076d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140077e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140078f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140079g);
        stringBuffer.append(",");
        stringBuffer.append(this.f140080h);
        stringBuffer.append(",");
        stringBuffer.append(this.f140081i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f140076d);
        stringBuffer.append("\r\npageType:");
        stringBuffer.append(this.f140077e);
        stringBuffer.append("\r\nquery:");
        stringBuffer.append(this.f140078f);
        stringBuffer.append("\r\nresCount:");
        stringBuffer.append(this.f140079g);
        stringBuffer.append("\r\nmatchType:");
        stringBuffer.append(this.f140080h);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f140081i);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 p(java.lang.String str) {
        this.f140078f = b("query", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 q(java.lang.String str) {
        this.f140081i = b("sessionid", str, true);
        return this;
    }
}
