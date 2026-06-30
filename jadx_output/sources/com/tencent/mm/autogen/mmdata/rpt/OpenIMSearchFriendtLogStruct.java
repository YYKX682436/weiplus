package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class OpenIMSearchFriendtLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59791d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59792e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f59793f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f59794g = 0;

    @Override // jx3.a
    public int g() {
        return 15850;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59791d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59792e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59793f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59794g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("sessionID:");
        stringBuffer.append(this.f59791d);
        stringBuffer.append("\r\nactionCode:");
        stringBuffer.append(this.f59792e);
        stringBuffer.append("\r\nactionCodeResult:");
        stringBuffer.append(this.f59793f);
        stringBuffer.append("\r\nclickAddContact:");
        stringBuffer.append(this.f59794g);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.OpenIMSearchFriendtLogStruct p(java.lang.String str) {
        this.f59791d = b("sessionID", str, true);
        return this;
    }
}
