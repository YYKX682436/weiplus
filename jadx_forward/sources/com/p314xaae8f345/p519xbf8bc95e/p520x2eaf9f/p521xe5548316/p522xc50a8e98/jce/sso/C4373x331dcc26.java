package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.sso.Package */
/* loaded from: classes13.dex */
public final class C4373x331dcc26 extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static int f130232a = 0;

    /* renamed from: b, reason: collision with root package name */
    static byte[] f130233b = null;

    /* renamed from: c, reason: collision with root package name */
    static byte[] f130234c = null;

    /* renamed from: d, reason: collision with root package name */
    static java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag> f130235d = null;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ boolean f130236e = true;

    /* renamed from: busiBuff */
    public byte[] f17275xbb90f9dc;

    /* renamed from: cEncodeType */
    public byte f17276xede84333;

    /* renamed from: eCmd */
    public int f17277x2ef295;

    /* renamed from: head */
    public byte[] f17278x30cde0;

    /* renamed from: iSeqNo */
    public int f17279xb7ee1397;

    /* renamed from: sAppId */
    public java.lang.String f17280xc805de69;

    /* renamed from: shVer */
    public short f17281x685250e;

    /* renamed from: strSubCmd */
    public java.lang.String f17282xcf8d246b;
    public java.lang.String uin;

    /* renamed from: vTag */
    public java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag> f17283x36eb44;

    public C4373x331dcc26() {
        this.f17281x685250e = (short) 0;
        this.f17277x2ef295 = 0;
        this.f17282xcf8d246b = "";
        this.f17279xb7ee1397 = 0;
        this.f17276xede84333 = (byte) 0;
        this.f17280xc805de69 = "";
        this.uin = "";
        this.f17278x30cde0 = null;
        this.f17275xbb90f9dc = null;
        this.f17283x36eb44 = null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "sosomap.Package";
    }

    /* renamed from: clone */
    public final java.lang.Object m36106x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130236e) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17281x685250e, "shVer");
        kVar.a(this.f17277x2ef295, "eCmd");
        kVar.a(this.f17282xcf8d246b, "strSubCmd");
        kVar.a(this.f17279xb7ee1397, "iSeqNo");
        kVar.a(this.f17276xede84333, "cEncodeType");
        kVar.a(this.f17280xc805de69, "sAppId");
        kVar.a(this.uin, "uin");
        kVar.a(this.f17278x30cde0, "head");
        kVar.a(this.f17275xbb90f9dc, "busiBuff");
        kVar.a((java.util.Collection) this.f17283x36eb44, "vTag");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17281x685250e, true);
        kVar.a(this.f17277x2ef295, true);
        kVar.a(this.f17282xcf8d246b, true);
        kVar.a(this.f17279xb7ee1397, true);
        kVar.a(this.f17276xede84333, true);
        kVar.a(this.f17280xc805de69, true);
        kVar.a(this.uin, true);
        kVar.a(this.f17278x30cde0, true);
        kVar.a(this.f17275xbb90f9dc, true);
        kVar.a((java.util.Collection) this.f17283x36eb44, false);
    }

    /* renamed from: equals */
    public final boolean m36107xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4373x331dcc26 c4373x331dcc26 = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4373x331dcc26) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17281x685250e, c4373x331dcc26.f17281x685250e) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17277x2ef295, c4373x331dcc26.f17277x2ef295) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17282xcf8d246b, (java.lang.Object) c4373x331dcc26.f17282xcf8d246b) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17279xb7ee1397, c4373x331dcc26.f17279xb7ee1397) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17276xede84333, c4373x331dcc26.f17276xede84333) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17280xc805de69, (java.lang.Object) c4373x331dcc26.f17280xc805de69) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.uin, (java.lang.Object) c4373x331dcc26.uin) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17278x30cde0, (java.lang.Object) c4373x331dcc26.f17278x30cde0) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17275xbb90f9dc, (java.lang.Object) c4373x331dcc26.f17275xbb90f9dc) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17283x36eb44, (java.lang.Object) c4373x331dcc26.f17283x36eb44);
    }

    /* renamed from: getBusiBuff */
    public final byte[] m36108x376b3752() {
        return this.f17275xbb90f9dc;
    }

    /* renamed from: getHead */
    public final byte[] m36109xfb803656() {
        return this.f17278x30cde0;
    }

    /* renamed from: hashCode */
    public final int m36110x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17281x685250e = mVar.a(this.f17281x685250e, 0, true);
        this.f17277x2ef295 = mVar.a(this.f17277x2ef295, 1, true);
        this.f17282xcf8d246b = mVar.b(2, true);
        this.f17279xb7ee1397 = mVar.a(this.f17279xb7ee1397, 3, false);
        this.f17276xede84333 = mVar.a(this.f17276xede84333, 4, false);
        this.f17280xc805de69 = mVar.b(5, false);
        this.uin = mVar.b(6, false);
        if (f130233b == null) {
            f130233b = r0;
            byte[] bArr = {0};
        }
        this.f17278x30cde0 = mVar.c(7, false);
        if (f130234c == null) {
            f130234c = r0;
            byte[] bArr2 = {0};
        }
        this.f17275xbb90f9dc = mVar.c(8, false);
        if (f130235d == null) {
            f130235d = new java.util.ArrayList<>();
            f130235d.add(new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag());
        }
        this.f17283x36eb44 = (java.util.ArrayList) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m) f130235d, 9, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17281x685250e, 0);
        nVar.a(this.f17277x2ef295, 1);
        nVar.a(this.f17282xcf8d246b, 2);
        nVar.a(this.f17279xb7ee1397, 3);
        nVar.a(this.f17276xede84333, 4);
        java.lang.String str = this.f17280xc805de69;
        if (str != null) {
            nVar.a(str, 5);
        }
        java.lang.String str2 = this.uin;
        if (str2 != null) {
            nVar.a(str2, 6);
        }
        byte[] bArr = this.f17278x30cde0;
        if (bArr != null) {
            nVar.a(bArr, 7);
        }
        byte[] bArr2 = this.f17275xbb90f9dc;
        if (bArr2 != null) {
            nVar.a(bArr2, 8);
        }
        java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag> arrayList = this.f17283x36eb44;
        if (arrayList != null) {
            nVar.a((java.util.Collection) arrayList, 9);
        }
    }

    public C4373x331dcc26(short s17, int i17, java.lang.String str, int i18, byte b17, java.lang.String str2, java.lang.String str3, byte[] bArr, byte[] bArr2, java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.Tag> arrayList) {
        this.f17281x685250e = s17;
        this.f17277x2ef295 = i17;
        this.f17282xcf8d246b = str;
        this.f17279xb7ee1397 = i18;
        this.f17276xede84333 = b17;
        this.f17280xc805de69 = str2;
        this.uin = str3;
        this.f17278x30cde0 = bArr;
        this.f17275xbb90f9dc = bArr2;
        this.f17283x36eb44 = arrayList;
    }
}
