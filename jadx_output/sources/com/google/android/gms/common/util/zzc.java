package com.google.android.gms.common.util;

/* loaded from: classes8.dex */
final class zzc {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static java.lang.String zza(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zza.matcher(str);
        java.lang.StringBuilder sb6 = null;
        int i17 = 0;
        while (matcher.find()) {
            if (sb6 == null) {
                sb6 = new java.lang.StringBuilder();
            }
            int start = matcher.start();
            int i18 = start;
            while (i18 >= 0 && str.charAt(i18) == '\\') {
                i18--;
            }
            if ((start - i18) % 2 != 0) {
                int parseInt = java.lang.Integer.parseInt(matcher.group().substring(2), 16);
                sb6.append((java.lang.CharSequence) str, i17, matcher.start());
                if (parseInt == 92) {
                    sb6.append("\\\\");
                } else {
                    sb6.append(java.lang.Character.toChars(parseInt));
                }
                i17 = matcher.end();
            }
        }
        if (sb6 == null) {
            return str;
        }
        if (i17 < matcher.regionEnd()) {
            sb6.append((java.lang.CharSequence) str, i17, matcher.regionEnd());
        }
        return sb6.toString();
    }
}
