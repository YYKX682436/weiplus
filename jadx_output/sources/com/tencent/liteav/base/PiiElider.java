package com.tencent.liteav.base;

/* loaded from: classes13.dex */
public class PiiElider {
    private static final java.lang.String[] APP_NAMESPACE;
    private static final java.lang.String CONSOLE_ELISION = "[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE";
    private static final java.util.regex.Pattern CONSOLE_MSG;
    private static final java.util.regex.Pattern DOMAIN_NAME;
    private static final java.lang.String EMAIL_ELISION = "XXX@EMAIL.ELIDED";
    private static final java.lang.String GOOD_GTLD_CHAR = "a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef";
    private static final java.lang.String GOOD_IRI_CHAR = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";
    private static final java.lang.String GTLD = "[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final java.lang.String HOST_NAME = "([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";
    private static final java.util.regex.Pattern IP_ADDRESS;
    private static final java.lang.String IRI = "[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}";
    private static final java.util.regex.Pattern LIKELY_EXCEPTION_LOG;
    private static final java.util.regex.Pattern MAC_ADDRESS;
    private static final java.lang.String MAC_ELISION = "01:23:45:67:89:AB";
    private static final java.lang.String[] SYSTEM_NAMESPACE;
    private static final java.lang.String URL_ELISION = "HTTP://WEBADDRESS.ELIDED";
    private static final java.util.regex.Pattern WEB_URL;

    static {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
        IP_ADDRESS = compile;
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|" + compile + ")");
        DOMAIN_NAME = compile2;
        LIKELY_EXCEPTION_LOG = java.util.regex.Pattern.compile("\\sat\\sorg\\.chromium\\.[^ ]+.");
        WEB_URL = java.util.regex.Pattern.compile("(?:\\b|^)((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:" + compile2 + ")(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?(?:\\b|$)");
        MAC_ADDRESS = java.util.regex.Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");
        CONSOLE_MSG = java.util.regex.Pattern.compile("\\[\\w*:CONSOLE.*\\].*");
        APP_NAMESPACE = new java.lang.String[]{"org.chromium.", "com.google."};
        SYSTEM_NAMESPACE = new java.lang.String[]{"android.accessibilityservice", "android.accounts", "android.animation", "android.annotation", "android.app", "android.appwidget", "android.bluetooth", "android.content", "android.database", "android.databinding", "android.drm", "android.gesture", "android.graphics", "android.hardware", "android.inputmethodservice", "android.location", "android.media", "android.mtp", "android.net", "android.nfc", "android.opengl", "android.os", "android.preference", "android.print", "android.printservice", "android.provider", "android.renderscript", "android.sax", "android.security", "android.service", "android.speech", "android.support", "android.system", "android.telecom", "android.telephony", "android.test", "android.text", "android.transition", "android.util", "android.view", "android.webkit", "android.widget", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull."};
    }

    public static java.lang.String elideConsole(java.lang.String str) {
        return CONSOLE_MSG.matcher(str).replaceAll(CONSOLE_ELISION);
    }

    public static java.lang.String elideEmail(java.lang.String str) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).replaceAll(EMAIL_ELISION);
    }

    public static java.lang.String elideMac(java.lang.String str) {
        return MAC_ADDRESS.matcher(str).replaceAll(MAC_ELISION);
    }

    public static java.lang.String elideUrl(java.lang.String str) {
        if (LIKELY_EXCEPTION_LOG.matcher(str).find()) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.regex.Matcher matcher = WEB_URL.matcher(sb6);
        int i17 = 0;
        while (matcher.find(i17)) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String substring = sb6.substring(start, end);
            if (likelyToBeAppNamespace(substring) || likelyToBeSystemNamespace(substring)) {
                i17 = end;
            } else {
                sb6.replace(start, end, URL_ELISION);
                i17 = start + 24;
                matcher = WEB_URL.matcher(sb6);
            }
        }
        return sb6.toString();
    }

    private static boolean likelyToBeAppNamespace(java.lang.String str) {
        for (java.lang.String str2 : APP_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean likelyToBeSystemNamespace(java.lang.String str) {
        for (java.lang.String str2 : SYSTEM_NAMESPACE) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String sanitizeStacktrace(java.lang.String str) {
        java.lang.String[] split = str.split("\\n");
        split[0] = elideUrl(split[0]);
        for (int i17 = 1; i17 < split.length; i17++) {
            if (split[i17].startsWith("Caused by:")) {
                split[i17] = elideUrl(split[i17]);
            }
        }
        return android.text.TextUtils.join("\n", split);
    }
}
