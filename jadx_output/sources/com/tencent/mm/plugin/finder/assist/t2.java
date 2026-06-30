package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.t2 f102547d = new com.tencent.mm.plugin.finder.assist.t2();

    public t2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN, true)) {
            ((ku5.t0) ku5.t0.f312615d).q(com.tencent.mm.plugin.finder.assist.s2.f102522d);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.assist.v2 v2Var = com.tencent.mm.plugin.finder.assist.v2.f102615a;
        com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "[checkClear#before] ".concat(e9Var.b()));
        com.tencent.mm.plugin.finder.assist.v2 v2Var2 = com.tencent.mm.plugin.finder.assist.v2.f102615a;
        v2Var2.a();
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        if (eVar != null) {
            ((qs2.q) eVar).Bi();
        }
        v2Var2.d();
        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "[checkClear#after] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms " + e9Var.b() + ' ');
        for (com.tencent.mm.plugin.finder.assist.r2 r2Var : com.tencent.mm.plugin.finder.assist.e9.f102151t) {
            com.tencent.mm.vfs.w6.u(r2Var.f102496a);
        }
        return jz5.f0.f302826a;
    }
}
