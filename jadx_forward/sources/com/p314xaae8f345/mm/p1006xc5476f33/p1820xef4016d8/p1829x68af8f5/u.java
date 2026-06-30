package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class u implements ym5.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227447d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227447d = c16344xea85a40c;
    }

    @Override // ym5.m3
    public void a(int i17, boolean z17, boolean z18) {
        boolean z19;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "on page change: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227447d;
        if (z17) {
            if (c16344xea85a40c.A1 == i17) {
                return;
            }
            c16344xea85a40c.j(false);
            c16344xea85a40c.A1 = i17;
            c16344xea85a40c.f227321w.m66144xce1c9d00(i17);
            in5.s0 s0Var = (in5.s0) c16344xea85a40c.f227321w.p0(i17);
            if (s0Var != null) {
                boolean h17 = c16344xea85a40c.f227321w.h1(c16344xea85a40c.A1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "[isVideoItem] onpage change: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(h17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.h0) s0Var.f374658i;
                if (h17) {
                    if (c16344xea85a40c.O1) {
                        c16344xea85a40c.f227321w.i1(2);
                    }
                    h0Var.a();
                } else {
                    if (c16344xea85a40c.O1) {
                        c16344xea85a40c.f227321w.i1(1);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227397e++;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16346x4deb5237.c(h0Var.f227411g, h0Var.f227413i)) {
                    str = h0Var.f227413i;
                    z19 = true;
                } else {
                    z19 = false;
                    str = h0Var.f227408d.f466308e;
                }
                c16344xea85a40c.D1.h(c16344xea85a40c.getContext(), (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.j0c), (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.j09), (android.widget.ProgressBar) s0Var.p(com.p314xaae8f345.mm.R.id.j0a), str, h0Var.f227408d.f466309f, h0Var.f227409e, h0Var.f227410f, i17, h17, z19, false);
                gb3.n.a(6);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227394b++;
        }
        c16344xea85a40c.A.mo62753xed908c5b(i17);
    }
}
