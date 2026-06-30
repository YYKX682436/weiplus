package com.tencent.liteav.base.util;

/* loaded from: classes7.dex */
public class TimeFormat {
    public static java.lang.String format(long j17, java.lang.String str) {
        try {
            return new java.text.SimpleDateFormat(str).format(new java.util.Date(j17));
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.i("TimeFormat", "toString: Date conversion failed.", e17);
            return "";
        }
    }

    public static long fromString(java.lang.String str, java.lang.String str2) {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(str2).parse(str);
            if (parse == null) {
                return 0L;
            }
            return parse.getTime();
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.i("TimeFormat", "formString: Date conversion failed.", e17);
            return 0L;
        }
    }
}
