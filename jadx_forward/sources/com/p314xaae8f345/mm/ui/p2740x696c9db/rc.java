package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes3.dex */
public class rc implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f292215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 f292216b;

    public rc(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72, java.lang.String str) {
        this.f292216b = activityC22543x95896a72;
        this.f292215a = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f292215a, str2);
        ((ku5.t0) ku5.t0.f394148d).D(new com.p314xaae8f345.mm.ui.p2740x696c9db.pc(this));
        q75.c.f(str2, this.f292216b.mo55332x76847179());
        if (this.f292216b.getIntent().hasExtra("jumpChat")) {
            jx3.f.INSTANCE.d(25464, 27, 0, 4);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22543x95896a72 activityC22543x95896a72 = this.f292216b;
        if (activityC22543x95896a72.f291762q) {
            t21.v2 h17 = t21.d3.h(activityC22543x95896a72.f291760o);
            if (h17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteVideoPlayUI", "save video");
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(h17.h(), h17.f496549n);
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f361204d;
            ((g90.u) wVar).Ui(Li, 2, str2, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(Li.Q0(), Li.m124847x74d37ac6(), 2);
        }
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteVideoPlayUI", "save video now video path %s out path %s", this.f292215a, str2);
        ((ku5.t0) ku5.t0.f394148d).D(new com.p314xaae8f345.mm.ui.p2740x696c9db.qc(this));
    }
}
