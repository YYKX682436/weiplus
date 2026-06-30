package com.p3249xcbb51f6b.ndk;

/* renamed from: com.tenpay.ndk.Encrypt */
/* loaded from: classes9.dex */
public class C28013x36bca45 {

    /* renamed from: CHARSET */
    private static final java.lang.String f63070x56d8ed2c = "UTF-8";

    /* renamed from: dec_buf */
    private byte[] f63071x5be860b6;

    /* renamed from: enc_buf */
    private byte[] f63072xa02a398e;

    /* renamed from: enc_passwd */
    private byte[] f63073xa8915da3;

    /* renamed from: key_buf */
    private byte[] f63074xcf6a0493;

    /* renamed from: raw_buf */
    private byte[] f63075x3ac611dc;

    /* renamed from: raw_passwd */
    private byte[] f63076xa669fa95;

    /* renamed from: server_time_stamp */
    private java.lang.String f63077x662c7a4d = "0";

    /* renamed from: time_stamp */
    private int f63078x43b56bd1;

    /* renamed from: aesDecryptCBC */
    public static native byte[] m121789x3d6f0146(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: aesEncryptCBC */
    public static native byte[] m121790x6820596e(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: decrypt */
    private native boolean m121791x5bf1598d(byte[] bArr, byte[] bArr2);

    /* renamed from: encrypt */
    private native boolean m121792xa0333265(byte[] bArr, byte[] bArr2);

    /* renamed from: encryptPasswdWithRSA */
    private native boolean m121793x3f4db0b7(byte b17, byte[] bArr, int i17);

    /* renamed from: encryptVerifyCode */
    private native boolean m121794xdeceda4b(byte[] bArr);

    /* renamed from: encryptWithRSA */
    private native byte[] m121795xfb056975(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17);

    /* renamed from: getRandom */
    private native byte[] m121796x2d2a07b9();

    /* renamed from: hexToBytes */
    private static byte[] m121797x8b32f715(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str) || str.length() % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i17 = 0; i17 < str.length(); i17 += 2) {
            bArr[i17 / 2] = (byte) ((java.lang.Character.digit(str.charAt(i17), 16) << 4) + java.lang.Character.digit(str.charAt(i17 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: desedeDecode */
    public java.lang.String m121798xe82f2162(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.f63075x3ac611dc = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.f63074xcf6a0493 = bytes;
            m121791x5bf1598d(bytes, this.f63075x3ac611dc);
            byte[] bArr = this.f63071x5be860b6;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: desedeEncode */
    public java.lang.String m121799xea62cd8a(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.f63075x3ac611dc = bytes;
            m121792xa0333265(null, bytes);
            byte[] bArr = this.f63072xa02a398e;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: desedeVerifyCode */
    public java.lang.String m121801x19b57b7a(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.f63075x3ac611dc = bytes;
            m121794xdeceda4b(bytes);
            byte[] bArr = this.f63072xa02a398e;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: encryptPasswd */
    public java.lang.String m121802xd26bb163(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            this.f63076xa669fa95 = bytes;
            m121793x3f4db0b7((byte) 2, bytes, 0);
            byte[] bArr = this.f63073xa8915da3;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0023, code lost:
    
        if (m121793x3f4db0b7((byte) 2, r6, 1) == false) goto L11;
     */
    /* renamed from: encryptPasswdWithRSA2048 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m121803x8b1ff279(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "V01_"
            r1 = 0
            if (r6 == 0) goto L35
            int r2 = r6.length()
            if (r2 <= 0) goto L35
            r5.f63076xa669fa95 = r1
            r5.f63073xa8915da3 = r1
            int r2 = r6.length()
            java.lang.String r3 = "UTF-8"
            if (r2 <= 0) goto L26
            byte[] r6 = r6.getBytes(r3)     // Catch: java.lang.Exception -> L25
            r5.f63076xa669fa95 = r6     // Catch: java.lang.Exception -> L25
            r2 = 2
            r4 = 1
            boolean r6 = r5.m121793x3f4db0b7(r2, r6, r4)
            if (r6 != 0) goto L26
        L25:
            return r1
        L26:
            byte[] r6 = r5.f63073xa8915da3
            if (r6 != 0) goto L2b
            return r1
        L2b:
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Exception -> L35
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = r0.concat(r2)     // Catch: java.lang.Exception -> L35
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p3249xcbb51f6b.ndk.C28013x36bca45.m121803x8b1ff279(java.lang.String):java.lang.String");
    }

    /* renamed from: encryptWithRSA1024 */
    public java.lang.String m121804xbeb0a796(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] m121795xfb056975 = m121795xfb056975(str.getBytes(), m121797x8b32f715(str2), m121797x8b32f715(str3), 0);
        if (m121795xfb056975 == null) {
            return null;
        }
        return android.util.Base64.encodeToString(m121795xfb056975, 0);
    }

    /* renamed from: encryptWithRSA2048 */
    public java.lang.String m121805xbeb11c37(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] m121795xfb056975 = m121795xfb056975(str.getBytes(), m121797x8b32f715(str2), m121797x8b32f715(str3), 1);
        if (m121795xfb056975 == null) {
            return null;
        }
        return android.util.Base64.encodeToString(m121795xfb056975, 0);
    }

    /* renamed from: getPasswdTimeStamp */
    public java.lang.String m121806x7f0a89c2() {
        return java.lang.String.valueOf(this.f63078x43b56bd1);
    }

    /* renamed from: getRandomKey */
    public java.lang.String m121807xce19d7e6() {
        byte[] m121796x2d2a07b9 = m121796x2d2a07b9();
        if (m121796x2d2a07b9 != null) {
            try {
                return new java.lang.String(m121796x2d2a07b9, "UTF-8");
            } catch (java.io.UnsupportedEncodingException unused) {
            }
        }
        return null;
    }

    /* renamed from: setTimeStamp */
    public void m121808x5d476ab4(java.lang.String str) {
        this.f63077x662c7a4d = str;
    }

    /* renamed from: sm4DecryptCBC */
    public native byte[] m121809x9beaa3d1(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: sm4EncryptCBC */
    public native byte[] m121810xc69bfbf9(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: desedeEncode */
    public java.lang.String m121800xea62cd8a(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null || str.length() <= 0) {
            return null;
        }
        try {
            this.f63075x3ac611dc = str.getBytes("UTF-8");
            byte[] bytes = str2.getBytes("UTF-8");
            this.f63074xcf6a0493 = bytes;
            m121792xa0333265(bytes, this.f63075x3ac611dc);
            byte[] bArr = this.f63072xa02a398e;
            if (bArr == null) {
                return null;
            }
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
