package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes8.dex */
public final class hr {

    /* renamed from: a, reason: collision with root package name */
    private static java.text.SimpleDateFormat f131373a = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    public static boolean a(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }

    private static boolean b(java.lang.String str, java.lang.String str2) {
        return (str2 == null || str == null || str2.indexOf(str) != 0) ? false : true;
    }

    public static java.lang.String c(java.lang.String str) {
        return str == null ? "" : str;
    }

    private static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static java.lang.String e(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLDecoder.decode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    private static java.lang.String f(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            return java.net.URLEncoder.encode(str, "gbk");
        } catch (java.io.UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static boolean g(java.lang.String str) {
        if (a(str)) {
            return false;
        }
        return str.equals(com.p314xaae8f345.map.lib.p496xc04b6a6a.AbstractC4234xc56d2fbc.f16300xbb5875c9) || str.equals("当前位置") || str.equals("我在哪") || str.equals("我在哪儿") || str.equals("我在的位置") || str.equals("我的位置在哪") || str.equals("我的位置在哪儿");
    }

    private static boolean h(java.lang.String str) {
        try {
            return java.util.regex.Pattern.compile("[0-9]*").matcher(str).matches();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private static java.lang.String i(java.lang.String str) {
        if (a(str)) {
            return str;
        }
        try {
            java.net.URI uri = new java.net.URI(str);
            java.lang.String[] split = uri.getQuery().split("&");
            java.util.Arrays.sort(split);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (java.lang.String str2 : split) {
                sb6.append(str2);
            }
            return new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), sb6.toString(), uri.getFragment()).toString();
        } catch (java.net.URISyntaxException unused) {
            return str;
        }
    }

    private static int j(java.lang.String str) {
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            int i19 = i17 + 1;
            i18 = str.substring(i17, i19).matches("[一-龥]") ? i18 + 1 : (int) (i18 + 0.5d);
            i17 = i19;
        }
        return i18;
    }

    private static java.lang.CharSequence a(java.lang.String[] strArr, int[] iArr) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (int i17 = 0; i17 < strArr.length; i17++) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(strArr[i17]);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(iArr[i17]), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    public static java.lang.String b(java.lang.String str) {
        int lastIndexOf;
        return (!a(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) ? str.substring(0, lastIndexOf) : str;
    }

    private static boolean c(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        return str2.contains(str);
    }

    private static int d(java.lang.String str, java.lang.String str2) {
        java.lang.String[] split = str.split("\\.");
        java.lang.String[] split2 = str2.split("\\.");
        int i17 = 0;
        while (true) {
            if (i17 < (split.length > split2.length ? split2.length : split.length)) {
                int intValue = java.lang.Integer.valueOf(split[i17]).intValue() - java.lang.Integer.valueOf(split2[i17]).intValue();
                if (intValue != 0) {
                    return intValue;
                }
                i17++;
            } else {
                if (split.length != split2.length) {
                    return split.length - split2.length;
                }
                return 0;
            }
        }
    }

    public static java.lang.String a(byte[] bArr, java.lang.String str) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new java.lang.String(bArr, str);
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static java.lang.String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(256);
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString);
        }
        return sb6.toString();
    }

    private static java.lang.String a(long j17) {
        return f131373a.format(java.lang.Long.valueOf(j17));
    }

    public static boolean a(java.lang.String str, java.lang.String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return str2.equals(str);
        }
        return false;
    }

    private static java.lang.String a(java.util.Collection<java.lang.String> collection, java.lang.String str) {
        if (collection == null || collection.isEmpty() || str == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.String str2 : collection) {
            if (i17 == collection.size() - 1) {
                sb6.append(str2);
            } else {
                sb6.append(str2);
                sb6.append(str);
            }
            i17++;
        }
        return sb6.toString();
    }
}
