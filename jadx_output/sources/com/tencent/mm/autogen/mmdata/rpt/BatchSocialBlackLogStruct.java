package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes10.dex */
public final class BatchSocialBlackLogStruct extends jx3.a {

    /* renamed from: d, reason: collision with root package name */
    public long f55372d;

    /* renamed from: e, reason: collision with root package name */
    public long f55373e;

    /* renamed from: f, reason: collision with root package name */
    public long f55374f;

    /* renamed from: h, reason: collision with root package name */
    public long f55376h;

    /* renamed from: i, reason: collision with root package name */
    public long f55377i;

    /* renamed from: j, reason: collision with root package name */
    public long f55378j;

    /* renamed from: m, reason: collision with root package name */
    public long f55381m;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f55375g = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f55379k = "";

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f55380l = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f55382n = "";

    @Override // jx3.a
    public int g() {
        return 19824;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55372d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55373e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55374f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55375g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55376h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55377i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55378j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55379k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55380l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55381m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55382n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("actioncode:");
        stringBuffer.append(this.f55372d);
        stringBuffer.append("\r\nselectfriendnum:");
        stringBuffer.append(this.f55373e);
        stringBuffer.append("\r\nmodifiedsucfriendnum:");
        stringBuffer.append(this.f55374f);
        stringBuffer.append("\r\nmodifiedsucfriendlist:");
        stringBuffer.append(this.f55375g);
        stringBuffer.append("\r\nbeforsocialblackfriendnum:");
        stringBuffer.append(this.f55376h);
        stringBuffer.append("\r\naftersocialblackfriendnum:");
        stringBuffer.append(this.f55377i);
        stringBuffer.append("\r\nactionnum:");
        stringBuffer.append(this.f55378j);
        stringBuffer.append("\r\nselecttagname:");
        stringBuffer.append(this.f55379k);
        stringBuffer.append("\r\nselecttagid:");
        stringBuffer.append(this.f55380l);
        stringBuffer.append("\r\nstaytime:");
        stringBuffer.append(this.f55381m);
        stringBuffer.append("\r\nsessionid:");
        stringBuffer.append(this.f55382n);
        return stringBuffer.toString();
    }
}
