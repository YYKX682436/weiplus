package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.DiscoverNearbyEntranceStruct */
/* loaded from: classes8.dex */
public final class C6391x90478033 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f137364d;

    /* renamed from: e, reason: collision with root package name */
    public long f137365e;

    /* renamed from: h, reason: collision with root package name */
    public long f137368h;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f137366f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f137367g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f137369i = "";

    @Override // jx3.a
    public int g() {
        return 21831;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f137364d);
        stringBuffer.append(",");
        stringBuffer.append(this.f137365e);
        stringBuffer.append(",");
        stringBuffer.append(this.f137366f);
        stringBuffer.append(",");
        stringBuffer.append(this.f137367g);
        stringBuffer.append(",");
        stringBuffer.append(this.f137368h);
        stringBuffer.append(",");
        stringBuffer.append(this.f137369i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionTimestamp:");
        stringBuffer.append(this.f137364d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f137365e);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f137366f);
        stringBuffer.append("\r\nContextID:");
        stringBuffer.append(this.f137367g);
        stringBuffer.append("\r\nEntrance_Type:");
        stringBuffer.append(this.f137368h);
        stringBuffer.append("\r\nEntrance_Extra:");
        stringBuffer.append(this.f137369i);
        return stringBuffer.toString();
    }
}
