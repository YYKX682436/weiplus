package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderUserPageScreenshotByClientStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57968e;

    /* renamed from: f, reason: collision with root package name */
    public long f57969f;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57967d = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f57970g = "";

    @Override // jx3.a
    public int g() {
        return 36194;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57967d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57968e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57969f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57970g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("finder_user_name:");
        stringBuffer.append(this.f57967d);
        stringBuffer.append("\r\ncomment_scene:");
        stringBuffer.append(this.f57968e);
        stringBuffer.append("\r\nenter_type:");
        stringBuffer.append(this.f57969f);
        stringBuffer.append("\r\nfeedid_list:");
        stringBuffer.append(this.f57970g);
        return stringBuffer.toString();
    }
}
