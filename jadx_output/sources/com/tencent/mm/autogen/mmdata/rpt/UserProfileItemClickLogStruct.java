package com.tencent.mm.autogen.mmdata.rpt;

/* loaded from: classes11.dex */
public final class UserProfileItemClickLogStruct extends jx3.a {

    /* renamed from: j, reason: collision with root package name */
    public long f61535j;

    /* renamed from: k, reason: collision with root package name */
    public long f61536k;

    /* renamed from: l, reason: collision with root package name */
    public long f61537l;

    /* renamed from: m, reason: collision with root package name */
    public long f61538m;

    /* renamed from: n, reason: collision with root package name */
    public long f61539n;

    /* renamed from: d, reason: collision with root package name */
    public long f61529d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f61530e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f61531f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f61532g = "";

    /* renamed from: h, reason: collision with root package name */
    public final int f61533h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f61534i = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f61540o = "";

    @Override // jx3.a
    public int g() {
        return 16055;
    }

    @Override // jx3.a
    public java.lang.String m() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(this.f61529d);
        stringBuffer.append(",");
        stringBuffer.append(this.f61530e);
        stringBuffer.append(",");
        stringBuffer.append(this.f61531f);
        stringBuffer.append(",");
        stringBuffer.append(this.f61532g);
        stringBuffer.append(",");
        stringBuffer.append(this.f61533h);
        stringBuffer.append(",");
        stringBuffer.append(this.f61534i);
        stringBuffer.append(",");
        stringBuffer.append(this.f61535j);
        stringBuffer.append(",");
        stringBuffer.append(this.f61536k);
        stringBuffer.append(",");
        stringBuffer.append(this.f61537l);
        stringBuffer.append(",");
        stringBuffer.append(this.f61538m);
        stringBuffer.append(",");
        stringBuffer.append(this.f61539n);
        stringBuffer.append(",");
        stringBuffer.append(this.f61540o);
        java.lang.String stringBuffer2 = stringBuffer.toString();
        a(stringBuffer2);
        return stringBuffer2;
    }

    @Override // jx3.a
    public java.lang.String n() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Source:");
        stringBuffer.append(this.f61529d);
        stringBuffer.append("\r\nClickedType:");
        stringBuffer.append(this.f61530e);
        stringBuffer.append("\r\nOpResult:");
        stringBuffer.append(this.f61531f);
        stringBuffer.append("\r\nusername:");
        stringBuffer.append(this.f61532g);
        stringBuffer.append("\r\nSessionID:");
        stringBuffer.append(this.f61533h);
        stringBuffer.append("\r\nTextStatusID:");
        stringBuffer.append(this.f61534i);
        stringBuffer.append("\r\nSubSource:");
        stringBuffer.append(this.f61535j);
        stringBuffer.append("\r\nHasSns:");
        stringBuffer.append(this.f61536k);
        stringBuffer.append("\r\nHasFinder:");
        stringBuffer.append(this.f61537l);
        stringBuffer.append("\r\nHasSignature:");
        stringBuffer.append(this.f61538m);
        stringBuffer.append("\r\nToUserGender:");
        stringBuffer.append(this.f61539n);
        stringBuffer.append("\r\nExtraSourceInfo:");
        stringBuffer.append(this.f61540o);
        return stringBuffer.toString();
    }
}
