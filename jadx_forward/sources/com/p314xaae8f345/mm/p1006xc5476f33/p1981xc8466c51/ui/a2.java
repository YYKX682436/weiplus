package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class a2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g2 f236880e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f236881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f236882g;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf, java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g2 g2Var, java.util.List list2) {
        this.f236882g = activityC16972xc3ec91bf;
        this.f236879d = list;
        this.f236880e = g2Var;
        this.f236881f = list2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f236882g;
        activityC16972xc3ec91bf.f236854r.o(null);
        g4Var.clear();
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f236879d;
            if (i17 >= list.size()) {
                return;
            }
            if (((java.lang.Integer) list.get(i17)).intValue() == 3) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC16972xc3ec91bf.f236854r;
                activityC16972xc3ec91bf.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g2 g2Var = this.f236880e;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = g2Var.f236928a;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                int c17 = s6Var.c(c5886xd11a0be7);
                int d17 = s6Var.d(c5886xd11a0be7);
                java.lang.String e17 = s6Var.e(c5886xd11a0be7);
                com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.d2(activityC16972xc3ec91bf, c5886xd11a0be7, e17, c17, d17);
                if (!g2Var.f236929b) {
                    g2Var.f236929b = true;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC16972xc3ec91bf.f236859w).h(c17, e17);
                }
                k0Var.o(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) activityC16972xc3ec91bf.f236859w).b(d2Var, c17, e17, 5));
            } else {
                g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f236881f.get(i17));
            }
            i17++;
        }
    }
}
