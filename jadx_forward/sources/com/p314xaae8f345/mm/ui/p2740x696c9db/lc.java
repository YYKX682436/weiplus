package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class lc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292088d;

    public lc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292088d = activityC22543x95896a72;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292088d;
        if (itemId != 1) {
            if (itemId == 2) {
                activityC22543x95896a72.a7(activityC22543x95896a72.f291754f, activityC22543x95896a72);
                return;
            }
            if (itemId != 3) {
                return;
            }
            if (activityC22543x95896a72.f291762q) {
                h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a722 = this.f292088d;
                ((g90.s) vVar).Zi(activityC22543x95896a722, activityC22543x95896a722.f291769x, activityC22543x95896a722.K, 2, 4, 2);
            }
            activityC22543x95896a72.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            int intExtra = activityC22543x95896a72.getIntent().getIntExtra("key_favorite_source_type", 1);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a2.h(c5303xc75d2f73, 1, activityC22543x95896a72.f291754f, activityC22543x95896a72.f291753e, 0, "", "", true);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activityC22543x95896a72;
            c4Var.f87860m = intExtra;
            c5303xc75d2f73.e();
            if (activityC22543x95896a72.f291762q) {
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(2);
                return;
            }
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        java.lang.String str = activityC22543x95896a72.f291754f;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        cVar.r(str);
        java.lang.String str2 = activityC22543x95896a72.f291753e;
        cVar.o(str2 != null ? str2 : "");
        cVar.q(activityC22543x95896a72.f291755g);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22543x95896a72.mo55332x76847179();
        n13.r a17 = n13.r.a(1);
        a17.f415653d.f415672a = 9;
        ((dk5.b0) b0Var).Bi(mo55332x76847179, cVar, a17);
        if (activityC22543x95896a72.getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 2);
        }
        if (activityC22543x95896a72.f291762q) {
            ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).oj(1);
            h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a723 = this.f292088d;
            ((g90.s) vVar2).Zi(activityC22543x95896a723, activityC22543x95896a723.f291769x, activityC22543x95896a723.K, 2, 4, 1);
        }
    }
}
