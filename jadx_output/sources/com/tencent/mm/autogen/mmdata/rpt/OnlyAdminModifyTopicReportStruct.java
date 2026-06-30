package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class OnlyAdminModifyTopicReportStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f59781d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f59782e;

    /* renamed from: f, reason: collision with root package name */
    public long f59783f;

    /* renamed from: g, reason: collision with root package name */
    public long f59784g;

    @Override // jx3.a
    public int g() {
        return 24874;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59781d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59782e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59783f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59784g);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("ChatName:");
        stringBuffer.append(this.f59781d);
        stringBuffer.append("\r\nRole:");
        stringBuffer.append(this.f59782e);
        stringBuffer.append("\r\nMemberCount:");
        stringBuffer.append(this.f59783f);
        stringBuffer.append("\r\nactionType:");
        stringBuffer.append(this.f59784g);
        return stringBuffer.toString();
    }
}
