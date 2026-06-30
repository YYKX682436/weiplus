package com.p3249xcbb51f6b.tsm;

/* renamed from: com.tenpay.tsm.TSMException */
/* loaded from: classes5.dex */
public class C28041x16492e41 extends java.lang.Exception {

    /* renamed from: ERR_ARG_IN */
    public static final int f65620xb0d7a408 = -10012;

    /* renamed from: ERR_ILLEGAL_ARGUMENT */
    public static final int f65621xd748a940 = -10001;

    /* renamed from: ERR_INVALID_PARAMS */
    public static final int f65622x75990b28 = -6001;

    /* renamed from: ERR_JNIV2_BEGIN */
    public static final int f65623x728dffb1 = -6000;

    /* renamed from: ERR_JNIV2_C_END */
    public static final int f65624x72a7e1e7 = -6499;

    /* renamed from: ERR_JNIV2_END */
    public static final int f65625x467235e3 = -6999;

    /* renamed from: ERR_JNIV2_JAVA_CERT_CTX_INIT */
    public static final int f65626xc001067e = -6505;

    /* renamed from: ERR_JNIV2_JAVA_SM2_CTX_INIT */
    public static final int f65627xa7e839b4 = -6501;

    /* renamed from: ERR_JNIV2_JAVA_SM3_CTX_INIT */
    public static final int f65628x9c31aad3 = -6502;

    /* renamed from: ERR_JNIV2_JAVA_SM3_HMAC_CTX_INIT */
    public static final int f65629xcdbfedf5 = -6503;

    /* renamed from: ERR_JNIV2_JAVA_SM4_CTX_INIT */
    public static final int f65630x907b1bf2 = -6504;

    /* renamed from: ERR_KV_FILE_EXIST */
    public static final int f65631x2198442e = -60025;

    /* renamed from: ERR_KV_FILE_NOT_FOUND */
    public static final int f65632x3f9a6cad = -60012;

    /* renamed from: ERR_MALLOC_FAIL */
    public static final int f65633x4768f21b = -6002;

    /* renamed from: ERR_MODULE_STATUSNG */
    public static final int f65634x22c062a4 = -10900;

    /* renamed from: ERR_SM4_GCM_ILLEGAL_TAGLEN */
    public static final int f65635xc33be3d1 = -40005;

    /* renamed from: ERR_SM4_GCM_TAG_VERIFY_FAILED */
    public static final int f65636xafb73511 = -40002;

    /* renamed from: ERR_SM4_ILLEGAL_MSGLEN */
    public static final int f65637xff323afc = -40007;

    /* renamed from: SM2_VERIFY_FAIL */
    public static final int f65638x904caa7d = -51003;

    /* renamed from: errMap */
    private static final java.util.Map<java.lang.Integer, java.lang.String> f65639xb2d4edb7;

    /* renamed from: errCode */
    public int f65640xa7c470f2;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(java.lang.Integer.valueOf(f65627xa7e839b4), "please call SM2Algo init method first to initialize context");
        hashMap.put(java.lang.Integer.valueOf(f65628x9c31aad3), "please call SM3Algo hashInit method first to initialize sm3 hash context");
        hashMap.put(java.lang.Integer.valueOf(f65629xcdbfedf5), "please call SM3Algo hmacInit method first to initialize sm3 hmac context");
        hashMap.put(java.lang.Integer.valueOf(f65630x907b1bf2), "please call SM4Algo stepInit method first to initialize sm4 context");
        hashMap.put(java.lang.Integer.valueOf(f65626xc001067e), "please call SMCert init method first to initialize cert context");
        f65639xb2d4edb7 = java.util.Collections.unmodifiableMap(hashMap);
    }

    public C28041x16492e41(int i17) {
        super("" + i17 + ": " + m121995x17ec12d2(i17));
        this.f65640xa7c470f2 = i17;
    }

    /* renamed from: getErrMsg */
    public static java.lang.String m121995x17ec12d2(int i17) {
        java.util.Map<java.lang.Integer, java.lang.String> map = f65639xb2d4edb7;
        return map.containsKey(java.lang.Integer.valueOf(i17)) ? map.get(java.lang.Integer.valueOf(i17)) : "Please refer to Tencent SM official document";
    }

    /* renamed from: getErrCode */
    public int m121996xe591acbc() {
        return this.f65640xa7c470f2;
    }

    public C28041x16492e41(int i17, java.lang.String str) {
        super("" + i17 + ": " + str);
        this.f65640xa7c470f2 = i17;
    }
}
