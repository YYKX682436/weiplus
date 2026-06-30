package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes9.dex */
public final class import_old_account_contactsStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f63116d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f63117e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f63118f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f63119g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f63120h;

    @Override // jx3.a
    public int g() {
        return 19376;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f63116d);
        stringBuffer.append(",");
        stringBuffer.append(this.f63117e);
        stringBuffer.append(",");
        stringBuffer.append(this.f63118f);
        stringBuffer.append(",");
        stringBuffer.append(this.f63119g);
        stringBuffer.append(",");
        stringBuffer.append(this.f63120h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f63116d);
        stringBuffer.append("\r\noldaccountusername:");
        stringBuffer.append(this.f63117e);
        stringBuffer.append("\r\nnewaccountusername:");
        stringBuffer.append(this.f63118f);
        stringBuffer.append("\r\nfriendusername:");
        stringBuffer.append(this.f63119g);
        stringBuffer.append("\r\nerrortype:");
        stringBuffer.append(this.f63120h);
        return stringBuffer.toString();
    }
}
