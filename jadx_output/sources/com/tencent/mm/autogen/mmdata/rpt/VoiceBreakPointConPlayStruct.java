package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class VoiceBreakPointConPlayStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f61682d;

    /* renamed from: e, reason: collision with root package name */
    public long f61683e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f61684f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61685g = "";

    /* renamed from: h, reason: collision with root package name */
    public long f61686h;

    /* renamed from: i, reason: collision with root package name */
    public long f61687i;

    /* renamed from: j, reason: collision with root package name */
    public long f61688j;

    @Override // jx3.a
    public int g() {
        return 25041;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61682d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61683e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61684f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61685g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61686h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61687i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61688j);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Scene:");
        stringBuffer.append(this.f61682d);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f61683e);
        stringBuffer.append("\r\nActionResult:");
        stringBuffer.append(this.f61684f);
        stringBuffer.append("\r\nVoiceId:");
        stringBuffer.append(this.f61685g);
        stringBuffer.append("\r\nTotalTime:");
        stringBuffer.append(this.f61686h);
        stringBuffer.append("\r\nStopReason:");
        stringBuffer.append(this.f61687i);
        stringBuffer.append("\r\nPlayTime:");
        stringBuffer.append(this.f61688j);
        return stringBuffer.toString();
    }
}
