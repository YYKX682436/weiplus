package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class LiveRoomPlayStatusStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f58654d;

    /* renamed from: e, reason: collision with root package name */
    public long f58655e;

    /* renamed from: f, reason: collision with root package name */
    public long f58656f;

    /* renamed from: g, reason: collision with root package name */
    public long f58657g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f58658h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58659i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f58660j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f58661k = "";

    @Override // jx3.a
    public int g() {
        return 30110;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58654d);
        stringBuffer.append(",");
        stringBuffer.append(this.f58655e);
        stringBuffer.append(",");
        stringBuffer.append(this.f58656f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58657g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58658h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58659i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58660j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58661k);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reportTime:");
        stringBuffer.append(this.f58654d);
        stringBuffer.append("\r\nplayStatus:");
        stringBuffer.append(this.f58655e);
        stringBuffer.append("\r\nplayTime:");
        stringBuffer.append(this.f58656f);
        stringBuffer.append("\r\nliveScene:");
        stringBuffer.append(this.f58657g);
        stringBuffer.append("\r\nstreamId:");
        stringBuffer.append(this.f58658h);
        stringBuffer.append("\r\nliveid:");
        stringBuffer.append(this.f58659i);
        stringBuffer.append("\r\nanchorNickname:");
        stringBuffer.append(this.f58660j);
        stringBuffer.append("\r\nplayUrl:");
        stringBuffer.append(this.f58661k);
        return stringBuffer.toString();
    }
}
