package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes12.dex */
public final class z0 implements pk4.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 f286415a;

    public z0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332) {
        this.f286415a = c22101xd1256332;
    }

    @Override // pk4.u0
    public void a(long j17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.h0 m80186x5131279e;
        yz5.l lVar;
        pk4.d m80189x4ee17f0a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22101xd1256332 c22101xd1256332 = this.f286415a;
        m80186x5131279e = c22101xd1256332.m80186x5131279e();
        if (m80186x5131279e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c22101xd1256332.f286259m, "onPlayProgress, prepareContext returns null, skip");
            return;
        }
        b11.a m48328xa0ab20ce = c22101xd1256332.m48328xa0ab20ce();
        b11.d dVar = m48328xa0ab20ce instanceof b11.d ? (b11.d) m48328xa0ab20ce : null;
        if (dVar == null || (lVar = dVar.F) == null) {
            return;
        }
        t21.v2 v2Var = m80186x5131279e.f286333c;
        java.lang.String d17 = v2Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getFileName(...)");
        java.lang.String m9577x4f4a97c4 = m80186x5131279e.f286331a.m9577x4f4a97c4();
        if (m9577x4f4a97c4 == null) {
            m9577x4f4a97c4 = "";
        }
        long j18 = v2Var.f496548m;
        m80189x4ee17f0a = c22101xd1256332.m80189x4ee17f0a();
        lVar.mo146xb9724478(new b11.c(d17, m9577x4f4a97c4, j18, j17, m80189x4ee17f0a.getIsOnlineVideo(), false));
    }
}
