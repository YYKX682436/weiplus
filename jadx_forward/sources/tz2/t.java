package tz2;

/* loaded from: classes13.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f504858a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f504859b = false;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f504860c = "";

    /* renamed from: d, reason: collision with root package name */
    public static byte[] f504861d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f504862e;

    public static final byte[] a(java.lang.String str, java.lang.String str2) {
        byte[] copyOf;
        javax.crypto.Mac mac;
        if (str == null || str2 == null) {
            return new byte[0];
        }
        try {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, f504862e) || (copyOf = f504861d) == null) {
                try {
                    byte[] bArr = new byte[16];
                    new java.security.SecureRandom().nextBytes(bArr);
                    mac = javax.crypto.Mac.getInstance("HmacSHA256");
                    javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256");
                    if (mac != null) {
                        mac.init(secretKeySpec);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e17, "generateSM4Key HMAC failed, fallback to bioId bytes", new java.lang.Object[0]);
                    byte[] bytes = str.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                    copyOf = java.util.Arrays.copyOf(bytes, 16);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                }
                if (mac != null) {
                    byte[] bytes2 = str.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                    byte[] doFinal = mac.doFinal(bytes2);
                    if (doFinal != null) {
                        copyOf = java.util.Arrays.copyOf(doFinal, 16);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                        f504861d = copyOf;
                        f504862e = str;
                    }
                }
                byte[] bytes3 = str.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
                copyOf = java.util.Arrays.copyOf(bytes3, 16);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
                f504861d = copyOf;
                f504862e = str;
            }
            java.nio.charset.Charset charset = r26.c.f450398a;
            byte[] bytes4 = str.getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes4, "getBytes(...)");
            byte[] h17 = kk.k.h(bytes4);
            byte[] bytes5 = str2.getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes5, "getBytes(...)");
            byte[] m121953x8adee29b = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121953x8adee29b(bytes5, copyOf, h17, false);
            if (m121953x8adee29b != null) {
                if (!(m121953x8adee29b.length == 0)) {
                    return m121953x8adee29b;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerError", "faceEncryptSM4: sm4CbcEncrypt failed");
            return new byte[0];
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceFlashManagerError", e18, "faceEncryptSM4 error", new java.lang.Object[0]);
            return new byte[0];
        }
    }
}
