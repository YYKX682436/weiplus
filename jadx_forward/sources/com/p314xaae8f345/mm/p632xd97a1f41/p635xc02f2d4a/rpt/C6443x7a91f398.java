package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct */
/* loaded from: classes12.dex */
public final class C6443x7a91f398 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137840d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f137841e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f137842f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f137843g;

    @Override // jx3.a
    public int g() {
        return 27536;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137840d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137841e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137842f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137843g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f137840d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f137841e);
        stringBuffer.append("\r\nSubType:");
        stringBuffer.append(this.f137842f);
        stringBuffer.append("\r\nFavId:");
        stringBuffer.append(this.f137843g);
        return stringBuffer.toString();
    }
}
