package l36;

/* loaded from: classes16.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Comparator f397140b = new l36.q();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f397141c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final l36.r f397142d;

    /* renamed from: e, reason: collision with root package name */
    public static final l36.r f397143e;

    /* renamed from: f, reason: collision with root package name */
    public static final l36.r f397144f;

    /* renamed from: g, reason: collision with root package name */
    public static final l36.r f397145g;

    /* renamed from: h, reason: collision with root package name */
    public static final l36.r f397146h;

    /* renamed from: i, reason: collision with root package name */
    public static final l36.r f397147i;

    /* renamed from: j, reason: collision with root package name */
    public static final l36.r f397148j;

    /* renamed from: k, reason: collision with root package name */
    public static final l36.r f397149k;

    /* renamed from: l, reason: collision with root package name */
    public static final l36.r f397150l;

    /* renamed from: m, reason: collision with root package name */
    public static final l36.r f397151m;

    /* renamed from: n, reason: collision with root package name */
    public static final l36.r f397152n;

    /* renamed from: o, reason: collision with root package name */
    public static final l36.r f397153o;

    /* renamed from: p, reason: collision with root package name */
    public static final l36.r f397154p;

    /* renamed from: q, reason: collision with root package name */
    public static final l36.r f397155q;

    /* renamed from: r, reason: collision with root package name */
    public static final l36.r f397156r;

    /* renamed from: s, reason: collision with root package name */
    public static final l36.r f397157s;

    /* renamed from: t, reason: collision with root package name */
    public static final l36.r f397158t;

    /* renamed from: u, reason: collision with root package name */
    public static final l36.r f397159u;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397160a;

    static {
        b("SSL_RSA_WITH_NULL_MD5", 1);
        b("SSL_RSA_WITH_NULL_SHA", 2);
        b("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b("SSL_RSA_WITH_RC4_128_MD5", 4);
        b("SSL_RSA_WITH_RC4_128_SHA", 5);
        b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f397142d = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b("TLS_KRB5_WITH_RC4_128_SHA", 32);
        b("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b("TLS_KRB5_WITH_RC4_128_MD5", 36);
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f397143e = b("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f397144f = b("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b("TLS_RSA_WITH_NULL_SHA256", 59);
        b("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        b("TLS_PSK_WITH_RC4_128_SHA", 138);
        b("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        b("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        b("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        b("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f397145g = b("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f397146h = b("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de);
        b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        b("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        b("TLS_DH_anon_WITH_AES_256_GCM_SHA384", com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727);
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b("TLS_FALLBACK_SCSV", 22016);
        b("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f397147i = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f397148j = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f397149k = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f397150l = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f397151m = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f397152n = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f397153o = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f397154p = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f397155q = b("TLS_AES_128_GCM_SHA256", 4865);
        f397156r = b("TLS_AES_256_GCM_SHA384", 4866);
        f397157s = b("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f397158t = b("TLS_AES_128_CCM_SHA256", 4868);
        f397159u = b("TLS_AES_256_CCM_8_SHA256", 4869);
    }

    public r(java.lang.String str) {
        str.getClass();
        this.f397160a = str;
    }

    public static synchronized l36.r a(java.lang.String str) {
        l36.r rVar;
        java.lang.String str2;
        synchronized (l36.r.class) {
            java.util.Map map = f397141c;
            rVar = (l36.r) ((java.util.LinkedHashMap) map).get(str);
            if (rVar == null) {
                if (str.startsWith("TLS_")) {
                    str2 = "SSL_" + str.substring(4);
                } else if (str.startsWith("SSL_")) {
                    str2 = "TLS_" + str.substring(4);
                } else {
                    str2 = str;
                }
                rVar = (l36.r) ((java.util.LinkedHashMap) map).get(str2);
                if (rVar == null) {
                    rVar = new l36.r(str);
                }
                map.put(str, rVar);
            }
        }
        return rVar;
    }

    public static l36.r b(java.lang.String str, int i17) {
        l36.r rVar = new l36.r(str);
        f397141c.put(str, rVar);
        return rVar;
    }

    /* renamed from: toString */
    public java.lang.String m145042x9616526c() {
        return this.f397160a;
    }
}
