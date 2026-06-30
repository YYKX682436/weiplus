package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.PackageUtils */
/* loaded from: classes13.dex */
public class C29326x995dfc2b {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73354x7118e671 = false;

    /* renamed from: HEX_CHAR_LOOKUP */
    private static final char[] f73355xbe15973f = "0123456789ABCDEF".toCharArray();
    private static final java.lang.String TAG = "PackageUtils";

    private C29326x995dfc2b() {
    }

    /* renamed from: byteArrayToHexString */
    public static java.lang.String m152553x7dd913e0(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder((bArr.length * 3) - 1);
        for (int i17 = 0; i17 < bArr.length; i17++) {
            char[] cArr = f73355xbe15973f;
            sb6.append(cArr[(bArr[i17] & 240) >>> 4]);
            sb6.append(cArr[bArr[i17] & 15]);
            if (i17 < bArr.length - 1) {
                sb6.append(':');
            }
        }
        return sb6.toString();
    }

    /* renamed from: getApplicationPackageInfo */
    public static android.content.pm.PackageInfo m152554xf7fb219a(int i17) {
        return m152556xffec0de(org.p3343x72743996.p3344x2e06d1.C29285x23ebd81c.m152232x9cf0d20b().f73200x362a8ff1, i17);
    }

    /* renamed from: getCertificateSHA256FingerprintForPackage */
    public static java.util.List<java.lang.String> m152555x9bece239(java.lang.String str) {
        android.content.pm.PackageInfo m152556xffec0de = m152556xffec0de(str, 64);
        if (m152556xffec0de == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(m152556xffec0de.signatures.length);
        for (android.content.pm.Signature signature : m152556xffec0de.signatures) {
            try {
                arrayList.add(m152553x7dd913e0(java.security.MessageDigest.getInstance("SHA256").digest(((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()))).getEncoded())));
            } catch (java.security.NoSuchAlgorithmException | java.security.cert.CertificateException e17) {
                org.p3343x72743996.p3344x2e06d1.Log.w(TAG, "Exception", e17);
                return null;
            }
        }
        return arrayList;
    }

    /* renamed from: getPackageInfo */
    public static android.content.pm.PackageInfo m152556xffec0de(java.lang.String str, int i17) {
        try {
            return org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getPackageManager().getPackageInfo(str, i17);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: getPackageVersion */
    public static int m152558xfff012a8(java.lang.String str) {
        android.content.pm.PackageInfo m152556xffec0de = m152556xffec0de(str, 0);
        if (m152556xffec0de != null) {
            return m152556xffec0de.versionCode;
        }
        return -1;
    }

    /* renamed from: isPackageInstalled */
    public static boolean m152559x1be04f1e(java.lang.String str) {
        return m152556xffec0de(str, 0) != null;
    }

    /* renamed from: getPackageVersion */
    public static int m152557xfff012a8(android.content.Context context, java.lang.String str) {
        return m152558xfff012a8(str);
    }
}
