package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderBrowsePatMusicIconStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f56576d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f56577e;

    /* renamed from: f, reason: collision with root package name */
    public long f56578f;

    /* renamed from: g, reason: collision with root package name */
    public long f56579g;

    @Override // jx3.a
    public int g() {
        return 21345;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56576d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56577e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56578f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56579g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Feedid:");
        stringBuffer.append(this.f56576d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f56577e);
        stringBuffer.append("\r\nScene:");
        stringBuffer.append(this.f56578f);
        stringBuffer.append("\r\nFollowcount:");
        stringBuffer.append(this.f56579g);
        return stringBuffer.toString();
    }
}
