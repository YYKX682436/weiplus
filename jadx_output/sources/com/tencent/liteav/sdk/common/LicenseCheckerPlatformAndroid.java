package com.tencent.liteav.sdk.common;

@com.tencent.liteav.base.annotations.JNINamespace("liteav::license")
/* loaded from: classes7.dex */
public class LicenseCheckerPlatformAndroid {
    private static final java.lang.String ALGORITHM_AES = "AES";
    private static final java.lang.String ALGORITHM_AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
    private static final java.lang.String ALGORITHM_RSA = "RSA";
    private static final java.lang.String ALGORITHM_SHA256WITH_RSA = "SHA256WithRSA";
    private static final java.lang.String TAG = "LicenseCheckerPlatformAndroid";

    public static java.lang.String decryptLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            com.tencent.liteav.base.Log.w(TAG, "decryptLicense: invalid parameter.", new java.lang.Object[0]);
            return "";
        }
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr2, ALGORITHM_AES);
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr3);
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(ALGORITHM_AES_CBC_PKCS5PADDING);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new java.lang.String(cipher.doFinal(android.util.Base64.decode(bArr, 0)));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static java.lang.String getPackageFile(java.lang.String str) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = com.tencent.liteav.base.ContextUtils.getApplicationContext().getAssets().open(str);
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
                com.tencent.liteav.base.Log.w(TAG, "read asset file failed.", e17);
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

    public static boolean verifyLicense(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr3 == null || bArr3.length == 0) {
            com.tencent.liteav.base.Log.w(TAG, "verifyLicense: invalid parameter.", new java.lang.Object[0]);
            return false;
        }
        try {
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance(ALGORITHM_RSA).generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(bArr3, 0)));
            java.security.Signature signature = java.security.Signature.getInstance(ALGORITHM_SHA256WITH_RSA);
            signature.initVerify(generatePublic);
            signature.update(android.util.Base64.decode(bArr, 0));
            return signature.verify(android.util.Base64.decode(bArr2, 0));
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | java.security.SignatureException | java.security.spec.InvalidKeySpecException unused) {
            return false;
        }
    }
}
