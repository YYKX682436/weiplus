package qo1;

/* loaded from: classes5.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qo1.h1 f447033d = new qo1.h1();

    public h1() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskManager", "Init task cache");
        qo1.j1.f447057b = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2565xa17a322b.C20648x10ecb94a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + c17);
        if (c17 == 1) {
            java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0> c18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c18);
            for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 m0Var : c18) {
                long j17 = m0Var.f297436e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TaskManager", "Find a incompleteTasks for pkgId=" + j17 + ", status=" + m0Var.f297438g + ", type=" + m0Var.f297444p);
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 type = m0Var.f297444p;
                ?? r122 = 0;
                r122 = 0;
                if (type == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_RESTORE) {
                    int i17 = qo1.c1.f446989y;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamRestoreTask", "fromIncompleteTask pkgId=" + m0Var.f297436e + ", taskType=" + m0Var.f297444p);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(m0Var.f297436e);
                    if (k17 != null) {
                        qo1.c1 c1Var = new qo1.c1(k17, r122, 2, r122);
                        c1Var.f447011d = m0Var.f297439h;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state = m0Var.f297438g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(state, "state");
                        c1Var.r(state);
                        c1Var.f447023p = true;
                        c1Var.f447025r = m0Var;
                        c1Var.f447024q = new qo1.w0(c1Var);
                        c1Var.h();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamRestoreTask", "Complete fromIncompleteTask.buildBackupTask(), pkgId=" + c1Var.f447016i);
                        r122 = c1Var;
                    }
                    if (r122 == 0) {
                        r122 = new qo1.g0(j17);
                    }
                } else if (type == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_BACKUP) {
                    int i18 = qo1.v0.f447088y;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "type");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "fromIncompleteTask pkgId=" + m0Var.f297436e + ", taskType=" + type);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k18 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(m0Var.f297436e);
                    if (k18 != null) {
                        qo1.v0 v0Var = new qo1.v0(k18, type);
                        v0Var.f447011d = m0Var.f297439h;
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state2 = m0Var.f297438g;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(state2, "state");
                        v0Var.r(state2);
                        v0Var.f447023p = true;
                        v0Var.f447025r = m0Var;
                        v0Var.f447024q = new qo1.k0(v0Var);
                        v0Var.h();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "Complete fromIncompleteTask.buildBackupTask(), pkgId=" + v0Var.f447016i);
                        r122 = v0Var;
                    }
                    if (r122 == 0) {
                        r122 = new qo1.g0(j17);
                    }
                } else {
                    r122 = new qo1.g0(j17);
                }
                hashMap.put(valueOf, r122);
            }
        }
        return hashMap;
    }
}
