package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class FinderMsgItemClickStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public long f57422e;

    /* renamed from: f, reason: collision with root package name */
    public long f57423f;

    /* renamed from: g, reason: collision with root package name */
    public long f57424g;

    /* renamed from: i, reason: collision with root package name */
    public long f57426i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f57421d = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f57425h = "";

    @Override // jx3.a
    public int g() {
        return 19946;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f57421d);
        stringBuffer.append(",");
        stringBuffer.append(this.f57422e);
        stringBuffer.append(",");
        stringBuffer.append(this.f57423f);
        stringBuffer.append(",");
        stringBuffer.append(this.f57424g);
        stringBuffer.append(",");
        stringBuffer.append(this.f57425h);
        stringBuffer.append(",");
        stringBuffer.append(this.f57426i);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f57421d);
        stringBuffer.append("\r\nType:");
        stringBuffer.append(this.f57422e);
        stringBuffer.append("\r\nIsOverlap:");
        stringBuffer.append(this.f57423f);
        stringBuffer.append("\r\nOverlapCount:");
        stringBuffer.append(this.f57424g);
        stringBuffer.append("\r\nfeedid:");
        stringBuffer.append(this.f57425h);
        stringBuffer.append("\r\nTabType:");
        stringBuffer.append(this.f57426i);
        return stringBuffer.toString();
    }
}
