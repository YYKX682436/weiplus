package qf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f444174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.m f444175g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, yz5.l lVar, qf2.y1 y1Var, dk2.m mVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444172d = hVar;
        this.f444173e = lVar;
        this.f444174f = y1Var;
        this.f444175g = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.x0(this.f444172d, interfaceC29045xdcb5ca57, this.f444173e, this.f444174f, this.f444175g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.x0 x0Var = (qf2.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.o22 o22Var = (r45.o22) ((xg2.i) this.f444172d).f535926b;
        java.lang.String m75945x2fec8307 = o22Var.m75945x2fec8307(2);
        int m75939xb282bd08 = o22Var.m75939xb282bd08(1);
        if (m75939xb282bd08 <= 0) {
            m75939xb282bd08 = 60;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicAnchorBattlePkController", "anchorNewApplyBattle success battleId: " + m75945x2fec8307 + " confirmTTl: " + m75939xb282bd08 + " curServerTime: " + c01.id.a());
        yz5.l lVar = this.f444173e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        qf2.y1 y1Var = this.f444174f;
        mm2.o4 o4Var = (mm2.o4) y1Var.m56788xbba4bfc0(mm2.o4.class);
        dk2.m mVar = this.f444175g;
        dk2.u4 u4Var = new dk2.u4(m75945x2fec8307, 0L, 0, 0, 0, null, mVar.f315271a, mVar.f315272b, mVar.f315273c, mVar.f315276f, null, null, mVar.f315275e, 0, 0, 27694, null);
        km2.k kVar = new km2.k(((mm2.c1) y1Var.m56788xbba4bfc0(mm2.c1.class)).f410385o, "", 0L, 0, false, null, 0L, true, 0L, null, 0, 1912, null);
        java.util.List list = u4Var.f315692f;
        list.add(kVar);
        java.util.Iterator it = mVar.f315276f.iterator();
        while (it.hasNext()) {
            int i17 = 0;
            java.util.LinkedList<r45.wk6> m75941xfb821914 = ((r45.r22) it.next()).m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
            for (r45.wk6 wk6Var : m75941xfb821914) {
                list.add(new km2.k(wk6Var.m75945x2fec8307(i17), wk6Var.m75945x2fec8307(1), 0L, 0, false, null, 0L, false, 0L, null, 0, 2040, null));
                i17 = 0;
            }
        }
        o4Var.Z = u4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
        if (naVar != null) {
            naVar.E1();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7) y1Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7.class);
        if (x7Var != null) {
            x7Var.I1(1);
        }
        mk2.h hVar = mk2.h.f408666a;
        long j17 = m75939xb282bd08 * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LinkMicTimeoutTimer", "startApplyBattleTimer delay:" + j17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(mk2.h.f408671f, j17);
        return jz5.f0.f384359a;
    }
}
