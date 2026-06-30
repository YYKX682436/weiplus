package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class tb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f217542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 f217543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217542d = list;
        this.f217543e = abstractC13834x56f46d28;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tb(this.f217542d, this.f217543e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tb tbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.tb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        tbVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        for (r45.tk0 tk0Var : this.f217542d) {
            long j17 = tk0Var.f468047d;
            java.lang.String u17 = pm0.v.u(j17);
            int i17 = tk0Var.f468048e;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = tk0Var.f468049f;
            if (i17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = this.f217543e;
                if (i17 != 1) {
                    if (i17 == 2) {
                        int mo56120xc84af884 = abstractC13834x56f46d28.mo56120xc84af884(j17, true);
                        if (mo56120xc84af884 >= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Del feed:" + u17 + " at pos:" + mo56120xc84af884);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Del failed, feed:" + u17 + " not found");
                        }
                    } else if (i17 == 3) {
                        if (c19792x256d2725 == null || hc2.o0.D(c19792x256d2725, true)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert skip, newObject null or isHardAd, feed:".concat(u17));
                        } else {
                            java.util.Iterator it = abstractC13834x56f46d28.m56388xcaeb60d0().iterator();
                            int i18 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i18 = -1;
                                    break;
                                }
                                if (((so2.j5) it.next()).mo2128x1ed62e84() == j17) {
                                    break;
                                }
                                i18++;
                            }
                            if (i18 >= 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
                                int i19 = i18 + 1;
                                abstractC13834x56f46d28.m56102xe9151828(kz5.b0.c(cu2.u.f303974a.p(a17)), i19);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert feed after:" + u17 + " at pos:" + i19 + " mediaType:" + a17.getMediaType());
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Insert failed, anchor feed:" + u17 + " not found");
                            }
                        }
                    }
                } else if (c19792x256d2725 == null || hc2.o0.D(c19792x256d2725, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace skip, newObject null or isHardAd, feed:".concat(u17));
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(a18);
                    int mo56120xc84af8842 = abstractC13834x56f46d28.mo56120xc84af884(j17, true);
                    if (mo56120xc84af8842 >= 0) {
                        abstractC13834x56f46d28.m56101xb970c2b9(p17, mo56120xc84af8842, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace feed:" + u17 + " at pos:" + mo56120xc84af8842 + " mediaType:" + a18.getMediaType());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Replace failed, feed:" + u17 + " not found");
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.EnhanceFeedUIC", "[handleRefreshObjects] Keep feed:".concat(u17));
            }
        }
        return jz5.f0.f384359a;
    }
}
