package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.w3 f105783d;

    public q3(com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var) {
        this.f105783d = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = this.f105783d;
        w3Var.getClass();
        r45.qw0 qw0Var = new r45.qw0();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_INFO_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        if (v17.length() > 0) {
            qw0Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = w3Var.f105958d.L0("FinderEntrance");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkDoSync] hasEntranceRedDot=");
        sb6.append(L0 != null);
        sb6.append(" checkInfo=");
        sb6.append(w3Var.b(qw0Var));
        com.tencent.mars.xlog.Log.i("Finder.RedDotExpiredHandler", sb6.toString());
        if (L0 == null || qw0Var.getInteger(0) != 1) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_COUNT_INT_SYNC;
        int r17 = c17.r(u3Var, 0);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_RED_DOT_EXPIRED_LAST_TIME_LONG_SYNC;
        long t17 = c18.t(u3Var2, 0L);
        if (t17 <= 0) {
            t17 = L0.field_time;
            if (t17 <= 0) {
                t17 = c01.id.c();
            }
        }
        long c19 = c01.id.c() - t17;
        com.tencent.mars.xlog.Log.i("Finder.RedDotExpiredHandler", "[checkDoSync] diffTime=" + c19 + "ms checkCount=" + r17 + ", checkInfo=" + w3Var.b(qw0Var));
        if (r17 >= qw0Var.getInteger(2) || c19 < qw0Var.getInteger(1) * 1000) {
            return;
        }
        w3Var.getClass();
        com.tencent.mars.xlog.Log.i("Finder.RedDotExpiredHandler", "innerCheckDoSync...");
        ((c61.l7) i95.n0.c(c61.l7.class)).P.e(826259965, 8);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        gm0.j1.u().c().x(u3Var2, java.lang.Long.valueOf(c01.id.c()));
    }
}
