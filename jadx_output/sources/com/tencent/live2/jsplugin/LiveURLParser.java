package com.tencent.live2.jsplugin;

/* loaded from: classes10.dex */
public class LiveURLParser {
    private static final java.lang.String TAG = "LiveURLParser";

    public static java.lang.String getStreamId(java.lang.String str) {
        int i17;
        try {
        } catch (java.lang.Exception unused) {
            com.tencent.liteav.base.util.LiteavLog.e(TAG, "getStreamId fail, url:".concat(java.lang.String.valueOf(str)));
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

    public static java.lang.String getURLParams(java.lang.String str, java.lang.String str2) {
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
