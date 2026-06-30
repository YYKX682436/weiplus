package by5;

/* loaded from: classes7.dex */
public abstract class s {
    public static boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            java.security.PublicKey generatePublic = java.security.KeyFactory.getInstance("EC").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str3, 0)));
            java.security.Signature signature = java.security.Signature.getInstance("SHA1withECDSA");
            signature.initVerify(generatePublic);
            byte[] decode = android.util.Base64.decode(str2, 0);
            signature.update(str.getBytes());
            return signature.verify(decode);
        } catch (java.lang.Throwable th6) {
            by5.c4.c("ECCUtil", "verify failed " + th6.getMessage());
            return false;
        }
    }
}
