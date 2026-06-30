package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class b6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f33879x366c91de = 466;

    /* renamed from: NAME */
    public static final java.lang.String f33880x24728b = "getMenuButtonBoundingClientRect";

    /* renamed from: g, reason: collision with root package name */
    public static boolean f161364g;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f161364g = false;
    }

    public boolean B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        return yVar.mo50261xee5260a9().mo51620x1ab1e3d4();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:12:0x0009, B:19:0x004b, B:21:0x0052, B:23:0x0056, B:25:0x0013, B:27:0x0019, B:32:0x002f, B:34:0x0033, B:36:0x0041), top: B:11:0x0009 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            com.tencent.mm.plugin.appbrand.y r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) r6
            com.tencent.mm.plugin.appbrand.page.v5 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(r6)
            r0 = 0
            if (r7 == 0) goto L6a
            boolean r1 = r5.B(r6)     // Catch: java.lang.Exception -> L5e
            if (r1 != 0) goto L41
            r1 = 0
            if (r6 != 0) goto L13
            goto L3f
        L13:
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r6.t3()     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L3f
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r2 = r6.t3()     // Catch: java.lang.Exception -> L5e
            mi1.v r2 = r2.f156354z     // Catch: java.lang.Exception -> L5e
            mi1.m0 r2 = r2.f408239e     // Catch: java.lang.Exception -> L5e
            android.util.SparseArray r3 = r2.f408152e     // Catch: java.lang.Exception -> L5e
            int r4 = r3.size()     // Catch: java.lang.Exception -> L5e
            if (r4 != 0) goto L2b
            r4 = 1
            goto L2c
        L2b:
            r4 = r1
        L2c:
            if (r4 == 0) goto L2f
            goto L3f
        L2f:
            mi1.j0 r2 = r2.f408154g     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L3f
            int r1 = r2.f408118a     // Catch: java.lang.Exception -> L5e
            java.lang.Object r1 = r3.get(r1)     // Catch: java.lang.Exception -> L5e
            mi1.g2 r1 = (mi1.g2) r1     // Catch: java.lang.Exception -> L5e
            boolean r1 = r1.mo147328xb9a8b747()     // Catch: java.lang.Exception -> L5e
        L3f:
            if (r1 == 0) goto L49
        L41:
            com.tencent.mm.plugin.appbrand.e9 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.b(r6)     // Catch: java.lang.Exception -> L5e
            java.util.Map r0 = mi1.a1.a(r1)     // Catch: java.lang.Exception -> L5e
        L49:
            if (r0 != 0) goto L50
            java.util.Map r7 = mi1.a1.b(r7)     // Catch: java.lang.Exception -> L5e
            r0 = r7
        L50:
            if (r0 == 0) goto L6a
            boolean r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b6.f161364g     // Catch: java.lang.Exception -> L5e
            if (r7 == 0) goto L6a
            com.tencent.mm.plugin.appbrand.e9 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.b(r6)     // Catch: java.lang.Exception -> L5e
            mi1.a1.a(r7)     // Catch: java.lang.Exception -> L5e
            goto L6a
        L5e:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "MicroMsg.JsApiGetMenuButtonBoundingClientRect"
            java.lang.String r2 = "getBoundingRectLegacy e=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r7)
        L6a:
            if (r0 != 0) goto L74
            com.tencent.mm.plugin.appbrand.e9 r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.b(r6)
            java.util.Map r0 = mi1.a1.a(r6)
        L74:
            if (r0 == 0) goto L7d
            java.lang.String r6 = "ok"
            java.lang.String r6 = r5.p(r6, r0)
            goto L83
        L7d:
            java.lang.String r6 = "fail:internal error"
            java.lang.String r6 = r5.o(r6)
        L83:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.b6.z(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject):java.lang.String");
    }
}
