package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct */
/* loaded from: classes5.dex */
public final class C6746x43f2e743 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f140771d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f140772e;

    /* renamed from: f, reason: collision with root package name */
    public long f140773f;

    /* renamed from: g, reason: collision with root package name */
    public long f140774g;

    @Override // jx3.a
    public int g() {
        return 19818;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f140771d);
        stringBuffer.append(",");
        stringBuffer.append(this.f140772e);
        stringBuffer.append(",");
        stringBuffer.append(this.f140773f);
        stringBuffer.append(",");
        stringBuffer.append(this.f140774g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionid:");
        stringBuffer.append(this.f140771d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f140772e);
        stringBuffer.append("\r\nerrortype:");
        stringBuffer.append(this.f140773f);
        stringBuffer.append("\r\npageid:");
        stringBuffer.append(this.f140774g);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 p(java.lang.String str) {
        this.f140771d = b("sessionid", str, true);
        return this;
    }
}
