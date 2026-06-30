package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f268301a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f268302b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public q4() {
        kz5.p0 p0Var = kz5.p0.f395529d;
        this.f268301a = p0Var;
        this.f268302b = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4 t4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268417a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268420d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268420d = true;
            ip.e a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
            ip.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268419c;
            synchronized (a17) {
                a17.f375088d.add(dVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p4 p4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p4(this);
        synchronized (t4Var) {
            ?? r47 = (java.util.List) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268421e.get();
            p0Var = r47 != 0 ? r47 : p0Var;
        }
        if (!p0Var.isEmpty()) {
            p4Var.mo146xb9724478(p0Var);
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigReq.Builder m113582x3136c9db = com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigReq.m113582x3136c9db();
        m113582x3136c9db.m113612xcd406a25(ip.e.c(1));
        for (java.lang.String str : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t4.f268418b) {
            m113582x3136c9db.m113608xa215b766(str);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27357x62b32574.m113463x9cf0d20b().m113465x20b41c72((com.p314xaae8f345.p3133xd0ce8b26.aff.p3156x3324ec.C27359xf892a56f.ReadDynamicMenuConfigReq) m113582x3136c9db.mo20556x59bc66e(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r4(p4Var));
    }
}
