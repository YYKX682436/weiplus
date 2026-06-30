package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public abstract class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f273982a = java.util.regex.Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f273983b = java.util.regex.Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.regex.Pattern f273984c = java.util.regex.Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    public static boolean a(java.lang.String str) {
        return f273982a.matcher(str).matches();
    }

    public static boolean b(java.lang.String str) {
        return f273983b.matcher(str).matches() || f273984c.matcher(str).matches();
    }
}
