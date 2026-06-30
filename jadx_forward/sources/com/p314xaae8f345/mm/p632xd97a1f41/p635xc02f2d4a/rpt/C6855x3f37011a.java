package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.SendFileWithSourceStruct */
/* loaded from: classes9.dex */
public final class C6855x3f37011a extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f141738e;

    /* renamed from: g, reason: collision with root package name */
    public long f141740g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141737d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141739f = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f141741h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f141742i = "";

    @Override // jx3.a
    public int g() {
        return 34826;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141737d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141738e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141739f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141740g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141741h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141742i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ToUsername:");
        stringBuffer.append(this.f141737d);
        stringBuffer.append("\r\nFileSize:");
        stringBuffer.append(this.f141738e);
        stringBuffer.append("\r\nFileExt:");
        stringBuffer.append(this.f141739f);
        stringBuffer.append("\r\nFileSource:");
        stringBuffer.append(this.f141740g);
        stringBuffer.append("\r\nFileId:");
        stringBuffer.append(this.f141741h);
        stringBuffer.append("\r\nMsgSvrId:");
        stringBuffer.append(this.f141742i);
        return stringBuffer.toString();
    }
}
