package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TextStatusHistoryPageV2Struct */
/* loaded from: classes11.dex */
public final class C6965xcd1181b5 extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f142737d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142738e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f142739f;

    /* renamed from: g, reason: collision with root package name */
    public long f142740g;

    @Override // jx3.a
    public int g() {
        return 25117;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142737d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142738e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142739f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142740g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionID:");
        stringBuffer.append(this.f142737d);
        stringBuffer.append("\r\nSceneSessionID:");
        stringBuffer.append(this.f142738e);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f142739f);
        stringBuffer.append("\r\nSceneStaytime:");
        stringBuffer.append(this.f142740g);
        return stringBuffer.toString();
    }
}
