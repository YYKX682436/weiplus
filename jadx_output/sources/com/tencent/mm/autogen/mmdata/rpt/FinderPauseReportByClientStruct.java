package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderPauseReportByClientStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57474d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f57475e = "";

    /* renamed from: f, reason: collision with root package name */
    public long f57476f;

    /* renamed from: g, reason: collision with root package name */
    public long f57477g;

    /* renamed from: h, reason: collision with root package name */
    public long f57478h;

    @Override // jx3.a
    public int g() {
        return 36193;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57474d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57475e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57476f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57477g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57478h);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("feed_id:");
        stringBuffer.append(this.f57474d);
        stringBuffer.append("\r\nfinder_user_name:");
        stringBuffer.append(this.f57475e);
        stringBuffer.append("\r\npause_position:");
        stringBuffer.append(this.f57476f);
        stringBuffer.append("\r\ncomment_scene:");
        stringBuffer.append(this.f57477g);
        stringBuffer.append("\r\nenter_type:");
        stringBuffer.append(this.f57478h);
        return stringBuffer.toString();
    }
}
