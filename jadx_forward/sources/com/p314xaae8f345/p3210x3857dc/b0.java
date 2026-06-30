package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.a0 f301744a;

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.a0 a0Var = f301744a;
        if (a0Var != null) {
            ((com.p314xaae8f345.mm.p2829xfa87f9de.d0) a0Var).getClass();
            java.lang.String g17 = fp.d0.g(str);
            if (g17 != null) {
                by5.c4.f("LibraryLoader", "findLibrary, use custom library loader, path:" + g17);
                return g17;
            }
        }
        if (context != null) {
            java.lang.String str2 = context.getApplicationInfo().nativeLibraryDir;
            java.io.File file = new java.io.File(str2, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428 + str + ".so");
            if (!file.isDirectory() && file.canRead()) {
                java.lang.String absolutePath = file.getAbsolutePath();
                by5.c4.f("LibraryLoader", "findLibrary, use system library loader, path:" + absolutePath);
                return absolutePath;
            }
            by5.c4.g("LibraryLoader", "findLibrary, nativeLibraryDir:" + str2);
        } else {
            by5.c4.g("LibraryLoader", "findLibrary, invalid context");
        }
        by5.c4.f("LibraryLoader", "findLibrary, can not find library:" + str);
        return null;
    }
}
