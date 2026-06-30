package com.p314xaae8f345.mm.p1006xc5476f33.ext.key;

/* renamed from: com.tencent.mm.plugin.ext.key.AESUtil */
/* loaded from: classes12.dex */
public class C13497xe8ed7151 {

    /* renamed from: a, reason: collision with root package name */
    public static javax.crypto.SecretKey f181390a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f181391b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static long a(java.lang.String str) {
        java.lang.String str2;
        if (str == null || str.length() <= 0) {
            str2 = null;
        } else {
            c();
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
            cipher.init(2, f181390a);
            str2 = new java.lang.String(cipher.doFinal(d(str)), "UTF8");
        }
        return java.lang.Long.valueOf(str2.trim()).longValue();
    }

    public static java.lang.String b(long j17) {
        byte[] bArr;
        java.lang.String valueOf = java.lang.String.valueOf(j17);
        if (valueOf == null || valueOf.length() <= 0) {
            bArr = null;
        } else {
            c();
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
            cipher.init(1, f181390a);
            bArr = cipher.doFinal(valueOf.getBytes("UTF8"));
        }
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(bArr.length * 2);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = f181391b;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
        }
        return sb6.toString();
    }

    public static void c() {
        try {
            if (f181390a == null) {
                java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(d("aced00057372001f6a617661782e63727970746f2e737065632e5365637265744b6579537065635b470b66e230614d0200024c0009616c676f726974686d7400124c6a6176612f6c616e672f537472696e673b5b00036b65797400025b427870740003414553757200025b42acf317f8060854e0020000787000000010402a2173bd6f2542e5e71ee414b2e1e8")));
                f181390a = (javax.crypto.SecretKey) objectInputStream.readObject();
                objectInputStream.close();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AESUtil", e17, "", new java.lang.Object[0]);
        }
    }

    public static final byte[] d(java.lang.String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) java.lang.Integer.parseInt(str.substring(i18, i18 + 2), 16);
        }
        return bArr;
    }
}
