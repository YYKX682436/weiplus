package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class l4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f200427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f200428f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 f200429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.l71 f200430h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, r45.nw1 nw1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 q4Var, r45.l71 l71Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200427e = h0Var;
        this.f200428f = nw1Var;
        this.f200429g = q4Var;
        this.f200430h = l71Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l4(this.f200427e, this.f200428f, this.f200429g, this.f200430h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.i72 i72Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f200426d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            long longValue = ((java.lang.Number) this.f200427e.f391656d).longValue();
            this.f200426d = 1;
            obj = ((c61.l7) b6Var).pl(longValue, null, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
        long j17 = 0;
        long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        r45.nw1 nw1Var = this.f200428f;
        if (nw1Var != null && (i72Var = (r45.i72) nw1Var.m75936x14adae67(44)) != null) {
            j17 = i72Var.m75942xfb822ef2(13);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 q4Var = this.f200429g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q4Var.f201019c, "checkPreloadReplayFeed, replayFeedId:" + pm0.v.u(m76784x5db1b11) + ", replay_control_flag:" + j17);
        if (c19792x256d2725 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209508v).mo141623x754a37bb()).r()).intValue() == 1 || pm0.v.A(j17, 1L)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).Bi(c19792x256d2725, 65, 1);
            }
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k4(c19792x256d2725, this.f200430h, q4Var, null);
        this.f200426d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, k4Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
