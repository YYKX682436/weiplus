package com.p314xaae8f345.p373xbe494963.p378x2e06d1;

/* renamed from: com.tencent.liteav.base.PiiElider */
/* loaded from: classes13.dex */
public class C3742x1f0df1bf {

    /* renamed from: APP_NAMESPACE */
    private static final java.lang.String[] f14627x163c907d;

    /* renamed from: CONSOLE_ELISION */
    private static final java.lang.String f14628x25aec32f = "[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE";

    /* renamed from: CONSOLE_MSG */
    private static final java.util.regex.Pattern f14629xe155859;

    /* renamed from: DOMAIN_NAME */
    private static final java.util.regex.Pattern f14630x884b3d26;

    /* renamed from: EMAIL_ELISION */
    private static final java.lang.String f14631x698c9074 = "XXX@EMAIL.ELIDED";

    /* renamed from: GOOD_GTLD_CHAR */
    private static final java.lang.String f14632x355f532e = "a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef";

    /* renamed from: GOOD_IRI_CHAR */
    private static final java.lang.String f14633x74840d37 = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";

    /* renamed from: GTLD */
    private static final java.lang.String f14634x218b25 = "[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";

    /* renamed from: HOST_NAME */
    private static final java.lang.String f14635x7d1786c2 = "([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";

    /* renamed from: IP_ADDRESS */
    private static final java.util.regex.Pattern f14636x7146c0bc;
    private static final java.lang.String IRI = "[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}";

    /* renamed from: LIKELY_EXCEPTION_LOG */
    private static final java.util.regex.Pattern f14637x8e45c179;

    /* renamed from: MAC_ADDRESS */
    private static final java.util.regex.Pattern f14638x104b58c4;

    /* renamed from: MAC_ELISION */
    private static final java.lang.String f14639xf1d20327 = "01:23:45:67:89:AB";

    /* renamed from: SYSTEM_NAMESPACE */
    private static final java.lang.String[] f14640x5121172b;

    /* renamed from: URL_ELISION */
    private static final java.lang.String f14641x8400347 = "HTTP://WEBADDRESS.ELIDED";

    /* renamed from: WEB_URL */
    private static final java.util.regex.Pattern f14642x73cb0dc4;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
        f14636x7146c0bc = compile;
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|" + compile + ")");
        f14630x884b3d26 = compile2;
        f14637x8e45c179 = java.util.regex.Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");
        f14642x73cb0dc4 = java.util.regex.Pattern.compile("(?:\\b|^)((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + compile2 + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        f14638x104b58c4 = java.util.regex.Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        f14629xe155859 = java.util.regex.Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        f14627x163c907d = new java.lang.String[]{"org.chromium.", "com.google."};
        f14640x5121172b = new java.lang.String[]{"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    /* renamed from: elideConsole */
    public static java.lang.String m29280x8e329b34(java.lang.String str) {
        return f14629xe155859.matcher(str).replaceAll(f14628x25aec32f);
    }

    /* renamed from: elideEmail */
    public static java.lang.String m29281xe37bd4b9(java.lang.String str) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).replaceAll(f14631x698c9074);
    }

    /* renamed from: elideMac */
    public static java.lang.String m29282x5d4d1ac(java.lang.String str) {
        return f14638x104b58c4.matcher(str).replaceAll(f14639xf1d20327);
    }

    /* renamed from: elideUrl */
    public static java.lang.String m29283x5d4f1cc(java.lang.String str) {
        if (f14637x8e45c179.matcher(str).find()) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.regex.Matcher matcher = f14642x73cb0dc4.matcher(sb6);
        int i17 = 0;
        while (matcher.find(i17)) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String substring = sb6.substring(start, end);
            if (m29284xf7197afc(substring) || m29285x8cf04dea(substring)) {
                i17 = end;
            } else {
                sb6.replace(start, end, f14641x8400347);
                i17 = start + 24;
                matcher = f14642x73cb0dc4.matcher(sb6);
            }
        }
        return sb6.toString();
    }

    /* renamed from: likelyToBeAppNamespace */
    private static boolean m29284xf7197afc(java.lang.String str) {
        for (java.lang.String str2 : f14627x163c907d) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: likelyToBeSystemNamespace */
    private static boolean m29285x8cf04dea(java.lang.String str) {
        for (java.lang.String str2 : f14640x5121172b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: sanitizeStacktrace */
    public static java.lang.String m29286x2c0d5906(java.lang.String str) {
        java.lang.String[] split = str.split("\\n");
        split[0] = m29283x5d4f1cc(split[0]);
        for (int i17 = 1; i17 < split.length; i17++) {
            if (split[i17].startsWith("Caused by:")) {
                split[i17] = m29283x5d4f1cc(split[i17]);
            }
        }
        return android.text.TextUtils.join("\n", split);
    }
}
