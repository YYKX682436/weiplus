package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct */
/* loaded from: classes11.dex */
public final class C6799xb684c4fb extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f141314d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f141315e;

    /* renamed from: f, reason: collision with root package name */
    public long f141316f;

    /* renamed from: g, reason: collision with root package name */
    public long f141317g;

    @Override // jx3.a
    public int g() {
        return 24874;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141314d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141315e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141316f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141317g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f141314d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f141315e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f141316f);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f141317g);
        return stringBuffer.toString();
    }
}
