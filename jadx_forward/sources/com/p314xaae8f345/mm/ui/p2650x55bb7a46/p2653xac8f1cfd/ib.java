package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.r0.class)
/* loaded from: classes8.dex */
public final class ib extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.r0, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d5 {

    /* renamed from: e, reason: collision with root package name */
    public yb5.d f280750e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f280751f;

    /* renamed from: g, reason: collision with root package name */
    public int f280752g = -1;

    /* renamed from: h, reason: collision with root package name */
    public gp1.v f280753h;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f280751f;
        if (c19666xfd6e2f33 != null) {
            c19666xfd6e2f33.m75506xeed302b0(null);
        }
        this.f280751f = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f280750e = dVar;
        this.f280753h = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b;
        android.os.Bundle m7436x8619eaa0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2;
        android.os.Bundle m7436x8619eaa02;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b3;
        android.os.Bundle m7436x8619eaa03;
        gp1.v vVar = this.f280753h;
        if (vVar != null) {
            vVar.Q(true);
        }
        gp1.v vVar2 = this.f280753h;
        if (vVar2 != null) {
            vVar2.s(131072);
        }
        yb5.d dVar = this.f280750e;
        int i17 = (dVar == null || (abstractC21611x7536149b3 = dVar.f542250l) == null || (m7436x8619eaa03 = abstractC21611x7536149b3.m7436x8619eaa0()) == null) ? 0 : m7436x8619eaa03.getInt("chat_from_scene", 0);
        yb5.d dVar2 = this.f280750e;
        boolean z17 = (dVar2 == null || (abstractC21611x7536149b2 = dVar2.f542250l) == null || (m7436x8619eaa02 = abstractC21611x7536149b2.m7436x8619eaa0()) == null) ? false : m7436x8619eaa02.getBoolean("key_can_show_message_float_ball", false);
        gp1.v vVar3 = this.f280753h;
        if (vVar3 != null && vVar3.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallComponent", "onChattingResume current is in QBFileViewPage");
        }
        if (i17 == 1 && z17) {
            gp1.v vVar4 = this.f280753h;
            if ((vVar4 == null || vVar4.j()) ? false : true) {
                gp1.v vVar5 = this.f280753h;
                if (vVar5 != null) {
                    vVar5.o(true);
                }
                gp1.v vVar6 = this.f280753h;
                if (vVar6 != null) {
                    vVar6.E(java.lang.System.currentTimeMillis());
                }
                yb5.d dVar3 = this.f280750e;
                if (dVar3 != null && (abstractC21611x7536149b = dVar3.f542250l) != null && (m7436x8619eaa0 = abstractC21611x7536149b.m7436x8619eaa0()) != null) {
                    m7436x8619eaa0.putBoolean("key_can_show_message_float_ball", false);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                gp1.v vVar7 = this.f280753h;
                if (vVar7 != null) {
                    vVar7.z(currentTimeMillis, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hb(i17, z17, currentTimeMillis));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        gp1.v vVar = this.f280753h;
        if (vVar != null) {
            vVar.Q(false);
        }
        gp1.v vVar2 = this.f280753h;
        if (vVar2 != null) {
            vVar2.i0(131072);
        }
    }
}
