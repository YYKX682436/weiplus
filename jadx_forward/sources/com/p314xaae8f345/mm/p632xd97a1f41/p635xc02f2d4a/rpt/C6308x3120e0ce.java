package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.AnimateEmojiReportStruct */
/* loaded from: classes15.dex */
public final class C6308x3120e0ce extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f136655e;

    /* renamed from: f, reason: collision with root package name */
    public int f136656f;

    /* renamed from: g, reason: collision with root package name */
    public int f136657g;

    /* renamed from: h, reason: collision with root package name */
    public int f136658h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f136654d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136659i = "";

    @Override // jx3.a
    public int g() {
        return 22146;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f136654d);
        stringBuffer.append(",");
        stringBuffer.append(this.f136655e);
        stringBuffer.append(",");
        stringBuffer.append(this.f136656f);
        stringBuffer.append(",");
        stringBuffer.append(this.f136657g);
        stringBuffer.append(",");
        stringBuffer.append(this.f136658h);
        stringBuffer.append(",");
        stringBuffer.append(this.f136659i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Content:");
        stringBuffer.append(this.f136654d);
        stringBuffer.append("\r\nIfPlay:");
        stringBuffer.append(this.f136655e);
        stringBuffer.append("\r\nIfPlaySuccess:");
        stringBuffer.append(this.f136656f);
        stringBuffer.append("\r\nPlayFailReason:");
        stringBuffer.append(this.f136657g);
        stringBuffer.append("\r\nRecentUse:");
        stringBuffer.append(this.f136658h);
        stringBuffer.append("\r\nChatId:");
        stringBuffer.append(this.f136659i);
        return stringBuffer.toString();
    }
}
