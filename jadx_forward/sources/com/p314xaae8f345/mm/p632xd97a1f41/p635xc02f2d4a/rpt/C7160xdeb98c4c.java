package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.import_old_account_contactsStruct */
/* loaded from: classes9.dex */
public final class C7160xdeb98c4c extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public int f144649d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f144650e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f144651f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f144652g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f144653h;

    @Override // jx3.a
    public int g() {
        return 19376;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f144649d);
        stringBuffer.append(",");
        stringBuffer.append(this.f144650e);
        stringBuffer.append(",");
        stringBuffer.append(this.f144651f);
        stringBuffer.append(",");
        stringBuffer.append(this.f144652g);
        stringBuffer.append(",");
        stringBuffer.append(this.f144653h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("action:");
        stringBuffer.append(this.f144649d);
        stringBuffer.append("\r\noldaccountusername:");
        stringBuffer.append(this.f144650e);
        stringBuffer.append("\r\nnewaccountusername:");
        stringBuffer.append(this.f144651f);
        stringBuffer.append("\r\nfriendusername:");
        stringBuffer.append(this.f144652g);
        stringBuffer.append("\r\nerrortype:");
        stringBuffer.append(this.f144653h);
        return stringBuffer.toString();
    }
}
