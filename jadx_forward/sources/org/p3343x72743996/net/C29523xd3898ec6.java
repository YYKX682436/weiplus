package org.p3343x72743996.net;

/* renamed from: org.chromium.net.MimeTypeFilter */
/* loaded from: classes7.dex */
public class C29523xd3898ec6 implements java.io.FileFilter {

    /* renamed from: mAcceptAllMimeTypes */
    private boolean f73877x7e63c879;

    /* renamed from: mAcceptDirectory */
    private boolean f73878x8dbfe218;

    /* renamed from: mMimeTypeMap */
    private android.webkit.MimeTypeMap f73881x8ee5be41;

    /* renamed from: mExtensions */
    private java.util.HashSet<java.lang.String> f73879x70586461 = new java.util.HashSet<>();

    /* renamed from: mMimeTypes */
    private java.util.HashSet<java.lang.String> f73882x6e6f0eb8 = new java.util.HashSet<>();

    /* renamed from: mMimeSupertypes */
    private java.util.HashSet<java.lang.String> f73880x1c50b6ff = new java.util.HashSet<>();

    public C29523xd3898ec6(java.util.List<java.lang.String> list, boolean z17) {
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase = it.next().trim().toLowerCase(java.util.Locale.US);
            if (lowerCase.startsWith(".")) {
                this.f73879x70586461.add(lowerCase.substring(1));
            } else if (lowerCase.equals("*/*")) {
                this.f73877x7e63c879 = true;
            } else if (lowerCase.endsWith("/*")) {
                this.f73880x1c50b6ff.add(lowerCase.substring(0, lowerCase.length() - 2));
            } else if (lowerCase.contains("/")) {
                this.f73882x6e6f0eb8.add(lowerCase);
            }
        }
        this.f73881x8ee5be41 = android.webkit.MimeTypeMap.getSingleton();
        this.f73878x8dbfe218 = z17;
    }

    /* renamed from: getMimeSupertype */
    private static java.lang.String m153299x9d09fbab(java.lang.String str) {
        return str.split("/", 2)[0];
    }

    /* renamed from: getMimeTypeFromExtension */
    private java.lang.String m153300x95c22f11(java.lang.String str) {
        java.lang.String mimeTypeFromExtension = this.f73881x8ee5be41.getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension != null) {
            return mimeTypeFromExtension.toLowerCase(java.util.Locale.US);
        }
        return null;
    }

    /* renamed from: accept */
    public boolean m153301xab27b508(android.net.Uri uri, java.lang.String str) {
        if (uri != null) {
            java.lang.String lowerCase = android.webkit.MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase(java.util.Locale.US);
            if (this.f73879x70586461.contains(lowerCase)) {
                return true;
            }
            if (str == null) {
                str = m153300x95c22f11(lowerCase);
            }
        }
        if (str != null) {
            return this.f73877x7e63c879 || this.f73882x6e6f0eb8.contains(str) || this.f73880x1c50b6ff.contains(m153299x9d09fbab(str));
        }
        return false;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        if (file.isDirectory()) {
            return this.f73878x8dbfe218;
        }
        return m153301xab27b508(android.net.Uri.fromFile(file), null);
    }
}
