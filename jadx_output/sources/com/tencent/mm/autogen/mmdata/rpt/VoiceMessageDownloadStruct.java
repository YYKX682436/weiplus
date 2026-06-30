package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class VoiceMessageDownloadStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f61689d;

    /* renamed from: f, reason: collision with root package name */
    public int f61691f;

    /* renamed from: g, reason: collision with root package name */
    public int f61692g;

    /* renamed from: h, reason: collision with root package name */
    public int f61693h;

    /* renamed from: i, reason: collision with root package name */
    public int f61694i;

    /* renamed from: l, reason: collision with root package name */
    public long f61697l;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61690e = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f61695j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f61696k = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f61698m = "";

    @Override // jx3.a
    public int g() {
        return 26956;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61689d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61690e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61691f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61692g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61693h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61694i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61695j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61696k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61697l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61698m);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("eventType:");
        stringBuffer.append(this.f61689d);
        stringBuffer.append("\r\nfileName:");
        stringBuffer.append(this.f61690e);
        stringBuffer.append("\r\nopType:");
        stringBuffer.append(this.f61691f);
        stringBuffer.append("\r\nerrorCode:");
        stringBuffer.append(this.f61692g);
        stringBuffer.append("\r\nspendTime:");
        stringBuffer.append(this.f61693h);
        stringBuffer.append("\r\nchatType:");
        stringBuffer.append(this.f61694i);
        stringBuffer.append("\r\nerrMsg:");
        stringBuffer.append(this.f61695j);
        stringBuffer.append("\r\nEventId:");
        stringBuffer.append(this.f61696k);
        stringBuffer.append("\r\nEventTime:");
        stringBuffer.append(this.f61697l);
        stringBuffer.append("\r\nEventParams:");
        stringBuffer.append(this.f61698m);
        return stringBuffer.toString();
    }
}
