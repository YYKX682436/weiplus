package n56;

/* loaded from: classes13.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f416700a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("*", "%2A");
        hashMap.put("+", "%20");
        hashMap.put("%7E", "~");
        f416700a = java.util.Collections.unmodifiableMap(hashMap);
    }

    public static java.lang.String a(java.lang.String str) {
        n56.c.b(str, "Cannot decode null object");
        try {
            return java.net.URLDecoder.decode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new j56.b("Charset not found while decoding string: UTF-8", e17);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        n56.c.b(str, "Cannot encode null object");
        try {
            java.lang.String encode = java.net.URLEncoder.encode(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            for (java.util.Map.Entry entry : f416700a.entrySet()) {
                java.lang.String str2 = (java.lang.String) entry.getKey();
                encode = encode.replaceAll(java.util.regex.Pattern.quote(str2), (java.lang.String) entry.getValue());
            }
            return encode;
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new j56.b("Charset not found while encoding string: UTF-8", e17);
        }
    }
}
