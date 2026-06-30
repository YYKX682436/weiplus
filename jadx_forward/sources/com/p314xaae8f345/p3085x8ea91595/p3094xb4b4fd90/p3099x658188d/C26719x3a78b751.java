package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools */
/* loaded from: classes13.dex */
public class C26719x3a78b751 {

    /* renamed from: CHILD_NAME */
    protected static final java.lang.String f56481x6f6febee = ".jce.";

    /* renamed from: CRYPT_KEY */
    static final java.lang.String f56482x563bfce = "ji*9^&43U0X-~./(";
    private static final java.lang.String TAG = "IPCPackageTools";

    /* renamed from: mReqId */
    protected static int f56483xbeb35dec;

    /* renamed from: buildIpcRequest */
    public static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26729xd2ca3af3 m105136x33decbe1(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26729xd2ca3af3 c26729xd2ca3af3 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26729xd2ca3af3();
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc c26727xa1fcfffc = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26727xa1fcfffc();
        int i17 = f56483xbeb35dec;
        f56483xbeb35dec = i17 + 1;
        c26727xa1fcfffc.f56540x295c940a = i17;
        c26727xa1fcfffc.f56537x5a623f5 = m105139x7443ca3f(abstractC2861x7aec4921);
        c26727xa1fcfffc.f56538xab3ca929 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105484xd4409c06(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179());
        c26727xa1fcfffc.f56539x9e1d2c1d = java.lang.String.valueOf(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105485xc7211efa(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105492x76847179()));
        c26729xd2ca3af3.f56550x30cde0 = c26727xa1fcfffc;
        c26729xd2ca3af3.f56549x2e39a2 = m105140x938d0a20(abstractC2861x7aec4921);
        return c26729xd2ca3af3;
    }

    /* renamed from: buildPostData */
    public static byte[] m105137xecf88f8(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26729xd2ca3af3 c26729xd2ca3af3) {
        if (c26729xd2ca3af3 == null) {
            return null;
        }
        c26729xd2ca3af3.f56549x2e39a2 = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105154xa0333265(c26729xd2ca3af3.f56549x2e39a2, f56482x563bfce.getBytes());
        return m105140x938d0a20(c26729xd2ca3af3);
    }

    /* renamed from: createFromRequest */
    private static com.qq.taf.jce.AbstractC2861x7aec4921 m105138x720630e9(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (com.qq.taf.jce.AbstractC2861x7aec4921) java.lang.Class.forName((com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.C26719x3a78b751.class.getPackage().getName() + f56481x6f6febee + str) + "Response").newInstance();
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.InstantiationException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e19, "", new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: getCmdId */
    public static int m105139x7443ca3f(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return -1;
        }
        return com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26725x81189b9e.m105145x38b81db3(abstractC2861x7aec4921.getClass().getSimpleName().substring(0, r2.length() - 7)).m105147x6ac9171();
    }

    /* renamed from: jceStruct2ByteArray */
    public static byte[] m105140x938d0a20(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        return com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105157xa76917d5(abstractC2861x7aec4921);
    }

    /* renamed from: unpackBodyStruct */
    public static com.qq.taf.jce.AbstractC2861x7aec4921 m105141x8786b1e9(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26730x89a4d85d c26730x89a4d85d) {
        com.qq.taf.jce.AbstractC2861x7aec4921 m105138x720630e9 = m105138x720630e9(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26725x81189b9e.m105144x38b81db3(c26730x89a4d85d.f56554x30cde0.f56537x5a623f5).m105146x9616526c());
        if (m105138x720630e9 != null) {
            byte[] bArr = c26730x89a4d85d.f56553x2e39a2;
            if (bArr.length > 0) {
                try {
                    com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e = new com.qq.taf.jce.C2859xe10ac61e(bArr);
                    c2859xe10ac61e.m21323x26b402b8(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    m105138x720630e9.mo21234xcc442a60(c2859xe10ac61e);
                    return m105138x720630e9;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
                }
            }
        }
        return null;
    }

    /* renamed from: unpackPackage */
    public static com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26730x89a4d85d m105142xf8cb93b4(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26730x89a4d85d c26730x89a4d85d = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce.C26730x89a4d85d();
            try {
                com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e = new com.qq.taf.jce.C2859xe10ac61e(bArr);
                c2859xe10ac61e.m21323x26b402b8(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                c26730x89a4d85d.mo21234xcc442a60(c2859xe10ac61e);
                if (!android.text.TextUtils.isEmpty(c26730x89a4d85d.f56554x30cde0.f56538xab3ca929)) {
                    c26730x89a4d85d.f56553x2e39a2 = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105153x5bf1598d(c26730x89a4d85d.f56553x2e39a2, f56482x563bfce.getBytes());
                }
                return c26730x89a4d85d;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
