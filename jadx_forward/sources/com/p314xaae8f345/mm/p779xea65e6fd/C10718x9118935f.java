package com.p314xaae8f345.mm.p779xea65e6fd;

/* renamed from: com.tencent.mm.fontdecode.PathExtractor */
/* loaded from: classes10.dex */
public class C10718x9118935f {

    /* renamed from: a, reason: collision with root package name */
    public final long f149682a;

    /* renamed from: com.tencent.mm.fontdecode.PathExtractor$Metrics */
    /* loaded from: classes10.dex */
    public static class Metrics {

        /* renamed from: ascender */
        public float f28960xce712ef7;

        /* renamed from: descender */
        public float f28961x58b13ed7;

        /* renamed from: height */
        public float f28962xb7389127;
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("fontdecode");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.p314xaae8f345.cso.C2941xefde02d2.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/fontdecode/PathExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public C10718x9118935f(java.lang.String str) {
        long m45652x630f29e = m45652x630f29e(str);
        this.f149682a = m45652x630f29e;
        if (m45652x630f29e != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PathExtractor", "create for %s, %d", str, java.lang.Long.valueOf(m45652x630f29e));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PathExtractor", "create for %s failed", str);
        }
    }

    /* renamed from: nExtractPath */
    private static native boolean m45649x1e6342f8(long j17, char c17, android.graphics.Path path, int[] iArr);

    /* renamed from: nFinalize */
    private static native void m45650x90a6f2ac(long j17);

    /* renamed from: nGetMetrics */
    private static native void m45651xe7dca79b(long j17, com.p314xaae8f345.mm.p779xea65e6fd.C10718x9118935f.Metrics metrics);

    /* renamed from: nInit */
    private static native long m45652x630f29e(java.lang.String str);

    /* renamed from: nSetTextSize */
    private static native void m45653xec7e9002(long j17, int i17);

    public boolean a(char c17, android.graphics.Path path, android.graphics.RectF rectF) {
        boolean z17;
        if (path == null) {
            return false;
        }
        try {
            z17 = m45649x1e6342f8(this.f149682a, c17, path, new int[4]);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PathExtractor", "extract path error %c", java.lang.Character.valueOf(c17));
            z17 = false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PathExtractor", "not such char " + c17);
            return false;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(0.015625f, 0.015625f);
        path.transform(matrix);
        if (rectF != null) {
            rectF.set(r2[0] * 0.015625f, r2[3] * 0.015625f, r2[2] * 0.015625f, r2[1] * 0.015625f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PathExtractor", "load path for " + c17);
        return true;
    }

    public void b(com.p314xaae8f345.mm.p779xea65e6fd.C10718x9118935f.Metrics metrics) {
        if (metrics == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PathExtractor", "metrics is null");
            return;
        }
        m45651xe7dca79b(this.f149682a, metrics);
        metrics.f28962xb7389127 *= 0.015625f;
        metrics.f28960xce712ef7 *= 0.015625f;
        metrics.f28961x58b13ed7 *= 0.015625f;
    }

    public void c(int i17) {
        long j17 = this.f149682a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PathExtractor", "set text size %d, %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        m45653xec7e9002(j17, i17);
    }

    /* renamed from: finalize */
    public void m45654xd764dc1e() {
        try {
            m45650x90a6f2ac(this.f149682a);
        } finally {
            super.finalize();
        }
    }
}
