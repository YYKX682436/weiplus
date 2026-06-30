package com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt;

/* renamed from: com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct */
/* loaded from: classes15.dex */
public final class C6828xd0e163fc extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f141486d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f141487e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141488f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141489g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f141490h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f141491i = "";

    /* renamed from: j, reason: collision with root package name */
    public long f141492j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f141493k = 0;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f141494l = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f141495m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f141496n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f141497o = "";

    @Override // jx3.a
    public int g() {
        return 18739;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f141486d);
        stringBuffer.append(",");
        stringBuffer.append(this.f141487e);
        stringBuffer.append(",");
        stringBuffer.append(this.f141488f);
        stringBuffer.append(",");
        stringBuffer.append(this.f141489g);
        stringBuffer.append(",");
        stringBuffer.append(this.f141490h);
        stringBuffer.append(",");
        stringBuffer.append(this.f141491i);
        stringBuffer.append(",");
        stringBuffer.append(this.f141492j);
        stringBuffer.append(",");
        stringBuffer.append(this.f141493k);
        stringBuffer.append(",0,0,0,");
        stringBuffer.append(this.f141494l);
        stringBuffer.append(",");
        stringBuffer.append(this.f141495m);
        stringBuffer.append(",");
        stringBuffer.append(this.f141496n);
        stringBuffer.append(",");
        stringBuffer.append(this.f141497o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("SessionId:");
        stringBuffer.append(this.f141486d);
        stringBuffer.append("\r\nAction:");
        stringBuffer.append(this.f141487e);
        stringBuffer.append("\r\nSourcePid:");
        stringBuffer.append(this.f141488f);
        stringBuffer.append("\r\nSourceMd5:");
        stringBuffer.append(this.f141489g);
        stringBuffer.append("\r\nPid:");
        stringBuffer.append(this.f141490h);
        stringBuffer.append("\r\nMd5:");
        stringBuffer.append(this.f141491i);
        stringBuffer.append("\r\nIndex:");
        stringBuffer.append(this.f141492j);
        stringBuffer.append("\r\nMaxRowCount:");
        stringBuffer.append(this.f141493k);
        stringBuffer.append("\r\nIsFree:0\r\nType:0\r\nIsLocal:0\r\nIsFree2:");
        stringBuffer.append(this.f141494l);
        stringBuffer.append("\r\nType2:");
        stringBuffer.append(this.f141495m);
        stringBuffer.append("\r\nIsLocal2:");
        stringBuffer.append(this.f141496n);
        stringBuffer.append("\r\nChatID:");
        stringBuffer.append(this.f141497o);
        return stringBuffer.toString();
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc p(java.lang.String str) {
        this.f141497o = b("ChatID", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc q(java.lang.String str) {
        this.f141489g = b("SourceMd5", str, true);
        return this;
    }

    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6828xd0e163fc r(java.lang.String str) {
        this.f141488f = b("SourcePid", str, true);
        return this;
    }
}
