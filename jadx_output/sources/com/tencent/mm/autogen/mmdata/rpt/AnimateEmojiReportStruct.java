package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class AnimateEmojiReportStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f55122e;

    /* renamed from: f, reason: collision with root package name */
    public int f55123f;

    /* renamed from: g, reason: collision with root package name */
    public int f55124g;

    /* renamed from: h, reason: collision with root package name */
    public int f55125h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55121d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55126i = "";

    @Override // jx3.a
    public int g() {
        return 22146;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55121d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55122e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55123f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55124g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55125h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55126i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Content:");
        stringBuffer.append(this.f55121d);
        stringBuffer.append("\r\nIfPlay:");
        stringBuffer.append(this.f55122e);
        stringBuffer.append("\r\nIfPlaySuccess:");
        stringBuffer.append(this.f55123f);
        stringBuffer.append("\r\nPlayFailReason:");
        stringBuffer.append(this.f55124g);
        stringBuffer.append("\r\nRecentUse:");
        stringBuffer.append(this.f55125h);
        stringBuffer.append("\r\nChatId:");
        stringBuffer.append(this.f55126i);
        return stringBuffer.toString();
    }
}
