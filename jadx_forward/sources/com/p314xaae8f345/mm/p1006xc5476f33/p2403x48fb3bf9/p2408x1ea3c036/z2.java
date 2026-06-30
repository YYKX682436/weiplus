package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f264254a = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r4) {
        /*
            java.util.HashMap r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.f264254a
            boolean r1 = r0.containsKey(r4)
            if (r1 == 0) goto L71
            java.lang.Object r4 = r0.remove(r4)
            r0 = -1
            int r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(r4, r0)
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.k2.f264080a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r4 == 0) goto L2c
            java.util.concurrent.ConcurrentHashMap r0 = sd.q0.f488178a
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L22
            goto L2e
        L22:
            java.lang.Object r4 = r0.remove(r4)
            sd.o0 r4 = (sd.o0) r4
            r4.k()
            goto L2f
        L2c:
            java.util.concurrent.ConcurrentHashMap r4 = sd.q0.f488178a
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto L71
            int r0 = r4.hashCode()
            java.util.concurrent.ConcurrentHashMap r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.l.f264960a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.remove(r0)
            com.tencent.mm.plugin.webview.permission.d r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d) r0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            java.lang.Thread r2 = r2.getThread()
            long r2 = r2.getId()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L69
            r4.a()     // Catch: java.lang.Exception -> L5d
            goto L71
        L5d:
            r4 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "MicroMsg.LuggageWebCoreStash"
            java.lang.String r2 = ""
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r4, r2, r0)
            goto L71
        L69:
            com.tencent.mm.plugin.webview.luggage.j2 r0 = new com.tencent.mm.plugin.webview.luggage.j2
            r0.<init>(r4)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r0)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.z2.a(java.lang.String):void");
    }

    public static int b(java.lang.String str) {
        java.util.HashMap hashMap = f264254a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewFloatBallManager", "onMultiTaskItemClick, size = %d", java.lang.Integer.valueOf(hashMap.size()));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) hashMap.remove(str), -1);
    }
}
