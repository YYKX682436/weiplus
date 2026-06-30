package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes12.dex */
public final class CheckContactStruct extends jx3.a {

    /* renamed from: e, reason: collision with root package name */
    public int f55671e;

    /* renamed from: f, reason: collision with root package name */
    public long f55672f;

    /* renamed from: g, reason: collision with root package name */
    public long f55673g;

    /* renamed from: h, reason: collision with root package name */
    public long f55674h;

    /* renamed from: j, reason: collision with root package name */
    public long f55676j;

    /* renamed from: k, reason: collision with root package name */
    public long f55677k;

    /* renamed from: l, reason: collision with root package name */
    public int f55678l;

    /* renamed from: m, reason: collision with root package name */
    public long f55679m;

    /* renamed from: n, reason: collision with root package name */
    public long f55680n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f55670d = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f55675i = "";

    @Override // jx3.a
    public int g() {
        return 36552;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f55670d);
        stringBuffer.append(",");
        stringBuffer.append(this.f55671e);
        stringBuffer.append(",");
        stringBuffer.append(this.f55672f);
        stringBuffer.append(",");
        stringBuffer.append(this.f55673g);
        stringBuffer.append(",");
        stringBuffer.append(this.f55674h);
        stringBuffer.append(",");
        stringBuffer.append(this.f55675i);
        stringBuffer.append(",");
        stringBuffer.append(this.f55676j);
        stringBuffer.append(",");
        stringBuffer.append(this.f55677k);
        stringBuffer.append(",");
        stringBuffer.append(this.f55678l);
        stringBuffer.append(",");
        stringBuffer.append(this.f55679m);
        stringBuffer.append(",");
        stringBuffer.append(this.f55680n);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("reversion:");
        stringBuffer.append(this.f55670d);
        stringBuffer.append("\r\ninnerVersion:");
        stringBuffer.append(this.f55671e);
        stringBuffer.append("\r\nisComplete:");
        stringBuffer.append(this.f55672f);
        stringBuffer.append("\r\nmissingUserNames:");
        stringBuffer.append(this.f55673g);
        stringBuffer.append("\r\nlocalNotContainUserNames:");
        stringBuffer.append(this.f55674h);
        stringBuffer.append("\r\nmissingNamesStr:");
        stringBuffer.append(this.f55675i);
        stringBuffer.append("\r\ncost:");
        stringBuffer.append(this.f55676j);
        stringBuffer.append("\r\ncontactChangeCntDuringCheck:");
        stringBuffer.append(this.f55677k);
        stringBuffer.append("\r\ninitVersion:");
        stringBuffer.append(this.f55678l);
        stringBuffer.append("\r\ntotalUsernameSize:");
        stringBuffer.append(this.f55679m);
        stringBuffer.append("\r\nisRecoverEnable:");
        stringBuffer.append(this.f55680n);
        return stringBuffer.toString();
    }
}
