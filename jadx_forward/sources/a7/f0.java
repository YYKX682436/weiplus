package a7;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f83354b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f83355a = f83354b;

    static {
        java.lang.String property = java.lang.System.getProperty("http.agent");
        if (!android.text.TextUtils.isEmpty(property)) {
            int length = property.length();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(property.length());
            for (int i17 = 0; i17 < length; i17++) {
                char charAt = property.charAt(i17);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb6.append(charAt);
                } else {
                    sb6.append('?');
                }
            }
            property = sb6.toString();
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        if (!android.text.TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", java.util.Collections.singletonList(new a7.g0(property)));
        }
        f83354b = java.util.Collections.unmodifiableMap(hashMap);
    }
}
