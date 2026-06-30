package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f211471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959 f211472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959 c15018xc6f0a959, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211472e = c15018xc6f0a959;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v2(this.f211472e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.v2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        android.view.View view;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f211471d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15018xc6f0a959 c15018xc6f0a959 = this.f211472e;
            qb2.h0 h0Var = (qb2.h0) c15018xc6f0a959.z0();
            l75.n0 c17 = h0Var.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
            java.util.List P0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80) c17).P0(h0Var.f442750a, 0, 1, new int[]{1}, h0Var.f442752c);
            if (!P0.isEmpty()) {
                str = ((qb2.t) P0.get(0)).F1 + ':' + ((qb2.t) P0.get(0)).f65853xf66fcca9;
            } else {
                str = "";
            }
            long j17 = P0.isEmpty() ^ true ? ((qb2.t) P0.get(0)).f65871xa783a79b : 0L;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            int J0 = Kj.J0(2, (java.lang.String) ((jz5.n) c15018xc6f0a959.f210043w).mo141623x754a37bb());
            qb2.t D0 = Kj.D0("findersayhisessionholder");
            if (J0 > 0 && D0.f72763xa3c65b86 > 0 && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, D0.f65853xf66fcca9) || j17 != D0.f65871xa783a79b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBaseConversationFragment", "[onResume] update digest=%s", str);
                D0.f65853xf66fcca9 = str;
                D0.f65871xa783a79b = j17;
                if (Kj.m145258xce0038c9(D0.f72763xa3c65b86, D0, false)) {
                    Kj.mo142179xf35bbb4(D0.f65866xbed8694c, 1, D0);
                }
            } else if (D0.f72763xa3c65b86 > 0 && J0 == 0 && (view = c15018xc6f0a959.f287834h) != null) {
                view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t2(Kj, D0), 1000L);
            }
            c15018xc6f0a959.N0();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u2 u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.u2(c15018xc6f0a959, null);
            this.f211471d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, u2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
