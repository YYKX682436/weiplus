package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.PiiElider */
/* loaded from: classes13.dex */
public class C29331x1f0df1bf {

    /* renamed from: CHROME_VARIANT_INFO */
    private static final java.lang.String f73372xf740e9ed = "chromium-[^\\.]+\\.aab";

    /* renamed from: CONSOLE_ELISION */
    private static final java.lang.String f73373x25aec32f = "[ELIDED:CONSOLE(0)] ELIDED CONSOLE MESSAGE";

    /* renamed from: DOMAIN_NAME */
    private static final java.lang.String f73375x884b3d26 = "(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))";

    /* renamed from: EMAIL_ELISION */
    private static final java.lang.String f73376x698c9074 = "XXX@EMAIL.ELIDED";

    /* renamed from: GOOD_GTLD_CHAR */
    private static final java.lang.String f73377x355f532e = "a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef";

    /* renamed from: GOOD_IRI_CHAR */
    private static final java.lang.String f73378x74840d37 = "a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef";

    /* renamed from: GTLD */
    private static final java.lang.String f73379x218b25 = "[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";

    /* renamed from: HOST_NAME */
    private static final java.lang.String f73380x7d1786c2 = "([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}";

    /* renamed from: INTENT */
    private static final java.lang.String f73381x81042a9c = "([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))";

    /* renamed from: INTENT_SCHEME */
    private static final java.lang.String f73382x83f414a8 = "[a-zA-Z][a-zA-Z0-9+.-]+://";

    /* renamed from: IP_ADDRESS */
    private static final java.lang.String f73383x7146c0bc = "((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))";

    /* renamed from: IP_ELISION */
    private static final java.lang.String f73384x52cd6b1f = "1.2.3.4";
    private static final java.lang.String IRI = "[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}";

    /* renamed from: MAC_ELISION */
    private static final java.lang.String f73387xf1d20327 = "01:23:45:67:89:AB";

    /* renamed from: PATH_CHAR */
    private static final java.lang.String f73388x9151b730 = "(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))";

    /* renamed from: PATH_COMPONENT */
    private static final java.lang.String f73389x85185943 = "((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+)";

    /* renamed from: PORT */
    private static final java.lang.String f73390x259081 = "(:\\d{1,5})";

    /* renamed from: URI_CHAR */
    private static final java.lang.String f73392xf16eea69 = "([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2}))";

    /* renamed from: URI_ENCODED_CHAR */
    private static final java.lang.String f73393xcbd341a = "(%[a-fA-F0-9]{2})";

    /* renamed from: URI_SCHEME */
    private static final java.lang.String f73394x6c680ff8 = "((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)";

    /* renamed from: URL_ELISION */
    private static final java.lang.String f73395x8400347 = "HTTP://WEBADDRESS.ELIDED";

    /* renamed from: URL_OR_INTENT */
    private static final java.lang.String f73396xad40f588 = "((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+)))";

    /* renamed from: URL_WITH_OPTIONAL_SCHEME_AND_PORT */
    private static final java.lang.String f73397x5e3c62ed = "(((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)";

    /* renamed from: WEB_URL */
    private static final java.util.regex.Pattern f73398x73cb0dc4 = java.util.regex.Pattern.compile("(\\b|^)(((((http|https|Http|Https|rtsp|Rtsp)://(([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,64}(:([a-zA-Z0-9$_.+!*'(),;?&=-]|(%[a-fA-F0-9]{2})){1,25})?@)?)?(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef-]{0,61}[a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef]){0,1}\\.)+[a-zA-Z -\ud7ff豈-﷏ﷰ-\uffef]{2,63}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(:\\d{1,5})?)|([a-zA-Z][a-zA-Z0-9+.-]+://((([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))+))))(/(([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef;/?:@&=#~.+!*'(),_-])|(%[a-fA-F0-9]{2}))*)?(\\b|$)");

    /* renamed from: LIKELY_EXCEPTION_LOG */
    private static final java.util.regex.Pattern f73385x8e45c179 = java.util.regex.Pattern.compile("\\sat\\s(org\\.chromium|com\\.google|java|android|com\\.android)\\.[^ ]+.|\\(chromium-[^\\.]+\\.aab[^:]+:\\d+\\)|Caused by: java\\.lang\\.(ClassNotFoundException|NoClassDefFoundError):");

