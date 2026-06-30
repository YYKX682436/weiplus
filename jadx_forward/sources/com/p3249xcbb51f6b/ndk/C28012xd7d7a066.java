package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.CertUtil */
/* loaded from: classes9.dex */
public class C28012xd7d7a066 {
    public static final java.lang.String TAG = "CertUtil";

    /* renamed from: instance */
    private static com.p3249xcbb51f6b.ndk.C28012xd7d7a066 f63042x21169495;

    /* renamed from: cert_dir */
    private java.lang.String f63043xd4018bf2;

    /* renamed from: priv_dir */
    private java.lang.String f63057xbae266fd;

    /* renamed from: publ_dir */
    private java.lang.String f63058x4d16415d;

    /* renamed from: token_dir */
    private java.lang.String f63067x873c947;

    /* renamed from: eventListener */
    private com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener f63049xde76616e = null;

    /* renamed from: qq_id */
    private java.lang.String f63059x66d2f9a = null;

    /* renamed from: login_ip */
    private java.lang.String f63053x7890ddbd = null;

    /* renamed from: svr_cert */
    private java.lang.String f63064xd43831f4 = null;

    /* renamed from: cert_id */
    private java.lang.String f63044x27df0516 = null;

    /* renamed from: sig_raw_buf */
    private java.lang.String f63061x83ba146e = null;

    /* renamed from: plain_buf */
    private java.lang.String f63055x7593927e = null;

    /* renamed from: plain_buf2 */
    private byte[] f63056x3cdebd74 = null;

    /* renamed from: token */
    private java.lang.String f63065x696b9f9 = null;

    /* renamed from: token_buf */
    private byte[] f63066x873c32d = null;

    /* renamed from: token_len */
    private int f63068x873e6cf = 0;

    /* renamed from: csr_buf */
    private byte[] f63047x3fb95eb6 = null;

    /* renamed from: sig_buf */
    private byte[] f63060x7c719a05 = null;

    /* renamed from: cipher_buf */
    private byte[] f63046xeb50963f = null;

    /* renamed from: certid_buf */
    private byte[] f63045xeada1473 = null;
    private java.lang.String mac = null;

    /* renamed from: imsi */
    private java.lang.String f63052x31627a = null;

    /* renamed from: iccid */
    private java.lang.String f63050x5f62564 = null;

    /* renamed from: imei */
    private java.lang.String f63051x3160c8 = null;

    /* renamed from: softid */
    private java.lang.String f63063xca899ec5 = null;

    /* renamed from: deskey */
    private java.lang.String f63048xb069c90d = null;

    /* renamed from: sm4Key */
    private java.lang.String f63062xca561ae5 = null;

    /* renamed from: useSM4 */
    private int f63069xce2aba33 = 0;

    /* renamed from: mContext */
    private android.content.Context f63054xd6cfe882 = null;

    /* renamed from: com.tenpay.ndk.CertUtil$EventListener */
    /* loaded from: classes9.dex */
    public interface EventListener {
        /* renamed from: getUniqueID */
        java.lang.String mo82992x6a4d2222();

        /* renamed from: onEvent */
        void mo82993xaf8c47fb(int i17, java.lang.String str);
    }

    private C28012xd7d7a066() {
    }

