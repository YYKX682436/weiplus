package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class fe {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f86623a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f86624b;

    public fe(com.tencent.mm.plugin.appbrand.page.v5 page) {
        kotlin.jvm.internal.o.g(page, "page");
        this.f86623a = page;
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        n3Var.setLogging(false);
        this.f86624b = n3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b A[PHI: r12
  0x006b: PHI (r12v5 java.lang.Object) = (r12v4 java.lang.Object), (r12v1 java.lang.Object) binds: [B:17:0x0068, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r8, java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.tencent.mm.plugin.appbrand.page.yd
            if (r0 == 0) goto L13
            r0 = r12
            com.tencent.mm.plugin.appbrand.page.yd r0 = (com.tencent.mm.plugin.appbrand.page.yd) r0
            int r1 = r0.f87302i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87302i = r1
            goto L18
        L13:
            com.tencent.mm.plugin.appbrand.page.yd r0 = new com.tencent.mm.plugin.appbrand.page.yd
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.f87300g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f87302i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L6b
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            boolean r8 = r0.f87299f
            java.lang.Object r9 = r0.f87298e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f87297d
            com.tencent.mm.plugin.appbrand.page.fe r10 = (com.tencent.mm.plugin.appbrand.page.fe) r10
            kotlin.ResultKt.throwOnFailure(r12)
            r11 = r8
            goto L5b
        L41:
            kotlin.ResultKt.throwOnFailure(r12)
            r5 = 0
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 <= 0) goto L59
            r0.f87297d = r7
            r0.f87298e = r10
            r0.f87299f = r11
            r0.f87302i = r4
            java.lang.Object r8 = kotlinx.coroutines.k1.b(r8, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r9 = r10
            r10 = r7
        L5b:
            com.tencent.mm.plugin.appbrand.page.v5 r8 = r10.f86623a
            r12 = 0
            r0.f87297d = r12
            r0.f87298e = r12
            r0.f87302i = r3
            java.lang.Object r12 = r10.b(r8, r9, r11, r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.fe.a(long, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.tencent.mm.plugin.appbrand.page.v5 r23, java.lang.String r24, boolean r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.fe.b(com.tencent.mm.plugin.appbrand.page.v5, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, yz5.l lVar) {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView;
        gh.r f48652e;
        ce.g gVar = (ce.g) v5Var.B1(ce.g.class);
        if (gVar == null || (magicBrushView = ((ce.o) gVar).f40686g) == null || (f48652e = magicBrushView.getF48652e()) == null) {
            lVar.invoke(null);
            return;
        }
        android.view.View thisView = f48652e.getThisView();
        if (thisView == null) {
            lVar.invoke(null);
            return;
        }
        if (!thisView.isLaidOut()) {
            lVar.invoke(null);
            return;
        }
        android.view.Surface surface = (android.view.Surface) f48652e.getSurface();
        if (surface == null) {
            lVar.invoke(null);
            return;
        }
        if (!surface.isValid()) {
            lVar.invoke(null);
            return;
        }
        int width = thisView.getWidth();
        int height = thisView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/PageSnapshotStore", "takeSnapshotForGame", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/page/PageSnapshotStore", "takeSnapshotForGame", "(Lcom/tencent/mm/plugin/appbrand/page/AppBrandPageView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.view.PixelCopy.request(surface, createBitmap, new com.tencent.mm.plugin.appbrand.page.ee(str, android.os.SystemClock.elapsedRealtime(), lVar, createBitmap), com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper()));
    }
}
