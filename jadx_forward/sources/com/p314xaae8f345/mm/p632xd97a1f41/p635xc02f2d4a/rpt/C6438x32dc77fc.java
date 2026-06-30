package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavCacheStruct */
/* loaded from: classes8.dex */
public final class C6438x32dc77fc extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137772d;

    /* renamed from: e, reason: collision with root package name */
    public long f137773e;

    /* renamed from: f, reason: collision with root package name */
    public long f137774f;

    /* renamed from: g, reason: collision with root package name */
    public long f137775g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f137776h = 0;

    @Override // jx3.a
    public int g() {
        return 18053;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137772d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137773e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137774f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137775g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137776h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("favid:");
        stringBuffer.append(this.f137772d);
        stringBuffer.append("\r\nfavsize:");
        stringBuffer.append(this.f137773e);
        stringBuffer.append("\r\ncachecnt:");
        stringBuffer.append(this.f137774f);
        stringBuffer.append("\r\ncachelsize:");
        stringBuffer.append(this.f137775g);
        stringBuffer.append("\r\ncachesuccess:");
        stringBuffer.append(this.f137776h);
        return stringBuffer.toString();
    }
}
