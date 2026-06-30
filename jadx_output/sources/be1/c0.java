package be1;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 40;
    public static final java.lang.String NAME = "getSystemInfo";

    /* renamed from: g, reason: collision with root package name */
    public final be1.g f19457g;

    public c0() {
        this(null);
    }

    public java.util.Map B(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("brand", android.os.Build.BRAND);
        hashMap.put("model", wo.w0.m());
        hashMap.put("abi", android.os.Build.CPU_ABI);
        java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
        if (strArr != null && strArr.length > 0) {
            hashMap.put("deviceAbi", strArr[0]);
        }
        hashMap.put("system", "Android " + android.os.Build.VERSION.RELEASE);
        android.util.DisplayMetrics displayMetrics = lVar.getContext().getResources().getDisplayMetrics();
        hashMap.put("pixelRatio", java.lang.Float.valueOf(displayMetrics.density));
        hashMap.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(displayMetrics.widthPixels)));
        hashMap.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(displayMetrics.heightPixels)));
        hashMap.put("memorySize", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.utils.l1.a(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        java.lang.String b17 = wo.t.b();
        if (b17 == null) {
            b17 = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        hashMap.put("cpuType", b17);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034 A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:3:0x000b, B:9:0x0045, B:10:0x0049, B:15:0x0012, B:17:0x001c, B:19:0x0027, B:25:0x0034, B:27:0x003a), top: B:2:0x000b }] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l r10, org.json.JSONObject r11) {
        /*
            r9 = this;
            java.lang.String r0 = "invoke cost:%dms, byNewImpl?:%b"
            java.lang.String r1 = "MicroMsg.JsApiGetSystemInfo"
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4 = 0
            be1.g r5 = r9.f19457g     // Catch: java.lang.Throwable -> L3d
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L12
            goto L40
        L12:
            r5.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r8 = "component"
            kotlin.jvm.internal.o.g(r10, r8)     // Catch: java.lang.Throwable -> L3d
            if (r11 == 0) goto L24
            java.lang.String r8 = "type"
            java.lang.String r11 = r11.optString(r8)     // Catch: java.lang.Throwable -> L3d
            goto L25
        L24:
            r11 = r7
        L25:
            if (r11 == 0) goto L30
            int r8 = r11.length()     // Catch: java.lang.Throwable -> L3d
            if (r8 != 0) goto L2e
            goto L30
        L2e:
            r8 = r4
            goto L31
        L30:
            r8 = r6
        L31:
            if (r8 == 0) goto L34
            goto L40
        L34:
            java.util.Map r11 = r5.a(r11, r10)     // Catch: java.lang.Throwable -> L3d
            if (r11 != 0) goto L3f
            kz5.q0 r11 = kz5.q0.f314001d     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r10 = move-exception
            goto L64
        L3f:
            r7 = r11
        L40:
            if (r7 == 0) goto L43
            r4 = r6
        L43:
            if (r7 != 0) goto L49
            java.util.Map r7 = r9.B(r10)     // Catch: java.lang.Throwable -> L3d
        L49:
            java.lang.String r10 = "ok"
            java.lang.String r10 = r9.p(r10, r7)     // Catch: java.lang.Throwable -> L3d
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r2
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r2}
            com.tencent.mars.xlog.Log.i(r1, r0, r11)
            return r10
        L64:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r2
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r2}
            com.tencent.mars.xlog.Log.i(r1, r0, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: be1.c0.z(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject):java.lang.String");
    }

    public c0(be1.g gVar) {
        this.f19457g = gVar;
    }
}
