package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class o9 {
    public static com.p314xaae8f345.mm.p2621x8fb0427b.f9 a(java.lang.StringBuilder sb6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(f9Var.j());
        int indexOf = sb7.indexOf("<gameshare>");
        int indexOf2 = sb7.indexOf("</gameshare>");
        if (indexOf >= 0 && indexOf2 >= indexOf) {
            sb7.replace(indexOf, indexOf2 + 12, sb6.toString());
            f9Var.d1(sb7.toString());
        }
        return f9Var;
    }

    public static void b(yb5.d dVar, java.lang.String str, java.lang.String str2) {
        c01.l2 c17 = c01.n2.d().c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.m9.a(dVar), true);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n9 n9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n9) c17.c("gamesharecardlistener", null);
        if (n9Var == null) {
            n9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n9(null);
            c17.i("gamesharecardlistener", n9Var);
        }
        n9Var.f286442d = new java.lang.ref.WeakReference(dVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameShareChattingLifecycleChangedListener", "john attach context");
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y4) ((yn.j) dVar.f542241c.a(yn.j.class))).b(n9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(ot0.q r24, android.view.View r25, yb5.d r26, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r27, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qq r28) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o9.c(ot0.q, android.view.View, yb5.d, com.tencent.mm.storage.f9, com.tencent.mm.ui.chatting.viewitems.qq):void");
    }
}
