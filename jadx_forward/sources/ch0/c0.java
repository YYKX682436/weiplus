package ch0;

/* loaded from: classes8.dex */
public final class c0 {
    public c0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r5, r0)
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
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962
            if (r0 == 0) goto L88
            com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity r5 = (com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962) r5
            r5.getClass()
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L59
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment r5 = r5.f290333d     // Catch: java.lang.Throwable -> L59
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
            boolean r0 = r5 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L53
            com.tencent.mm.ui.vas.VASCommonFragment r5 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) r5     // Catch: java.lang.Throwable -> L59
            com.tencent.mm.ui.vas.VASActivity r5 = r5.f292654p     // Catch: java.lang.Throwable -> L59
            goto L54
        L53:
            r5 = r1
        L54:
            java.lang.Object r5 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)     // Catch: java.lang.Throwable -> L59
            goto L64
        L59:
            r5 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r5 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r5)
            java.lang.Object r5 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)
        L64:
            java.lang.Throwable r0 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r5)
            if (r0 == 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "get child activity error: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "MMHalfScreen.TransparentActivity"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r0)
        L7d:
            boolean r0 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r5)
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

    public final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19400xd202f864 activity, ch0.k data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("ftsrealurl");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!r26.n0.N(stringExtra)) {
            return stringExtra;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        tg0.c1 c1Var = data.f122766c;
        linkedHashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(c1Var.f500574m));
        linkedHashMap.put("type", java.lang.String.valueOf(c1Var.f500575n));
        tg0.f2 f2Var = tg0.g2.f500606e;
        linkedHashMap.put("isInFlutter", data.f122765b == 1 ? "1" : "2");
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
