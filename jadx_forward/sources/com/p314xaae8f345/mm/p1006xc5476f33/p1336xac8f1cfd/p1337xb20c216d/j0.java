package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0 f178110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 f178112g;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0 n0Var, java.util.List list2) {
        this.f178112g = activityC13155x6eea6ae2;
        this.f178109d = list;
        this.f178110e = n0Var;
        this.f178111f = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2 = this.f178112g;
        activityC13155x6eea6ae2.f178018n.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f178109d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13155x6eea6ae2.f178018n;
                activityC13155x6eea6ae2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0 n0Var = this.f178110e;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = n0Var.f178146a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                int c17 = s6Var.c(c5886xd11a0be7);
                int d17 = s6Var.d(c5886xd11a0be7);
                java.lang.String e17 = s6Var.e(c5886xd11a0be7);
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.l0 l0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.l0(activityC13155x6eea6ae2, c5886xd11a0be7, e17, c17, d17);
                if (!n0Var.f178147b) {
                    n0Var.f178147b = true;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13155x6eea6ae2.f178023s).h(c17, e17);
                }
                k0Var.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13155x6eea6ae2.f178023s).b(l0Var, c17, e17, 5));
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f178111f.get(i17));
            }
            i17++;
        }
    }
}
