package oj;

/* loaded from: classes12.dex */
public final class y {
    public y(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e a(android.os.Debug.MemoryInfo memoryInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memoryInfo, "memoryInfo");
        com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e c4723x52a73b7e = new com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
        c4723x52a73b7e.f134647d = memoryInfo.getTotalPss();
        java.util.Map<java.lang.String, java.lang.String> memoryStats = memoryInfo.getMemoryStats();
        oj.x xVar = oj.x.f427253d;
        c4723x52a73b7e.f134648e = xVar.a(memoryStats, "summary.java-heap");
        c4723x52a73b7e.f134649f = xVar.a(memoryStats, "summary.native-heap");
        c4723x52a73b7e.f134653m = xVar.a(memoryStats, "summary.code");
        c4723x52a73b7e.f134654n = xVar.a(memoryStats, "summary.stack");
        c4723x52a73b7e.f134650g = xVar.a(memoryStats, "summary.graphics");
        c4723x52a73b7e.f134655o = xVar.a(memoryStats, "summary.private-other");
        c4723x52a73b7e.f134651h = xVar.a(memoryStats, "summary.system");
        c4723x52a73b7e.f134652i = xVar.a(memoryStats, "summary.total-swap");
        int i17 = c4723x52a73b7e.f134648e;
        java.lang.Object a17 = oj.c0.a(android.os.Debug.MemoryInfo.class, "dalvikSwappedOut", memoryInfo);
        if (a17 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        c4723x52a73b7e.f134656p = i17 + ((java.lang.Integer) a17).intValue();
        int i18 = c4723x52a73b7e.f134649f;
        java.lang.Object a18 = oj.c0.a(android.os.Debug.MemoryInfo.class, "nativeSwappedOut", memoryInfo);
        if (a18 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        c4723x52a73b7e.f134657q = i18 + ((java.lang.Integer) a18).intValue();
        int i19 = c4723x52a73b7e.f134655o;
        java.lang.Object a19 = oj.c0.a(android.os.Debug.MemoryInfo.class, "otherSwappedOut", memoryInfo);
        if (a19 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
        c4723x52a73b7e.f134658r = i19 + ((java.lang.Integer) a19).intValue();
        return c4723x52a73b7e;
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4723x52a73b7e b() {
        android.os.Debug.MemoryInfo memoryInfo = new android.os.Debug.MemoryInfo();
        android.os.Debug.getMemoryInfo(memoryInfo);
        return a(memoryInfo);
    }
}
