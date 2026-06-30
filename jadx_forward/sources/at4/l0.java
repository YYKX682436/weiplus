package at4;

/* loaded from: classes7.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static at4.l0 f95427b;

    /* renamed from: a, reason: collision with root package name */
    public java.security.PublicKey f95428a = null;

    public java.lang.String a(byte[] bArr) {
        try {
            this.f95428a = kk.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "lbs_rsa_public_key.pem");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
            java.security.PublicKey publicKey = this.f95428a;
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            return new java.lang.String(android.util.Base64.encode(cipher.doFinal(bArr), 0));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocationEncrypt", "encry publicKey error %s", e17.getMessage());
            return "";
        }
    }
}
