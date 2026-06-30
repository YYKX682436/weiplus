package qf2;

/* loaded from: classes10.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f444046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.pf f444047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f444048h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444049i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.c3 c3Var, dk2.pf pfVar, java.util.LinkedList linkedList, yz5.l lVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444045e = hVar;
        this.f444046f = c3Var;
        this.f444047g = pfVar;
        this.f444048h = linkedList;
        this.f444049i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.o2(this.f444045e, interfaceC29045xdcb5ca57, this.f444046f, this.f444047g, this.f444048h, this.f444049i);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.o2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444044d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String m75945x2fec8307 = ((r45.mm1) ((xg2.i) this.f444045e).f535926b).m75945x2fec8307(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorApplyVisitorBattle success battleId: " + m75945x2fec8307);
            qf2.c3 c3Var = this.f444046f;
            mm2.o4 o4Var = (mm2.o4) c3Var.m56788xbba4bfc0(mm2.o4.class);
            dk2.pf pfVar = this.f444047g;
            dk2.u4 u4Var = new dk2.u4(m75945x2fec8307, 0L, 0, 0, 6, null, pfVar.f315459a, pfVar.f315460b, pfVar.f315461c, this.f444048h, null, null, pfVar.f315463e, 0, 0, 27694, null);
            km2.k kVar = new km2.k(((mm2.c1) c3Var.m56788xbba4bfc0(mm2.c1.class)).f410385o, "", 0L, 0, false, null, 0L, true, 0L, null, 0, 1912, null);
            java.util.List list = u4Var.f315692f;
            list.add(kVar);
            java.util.Iterator it = this.f444048h.iterator();
            while (it.hasNext()) {
                java.util.LinkedList m75941xfb821914 = ((r45.r22) it.next()).m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getMembers(...)");
                java.util.Iterator it6 = m75941xfb821914.iterator();
                while (it6.hasNext()) {
                    list.add(new km2.k(((r45.wk6) it6.next()).m75945x2fec8307(0), "", 0L, 0, false, null, 0L, false, 0L, null, 0, 2040, null));
                }
            }
            o4Var.Z = u4Var;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            qf2.q2 q2Var = new qf2.q2(c3Var, pfVar, null);
            this.f444044d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, q2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yz5.l lVar = this.f444049i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
