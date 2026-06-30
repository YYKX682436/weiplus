package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class TranslateMsgStruct extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public int f61351f;

    /* renamed from: i, reason: collision with root package name */
    public int f61354i;

    /* renamed from: j, reason: collision with root package name */
    public int f61355j;

    /* renamed from: k, reason: collision with root package name */
    public int f61356k;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f61349d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f61350e = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61352g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f61353h = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f61357l = "";

    @Override // jx3.a
    public int g() {
        return 23607;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61349d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61350e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61351f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61352g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61353h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61354i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61355j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61356k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61357l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f61349d);
        stringBuffer.append("\r\nTypeSessionId:");
        stringBuffer.append(this.f61350e);
        stringBuffer.append("\r\nActionType:");
        stringBuffer.append(this.f61351f);
        stringBuffer.append("\r\nButtonType:");
        stringBuffer.append(this.f61352g);
        stringBuffer.append("\r\nChatId:");
        stringBuffer.append(this.f61353h);
        stringBuffer.append("\r\nTypeLength:");
        stringBuffer.append(this.f61354i);
        stringBuffer.append("\r\nTransLength:");
        stringBuffer.append(this.f61355j);
        stringBuffer.append("\r\nSendLength:");
        stringBuffer.append(this.f61356k);
        stringBuffer.append("\r\nTargetLanguage:");
        stringBuffer.append(this.f61357l);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct p(java.lang.String str) {
        this.f61352g = b("ButtonType", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct q(java.lang.String str) {
        this.f61353h = b("ChatId", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.TranslateMsgStruct r(java.lang.String str) {
        this.f61350e = b("TypeSessionId", str, true);
        return this;
    }
}
