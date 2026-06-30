package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes8.dex */
public final class FinderRedDotImageLoadFailStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57696d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57697e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f57698f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f57699g;

    @Override // jx3.a
    public int g() {
        return 35193;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57696d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57697e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57698f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57699g);
        stringBuffer.append(",0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("redDotPath:");
        stringBuffer.append(this.f57696d);
        stringBuffer.append("\r\nredDotTipsUuid:");
        stringBuffer.append(this.f57697e);
        stringBuffer.append("\r\nloadFailUrl:");
        stringBuffer.append(this.f57698f);
        stringBuffer.append("\r\ndownloadTimeConsuming:");
        stringBuffer.append(this.f57699g);
        stringBuffer.append("\r\nerrorCode:0");
        return stringBuffer.toString();
    }
}
