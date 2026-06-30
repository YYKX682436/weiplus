package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android")
/* renamed from: org.chromium.net.AndroidKeyStore */
/* loaded from: classes7.dex */
public class C29486x43610131 {
    private static final java.lang.String TAG = "AndroidKeyStore";

    /* renamed from: encryptWithPrivateKey */
    private static byte[] m153052xafc8a507(java.security.PrivateKey privateKey, java.lang.String str, byte[] bArr) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(str);
            try {
                cipher.init(1, privateKey);
                return cipher.doFinal(bArr);
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Exception while encrypting input with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e17);
                return null;
            }
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException e18) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Cipher " + str + " not supported: " + e18);
            return null;
        }
    }

    /* renamed from: getPrivateKeyClassName */
    private static java.lang.String m153053x55c58271(java.security.PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    /* renamed from: privateKeySupportsCipher */
    private static boolean m153054xe0e222ab(java.security.PrivateKey privateKey, java.lang.String str) {
        try {
            javax.crypto.Cipher.getInstance(str).init(1, privateKey);
            return true;
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            return false;
        } catch (java.lang.Exception e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Exception while checking support for " + str + ": " + e17);
            return false;
        }
    }

    /* renamed from: privateKeySupportsSignature */
    private static boolean m153055x5dd69818(java.security.PrivateKey privateKey, java.lang.String str) {
        try {
            java.security.Signature.getInstance(str).initSign(privateKey);
            return true;
        } catch (java.security.InvalidKeyException | java.security.NoSuchAlgorithmException unused) {
            return false;
        } catch (java.lang.Exception e17) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Exception while checking support for " + str + ": " + e17);
            return false;
        }
    }

    /* renamed from: signWithPrivateKey */
    private static byte[] m153056x57b0965f(java.security.PrivateKey privateKey, java.lang.String str, byte[] bArr) {
        try {
            java.security.Signature signature = java.security.Signature.getInstance(str);
            try {
                signature.initSign(privateKey);
                signature.update(bArr);
                return signature.sign();
            } catch (java.lang.Exception e17) {
                org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Exception while signing message with " + str + " and " + privateKey.getAlgorithm() + " private key (" + privateKey.getClass().getName() + "): " + e17);
                return null;
            }
        } catch (java.security.NoSuchAlgorithmException e18) {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "Signature algorithm " + str + " not supported: " + e18);
            return null;
        }
    }
}
