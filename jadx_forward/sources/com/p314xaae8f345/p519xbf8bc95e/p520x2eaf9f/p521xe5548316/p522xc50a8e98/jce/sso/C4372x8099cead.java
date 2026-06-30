package com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso;

/* renamed from: com.tencent.mapsdk.core.components.protocol.jce.sso.Header */
/* loaded from: classes13.dex */
public final class C4372x8099cead extends com.qq.taf.jce.AbstractC2863x16243f65 implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7 f130230a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f130231b = true;

    /* renamed from: lCurrTime */
    public long f17257xb2fd5cab;

    /* renamed from: stResult */
    public com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7 f17258x342cb5de;

    /* renamed from: strChannel */
    public java.lang.String f17259xbd8a2d92;

    /* renamed from: strFr */
    public java.lang.String f17260x68afedd;

    /* renamed from: strImei */
    public java.lang.String f17261x8fc81299;

    /* renamed from: strImsi */
    public java.lang.String f17262x8fc8144b;

    /* renamed from: strLC */
    public java.lang.String f17263x68aff68;

    /* renamed from: strMachineModel */
    public java.lang.String f17264x62c6abf3;

    /* renamed from: strMobver */
    public java.lang.String f17265xc4fc4234;

    /* renamed from: strNettp */
    public java.lang.String f17266x697d4d28;

    /* renamed from: strOfflineVersion */
    public java.lang.String f17267x6e913206;

    /* renamed from: strOsVersion */
    public java.lang.String f17268x9895c723;

    /* renamed from: strPf */
    public java.lang.String f17269x68b0007;

    /* renamed from: strSessionId */
    public java.lang.String f17270x50cf0720;

    /* renamed from: strSoftVersion */
    public java.lang.String f17271xc6946e5d;

    /* renamed from: strToken */
    public java.lang.String f17272x69d64248;

    /* renamed from: strUserNetType */
    public java.lang.String f17273xb659493b;

    /* renamed from: uAccIp */
    public long f17274xcb697613;

    public C4372x8099cead() {
        this.f17257xb2fd5cab = 0L;
        this.f17258x342cb5de = null;
        this.f17274xcb697613 = 0L;
        this.f17270x50cf0720 = "";
        this.f17263x68aff68 = "";
        this.f17272x69d64248 = "";
        this.f17260x68afedd = "";
        this.f17269x68b0007 = "";
        this.f17261x8fc81299 = "";
        this.f17265xc4fc4234 = "";
        this.f17266x697d4d28 = "";
        this.f17262x8fc8144b = "";
        this.f17268x9895c723 = "";
        this.f17271xc6946e5d = "";
        this.f17267x6e913206 = "";
        this.f17259xbd8a2d92 = "";
        this.f17264x62c6abf3 = "";
        this.f17273xb659493b = "";
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: className */
    public final java.lang.String mo36073xff691c23() {
        return "sosomap.Header";
    }

    /* renamed from: clone */
    public final java.lang.Object m36103x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f130231b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: display */
    public final void mo36080x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17257xb2fd5cab, "lCurrTime");
        kVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) this.f17258x342cb5de, "stResult");
        kVar.a(this.f17274xcb697613, "uAccIp");
        kVar.a(this.f17270x50cf0720, "strSessionId");
        kVar.a(this.f17263x68aff68, "strLC");
        kVar.a(this.f17272x69d64248, "strToken");
        kVar.a(this.f17260x68afedd, "strFr");
        kVar.a(this.f17269x68b0007, "strPf");
        kVar.a(this.f17261x8fc81299, "strImei");
        kVar.a(this.f17265xc4fc4234, "strMobver");
        kVar.a(this.f17266x697d4d28, "strNettp");
        kVar.a(this.f17262x8fc8144b, "strImsi");
        kVar.a(this.f17268x9895c723, "strOsVersion");
        kVar.a(this.f17271xc6946e5d, "strSoftVersion");
        kVar.a(this.f17267x6e913206, "strOfflineVersion");
        kVar.a(this.f17259xbd8a2d92, "strChannel");
        kVar.a(this.f17264x62c6abf3, "strMachineModel");
        kVar.a(this.f17273xb659493b, "strUserNetType");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: displaySimple */
    public final void mo36081x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k kVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.k(sb6, i17);
        kVar.a(this.f17257xb2fd5cab, true);
        kVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) this.f17258x342cb5de, true);
        kVar.a(this.f17274xcb697613, true);
        kVar.a(this.f17270x50cf0720, true);
        kVar.a(this.f17263x68aff68, true);
        kVar.a(this.f17272x69d64248, true);
        kVar.a(this.f17260x68afedd, true);
        kVar.a(this.f17269x68b0007, true);
        kVar.a(this.f17261x8fc81299, true);
        kVar.a(this.f17265xc4fc4234, true);
        kVar.a(this.f17266x697d4d28, true);
        kVar.a(this.f17262x8fc8144b, true);
        kVar.a(this.f17268x9895c723, true);
        kVar.a(this.f17271xc6946e5d, true);
        kVar.a(this.f17267x6e913206, true);
        kVar.a(this.f17259xbd8a2d92, true);
        kVar.a(this.f17264x62c6abf3, true);
        kVar.a(this.f17273xb659493b, false);
    }

    /* renamed from: equals */
    public final boolean m36104xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4372x8099cead c4372x8099cead = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4372x8099cead) obj;
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17257xb2fd5cab, c4372x8099cead.f17257xb2fd5cab) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17258x342cb5de, c4372x8099cead.f17258x342cb5de) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a(this.f17274xcb697613, c4372x8099cead.f17274xcb697613) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17270x50cf0720, (java.lang.Object) c4372x8099cead.f17270x50cf0720) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17263x68aff68, (java.lang.Object) c4372x8099cead.f17263x68aff68) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17272x69d64248, (java.lang.Object) c4372x8099cead.f17272x69d64248) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17260x68afedd, (java.lang.Object) c4372x8099cead.f17260x68afedd) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17269x68b0007, (java.lang.Object) c4372x8099cead.f17269x68b0007) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17261x8fc81299, (java.lang.Object) c4372x8099cead.f17261x8fc81299) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17265xc4fc4234, (java.lang.Object) c4372x8099cead.f17265xc4fc4234) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17266x697d4d28, (java.lang.Object) c4372x8099cead.f17266x697d4d28) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17262x8fc8144b, (java.lang.Object) c4372x8099cead.f17262x8fc8144b) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17268x9895c723, (java.lang.Object) c4372x8099cead.f17268x9895c723) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17271xc6946e5d, (java.lang.Object) c4372x8099cead.f17271xc6946e5d) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17267x6e913206, (java.lang.Object) c4372x8099cead.f17267x6e913206) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17259xbd8a2d92, (java.lang.Object) c4372x8099cead.f17259xbd8a2d92) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17264x62c6abf3, (java.lang.Object) c4372x8099cead.f17264x62c6abf3) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.q.a((java.lang.Object) this.f17273xb659493b, (java.lang.Object) c4372x8099cead.f17273xb659493b);
    }

    /* renamed from: hashCode */
    public final int m36105x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: readFrom */
    public final void mo36074xcc442a60(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar) {
        this.f17257xb2fd5cab = mVar.a(this.f17257xb2fd5cab, 0, true);
        if (f130230a == null) {
            f130230a = new com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7();
        }
        this.f17258x342cb5de = (com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7) mVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) f130230a, 1, false);
        this.f17274xcb697613 = mVar.a(this.f17274xcb697613, 2, false);
        this.f17270x50cf0720 = mVar.b(3, false);
        this.f17263x68aff68 = mVar.b(4, false);
        this.f17272x69d64248 = mVar.b(5, false);
        this.f17260x68afedd = mVar.b(6, false);
        this.f17269x68b0007 = mVar.b(7, false);
        this.f17261x8fc81299 = mVar.b(8, false);
        this.f17265xc4fc4234 = mVar.b(9, false);
        this.f17266x697d4d28 = mVar.b(10, false);
        this.f17262x8fc8144b = mVar.b(11, false);
        this.f17268x9895c723 = mVar.b(12, false);
        this.f17271xc6946e5d = mVar.b(13, false);
        this.f17267x6e913206 = mVar.b(14, false);
        this.f17259xbd8a2d92 = mVar.b(15, false);
        this.f17264x62c6abf3 = mVar.b(16, false);
        this.f17273xb659493b = mVar.b(17, false);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p
    /* renamed from: writeTo */
    public final void mo36076x5f8be6ba(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.n nVar) {
        nVar.a(this.f17257xb2fd5cab, 0);
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7 c4371x446b01d7 = this.f17258x342cb5de;
        if (c4371x446b01d7 != null) {
            nVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.p) c4371x446b01d7, 1);
        }
        nVar.a(this.f17274xcb697613, 2);
        java.lang.String str = this.f17270x50cf0720;
        if (str != null) {
            nVar.a(str, 3);
        }
        java.lang.String str2 = this.f17263x68aff68;
        if (str2 != null) {
            nVar.a(str2, 4);
        }
        java.lang.String str3 = this.f17272x69d64248;
        if (str3 != null) {
            nVar.a(str3, 5);
        }
        java.lang.String str4 = this.f17260x68afedd;
        if (str4 != null) {
            nVar.a(str4, 6);
        }
        java.lang.String str5 = this.f17269x68b0007;
        if (str5 != null) {
            nVar.a(str5, 7);
        }
        java.lang.String str6 = this.f17261x8fc81299;
        if (str6 != null) {
            nVar.a(str6, 8);
        }
        java.lang.String str7 = this.f17265xc4fc4234;
        if (str7 != null) {
            nVar.a(str7, 9);
        }
        java.lang.String str8 = this.f17266x697d4d28;
        if (str8 != null) {
            nVar.a(str8, 10);
        }
        java.lang.String str9 = this.f17262x8fc8144b;
        if (str9 != null) {
            nVar.a(str9, 11);
        }
        java.lang.String str10 = this.f17268x9895c723;
        if (str10 != null) {
            nVar.a(str10, 12);
        }
        java.lang.String str11 = this.f17271xc6946e5d;
        if (str11 != null) {
            nVar.a(str11, 13);
        }
        java.lang.String str12 = this.f17267x6e913206;
        if (str12 != null) {
            nVar.a(str12, 14);
        }
        java.lang.String str13 = this.f17259xbd8a2d92;
        if (str13 != null) {
            nVar.a(str13, 15);
        }
        java.lang.String str14 = this.f17264x62c6abf3;
        if (str14 != null) {
            nVar.a(str14, 16);
        }
        java.lang.String str15 = this.f17273xb659493b;
        if (str15 != null) {
            nVar.a(str15, 17);
        }
    }

    public C4372x8099cead(long j17, com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p521xe5548316.p522xc50a8e98.jce.sso.C4371x446b01d7 c4371x446b01d7, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15) {
        this.f17257xb2fd5cab = j17;
        this.f17258x342cb5de = c4371x446b01d7;
        this.f17274xcb697613 = j18;
        this.f17270x50cf0720 = str;
        this.f17263x68aff68 = str2;
        this.f17272x69d64248 = str3;
        this.f17260x68afedd = str4;
        this.f17269x68b0007 = str5;
        this.f17261x8fc81299 = str6;
        this.f17265xc4fc4234 = str7;
        this.f17266x697d4d28 = str8;
        this.f17262x8fc8144b = str9;
        this.f17268x9895c723 = str10;
        this.f17271xc6946e5d = str11;
        this.f17267x6e913206 = str12;
        this.f17259xbd8a2d92 = str13;
        this.f17264x62c6abf3 = str14;
        this.f17273xb659493b = str15;
    }
}
