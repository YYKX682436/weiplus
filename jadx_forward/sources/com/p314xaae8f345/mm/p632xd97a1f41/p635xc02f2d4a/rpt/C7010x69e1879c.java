package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.VoiceToTextChatInterfaceStruct */
/* loaded from: classes5.dex */
public final class C7010x69e1879c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f143232d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f143233e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f143234f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f143235g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f143236h;

    @Override // jx3.a
    public int g() {
        return 28807;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f143232d);
        stringBuffer.append(",");
        stringBuffer.append(this.f143233e);
        stringBuffer.append(",");
        stringBuffer.append(this.f143234f);
        stringBuffer.append(",");
        stringBuffer.append(this.f143235g);
        stringBuffer.append(",");
        stringBuffer.append(this.f143236h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f143232d);
        stringBuffer.append("\r\ntips:");
        stringBuffer.append(this.f143233e);
        stringBuffer.append("\r\nhasreddot:");
        stringBuffer.append(this.f143234f);
        stringBuffer.append("\r\nreddottype:");
        stringBuffer.append(this.f143235g);
        stringBuffer.append("\r\nwxkbInstalled:");
        stringBuffer.append(this.f143236h);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7010x69e1879c p(java.lang.String str) {
        this.f143233e = b("tips", str, true);
        return this;
    }
}
