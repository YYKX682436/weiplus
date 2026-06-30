package c62;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f120989a;

    /* renamed from: b, reason: collision with root package name */
    public final yj0.d f120990b;

    public c() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f120989a = hashMap;
        this.f120990b = new c62.b(null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("show", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        arrayList.add(android.util.Pair.create("hide", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        hashMap.put("com/tencent/mm/plugin/ball/view/FloatMenuView", arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(android.util.Pair.create("onAttachedToWindow", "()V"));
        arrayList2.add(android.util.Pair.create("onDetachedFromWindow", "()V"));
        arrayList2.add(android.util.Pair.create("show", "(ZLandroid/animation/AnimatorListenerAdapter;)V"));
        arrayList2.add(android.util.Pair.create("hide", "(Landroid/animation/AnimatorListenerAdapter;)V"));
        hashMap.put("com/tencent/mm/plugin/ball/view/FloatBallView", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(android.util.Pair.create("onFloatMenuBackgroundClicked", "()V"));
        arrayList3.add(android.util.Pair.create("onFloatMenuBackPressed", "()V"));
        arrayList3.add(android.util.Pair.create("onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V"));
        arrayList3.add(android.util.Pair.create("onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V"));
        hashMap.put("com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", arrayList3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.c45 r7, boolean r8, int r9, int r10, long r11) {
        /*
            r6 = this;
            java.lang.String r0 = "HABBYGE-MALI.FloatBallSessionHandler"
            if (r7 != 0) goto La
            java.lang.String r7 = "_exitFloatSession, 不是合法session !!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r7)
            goto L24
        La:
            java.lang.String r1 = r7.f452803d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r2 = "_exitFloatSession, curSession: %s, %d, %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r2, r1)
            v52.c r1 = v52.c.g()
            r1.s(r7, r11)
        L24:
            java.lang.String r7 = "mmkv_sionpairD_table_hell"
            byte[] r7 = c52.c.a(r7)
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L51
            int r3 = r7.length
            if (r3 != 0) goto L34
            r3 = r1
            goto L35
        L34:
            r3 = 0
        L35:
            if (r3 == 0) goto L38
            goto L51
        L38:
            r45.h16 r3 = new r45.h16
            r3.<init>()
            r3.mo11468x92b714fd(r7)     // Catch: java.io.IOException -> L41
            goto L52
        L41:
            r7 = move-exception
            java.lang.String r3 = r7.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "HABBYGE-MALI.SessionPairDao"
            java.lang.String r5 = "SessionPair, _read: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r7, r5, r3)
        L51:
            r3 = r2
        L52:
            if (r3 != 0) goto L55
            return
        L55:
            boolean r7 = r3.f457300h
            if (r7 == 0) goto Lad
            r45.c45 r7 = r3.f457296d
            java.lang.String r8 = r7.f452803d
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.p1391x46fdf567.ext.p1392x76508296.p1393xaf3f8342.c.b(r8)
            if (r8 != 0) goto L65
            goto Lde
        L65:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "_"
            r9.append(r8)
            r9.append(r11)
            java.lang.String r8 = r9.toString()
            r45.c45 r8 = x52.c.c(r7, r8, r11)
            java.lang.String r7 = r7.f452803d
            r45.jw3 r7 = b52.b.a(r7)
            if (r7 == 0) goto L98
            java.lang.String r9 = r7.f459695g
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "restoreLastSesssion, curPage: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r10, r9)
            java.lang.String r9 = r7.f459692d
            int r7 = r7.f459700o
            y52.b.b(r8, r9, r7, r11)
        L98:
            java.lang.String r7 = x52.m.b()
            if (r7 != 0) goto La0
            java.lang.String r7 = ""
        La0:
            r8.f452818v = r7
            x52.c.a(r8)
            v52.c r7 = v52.c.g()
            r7.u(r8)
            goto Lde
        Lad:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r4, r5}
            java.lang.String r4 = "_onFloatSessionExit, lastValidateSession[FALSE], finish=%b, floatClickEvent=%s, floatEventType=%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4, r7)
            if (r8 != 0) goto Lde
            if (r9 != r1) goto Lde
            if (r10 != r1) goto Lde
            v52.c r7 = v52.c.g()
            r45.w35 r8 = r3.f457297e
            java.lang.String r9 = r8.f470381m
            int r8 = r8.f470382n
            r7.w(r9, r8, r11)
            r45.w35 r7 = r3.f457297e
            java.lang.String r8 = r7.f470381m
            int r7 = r7.f470382n
            y52.b.b(r2, r8, r7, r11)
        Lde:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c62.c.a(r45.c45, boolean, int, int, long):void");
    }
}
