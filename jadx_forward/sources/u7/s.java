package u7;

/* loaded from: classes13.dex */
public abstract class s {
    public static java.lang.String a(java.lang.String str) {
        try {
            return java.net.URLDecoder.decode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("Error decoding url", e17);
        }
    }
}
