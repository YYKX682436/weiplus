package v6;

/* loaded from: classes13.dex */
public abstract class b {
    public static boolean a(android.net.Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
