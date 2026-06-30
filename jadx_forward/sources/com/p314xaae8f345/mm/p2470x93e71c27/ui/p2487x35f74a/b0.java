package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f272699a = java.util.regex.Pattern.compile("<a[^>]*href\\s*=\\s*[\"|']\\s*([^>]{0,2048})\\s*[\"|'][^>]*>((\\s|\\S){0,1024}?)</a>");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f272700b = java.util.regex.Pattern.compile("<a[^>]*href\\s*=\\s*[\"|']\\s*([^>]{0,2048})\\s*[\"|'][^>]*>((\\s|\\S){0,1024}?)</a>");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f272701c = java.util.regex.Pattern.compile("<a.{1,1000}?href\\s*=\\s*[\"|']\\s*(.{1,500}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.regex.Pattern f272702d = java.util.regex.Pattern.compile("<a.{1,1000}?href\\s*=\\s*[\"|']\\s*(.{1,300}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.regex.Pattern f272703e = java.util.regex.Pattern.compile("<a.{1,500}?href\\s*=\\s*[\"|']\\s*(.{1,1024}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f272704f = java.util.regex.Pattern.compile("<a.{1,100}?href\\s*=\\s*[\"|']\\s*(.{1,1024}?)\\s*[\"|']\\s*>(.+?)</a>");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.regex.Pattern f272705g = java.util.regex.Pattern.compile("<_wc_custom_link_.+?color\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*href\\s*=\\s*[\"|']\\s*(.*?)\\s*[\"|']\\s*.*?>(.*?)</_wc_custom_link_>");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f272706h = java.util.regex.Pattern.compile("<textstatus_iconId=\"([^\"]+)\"/>");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f272707i = java.util.regex.Pattern.compile("<_wc_custom_link_.+?\\s*href\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*>(.*?)</_wc_custom_link_>");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f272708j = java.util.regex.Pattern.compile("<img.+?src=\"(.+?)\\.(png|svg)\"/>\\s*");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f272709k = java.util.regex.Pattern.compile("weixin://\\S+");

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.regex.Pattern f272710l = java.util.regex.Pattern.compile("((?:(http|https|Http|Https|rtsp|Rtsp):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([-_a-zA-Z0-9]([-_a-zA-Z0-9\\-]{0,61}[-_a-zA-Z0-9]){0,1}\\.)+[a-zA-Z]{2,6}|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)(\\/(?:(?:[-_a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?", 2);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f272711m = java.util.regex.Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.regex.Pattern f272712n = java.util.regex.Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9._-]+\\.[A-Z]+", 2);

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f272713o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f272714p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.regex.Pattern f272715q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.regex.Pattern f272716r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.regex.Pattern f272717s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.regex.Pattern f272718t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.regex.Pattern f272719u;

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.regex.Pattern f272720v;

    static {
        java.util.regex.Pattern.compile("#冒泡#");
        f272713o = java.util.regex.Pattern.compile("\\+?(\\d{2,8}([- ]?\\d{3,8}){2,6}|\\d{5,20})([,;]+\\d{0,20}#?){0,5}");
        f272714p = java.util.regex.Pattern.compile("weixin://wxpay/\\S+");
        f272715q = java.util.regex.Pattern.compile("weixin://dl/\\w+");
        f272716r = java.util.regex.Pattern.compile("weixin://dl/business(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~%\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
        f272717s = java.util.regex.Pattern.compile("\\d{1,5}\\s(\\w+[\\s,.]+){2,8}\\d{5}(-\\d{4})?([\\s,]*USA)?", 2);
        f272718t = java.util.regex.Pattern.compile("([A-Za-z0-9]{3,})");
        java.util.regex.Pattern.compile("^(62[0-9]{14,17})$");
        java.util.regex.Pattern.compile("^(1[0-9]{10})$");
        f272719u = java.util.regex.Pattern.compile("([#＃][^#＃\\s,.，。@]{1,1000})");
        f272720v = java.util.regex.Pattern.compile("mp://\\w+");
    }
}