    /* renamed from: MAC_ADDRESS */
    private static final java.util.regex.Pattern f73386x104b58c4 = java.util.regex.Pattern.compile("([0-9a-fA-F]{2}[-:]+){5}[0-9a-fA-F]{2}");

    /* renamed from: CONSOLE_MSG */
    private static final java.util.regex.Pattern f73374xe155859 = java.util.regex.Pattern.compile("\\[\\w*:CONSOLE.*\\].*");

    /* renamed from: APP_NAMESPACE */
    private static final java.lang.String[] f73371x163c907d = {"org.chromium.", "com.google.", "com.chrome."};

    /* renamed from: SYSTEM_NAMESPACE */
    private static final java.lang.String[] f73391x5121172b = {"android.", "com.android.", "dalvik.", "java.", "javax.", "org.apache.", "org.json.", "org.w3c.dom.", "org.xml.", "org.xmlpull.", "System."};

    /* renamed from: elideConsole */
    public static java.lang.String m152584x8e329b34(java.lang.String str) {
        return f73374xe155859.matcher(str).replaceAll(f73373x25aec32f);
    }

    /* renamed from: elideEmail */
    public static java.lang.String m152585xe37bd4b9(java.lang.String str) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(str).replaceAll(f73376x698c9074);
    }

    /* renamed from: elideIp */
    public static java.lang.String m152586x9d17612a(java.lang.String str) {
        return android.util.Patterns.IP_ADDRESS.matcher(str).replaceAll(f73384x52cd6b1f);
    }

    /* renamed from: elideMac */
    public static java.lang.String m152587x5d4d1ac(java.lang.String str) {
        return f73386x104b58c4.matcher(str).replaceAll(f73387xf1d20327);
    }

    /* renamed from: elideUrl */
    public static java.lang.String m152588x5d4f1cc(java.lang.String str) {
        if (f73385x8e45c179.matcher(str).find()) {
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        java.util.regex.Matcher matcher = f73398x73cb0dc4.matcher(sb6);
        int i17 = 0;
        while (matcher.find(i17)) {
            int start = matcher.start();
            int end = matcher.end();
            java.lang.String substring = sb6.substring(start, end);
            if (m152591xf7197afc(substring) || m152593x8cf04dea(substring) || m152592x8b1dd965(substring)) {
                i17 = end;
            } else {
                sb6.replace(start, end, f73395x8400347);
                i17 = start + 24;
                matcher = f73398x73cb0dc4.matcher(sb6);
            }
        }
        return sb6.toString();
    }

    /* renamed from: getSanitizedStacktrace */
    public static java.lang.String m152589x8e6e3c02(java.lang.Throwable th6) {
        return m152594x2c0d5906(org.p3343x72743996.p3344x2e06d1.Log.m152496x2d915d84(th6));
    }

    /* renamed from: isClassName */
    private static boolean m152590x45a65e19(java.lang.String str) {
        try {
            java.lang.Class.forName(str, false, org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().getClassLoader());
            return true;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    /* renamed from: likelyToBeAppNamespace */
    private static boolean m152591xf7197afc(java.lang.String str) {
        for (java.lang.String str2 : f73371x163c907d) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: likelyToBeClassOrMethodName */
    private static boolean m152592x8b1dd965(java.lang.String str) {
        if (m152590x45a65e19(str)) {
            return true;
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return false;
        }
        return m152590x45a65e19(str.substring(0, lastIndexOf));
    }

    /* renamed from: likelyToBeSystemNamespace */
    private static boolean m152593x8cf04dea(java.lang.String str) {
        for (java.lang.String str2 : f73391x5121172b) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: sanitizeStacktrace */
    public static java.lang.String m152594x2c0d5906(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String[] split = str.split("\\n");
        split[0] = m152588x5d4f1cc(split[0]);
        for (int i17 = 1; i17 < split.length; i17++) {
            if (split[i17].startsWith("Caused by:")) {
                split[i17] = m152588x5d4f1cc(split[i17]);
            }
        }
        return android.text.TextUtils.join("\n", split);
    }
}
