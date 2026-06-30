package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.FinderCommentResourceLoadingStruct */
/* loaded from: classes10.dex */
public final class C6478x668bc50a extends jx3.a {

    /* renamed from: f, reason: collision with root package name */
    public long f138219f;

    /* renamed from: g, reason: collision with root package name */
    public long f138220g;

    /* renamed from: h, reason: collision with root package name */
    public long f138221h;

    /* renamed from: j, reason: collision with root package name */
    public long f138223j;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f138217d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f138218e = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f138222i = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f138224k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f138225l = "";

    @Override // jx3.a
    public int g() {
        return 33864;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f138217d);
        stringBuffer.append(",");
        stringBuffer.append(this.f138218e);
        stringBuffer.append(",");
        stringBuffer.append(this.f138219f);
        stringBuffer.append(",");
        stringBuffer.append(this.f138220g);
        stringBuffer.append(",");
        stringBuffer.append(this.f138221h);
        stringBuffer.append(",");
        stringBuffer.append(this.f138222i);
        stringBuffer.append(",");
        stringBuffer.append(this.f138223j);
        stringBuffer.append(",");
        stringBuffer.append(this.f138224k);
        stringBuffer.append(",");
        stringBuffer.append(this.f138225l);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FeedId:");
        stringBuffer.append(this.f138217d);
        stringBuffer.append("\r\nCommentId:");
        stringBuffer.append(this.f138218e);
        stringBuffer.append("\r\nContentType:");
        stringBuffer.append(this.f138219f);
        stringBuffer.append("\r\nLoadFail:");
        stringBuffer.append(this.f138220g);
        stringBuffer.append("\r\nLoadTimeMs:");
        stringBuffer.append(this.f138221h);
        stringBuffer.append("\r\nUrl:");
        stringBuffer.append(this.f138222i);
        stringBuffer.append("\r\nIsThumbUrl:");
        stringBuffer.append(this.f138223j);
        stringBuffer.append("\r\nEmoticonMd5:");
        stringBuffer.append(this.f138224k);
        stringBuffer.append("\r\nToken:");
        stringBuffer.append(this.f138225l);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a p(java.lang.String str) {
        this.f138218e = b("CommentId", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6478x668bc50a q(java.lang.String str) {
        this.f138217d = b("FeedId", str, true);
        return this;
    }
}
