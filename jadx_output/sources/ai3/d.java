package ai3;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5107a;

    /* renamed from: b, reason: collision with root package name */
    public static int f5108b;

    /* renamed from: c, reason: collision with root package name */
    public static int f5109c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f5110d = new java.util.concurrent.ConcurrentHashMap();

    public static int a(int i17) {
        if (i17 % 16 == 0) {
            return i17;
        }
        while (i17 % 16 != 0) {
            i17++;
        }
        return i17;
    }

    public static int b(int i17, int i18) {
        int i19 = i17 % 32;
        if (i19 == 0) {
            return i17;
        }
        int min = i17 - java.lang.Math.min(32, i19);
        return min < i18 ? min : i17 - i19;
    }

    public static boolean c(android.content.Context context, android.graphics.Point point, boolean z17) {
        float f17;
        int i17;
        android.graphics.Point f18 = f(context);
        float f19 = f18.y / f18.x;
        if (z17) {
            f17 = point.x;
            i17 = point.y;
        } else {
            f17 = point.y;
            i17 = point.x;
        }
        float f27 = f17 / i17;
        float abs = java.lang.Math.abs(f19 - f27);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "checkIfNeedUsePreviewLarge: previewSize: %s, displaySize: %s, displayRatio: %s, previewRatio: %s, diff: %s", point, f18, java.lang.Float.valueOf(f19), java.lang.Float.valueOf(f27), java.lang.Float.valueOf(abs));
        return abs > 0.01f;
    }

    public static android.graphics.Point d(android.graphics.Point point, android.graphics.Point point2, boolean z17, boolean z18) {
        int i17 = point2.x;
        int i18 = point2.y;
        int i19 = (int) (i18 * ((z17 ? point.y : point.x) / (z17 ? point.x : point.y)));
        if (i19 % 2 != 0) {
            i19++;
        }
        if (z18) {
            i19 = s(i19, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newWidth: %s, makeMediaCodecHappy %s, , isRoate: %s", point2, point, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        if (i19 <= point2.x) {
            return new android.graphics.Point(i19, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "can not adapt to screen");
        return null;
    }

    public static android.graphics.Point e(android.graphics.Point point, android.graphics.Point point2, boolean z17, boolean z18) {
        int i17 = point2.x;
        int i18 = point2.y;
        int i19 = z17 ? point.y : point.x;
        float f17 = z17 ? point.x : point.y;
        float f18 = i19;
        int i27 = (int) (i17 * (f17 / f18));
        if (i27 % 2 != 0) {
            i27--;
        }
        int i28 = (int) (i18 * (f18 / f17));
        if (z18) {
            i27 = s(i27, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "getCropPreviewSizeWithHeight, previewSize: %s, displaySize: %s, width: %s, newHeight: %s makeMediaCodecHappy %s, newWidth: %s, isRoate: %s", point2, point, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(i28), java.lang.Boolean.valueOf(z17));
        if (i27 <= point2.y && i17 <= point2.x) {
            return new android.graphics.Point(i17, i27);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "can not adapt to screen");
        return null;
    }

    public static android.graphics.Point f(android.content.Context context) {
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(context);
        if (!f5107a && com.tencent.mm.ui.bk.k(context)) {
            h17.y -= com.tencent.mm.ui.bk.j(context);
        }
        return h17;
    }

    public static java.lang.String g(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(q75.c.d());
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        objArr[0] = yp5.a.f464409a.a() ? "wx_camera_" : "w_camera_";
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[2] = str;
        sb6.append(java.lang.String.format("%s%d.%s", objArr));
        return sb6.toString();
    }

    public static java.lang.String h(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT > 29) {
            return g(str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.r());
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.a9.f192463a;
        objArr[0] = yp5.a.f464409a.a() ? "wx_camera_" : "w_camera_";
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[2] = str;
        sb6.append(java.lang.String.format("%s%d.%s", objArr));
        return sb6.toString();
    }

    public static java.lang.String i(java.lang.String str) {
        try {
            return com.tencent.mm.plugin.sight.base.e.e(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightUtil", "getMediaInfo error: %s", e17.getMessage());
            return null;
        }
    }

    public static android.graphics.Point j() {
        return com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public static java.lang.String k(java.lang.String str) {
        int i17 = f5108b;
        f5108b = i17 + 1;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(java.lang.String.format("%s/tempvideo%s.mp4", str, java.lang.Integer.valueOf(i17)));
        if (r6Var.m()) {
            r6Var.l();
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(r6Var.o() + ".remux");
        if (r6Var2.m()) {
            r6Var2.l();
        }
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(r6Var.n() + ".thumb");
        if (r6Var3.m()) {
            r6Var3.l();
        }
        com.tencent.mm.vfs.r6 r6Var4 = new com.tencent.mm.vfs.r6(r6Var.n() + ".soundmp4");
        if (r6Var4.m()) {
            r6Var4.l();
        }
        di3.u.f232763a.postToWorker(new ai3.b(f5108b - 3, str));
        return r6Var.o();
    }

    public static java.lang.String l(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(java.lang.String.format("%s/%s.mp4", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        if (r6Var.m()) {
            r6Var.l();
        }
        return r6Var.o();
    }

    public static java.lang.String m(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        return str.concat(".thumb");
    }

    public static long n(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f5110d;
        if (!concurrentHashMap.containsKey(str)) {
            return 0L;
        }
        return java.lang.System.currentTimeMillis() - ((java.lang.Long) concurrentHashMap.get(str)).longValue();
    }

    public static int o(android.content.Context context) {
        ((android.app.ActivityManager) context.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(new android.app.ActivityManager.MemoryInfo());
        return (int) (r0.totalMem / 1024.0d);
    }

    public static android.graphics.Bitmap p(java.lang.String str) {
        return q(str, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0111 A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:11:0x0029, B:13:0x0030, B:15:0x00cf, B:18:0x00da, B:23:0x010b, B:25:0x0111, B:27:0x0117, B:29:0x0186, B:32:0x00ea), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117 A[Catch: Exception -> 0x018c, TryCatch #0 {Exception -> 0x018c, blocks: (B:11:0x0029, B:13:0x0030, B:15:0x00cf, B:18:0x00da, B:23:0x010b, B:25:0x0111, B:27:0x0117, B:29:0x0186, B:32:0x00ea), top: B:10:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap q(java.lang.String r19, long r20) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai3.d.q(java.lang.String, long):android.graphics.Bitmap");
    }

    public static int r(int i17) {
        return s(i17, Integer.MAX_VALUE);
    }

    public static int s(int i17, int i18) {
        int i19 = i17 % 16;
        if (i19 == 0) {
            return i17;
        }
        int i27 = (16 - i19) + i17;
        return i27 < i18 ? i27 : i17 - i19;
    }

    public static java.lang.String t(android.util.Size[] sizeArr) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (android.util.Size size : sizeArr) {
            stringBuffer.append("size: " + size.getHeight() + "," + size.getWidth() + " " + ((size.getHeight() * 1.0d) / size.getWidth()) + "||");
        }
        return stringBuffer.toString();
    }

    public static java.lang.String u(java.util.List list) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
            stringBuffer.append("size: " + size.height + "," + size.width + " " + ((size.height * 1.0d) / size.width) + "||");
        }
        return stringBuffer.toString();
    }

    public static java.lang.String v(java.util.List list) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.hardware.Camera.Size size = (android.hardware.Camera.Size) it.next();
            stringBuffer.append("size: " + size.height + "," + size.width + ";");
        }
        return stringBuffer.toString();
    }

    public static byte[] w(byte[] bArr, int i17, int i18, int i19) {
        if (i19 == 0) {
            return bArr;
        }
        byte[] m17 = ei3.x.f253187d.m(java.lang.Integer.valueOf(bArr.length));
        int i27 = i17 * i18;
        boolean z17 = i19 % 180 != 0;
        boolean z18 = i19 % 270 != 0;
        boolean z19 = i19 >= 180;
        for (int i28 = 0; i28 < i18; i28++) {
            for (int i29 = 0; i29 < i17; i29++) {
                int i37 = (i28 * i17) + i29;
                int i38 = ((i28 >> 1) * i17) + i27 + (i29 & (-2));
                int i39 = i38 + 1;
                int i47 = z17 ? i18 : i17;
                int i48 = z17 ? i17 : i18;
                int i49 = z17 ? i28 : i29;
                int i57 = z17 ? i29 : i28;
                if (z18) {
                    i49 = (i47 - i49) - 1;
                }
                if (z19) {
                    i57 = (i48 - i57) - 1;
                }
                int i58 = (i57 * i47) + i49;
                int i59 = i27 + ((i57 >> 1) * i47) + (i49 & (-2));
                m17[i58] = (byte) (bArr[i37] & 255);
                m17[i59] = (byte) (bArr[i38] & 255);
                m17[i59 + 1] = (byte) (bArr[i39] & 255);
            }
        }
        ei3.x.f253187d.o(bArr);
        return m17;
    }

    public static void x(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightUtil", "setTime key %s %s", str, com.tencent.mm.sdk.platformtools.z3.b(true));
        f5110d.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
