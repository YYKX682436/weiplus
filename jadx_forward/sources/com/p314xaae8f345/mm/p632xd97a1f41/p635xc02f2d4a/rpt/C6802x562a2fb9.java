package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct */
/* loaded from: classes11.dex */
public final class C6802x562a2fb9 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141324d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f141325e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f141326f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f141327g = 0;

    @Override // jx3.a
    public int g() {
        return 15850;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141324d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141325e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141326f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141327g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionID:");
        stringBuffer.append(this.f141324d);
        stringBuffer.append("\r\nactionCode:");
        stringBuffer.append(this.f141325e);
        stringBuffer.append("\r\nactionCodeResult:");
        stringBuffer.append(this.f141326f);
        stringBuffer.append("\r\nclickAddContact:");
        stringBuffer.append(this.f141327g);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6802x562a2fb9 p(java.lang.String str) {
        this.f141324d = b("sessionID", str, true);
        return this;
    }
}
