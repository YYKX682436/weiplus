package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes15.dex */
public final class RelatedEmoticonActionStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f59953d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f59954e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f59955f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f59956g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f59957h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f59958i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f59959j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f59960k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f59961l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f59962m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f59963n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f59964o = "";

    @Override // jx3.a
    public int g() {
        return 18739;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f59953d);
        stringBuffer.append(",");
        stringBuffer.append(this.f59954e);
        stringBuffer.append(",");
        stringBuffer.append(this.f59955f);
        stringBuffer.append(",");
        stringBuffer.append(this.f59956g);
        stringBuffer.append(",");
        stringBuffer.append(this.f59957h);
        stringBuffer.append(",");
        stringBuffer.append(this.f59958i);
        stringBuffer.append(",");
        stringBuffer.append(this.f59959j);
        stringBuffer.append(",");
        stringBuffer.append(this.f59960k);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f59961l);
        stringBuffer.append(",");
        stringBuffer.append(this.f59962m);
        stringBuffer.append(",");
        stringBuffer.append(this.f59963n);
        stringBuffer.append(",");
        stringBuffer.append(this.f59964o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f59953d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f59954e);
        stringBuffer.append("\r\nSourcePid:");
        stringBuffer.append(this.f59955f);
        stringBuffer.append("\r\nSourceMd5:");
        stringBuffer.append(this.f59956g);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f59957h);
        stringBuffer.append("\r\nMd5:");
        stringBuffer.append(this.f59958i);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f59959j);
        stringBuffer.append("\r\nMaxRowCount:");
        stringBuffer.append(this.f59960k);
        stringBuffer.append("\r\nIsFree:0\r\nType:0\r\nIsLocal:0\r\nIsFree2:");
        stringBuffer.append(this.f59961l);
        stringBuffer.append("\r\nType2:");
        stringBuffer.append(this.f59962m);
        stringBuffer.append("\r\nIsLocal2:");
        stringBuffer.append(this.f59963n);
        stringBuffer.append("\r\nChatID:");
        stringBuffer.append(this.f59964o);
        return stringBuffer.toString();
    }

    public com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct p(java.lang.String str) {
        this.f59964o = b("ChatID", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct q(java.lang.String str) {
        this.f59956g = b("SourceMd5", str, true);
        return this;
    }

    public com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct r(java.lang.String str) {
        this.f59955f = b("SourcePid", str, true);
        return this;
    }
}
