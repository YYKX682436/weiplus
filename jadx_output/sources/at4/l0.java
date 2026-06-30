package at4;

/* loaded from: classes7.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static at4.l0 f13894b;

    /* renamed from: a, reason: collision with root package name */
    public java.security.PublicKey f13895a = null;

    public java.lang.String a(byte[] bArr) {
        try {
            this.f13895a = kk.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a, "lbs_rsa_public_key.pem");
            com.tencent.mars.xlog.Log.i("MicroMsg.LocationEncrypt", "getPemPublickKeyFromAsset23 done2");
            java.security.PublicKey publicKey = this.f13895a;
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, publicKey);
            return new java.lang.String(android.util.Base64.encode(cipher.doFinal(bArr), 0));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LocationEncrypt", "encry publicKey error %s", e17.getMessage());
            return "";
        }
    }
}