    /* renamed from: checkDir */
    private void m121744x5b9aaa65(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m()) {
            r6Var.J();
        } else {
            if (r6Var.y()) {
                return;
            }
            r6Var.l();
            r6Var.J();
        }
    }

    /* renamed from: create_dir */
    private boolean m121745x51a176ca(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                return true;
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
            if (m18.a()) {
                return m18.f294799a.r(m18.f294800b);
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: decrypt */
    private native byte[] m121746x5bf1598d(byte[] bArr, byte[] bArr2);

    /* renamed from: del_all_files */
    private boolean m121747xa5fa4725(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        if (!r6Var.m() || !r6Var.y()) {
            return false;
        }
        java.lang.String[] D = r6Var.D();
        boolean z17 = false;
        for (int i17 = 0; i17 < D.length; i17++) {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = str.endsWith("/") ? new com.p314xaae8f345.mm.vfs.r6(str + D[i17]) : new com.p314xaae8f345.mm.vfs.r6(str + "/" + D[i17]);
            if (r6Var2.A()) {
                r6Var2.l();
            } else if (r6Var2.y()) {
                m121747xa5fa4725(str + "/" + D[i17]);
                m121748x5c673a59(str + "/" + D[i17], true);
                z17 = true;
            }
        }
        return z17;
    }

    /* renamed from: del_dir */
    private void m121748x5c673a59(java.lang.String str, boolean z17) {
        try {
            m121747xa5fa4725(str);
            if (z17) {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str.toString());
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a()) {
                    m17.f294799a.d(m17.f294800b);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: encrypt */
    private native boolean m121749xa0333265();

    /* renamed from: expireTime */
    private native long m121750xce3f1c8c();

    /* renamed from: genCertApplyCsr */
    private native boolean m121751xc3b39d68();

    /* renamed from: genCertApplyCsrNew */
    private native boolean m121752x2fbbb18(int i17);

    /* renamed from: genQrcode */
    private native boolean m121753xeefa82fe();

    /* renamed from: getCertDir */
    private java.lang.String m121754x65abdb93() {
        return this.f63054xd6cfe882.getFilesDir().getParentFile().getAbsolutePath() + "/cert";
    }

    /* renamed from: getCertid */
    private native boolean m121755x13cbc135();

    /* renamed from: getInstance */
    public static com.p3249xcbb51f6b.ndk.C28012xd7d7a066 m121756x9cf0d20b() {
        if (f63042x21169495 == null) {
            synchronized (com.p3249xcbb51f6b.ndk.C28012xd7d7a066.class) {
                f63042x21169495 = new com.p3249xcbb51f6b.ndk.C28012xd7d7a066();
            }
        }
        return f63042x21169495;
    }

    /* renamed from: getToken */
    private native boolean m121757x75346043();

    /* renamed from: getTokenCount */
    private native int m121758xf2c0b28c();

    /* renamed from: hexdigest */
    private java.lang.String m121759xb42c309f(java.lang.String str) {
        if (str == null) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            char[] cArr2 = new char[32];
            int i17 = 0;
            for (int i18 = 0; i18 < 16; i18++) {
                byte b17 = digest[i18];
                int i19 = i17 + 1;
                cArr2[i17] = cArr[(b17 >>> 4) & 15];
                i17 = i19 + 1;
                cArr2[i19] = cArr[b17 & 15];
            }
            return new java.lang.String(cArr2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: importCert */
    private native boolean m121760x7ea51769();

    /* renamed from: isCertExist */
    private native boolean m121761xf107e929();

    /* renamed from: isNotEmptyDir */
    private boolean m121762xc859069(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        return r6Var.m() && r6Var.y() && r6Var.G() != null;
    }

    /* renamed from: isNullOrEmpty */
    private boolean m121763xc53c3619(java.lang.String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: isValidDir */
    private boolean m121764x7c00523b(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
        return r6Var.m() && r6Var.y();
    }

    /* renamed from: onNativeEvent */
    private void m121765x83813164(int i17, java.lang.String str) {
        com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener eventListener = this.f63049xde76616e;
        if (eventListener != null) {
            eventListener.mo82993xaf8c47fb(i17, str);
        }
    }

    /* renamed from: setAndCheckDir */
    private void m121766x1ca27b9a(java.lang.String str) {
        java.lang.String m121754x65abdb93 = m121754x65abdb93();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m121754x65abdb93);
        sb6.append("/");
        sb6.append(m121759xb42c309f(str + this.f63051x3160c8));
        java.lang.String sb7 = sb6.toString();
        this.f63043xd4018bf2 = sb7 + "/cert";
        this.f63057xbae266fd = sb7 + "/priv";
        this.f63058x4d16415d = sb7 + "/publ";
        this.f63067x873c947 = sb7 + "/auth";
        m121744x5b9aaa65(m121754x65abdb93);
        m121744x5b9aaa65(this.f63067x873c947);
    }

    /* renamed from: setDir */
    private void m121767xca025ccb(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m121754x65abdb93());
        sb6.append("/");
        sb6.append(m121759xb42c309f(str + this.f63051x3160c8));
        java.lang.String sb7 = sb6.toString();
        this.f63043xd4018bf2 = sb7 + "/cert";
        this.f63057xbae266fd = sb7 + "/priv";
        this.f63058x4d16415d = sb7 + "/publ";
        this.f63067x873c947 = sb7 + "/auth";
    }

    /* renamed from: setToken */
    private native boolean m121768x53c27ab7();

    /* renamed from: usrSig */
    private native boolean m121769xce30a69d(byte[] bArr);

    /* renamed from: clearAllCert */
    public synchronized void m121770xc82e6058() {
        m121748x5c673a59(m121754x65abdb93(), true);
    }

    /* renamed from: clearCert */
    public synchronized void m121771xb437c611(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(m121754x65abdb93());
        sb6.append("/");
        sb6.append(m121759xb42c309f(str + this.f63051x3160c8));
        m121748x5c673a59(sb6.toString(), true);
    }

    /* renamed from: clearToken */
    public synchronized void m121772xd3b4fbac(java.lang.String str) {
        if (m121763xc53c3619(str)) {
            return;
        }
        m121767xca025ccb(str);
        m121748x5c673a59(this.f63067x873c947, true);
    }

    /* renamed from: decrypt */
    public synchronized java.lang.String m121773x5bf1598d(java.lang.String str, java.lang.String str2) {
        if (!m121763xc53c3619(str) && !m121763xc53c3619(str2)) {
            m121766x1ca27b9a(str);
            if (m121762xc859069(this.f63043xd4018bf2) && m121762xc859069(this.f63058x4d16415d) && m121762xc859069(this.f63057xbae266fd)) {
                byte[] decode = android.util.Base64.decode(str2.getBytes(), 0);
                if (decode != null && decode.length != 0) {
                    this.f63044x27df0516 = str;
                    this.f63046xeb50963f = null;
                    byte[] m121746x5bf1598d = m121746x5bf1598d(str.getBytes(), decode);
                    if (m121746x5bf1598d == null) {
                        return null;
                    }
                    return android.util.Base64.encodeToString(m121746x5bf1598d, 0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "base64 decode data fail, %s", str2);
                return null;
            }
            return null;
        }
        return null;
    }

    /* renamed from: encrypt */
    public synchronized java.lang.String m121774xa0333265(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        java.lang.String str3 = null;
        if (!m121763xc53c3619(str) && !m121763xc53c3619(str2)) {
            m121766x1ca27b9a(str);
            if (m121762xc859069(this.f63043xd4018bf2) && m121762xc859069(this.f63058x4d16415d) && m121762xc859069(this.f63057xbae266fd)) {
                this.f63044x27df0516 = str;
                this.f63055x7593927e = str2;
                this.f63046xeb50963f = null;
                if (m121749xa0333265() && (bArr = this.f63046xeb50963f) != null) {
                    try {
                        str3 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
                return str3;
            }
            return null;
        }
        return null;
    }

    /* renamed from: encryptWithPubkey */
    public native byte[] m121775x995132ed(byte[] bArr, byte[] bArr2, boolean z17);

    /* renamed from: genQrcode */
    public synchronized byte[] m121776xeefa82fe(java.lang.String str, byte[] bArr, java.lang.String str2) {
        byte[] bArr2 = null;
        if (!m121763xc53c3619(str) && !m121763xc53c3619(str2) && bArr != null && bArr.length != 0) {
            m121766x1ca27b9a(str);
            if (m121762xc859069(this.f63043xd4018bf2) && m121762xc859069(this.f63058x4d16415d) && m121762xc859069(this.f63057xbae266fd)) {
                this.f63044x27df0516 = str;
                this.f63056x3cdebd74 = bArr;
                this.f63046xeb50963f = null;
                this.f63065x696b9f9 = str2;
                if (m121753xeefa82fe()) {
                    byte[] bArr3 = this.f63046xeb50963f;
                    if (bArr3 != null) {
                        bArr2 = bArr3;
                    }
                }
                return bArr2;
            }
            return null;
        }
        return null;
    }

    /* renamed from: genUserSig */
    public synchronized java.lang.String m121778xc5c0ef96(java.lang.String str, byte[] bArr) {
        byte[] bArr2;
        java.lang.String str2 = null;
        if (!m121763xc53c3619(str) && bArr != null && bArr.length != 0) {
            m121766x1ca27b9a(str);
            if (m121762xc859069(this.f63043xd4018bf2) && m121762xc859069(this.f63058x4d16415d) && m121762xc859069(this.f63057xbae266fd)) {
                this.f63044x27df0516 = str;
                this.f63060x7c719a05 = null;
                if (m121769xce30a69d(bArr) && (bArr2 = this.f63060x7c719a05) != null) {
                    try {
                        str2 = new java.lang.String(bArr2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
                return str2;
            }
            return null;
        }
        return null;
    }

    /* renamed from: getCertApplyCSR */
    public synchronized java.lang.String m121779x5ac5c06e(java.lang.String str) {
        java.lang.String str2;
        byte[] bArr;
        this.f63059x66d2f9a = str;
        str2 = null;
        this.f63047x3fb95eb6 = null;
        if (m121751xc3b39d68() && (bArr = this.f63047x3fb95eb6) != null) {
            try {
                str2 = new java.lang.String(bArr, "ASCII");
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    /* renamed from: getLastError */
    public native int m121781x75feee5c();

    /* renamed from: getToken */
    public synchronized java.lang.String m121782x75346043(java.lang.String str) {
        byte[] bArr;
        java.lang.String str2 = null;
        if (m121763xc53c3619(str)) {
            return null;
        }
        m121766x1ca27b9a(str);
        if (!m121762xc859069(this.f63067x873c947)) {
            return null;
        }
        this.f63044x27df0516 = str;
        if (m121758xf2c0b28c() <= 0) {
            return null;
        }
        if (m121757x75346043() && (bArr = this.f63066x873c32d) != null) {
            try {
                str2 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    /* renamed from: getTokenCount */
    public synchronized int m121783xf2c0b28c(java.lang.String str) {
        if (m121763xc53c3619(str)) {
            return 0;
        }
        m121767xca025ccb(str);
        this.f63044x27df0516 = str;
        return m121758xf2c0b28c();
    }

    /* renamed from: importCert */
    public synchronized boolean m121784x7ea51769(java.lang.String str, java.lang.String str2) {
        if (str2.length() <= 0) {
            return false;
        }
        try {
            this.f63064xd43831f4 = new java.lang.String(str2.getBytes(), "ASCII");
        } catch (java.lang.Exception unused) {
        }
        m121771xb437c611(str);
        m121766x1ca27b9a(str);
        m121745x51a176ca(this.f63043xd4018bf2);
        m121745x51a176ca(this.f63057xbae266fd);
        m121745x51a176ca(this.f63058x4d16415d);
        return m121760x7ea51769();
    }

    /* renamed from: init */
    public void m121785x316510(android.content.Context context, com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener eventListener) {
        this.f63049xde76616e = eventListener;
        this.f63054xd6cfe882 = context.getApplicationContext();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String mo82992x6a4d2222 = eventListener.mo82992x6a4d2222();
        this.f63048xb069c90d = mo82992x6a4d2222;
        this.f63051x3160c8 = mo82992x6a4d2222;
    }

    /* renamed from: isCertExist */
    public synchronized boolean m121786xf107e929(java.lang.String str) {
        if (m121763xc53c3619(str)) {
            return false;
        }
        m121767xca025ccb(str);
        if (!m121762xc859069(this.f63043xd4018bf2) || !m121762xc859069(this.f63058x4d16415d) || !m121762xc859069(this.f63057xbae266fd)) {
            return false;
        }
        this.f63044x27df0516 = str;
        return m121761xf107e929();
    }

    /* renamed from: setEventListener */
    public void m121787x2eac842c(com.p3249xcbb51f6b.ndk.C28012xd7d7a066.EventListener eventListener) {
        this.f63049xde76616e = eventListener;
    }

    /* renamed from: setTokens */
    public synchronized boolean m121788x248cdc9c(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        if (!m121763xc53c3619(str) && !m121763xc53c3619(str2)) {
            if (z17 && (str3 == null || str3.length() != 16)) {
                return false;
            }
            m121766x1ca27b9a(str);
            if (!m121764x7c00523b(this.f63043xd4018bf2)) {
                return false;
            }
            if (!m121764x7c00523b(this.f63067x873c947)) {
                return false;
            }
            this.f63069xce2aba33 = z17 ? 1 : 0;
            this.f63062xca561ae5 = str3;
            this.f63044x27df0516 = str;
            this.f63065x696b9f9 = str2;
            this.f63068x873e6cf = str2.length();
            return m121768x53c27ab7();
        }
        return false;
    }

    /* renamed from: getCertApplyCSR */
    public synchronized java.lang.String m121780x5ac5c06e(java.lang.String str, int i17) {
        java.lang.String str2;
        byte[] bArr;
        this.f63059x66d2f9a = str;
        str2 = null;
        this.f63047x3fb95eb6 = null;
        if (m121752x2fbbb18(i17) && (bArr = this.f63047x3fb95eb6) != null) {
            try {
                str2 = new java.lang.String(bArr, "ASCII");
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return str2;
    }

    /* renamed from: genUserSig */
    public synchronized java.lang.String m121777xc5c0ef96(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        java.lang.String str3 = null;
        if (!m121763xc53c3619(str) && !m121763xc53c3619(str2)) {
            m121766x1ca27b9a(str);
            if (m121762xc859069(this.f63043xd4018bf2) && m121762xc859069(this.f63058x4d16415d) && m121762xc859069(this.f63057xbae266fd)) {
                if (str != null && str2 != null && str.length() > 0 && str2.length() > 0) {
                    this.f63044x27df0516 = str;
                    this.f63061x83ba146e = str2;
                    this.f63060x7c719a05 = null;
                    if (m121769xce30a69d(str2.getBytes()) && (bArr = this.f63060x7c719a05) != null) {
                        try {
                            str3 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        } catch (java.lang.Exception unused) {
                            return null;
                        }
                    }
                    return str3;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
