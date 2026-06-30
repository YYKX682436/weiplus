package a46;

/* loaded from: classes13.dex */
public class c implements a46.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a46.c f1355b = new a46.c();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f1356c = d("Google Brotli Dec", "https://github.com/google/brotli/");

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f1357d = d("XZ for Java", "https://tukaani.org/xz/java.html");

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f1358e = d("Zstd JNI", "https://github.com/luben/zstd-jni");

    /* renamed from: a, reason: collision with root package name */
    public java.util.SortedMap f1359a;

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        return " In addition to Apache Commons Compress you need the " + str + " library - see " + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a46.b a(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a46.c.a(java.io.InputStream):a46.b");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9 == b46.b.CACHED_AVAILABLE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        if (r9 == m46.b.CACHED_AVAILABLE) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        if (r9 == o46.b.CACHED_AVAILABLE) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        if (r9 == i46.b.CACHED_AVAILABLE) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a46.b b(java.lang.String r9, java.io.InputStream r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a46.c.b(java.lang.String, java.io.InputStream, boolean):a46.b");
    }

    public java.util.Set c() {
        java.util.HashSet hashSet = new java.util.HashSet(14);
        java.util.Collections.addAll(hashSet, "gz", "br", "bzip2", "xz", "lzma", "pack200", "deflate", "snappy-raw", "snappy-framed", "z", "lz4-block", "lz4-framed", "zstd", "deflate64");
        return hashSet;
    }
}
