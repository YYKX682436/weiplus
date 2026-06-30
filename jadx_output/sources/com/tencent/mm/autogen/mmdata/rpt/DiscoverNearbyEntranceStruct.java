package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class DiscoverNearbyEntranceStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55831d;

    /* renamed from: e, reason: collision with root package name */
    public long f55832e;

    /* renamed from: h, reason: collision with root package name */
    public long f55835h;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f55833f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55834g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55836i = "";

    @Override // jx3.a
    public int g() {
        return 21831;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55831d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55832e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55833f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55834g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55835h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55836i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ActionTimestamp:");
        stringBuffer.append(this.f55831d);
        stringBuffer.append("\r\naction:");
        stringBuffer.append(this.f55832e);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f55833f);
        stringBuffer.append("\r\nContextID:");
        stringBuffer.append(this.f55834g);
        stringBuffer.append("\r\nEntrance_Type:");
        stringBuffer.append(this.f55835h);
        stringBuffer.append("\r\nEntrance_Extra:");
        stringBuffer.append(this.f55836i);
        return stringBuffer.toString();
    }
}
