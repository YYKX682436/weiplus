package com.tencent.mm.fontdecode;

/* loaded from: classes10.dex */
public class PathExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final long f68149a;

    /* loaded from: classes10.dex */
    public static class Metrics {
        public float ascender;
        public float descender;
        public float height;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("fontdecode");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public PathExtractor(java.lang.String str) {
        long nInit = nInit(str);
        this.f68149a = nInit;
        if (nInit != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PathExtractor", "create for %s, %d", str, java.lang.Long.valueOf(nInit));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.PathExtractor", "create for %s failed", str);
        }
    }

    private static native boolean nExtractPath(long j17, char c17, android.graphics.Path path, int[] iArr);

    private static native void nFinalize(long j17);

    private static native void nGetMetrics(long j17, com.tencent.mm.fontdecode.PathExtractor.Metrics metrics);

    private static native long nInit(java.lang.String str);

    private static native void nSetTextSize(long j17, int i17);

    public boolean a(char c17, android.graphics.Path path, android.graphics.RectF rectF) {
        boolean z17;
        if (path == null) {
            return false;
        }
        try {
            z17 = nExtractPath(this.f68149a, c17, path, new int[4]);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PathExtractor", "extract path error %c", java.lang.Character.valueOf(c17));
            z17 = false;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PathExtractor", "not such char " + c17);
            return false;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(0.015625f, 0.015625f);
        path.transform(matrix);
        if (rectF != null) {
            rectF.set(r2[0] * 0.015625f, r2[3] * 0.015625f, r2[2] * 0.015625f, r2[1] * 0.015625f);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PathExtractor", "load path for " + c17);
        return true;
    }

    public void b(com.tencent.mm.fontdecode.PathExtractor.Metrics metrics) {
        if (metrics == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PathExtractor", "metrics is null");
            return;
        }
        nGetMetrics(this.f68149a, metrics);
        metrics.height *= 0.015625f;
        metrics.ascender *= 0.015625f;
        metrics.descender *= 0.015625f;
    }

    public void c(int i17) {
        long j17 = this.f68149a;
        com.tencent.mars.xlog.Log.i("MicroMsg.PathExtractor", "set text size %d, %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        nSetTextSize(j17, i17);
    }

    public void finalize() {
        try {
            nFinalize(this.f68149a);
        } finally {
            super.finalize();
        }
    }
}
