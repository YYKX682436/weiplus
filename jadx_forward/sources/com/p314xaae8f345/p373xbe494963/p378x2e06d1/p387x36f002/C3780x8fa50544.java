package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002;

/* renamed from: com.tencent.liteav.base.util.TimeFormat */
/* loaded from: classes7.dex */
public class C3780x8fa50544 {
    /* renamed from: format */
    public static java.lang.String m29563xb45ff7f7(long j17, java.lang.String str) {
        try {
            return new java.text.SimpleDateFormat(str).format(new java.util.Date(j17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("TimeFormat", "toString: Date conversion failed.", e17);
            return "";
        }
    }

    /* renamed from: fromString */
    public static long m29564x80a07c5b(java.lang.String str, java.lang.String str2) {
        try {
            java.util.Date parse = new java.text.SimpleDateFormat(str2).parse(str);
            if (parse == null) {
                return 0L;
            }
            return parse.getTime();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.Log.i("TimeFormat", "formString: Date conversion failed.", e17);
            return 0L;
        }
    }
}
