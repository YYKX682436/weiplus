package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class t0 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f286390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 f286391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286392f;

    public t0(t21.v2 v2Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286390d = v2Var;
        this.f286391e = c22101xd1256332;
        this.f286392f = f9Var;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var != null ? r1Var.f527062a : null;
        t21.v2 v2Var = this.f286390d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, v2Var.d());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332 = this.f286391e;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c22101xd1256332.f286259m, "tryPrepareDownload, notifyChanged, fileName not matched, skip");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286392f;
        if ((!f9Var.M2() && f9Var.z2()) || v2Var.f496544i == 198) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c22101xd1256332.f286259m, "tryPrepareDownload, notifyChanged, video expired or failed, skip");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            c22101xd1256332.B(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22102x6d2ff568.f286276a);
            return;
        }
        if (!v2Var.i()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c22101xd1256332.f286259m, "tryPrepareDownload, notifyChanged, download failed, skip");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            c22101xd1256332.B(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22102x6d2ff568.f286276a);
            return;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22103x909e82dd c22103x909e82dd = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22103x909e82dd.f286277a;
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332.B;
        c22101xd1256332.B(c22103x909e82dd);
    }
}
