package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FavCacheStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56239d;

    /* renamed from: e, reason: collision with root package name */
    public long f56240e;

    /* renamed from: f, reason: collision with root package name */
    public long f56241f;

    /* renamed from: g, reason: collision with root package name */
    public long f56242g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f56243h = 0;

    @Override // jx3.a
    public int g() {
        return 18053;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56239d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56240e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56241f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56242g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56243h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("favid:");
        stringBuffer.append(this.f56239d);
        stringBuffer.append("\r\nfavsize:");
        stringBuffer.append(this.f56240e);
        stringBuffer.append("\r\ncachecnt:");
        stringBuffer.append(this.f56241f);
        stringBuffer.append("\r\ncachelsize:");
        stringBuffer.append(this.f56242g);
        stringBuffer.append("\r\ncachesuccess:");
        stringBuffer.append(this.f56243h);
        return stringBuffer.toString();
    }
}
