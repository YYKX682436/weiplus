package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct */
/* loaded from: classes5.dex */
public final class C6980x787b3d28 extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f142884f;

    /* renamed from: i, reason: collision with root package name */
    public int f142887i;

    /* renamed from: j, reason: collision with root package name */
    public int f142888j;

    /* renamed from: k, reason: collision with root package name */
    public int f142889k;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f142882d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f142883e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f142885g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142886h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f142890l = "";

    @Override // jx3.a
    public int g() {
        return 23607;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f142882d);
        stringBuffer.append(",");
        stringBuffer.append(this.f142883e);
        stringBuffer.append(",");
        stringBuffer.append(this.f142884f);
        stringBuffer.append(",");
        stringBuffer.append(this.f142885g);
        stringBuffer.append(",");
        stringBuffer.append(this.f142886h);
        stringBuffer.append(",");
        stringBuffer.append(this.f142887i);
        stringBuffer.append(",");
        stringBuffer.append(this.f142888j);
        stringBuffer.append(",");
        stringBuffer.append(this.f142889k);
        stringBuffer.append(",");
        stringBuffer.append(this.f142890l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f142882d);
        stringBuffer.append("\r\nTypeSessionId:");
        stringBuffer.append(this.f142883e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f142884f);
        stringBuffer.append("\r\nButtonType:");
        stringBuffer.append(this.f142885g);
        stringBuffer.append("\r\nChatId:");
        stringBuffer.append(this.f142886h);
        stringBuffer.append("\r\nTypeLength:");
        stringBuffer.append(this.f142887i);
        stringBuffer.append("\r\nTransLength:");
        stringBuffer.append(this.f142888j);
        stringBuffer.append("\r\nSendLength:");
        stringBuffer.append(this.f142889k);
        stringBuffer.append("\r\nTargetLanguage:");
        stringBuffer.append(this.f142890l);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 p(java.lang.String str) {
        this.f142885g = b("ButtonType", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 q(java.lang.String str) {
        this.f142886h = b("ChatId", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 r(java.lang.String str) {
        this.f142883e = b("TypeSessionId", str, true);
        return this;
    }
}
