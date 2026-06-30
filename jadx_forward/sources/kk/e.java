package kk;

/* loaded from: classes8.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final javax.crypto.Cipher f389998a;

    public e(java.lang.String str) {
        try {
            javax.crypto.SecretKey generateSecret = javax.crypto.SecretKeyFactory.getInstance("DES").generateSecret(new javax.crypto.spec.DESKeySpec(str.getBytes("UTF8")));
            javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec("manifest".getBytes("UTF8"));
            javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding").init(1, generateSecret, ivParameterSpec);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5Padding");
            this.f389998a = cipher;
            cipher.init(2, generateSecret, ivParameterSpec);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DESUtil", e17, "", new java.lang.Object[0]);
        }
    }

    public java.lang.String a(java.lang.String str) {
        try {
            return new java.lang.String(this.f389998a.doFinal(android.util.Base64.decode(str, 0)), "UTF8");
        } catch (java.lang.Exception e17) {
            return "[des]" + str + "|" + e17.toString();
        }
    }
}
