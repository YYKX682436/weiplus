package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes5.dex */
public final class InputChangeLineStruct extends jx3.a {

    /* renamed from: h, reason: collision with root package name */
    public long f58502h;

    /* renamed from: j, reason: collision with root package name */
    public long f58504j;

    /* renamed from: k, reason: collision with root package name */
    public long f58505k;

    /* renamed from: l, reason: collision with root package name */
    public long f58506l;

    /* renamed from: d, reason: collision with root package name */
    public long f58498d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f58499e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f58500f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f58501g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f58503i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f58507m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f58508n = 0;

    @Override // jx3.a
    public int g() {
        return 16112;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f58498d);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58499e);
        stringBuffer.append(",0,");
        stringBuffer.append(this.f58500f);
        stringBuffer.append(",");
        stringBuffer.append(this.f58501g);
        stringBuffer.append(",");
        stringBuffer.append(this.f58502h);
        stringBuffer.append(",");
        stringBuffer.append(this.f58503i);
        stringBuffer.append(",");
        stringBuffer.append(this.f58504j);
        stringBuffer.append(",");
        stringBuffer.append(this.f58505k);
        stringBuffer.append(",");
        stringBuffer.append(this.f58506l);
        stringBuffer.append(",");
        stringBuffer.append(this.f58507m);
        stringBuffer.append(",");
        stringBuffer.append(this.f58508n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("scene:");
        stringBuffer.append(this.f58498d);
        stringBuffer.append("\r\nsubScene:0\r\nhasText:");
        stringBuffer.append(this.f58499e);
        stringBuffer.append("\r\nsubSceneNote:0\r\nbuttonType:");
        stringBuffer.append(this.f58500f);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f58501g);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f58502h);
        stringBuffer.append("\r\nMenuList:");
        stringBuffer.append(this.f58503i);
        stringBuffer.append("\r\nPasteType:");
        stringBuffer.append(this.f58504j);
        stringBuffer.append("\r\nisKeyboardPopup:");
        stringBuffer.append(this.f58505k);
        stringBuffer.append("\r\nPasteTextLength:");
        stringBuffer.append(this.f58506l);
        stringBuffer.append("\r\nChatSessionId:");
        stringBuffer.append(this.f58507m);
        stringBuffer.append("\r\nActionTimeStamp:");
        stringBuffer.append(this.f58508n);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct p(java.lang.String str) {
        this.f58507m = b("ChatSessionId", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.InputChangeLineStruct q(java.lang.String str) {
        this.f58501g = b(dm.i4.COL_USERNAME, str, true);
        return this;
    }
}
