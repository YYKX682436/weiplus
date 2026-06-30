package com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc;

/* renamed from: com.tencent.live2.jsplugin.LiveURLParser */
/* loaded from: classes10.dex */
public class C3886xbc69c2c2 {
    private static final java.lang.String TAG = "LiveURLParser";

    /* renamed from: getStreamId */
    public static java.lang.String m31943xe699b631(java.lang.String str) {
        int i17;
        try {
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e(TAG, "getStreamId fail, url:".concat(java.lang.String.valueOf(str)));
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf("/");
        int indexOf = str.contains("?") ? str.indexOf("?") : str.length();
        if (lastIndexOf != -1 && indexOf != -1 && indexOf > (i17 = lastIndexOf + 1)) {
            return str.substring(i17, indexOf);
        }
        return "";
    }

    /* renamed from: getURLParams */
    public static java.lang.String m31944x4b3e091f(java.lang.String str, java.lang.String str2) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            java.lang.String[] split = str.split("\\?");
            if (split.length < 2) {
                return "";
            }
            for (java.lang.String str3 : split[1].split("&")) {
                if (str3.indexOf("=") > 0) {
                    java.lang.String substring = str3.substring(0, str3.indexOf("="));
                    java.lang.String substring2 = str3.substring(str3.indexOf("=") + 1);
                    if (substring.equalsIgnoreCase(str2)) {
                        return substring2;
                    }
                }
            }
        }
        return "";
    }
}
