package sr5;

/* loaded from: classes8.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.regex.Pattern f493404a = java.util.regex.Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.regex.Pattern f493405b = java.util.regex.Pattern.compile("([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]+|::ffff(:0{1,4})?:((25[0-5]|(2[0-4]|1?[0-9])?[0-9])\\\\.){3}(25[0-5]|(2[0-4]|1?[0-9])?[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1?[0-9])?[0-9])\\\\.){3}(25[0-5]|(2[0-4]|1?[0-9])?[0-9])");

    public static boolean a(java.lang.String str) {
        if (str.contains(":")) {
            str = str.substring(str.indexOf(":") + 1);
        }
        return !android.text.TextUtils.isEmpty(str) && f493404a.matcher(str).matches();
    }

    public static boolean b(java.lang.String str) {
        java.lang.String substring = str.contains(":") ? str.substring(str.indexOf(":") + 1) : str;
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        java.util.regex.Pattern pattern = f493405b;
        if (isEmpty || !pattern.matcher(str).matches()) {
            return !android.text.TextUtils.isEmpty(substring) && pattern.matcher(substring).matches();
        }
        return true;
    }
}
