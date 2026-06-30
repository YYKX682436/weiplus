package a42;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.b f1196a = new a42.b();

    /* renamed from: b, reason: collision with root package name */
    public static byte[] f1197b;

    /* renamed from: c, reason: collision with root package name */
    public static byte[] f1198c;

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f1199d;

    public final java.lang.String a(java.lang.String filePath, boolean z17) {
        byte[][] AesGcmEncryptWithNonce;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(filePath);
            kotlin.jvm.internal.o.f(E, "openRead(...)");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            for (int read = E.read(); read != -1; read = E.read()) {
                byteArrayOutputStream.write(read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            if (z17) {
                com.tencent.mm.jni.utils.UtilsJni.cryptGenRandom(32);
                com.tencent.mm.jni.utils.UtilsJni.cryptGenRandom(12);
                AesGcmEncryptWithNonce = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncryptWithNonce(f1197b, f1198c, null, byteArray);
                byte[] bArr = AesGcmEncryptWithNonce[1];
            } else {
                f1198c = com.tencent.mm.jni.utils.UtilsJni.cryptGenRandom(12);
                byte[] cryptGenRandom = com.tencent.mm.jni.utils.UtilsJni.cryptGenRandom(32);
                f1197b = cryptGenRandom;
                AesGcmEncryptWithNonce = com.tencent.mm.jni.utils.UtilsJni.AesGcmEncryptWithNonce(cryptGenRandom, f1198c, null, byteArray);
                f1199d = AesGcmEncryptWithNonce[1];
            }
            java.lang.String r17 = com.tencent.mm.vfs.w6.r(filePath);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(r17);
            sb6.append("/enc_");
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(filePath);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str2 = a17.f213279f;
            int lastIndexOf = str2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb6.append(str2);
            java.lang.String sb7 = sb6.toString();
            java.io.OutputStream K = com.tencent.mm.vfs.w6.K(sb7, false);
            kotlin.jvm.internal.o.f(K, "openWrite(...)");
            K.write(AesGcmEncryptWithNonce[0]);
            K.flush();
            K.close();
            com.tencent.mm.vfs.w6.k(sb7);
            return sb7;
        } catch (java.io.FileNotFoundException unused) {
            return "";
        }
    }
}
