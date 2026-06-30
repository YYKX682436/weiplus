package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPCommonUtils */
/* loaded from: classes13.dex */
public class C26565x9aa4e96a {
    private static final java.lang.String TAG = "TPCommonUtils";

    /* renamed from: assertTrue */
    public static void m104272x7ca149f4(boolean z17, java.lang.String str) {
        if (!z17) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    /* renamed from: getMd5 */
    public static java.lang.String m104273xb5885648(java.lang.String str) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(40);
            for (byte b17 : digest) {
                int i17 = b17 & 255;
                if ((i17 >> 4) == 0) {
                    sb6.append("0");
                    sb6.append(java.lang.Integer.toHexString(i17));
                } else {
                    sb6.append(java.lang.Integer.toHexString(i17));
                }
            }
            return sb6.toString();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17.toString());
            return null;
        }
    }

    /* renamed from: isEmpty */
    public static boolean m104274x7aab3243(java.util.Collection<? extends java.lang.Object> collection) {
        return collection == null || collection.size() <= 0;
    }

    /* renamed from: isNumeric */
    public static boolean m104276x66356283(java.lang.String str) {
        try {
            return java.util.regex.Pattern.compile("-?[0-9]+(\\.[0-9]+)?").matcher(new java.math.BigDecimal(str).toString()).matches();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: isUrl */
    public static boolean m104277x5fd37e5(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return str.split(":")[0].matches("^((https|http|ftp|rtsp|mms)?)");
        } catch (java.util.regex.PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: isXmlDocument */
    public static boolean m104278x3e839ac8(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str) || !str.contains("<?xml")) {
                return false;
            }
            javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.StringReader(str)));
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* renamed from: optDouble */
    public static double m104279x2edf0464(java.lang.String str, double d17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Double.parseDouble(str);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return d17;
    }

    /* renamed from: optFloat */
    public static float m104280xf95bbb69(java.lang.String str, int i17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Float.parseFloat(str);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return i17;
    }

    /* renamed from: optInt */
    public static int m104281xc3ca103c(java.lang.String str, int i17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return i17;
    }

    /* renamed from: optLong */
    public static long m104282xb57957cf(java.lang.String str, long j17) {
        if (!android.text.TextUtils.isEmpty(str)) {
            try {
                return java.lang.Long.parseLong(str);
            } catch (java.lang.NumberFormatException e17) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(TAG, e17);
            }
        }
        return j17;
    }

    /* renamed from: requireNotNull */
    public static void m104283x36ec6dd5(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = "this argument should not be null!";
            }
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    /* renamed from: isEmpty */
    public static boolean m104275x7aab3243(java.util.Map<? extends java.lang.Object, ? extends java.lang.Object> map) {
        return map == null || map.size() <= 0;
    }
}
