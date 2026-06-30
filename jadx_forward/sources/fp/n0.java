package fp;

/* loaded from: classes11.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final fp.n0 f346748a = new fp.n0();

    /* renamed from: b, reason: collision with root package name */
    public static final long f346749b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f346750c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.o f346751d;

    static {
        long totalBytes = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getTotalBytes();
        f346749b = totalBytes;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageAlertUtil", "init, totalSize = " + totalBytes);
        f346750c = kz5.c1.k(new jz5.l(fp.l0.f346737d, new jz5.o(500000000L, 500000000L, 100000000L)), new jz5.l(fp.l0.f346738e, new jz5.o(500000000L, 500000000L, 200000000L)), new jz5.l(fp.l0.f346739f, new jz5.o(1000000000L, 1000000000L, 500000000L)));
        f346751d = new jz5.o(10000000000L, 5000000000L, 500000000L);
    }

    public static final java.lang.String a(long j17) {
        if (j17 >= 1000000000) {
            java.lang.String format = java.lang.String.format("%.1f GB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000000000)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            return format;
        }
        if (j17 >= 1000000) {
            java.lang.String format2 = java.lang.String.format("%.1f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000000)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            return format2;
        }
        if (j17 < 1000) {
            return j17 > 0 ? "< 1 KB" : "0 KB";
        }
        java.lang.String format3 = java.lang.String.format("%.0f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 * 1.0d) / 1000)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format3, "format(...)");
        return format3;
    }

    public final fp.m0 b() {
        long j17;
        int parseInt;
        if (z65.c.a()) {
            try {
                java.lang.Integer h17 = r26.h0.h(bm5.o1.f104252a.l(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20269x10214bfe()));
                if (h17 != null) {
                    parseInt = h17.intValue();
                } else {
                    new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20269x10214bfe();
                    parseInt = java.lang.Integer.parseInt("10000".toString());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageAlertUtil", "getAvailableSizeFromRepairer, availableBytes = " + parseInt);
                j17 = parseInt * 1000000;
            } catch (java.lang.Throwable unused) {
                j17 = -1;
            }
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            j17 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath()).getAvailableBytes();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageAlertUtil", "getStorageStatus, availableSize = " + j17);
        if (j17 < 0) {
            return fp.m0.f346742d;
        }
        long j18 = f346749b / 1000000000;
        jz5.o oVar = (jz5.o) f346750c.get(j18 <= 64 ? fp.l0.f346737d : j18 <= 128 ? fp.l0.f346738e : fp.l0.f346739f);
        if (oVar == null) {
            oVar = f346751d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageAlertUtil", "getStorageStatus, threshold = " + oVar);
        return j17 < ((java.lang.Number) oVar.f384376f).longValue() ? fp.m0.f346744f : j17 < ((java.lang.Number) oVar.f384374d).longValue() ? fp.m0.f346743e : fp.m0.f346742d;
    }
}
