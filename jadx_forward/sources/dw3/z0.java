package dw3;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.z0 f325829a = new dw3.z0();

    public final java.lang.String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(bArr.length);
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hexString, "toHexString(...)");
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            java.lang.String upperCase = hexString.toUpperCase();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(upperCase, "toUpperCase(...)");
            stringBuffer.append(upperCase);
        }
        return stringBuffer.toString();
    }

    public final boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.weishi", 64);
            if (packageInfo == null) {
                return false;
            }
            android.content.pm.Signature[] signatureArr = packageInfo.signatures;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(signatureArr);
            byte[] byteArray = signatureArr[0].toByteArray();
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(messageDigest);
            messageDigest.update(byteArray);
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(a(messageDigest.digest()), "2A281593D71DF33374E6124E9106DF08");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeSeeUtil", "checkWeishiInstalled Exception: %s", e17.getMessage());
            return false;
        }
    }
}
