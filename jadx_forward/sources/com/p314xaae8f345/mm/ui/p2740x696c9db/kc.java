package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class kc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292068d;

    public kc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72) {
        this.f292068d = activityC22543x95896a72;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 2) {
            return;
        }
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292068d;
        ((g90.s) vVar).Zi(activityC22543x95896a72, activityC22543x95896a72.f291769x, activityC22543x95896a72.K, 2, 4, 4);
        h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a722 = this.f292068d;
        ((g90.s) vVar2).nj(activityC22543x95896a722.f291769x, 3, 4, 2);
        t21.v2 h17 = t21.d3.h(activityC22543x95896a722.f291760o);
        if (h17 == null) {
            activityC22543x95896a722.a7(activityC22543x95896a722.f291754f, activityC22543x95896a722);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteVideoPlayUI", "[recent share]video is null");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
        ((c35.m) i95.n0.c(c35.m.class)).getClass();
        h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr = h90.a.f361204d;
        if (((g90.u) wVar).Bi(Li, 2) != 3 || ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(Li, 2) != 4) {
            h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr2 = h90.a.f361204d;
            if (((g90.u) wVar2).Bi(Li, 5) != 3) {
                activityC22543x95896a722.a7(activityC22543x95896a722.f291754f, activityC22543x95896a722);
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.a1.d(this.f292068d, Li, ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Bi(Li, 2) == 3 && ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Ai(Li, 2) == 4, true, 4, 2, new com.p314xaae8f345.mm.ui.p2740x696c9db.s0() { // from class: com.tencent.mm.ui.tools.kc$$a
            @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.s0
            public final void a() {
                com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a723 = com.p314xaae8f345.mm.ui.p2740x696c9db.kc.this.f292068d;
                activityC22543x95896a723.a7(activityC22543x95896a723.f291754f, activityC22543x95896a723);
            }
        });
    }
}
