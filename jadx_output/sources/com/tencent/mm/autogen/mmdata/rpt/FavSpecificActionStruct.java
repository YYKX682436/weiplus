package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class FavSpecificActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56307d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f56308e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f56309f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f56310g;

    @Override // jx3.a
    public int g() {
        return 27536;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56307d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56308e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56309f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56310g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Action:");
        stringBuffer.append(this.f56307d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f56308e);
        stringBuffer.append("\r\nSubType:");
        stringBuffer.append(this.f56309f);
        stringBuffer.append("\r\nFavId:");
        stringBuffer.append(this.f56310g);
        return stringBuffer.toString();
    }
}
