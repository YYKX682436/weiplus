package ch0;

/* loaded from: classes8.dex */
public final class c0 {
    public c0(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Activity a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r5, r0)
            boolean r0 = r5 instanceof android.content.MutableContextWrapper
            r1 = 0
            if (r0 == 0) goto L21
            r0 = r5
            android.content.MutableContextWrapper r0 = (android.content.MutableContextWrapper) r0
            android.content.Context r2 = r0.getBaseContext()
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L21
            android.content.Context r5 = r0.getBaseContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            kotlin.jvm.internal.o.e(r5, r0)
            android.app.Activity r5 = (android.app.Activity) r5
            goto L29
        L21:
            boolean r0 = r5 instanceof android.app.Activity
            if (r0 == 0) goto L28
            android.app.Activity r5 = (android.app.Activity) r5
            goto L29
        L28:
            r5 = r1
        L29:
            boolean r0 = r5 instanceof com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity
            if (r0 == 0) goto L88
            com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity r5 = (com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity) r5
            r5.getClass()
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L59
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment r5 = r5.f208800d     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L49
            tk5.c r5 = r5.u0()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L49
            tk5.a r5 = r5.b()     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L49
            androidx.fragment.app.Fragment r5 = r5.u()     // Catch: java.lang.Throwable -> L59
            goto L4a
        L49:
            r5 = r1
        L4a:
            boolean r0 = r5 instanceof com.tencent.mm.ui.vas.VASCommonFragment     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L53
            com.tencent.mm.ui.vas.VASCommonFragment r5 = (com.tencent.mm.ui.vas.VASCommonFragment) r5     // Catch: java.lang.Throwable -> L59
            com.tencent.mm.ui.vas.VASActivity r5 = r5.f211121p     // Catch: java.lang.Throwable -> L59
            goto L54
        L53:
            r5 = r1
        L54:
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)     // Catch: java.lang.Throwable -> L59
            goto L64
        L59:
            r5 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
        L64:
            java.lang.Throwable r0 = kotlin.Result.m524exceptionOrNullimpl(r5)
            if (r0 == 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "get child activity error: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MMHalfScreen.TransparentActivity"
            com.tencent.mars.xlog.Log.e(r2, r0)
        L7d:
            boolean r0 = kotlin.Result.m527isFailureimpl(r5)
            if (r0 == 0) goto L84
            goto L85
        L84:
            r1 = r5
        L85:
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ch0.c0.a(android.content.Context):android.app.Activity");
    }

    public final java.lang.String b(com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI activity, ch0.k data) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("ftsrealurl");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!r26.n0.N(stringExtra)) {
            return stringExtra;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        tg0.c1 c1Var = data.f41233c;
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.String.valueOf(c1Var.f419041m));
        linkedHashMap.put("type", java.lang.String.valueOf(c1Var.f419042n));
        tg0.f2 f2Var = tg0.g2.f419073e;
        linkedHashMap.put("isInFlutter", data.f41232b == 1 ? "1" : "2");
        java.lang.String e17 = ((su4.a1) i95.n0.c(su4.a1.class)) != null ? su4.r2.e(linkedHashMap, 0) : null;
        return e17 != null ? e17 : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ch0.k c(int r31, boolean r32, java.util.Map r33) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch0.c0.c(int, boolean, java.util.Map):ch0.k");
    }
}
