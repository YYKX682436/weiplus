package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class r3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 f182901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f182903g;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 y3Var, java.util.List list2) {
        this.f182903g = activityC13568x82804f7e;
        this.f182900d = list;
        this.f182901e = y3Var;
        this.f182902f = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        android.view.View b17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f182903g;
        activityC13568x82804f7e.f181894h.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f182900d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13568x82804f7e.f181894h;
                activityC13568x82804f7e.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 y3Var = this.f182901e;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = y3Var.f183149a;
                java.util.ArrayList a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a.a(c5886xd11a0be7);
                if (a17.size() == 0) {
                    b17 = null;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) a17.get(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u3 u3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u3(activityC13568x82804f7e, c5886xd11a0be7, c17261xe88a6357);
                    if (!y3Var.f183150b) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13568x82804f7e.f181901r).h(c17261xe88a6357.f240153e, c17261xe88a6357.f240152d);
                        y3Var.f183150b = true;
                    }
                    b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC13568x82804f7e.f181901r).b(u3Var, c17261xe88a6357.f240153e, c17261xe88a6357.f240152d, 3);
                }
                k0Var.o(b17);
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f182902f.get(i17));
            }
            i17++;
        }
    }
}
