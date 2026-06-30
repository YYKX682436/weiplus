package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.WeakHashMap f274510a = new java.util.WeakHashMap();

    static {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("BitmapTracer", new com.p314xaae8f345.mm.sdk.p2603x2137b148.q());
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("BitmapBriefTracer", (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.sdk.p2603x2137b148.p(), true);
            b4Var.c(3600000L, 3600000L);
            b4Var.m77789xc5a5549d(false);
        }
        com.p314xaae8f345.mm.app.i4.a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.r());
    }

    public static java.lang.String a(long j17) {
        return j17 >= 1073741824 ? java.lang.String.format("%.2f GB", java.lang.Double.valueOf(j17 / 1.073741824E9d)) : j17 >= 1048576 ? java.lang.String.format("%.2f MB", java.lang.Double.valueOf(j17 / 1048576.0d)) : j17 >= 1024 ? java.lang.String.format("%.2f kB", java.lang.Double.valueOf(j17 / 1024.0d)) : java.lang.String.format("%d bytes", java.lang.Long.valueOf(j17));
    }

    public static void b(java.io.PrintWriter printWriter, long j17, int i17) {
        long j18;
        int i18;
        int i19;
        long j19;
        long j27 = 0;
        if (j17 > 0) {
            printWriter.format("Statistics for all Bitmaps larger than %.2f MB:\n", java.lang.Double.valueOf(j17 / 1048576.0d));
        } else {
            printWriter.print("Statistics for all Bitmaps alive:\n");
        }
        printWriter.flush();
        java.lang.System.currentTimeMillis();
        java.util.WeakHashMap weakHashMap = f274510a;
        synchronized (weakHashMap) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                arrayList.addAll(weakHashMap.entrySet());
                java.util.Iterator it = arrayList.iterator();
                j18 = 0;
                i18 = 0;
                i19 = 0;
                android.graphics.Bitmap bitmap = null;
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) entry.getKey();
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
                    if (bitmap2 != null) {
                        if (bitmap2.isRecycled()) {
                            i19++;
                            j19 = j27;
                        } else {
                            long allocationByteCount = bitmap2.getAllocationByteCount();
                            j18 += allocationByteCount;
                            i18++;
                            if (bitmap == null || allocationByteCount > bitmap.getAllocationByteCount()) {
                                bitmap = bitmap2;
                            }
                            if (allocationByteCount >= j17) {
                                if (i17 != -1) {
                                    j19 = 0;
                                    if (0 < i17) {
                                    }
                                }
                                printWriter.append('#').println(i18);
                                android.graphics.Bitmap.Config config = bitmap2.getConfig();
                                java.lang.Object[] objArr = new java.lang.Object[4];
                                objArr[0] = a(bitmap2.getAllocationByteCount());
                                objArr[1] = java.lang.Integer.valueOf(bitmap2.getWidth());
                                objArr[2] = java.lang.Integer.valueOf(bitmap2.getHeight());
                                objArr[3] = config == null ? "UNKNOWN" : config.name();
                                printWriter.format("\nSize: %s (%d x %d, %s)\n", objArr);
                                printWriter.append("Source: ");
                                throw null;
                            }
                            j19 = 0;
                            j27 = j19;
                        }
                        j27 = j19;
                    }
                }
            } catch (java.util.ConcurrentModificationException unused) {
                printWriter.print("ConcurrentModificationException occur.");
                printWriter.flush();
                printWriter.close();
                return;
            }
        }
        printWriter.format("\n\nLiving Bitmaps: %d, %s\n", java.lang.Integer.valueOf(i18), a(j18));
        printWriter.append("Recycled Bitmaps: ").println(i19);
        printWriter.flush();
        printWriter.close();
    }
}
