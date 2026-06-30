package sm2;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f490898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f490899f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(sm2.o4 o4Var, long j17, r45.hc1 hc1Var) {
        super(0);
        this.f490897d = o4Var;
        this.f490898e = j17;
        this.f490899f = hc1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        r45.gw0 gw0Var;
        r45.f84 f84Var;
        sm2.o4 o4Var = this.f490897d;
        ((mm2.c1) o4Var.c(mm2.c1.class)).Z9(this.f490898e);
        dk2.xa xaVar = dk2.xa.f315877a;
        xaVar.i(o4Var.f101142a);
        gk2.e eVar = o4Var.f101142a;
        r45.hc1 hc1Var = this.f490899f;
        java.lang.String m75945x2fec8307 = hc1Var.m75945x2fec8307(38);
        r45.ic1 ic1Var = (r45.ic1) hc1Var.m75936x14adae67(85);
        xaVar.j(eVar, m75945x2fec8307, (ic1Var == null || (f84Var = (r45.f84) ic1Var.m75936x14adae67(12)) == null) ? null : f84Var.m75945x2fec8307(1));
        xaVar.g(o4Var.f101142a);
        r45.nw1 nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3);
        boolean z17 = pm0.v.z(nw1Var != null ? nw1Var.m75939xb282bd08(37) : 0, 64);
        java.lang.String str = o4Var.f491143f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "#handleJoinResp.setAnchorStatus isBizMode=" + z17);
        if (!z17) {
            xaVar.h(o4Var.f101142a, (r45.gw0) hc1Var.m75936x14adae67(24));
        }
        r45.nw1 nw1Var2 = (r45.nw1) hc1Var.m75936x14adae67(3);
        java.lang.String m75945x2fec83072 = (nw1Var2 == null || (gw0Var = (r45.gw0) nw1Var2.m75936x14adae67(40)) == null) ? null : gw0Var.m75945x2fec8307(1);
        if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
            ((mm2.d) o4Var.c(mm2.d.class)).O6(z17);
        }
        xaVar.d(o4Var.f101142a);
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.x2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f458662d) || r4Var.y2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f458662d) || r4Var.w2(((mm2.o4) o4Var.c(mm2.o4.class)).U.f458662d)) {
            xaVar.f(o4Var.f101142a);
        }
        if (!((mm2.c1) o4Var.c(mm2.c1.class)).l7()) {
            in0.q qVar = o4Var.f101130e;
            vn0.c cVar = vn0.b.f519707a;
            if (!(qVar != null && qVar.Q == cVar.d().f536965e) && dk2.ef.f314905a.l() && !((mm2.e1) o4Var.c(mm2.e1.class)).f7()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fps Change, oldFps:");
                in0.q qVar2 = o4Var.f101130e;
                sb6.append(qVar2 != null ? java.lang.Integer.valueOf(qVar2.Q) : null);
                sb6.append(" newFps:");
                sb6.append(cVar.d().f536965e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var = o4Var.f491149i;
                if (o9Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.D1(o9Var, false, false, 3, null);
                }
            }
        }
        dk2.xf g17 = o4Var.g();
        if (g17 != null) {
            dk2.xf.g(g17, ((mm2.e1) o4Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) o4Var.c(mm2.e1.class)).f410516m, ((mm2.e1) o4Var.c(mm2.e1.class)).f410525v, 2, null, 16, null);
        }
        ((mm2.c1) o4Var.c(mm2.c1.class)).f410394p2 = android.os.SystemClock.elapsedRealtimeNanos();
        fm2.a aVar = o4Var.f101128c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f446919n, null, 2, null);
        }
        fm2.a aVar2 = o4Var.f101128c;
        if (aVar2 != null && (m57663xfb7e5820 = aVar2.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null) {
            if2.z.f372686a.h(c14197x319b1b9e, hc1Var);
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5440x181ea454().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.D.f184073b, null, false, true, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184134c = c01.id.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a, o4Var.f101142a, 17, 0, "anchorSuccLive", null, 16, null);
        return jz5.f0.f384359a;
    }
}
