package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes2.dex */
public final class FinderFoldFeedExposeStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f56890d;

    /* renamed from: j, reason: collision with root package name */
    public long f56896j;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f56891e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f56892f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f56893g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f56894h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f56895i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f56897k = "";

    @Override // jx3.a
    public int g() {
        return 20027;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f56890d);
        stringBuffer.append(",");
        stringBuffer.append(this.f56891e);
        stringBuffer.append(",");
        stringBuffer.append(this.f56892f);
        stringBuffer.append(",");
        stringBuffer.append(this.f56893g);
        stringBuffer.append(",");
        stringBuffer.append(this.f56894h);
        stringBuffer.append(",");
        stringBuffer.append(this.f56895i);
        stringBuffer.append(",");
        stringBuffer.append(this.f56896j);
        stringBuffer.append(",");
        stringBuffer.append(this.f56897k);
        stringBuffer.append(",0,0");
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("CommentScene:");
        stringBuffer.append(this.f56890d);
        stringBuffer.append("\r\nSessionid:");
        stringBuffer.append(this.f56891e);
        stringBuffer.append("\r\nContextid:");
        stringBuffer.append(this.f56892f);
        stringBuffer.append("\r\nClickTabContextid:");
        stringBuffer.append(this.f56893g);
        stringBuffer.append("\r\nFeedId:");
        stringBuffer.append(this.f56894h);
        stringBuffer.append("\r\nFlodUsername:");
        stringBuffer.append(this.f56895i);
        stringBuffer.append("\r\nFlodFeedCnt:");
        stringBuffer.append(this.f56896j);
        stringBuffer.append("\r\nAllFlodFeedItems:");
        stringBuffer.append(this.f56897k);
        stringBuffer.append("\r\nMoreTabClickTimestamp:0\r\nTopTabClickTimestamp:0");
        return stringBuffer.toString();
    }
}
