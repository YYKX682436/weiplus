package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGDiskCache */
/* loaded from: classes12.dex */
public class C29689x715d3c0f {
    static {
        b56.a.a("pag");
    }

    /* renamed from: GetCacheDir */
    private static java.lang.String m154708xc56cfb01() {
        android.content.Context context = b56.a.f99646a;
        if (context == null) {
            return "";
        }
        java.io.File externalCacheDir = ("mounted".equals(android.os.Environment.getExternalStorageState()) || !android.os.Environment.isExternalStorageRemovable()) ? context.getExternalCacheDir() : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        return externalCacheDir == null ? "" : externalCacheDir.getPath();
    }

    /* renamed from: MaxDiskSize */
    public static native long m154709xed3858a2();

    /* renamed from: ReadFile */
    public static native byte[] m154710xd01e6c52(java.lang.String str);

    /* renamed from: RemoveAll */
    public static native void m154711xc3e12a5d();

    /* renamed from: SetMaxDiskSize */
    public static native void m154712xbe513720(long j17);

    /* renamed from: WriteFile */
    public static native boolean m154713x2398d9db(java.lang.String str, byte[] bArr);
}
