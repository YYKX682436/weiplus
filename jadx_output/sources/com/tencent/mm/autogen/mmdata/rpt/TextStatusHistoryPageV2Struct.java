package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class TextStatusHistoryPageV2Struct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f61204d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61205e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f61206f;

    /* renamed from: g, reason: collision with root package name */
    public long f61207g;

    @Override // jx3.a
    public int g() {
        return 25117;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61204d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61205e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61206f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61207g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f61204d);
        stringBuffer.append("\r\nSceneSessionID:");
        stringBuffer.append(this.f61205e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f61206f);
        stringBuffer.append("\r\nSceneStaytime:");
        stringBuffer.append(this.f61207g);
        return stringBuffer.toString();
    }
}
