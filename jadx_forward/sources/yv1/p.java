package yv1;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.q f547665d;

    public p(yv1.q qVar) {
        this.f547665d = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20273xf2c5ebb0()) == 1 ? "FastList" : "MigrationFileIndex";
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        yv1.q qVar = this.f547665d;
        qVar.getClass();
        java.lang.String concat = "#runLoadingTask: from=".concat(str);
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanExService", concat, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "MigrationFileIndex")) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new yv1.o(g0Var, null), 1, null);
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "FastList")) {
                throw new java.lang.IllegalArgumentException("Unknown dataSource: ".concat(str));
            }
            ((jm.y) ((qi3.y) i95.n0.c(qi3.y.class))).getClass();
            java.util.List list = jm.p.f381778a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((kz5.h) list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((bm5.v) next) != bm5.v.f104283p) {
                    arrayList.add(next);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList2.add(bm5.c0.f104083a.h((bm5.v) it6.next(), false));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanExService", "#runLoadingTask: listing c2cChatDirList=" + arrayList2.size(), null);
            if (!arrayList2.isEmpty()) {
                g0Var.f391654d = com.p314xaae8f345.mm.vfs.C22748x3d92d33a.e(kz5.n0.V0(arrayList2));
            }
        }
        long j17 = g0Var.f391654d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanExService", "#runLoadingTask: " + j17 + ", from=" + str + ", durationMs=" + (java.lang.System.currentTimeMillis() - currentTimeMillis), null);
        if (java.lang.Thread.currentThread().isInterrupted()) {
            return;
        }
        qVar.wi(str, j17);
    }
}
