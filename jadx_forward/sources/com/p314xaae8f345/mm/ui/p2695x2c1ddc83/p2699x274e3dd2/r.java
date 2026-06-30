package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.c f289686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.s f289687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.d f289688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f289689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ym3.c cVar, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.s sVar, ym3.d dVar, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f289686d = cVar;
        this.f289687e = sVar;
        this.f289688f = dVar;
        this.f289689g = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.r(this.f289686d, this.f289687e, this.f289688f, this.f289689g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.r rVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        long j18;
        boolean z17;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.r rVar;
        boolean z18;
        boolean z19;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ym3.c cVar = this.f289686d;
        java.lang.Object obj2 = cVar.f544679d;
        int i17 = cVar.f544678c;
        java.lang.Long l17 = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        long longValue = l17 != null ? l17.longValue() : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.s sVar = this.f289687e;
        yf5.w wVar = sVar.f289690d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            p75.d dVar = dm.i2.M;
            p75.m0 o17 = dVar.o(0);
            p75.d dVar2 = dm.i2.W;
            p75.m c17 = o17.c(dVar2.m());
            p75.d dVar3 = dm.i2.T;
            p75.y yVar = (p75.y) c17;
            yVar.f(dVar3.w(java.lang.Long.valueOf(longValue)));
            p75.m a17 = g95.x.f351360a.a(yVar);
            p75.n0 n0Var = dm.i2.K;
            p75.i0 i18 = n0Var.i();
            i18.f434190d = a17;
            i18.e(dVar3.u());
            i18.c(i17, 0);
            p75.l0 a18 = i18.a();
            jz5.g gVar = sVar.f289692f;
            java.util.List k17 = a18.k(((jm0.l) ((jz5.n) gVar).mo141623x754a37bb()).Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.l4.class);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
            j17 = longValue;
            try {
                boolean z27 = arrayList2.size() >= i17;
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.k0(k17);
                    j18 = l4Var != null ? l4Var.G0() : 0L;
                    try {
                        if (arrayList2.size() < i17 || ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.X(k17)).G0() != ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.i0(k17)).G0()) {
                            z19 = z27;
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUnreadConvList: all flag is same, count: ");
                            sb6.append(arrayList2.size());
                            sb6.append(", flag: ");
                            z19 = z27;
                            try {
                                sb6.append(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.X(k17)).G0());
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UnreadConversationDataSource", sb6.toString());
                                p75.i0 i19 = n0Var.i();
                                p75.y yVar2 = (p75.y) dVar.o(0).c(dVar2.m());
                                yVar2.f(dVar3.i(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.X(k17)).G0())));
                                i19.f434190d = yVar2;
                                i19.e(dVar3.u());
                                k17 = i19.a().k(((jm0.l) ((jz5.n) gVar).mo141623x754a37bb()).Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.l4.class);
                                j18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.l4) kz5.n0.i0(k17)).G0() - 1;
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                z17 = z19;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UnreadConversationDataSource", e, "getUnreadConvList error", new java.lang.Object[0]);
                                rVar = this;
                                z18 = z17;
                                ym3.d dVar4 = rVar.f289688f;
                                dVar4.f544682c.addAll(arrayList);
                                dVar4.f544681b = z18;
                                dVar4.f544683d = java.lang.Long.valueOf(j18);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar4.f544682c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar4.f544681b + ", pageSize: " + i17);
                                u26.w wVar2 = rVar.f289689g;
                                wVar2.e(dVar4);
                                u26.x0.a(wVar2, null, 1, null);
                                return jz5.f0.f384359a;
                            }
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : k17) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) obj3).h1(), "qmessage")) {
                                arrayList3.add(obj3);
                            }
                        }
                        java.util.Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) it.next();
                            yf5.x xVar = (yf5.x) wVar.f543505s.get(l4Var2.h1());
                            if (xVar == null) {
                                xVar = wVar.d(l4Var2, null);
                            }
                            if (xVar == null || xVar.f543547z != 2) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append("getUnreadConvList: buildConvItem error, username=");
                                sb7.append(l4Var2.h1());
                                sb7.append(", countShowType=");
                                sb7.append(xVar != null ? java.lang.Integer.valueOf(xVar.f543547z) : null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UnreadConversationDataSource", sb7.toString());
                            } else {
                                arrayList.add(xVar);
                                java.util.Set set = sVar.f289693g;
                                java.lang.String h17 = l4Var2.h1();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getUsername(...)");
                                set.add(h17);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList lastFlag=%d, pageSize=%d, result=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
                        rVar = this;
                        z18 = z19;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        z19 = z27;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    z19 = z27;
                    j18 = j17;
                }
            } catch (java.lang.Exception e27) {
                e = e27;
                j18 = j17;
                z17 = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UnreadConversationDataSource", e, "getUnreadConvList error", new java.lang.Object[0]);
                rVar = this;
                z18 = z17;
                ym3.d dVar42 = rVar.f289688f;
                dVar42.f544682c.addAll(arrayList);
                dVar42.f544681b = z18;
                dVar42.f544683d = java.lang.Long.valueOf(j18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar42.f544682c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar42.f544681b + ", pageSize: " + i17);
                u26.w wVar22 = rVar.f289689g;
                wVar22.e(dVar42);
                u26.x0.a(wVar22, null, 1, null);
                return jz5.f0.f384359a;
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            j17 = longValue;
        }
        ym3.d dVar422 = rVar.f289688f;
        dVar422.f544682c.addAll(arrayList);
        dVar422.f544681b = z18;
        dVar422.f544683d = java.lang.Long.valueOf(j18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar422.f544682c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar422.f544681b + ", pageSize: " + i17);
        u26.w wVar222 = rVar.f289689g;
        wVar222.e(dVar422);
        u26.x0.a(wVar222, null, 1, null);
        return jz5.f0.f384359a;
    }
}
