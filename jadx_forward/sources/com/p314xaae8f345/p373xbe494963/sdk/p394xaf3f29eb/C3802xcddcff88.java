package com.p314xaae8f345.p373xbe494963.sdk.p394xaf3f29eb;

@com.p314xaae8f345.p373xbe494963.p378x2e06d1.p379xc6ad7b24.InterfaceC3751x20efb56(m29314x6ac9171 = "liteav::license")
/* renamed from: com.tencent.liteav.sdk.common.LicenseCheckerPlatformAndroid */
/* loaded from: classes7.dex */
public class C3802xcddcff88 {

    /* renamed from: ALGORITHM_AES */
    private static final java.lang.String f14846x7e0c30bf = "AES";

    /* renamed from: ALGORITHM_AES_CBC_PKCS5PADDING */
    private static final java.lang.String f14847x256b42e2 = "AES/CBC/PKCS5Padding";

    /* renamed from: ALGORITHM_RSA */
    private static final java.lang.String f14848x7e0c7230 = "RSA";

    /* renamed from: ALGORITHM_SHA256WITH_RSA */
    private static final java.lang.String f14849x9699d45e = "SHA256WithRSA";
    private static final java.lang.String TAG = "LicenseCheckerPlatformAndroid";

    /* renamed from: decryptLicense */
    public static java.lang.String m30208x6fb759f4(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "decryptLicense: invalid parameter.", new java.lang.Object[0]);
            return "";
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, f14846x7e0c30bf);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr3);
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(f14847x256b42e2);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new java.lang.String(cipher.doFinal(android.util.Base64.decode(bArr, 0)));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    /* renamed from: getPackageFile */
    public static java.lang.String m30209xffd51ac(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035().getAssets().open(str);
                byte[] bArr = new byte[inputStream.available()];
                if (inputStream.read(bArr) <= 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                    return "";
                }
                inputStream.close();
                java.lang.String str2 = new java.lang.String(bArr);
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
                return str2;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "read asset file failed.", e17);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return "";
            }
        } catch (java.lang.Throwable th6) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th6;
        }
    }

    /* renamed from: verifyLicense */
    public static boolean m30210x134dc988(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.w(TAG, "verifyLicense: invalid parameter.", new java.lang.Object[0]);
            return false;
        }
        try {
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(f14848x7e0c7230).generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(bArr3, 0)));
            java.security.Signature signature = java.security.Signature.getInstance(f14849x9699d45e);
            signature.initVerify(generatePublic);
            signature.update(android.util.Base64.decode(bArr, 0));
            return signature.verify(android.util.Base64.decode(bArr2, 0));
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException unused) {
            return false;
        }
    }
}
