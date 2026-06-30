package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sq extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a {

    /* renamed from: a, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx f133053a;

    /* renamed from: b, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg f133054b;

    /* renamed from: c, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 f133055c;

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 f133056d;

    /* renamed from: com.tencent.mapsdk.internal.sq$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133057a;

        static {
            int[] iArr = new int[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.m99821xcee59d22().length];
            f133057a = iArr;
            try {
                iArr[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f133057a[com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6.SPARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public sq(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26073x5a789ab6 enumC26073x5a789ab6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar) {
        super(sxVar.f133091a, sxVar.f133094d);
        this.f133055c = com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778.zh;
        this.f133054b = hgVar;
        this.f133056d = enumC26073x5a789ab6;
        this.f133053a = sxVar;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a
    /* renamed from: getLogo */
    public final android.graphics.Bitmap mo36975xfb822e21(boolean z17) {
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae
    /* renamed from: getTileUrl */
    public final java.net.URL mo36931xef6e0fab(int i17, int i18, int i19) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx sxVar = this.f133053a;
        java.lang.String name = this.f133055c.name();
        java.lang.String str = sxVar.f133095e;
        int[] iArr = sxVar.f133096f;
        java.lang.String replaceFirst = (iArr.length == 0 ? str.replaceFirst("\\{range\\}", "") : str.replaceFirst("\\{range\\}", java.lang.Integer.toString(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sx.a(i17 + i18, iArr.length)))).replaceFirst("\\{z\\}", java.lang.Integer.toString(i19)).replaceFirst("\\{x\\}", java.lang.Integer.toString(i17)).replaceFirst("\\{y\\}", java.lang.Integer.toString(i18)).replaceFirst("\\{style\\}", java.lang.Integer.toString(sxVar.f133092b)).replaceFirst("\\{scene\\}", java.lang.Integer.toString(sxVar.f133093c)).replaceFirst("\\{version\\}", java.lang.Integer.toString(sxVar.f133094d)).replaceFirst("\\{ch\\}", name);
        if (replaceFirst != null) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131741i, "请求海外图瓦片：".concat(replaceFirst));
            try {
                return new java.net.URL(replaceFirst);
            } catch (java.net.MalformedURLException e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.d(android.util.Log.getStackTraceString(e17));
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26074xe626c11a
    /* renamed from: onLanguageChange */
    public final boolean mo36976x48658e7(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.EnumC26040xa3acf778 enumC26040xa3acf778) {
        this.f133055c = enumC26040xa3acf778;
        return false;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae
    /* renamed from: requestTileData */
    public final com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde mo36977x1cc30727(java.lang.String str) {
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35995x5b4bacb();
        byte[] bArr = m35995x5b4bacb != null ? m35995x5b4bacb.f16977x2eefaa : null;
        if (bArr != null && bArr.length != 0 && this.f133054b != null) {
            int i17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.sq.AnonymousClass1.f133057a[this.f133056d.ordinal()];
            if (i17 == 1) {
                this.f133054b.b().f131270a++;
            } else if (i17 == 2) {
                this.f133054b.b().f131271b++;
            }
        }
        return m35995x5b4bacb;
    }
}
