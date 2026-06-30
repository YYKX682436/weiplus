package lo0;

/* loaded from: classes12.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final java.lang.String b(java.lang.String str) {
        java.io.File file = new java.io.File(str);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalPath);
            return canonicalPath;
        } catch (java.io.IOException unused) {
            java.lang.String absolutePath = file.getAbsolutePath();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(absolutePath);
            return absolutePath;
        }
    }

    public final java.lang.String a(java.lang.String relativePath, java.lang.String absoluteParentPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(relativePath, "relativePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(absoluteParentPath, "absoluteParentPath");
        if (relativePath.length() == 0) {
            return null;
        }
        if (absoluteParentPath.length() == 0) {
            return null;
        }
        java.lang.String b17 = b(absoluteParentPath);
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(absoluteParentPath, relativePath).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String b18 = b(o17);
        if (r26.i0.y(b18, b17, false)) {
            return b18;
        }
        return null;
    }
}
