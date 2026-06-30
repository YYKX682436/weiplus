package cj5;

/* loaded from: classes.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f123789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(cj5.l2 l2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f123789d = l2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cj5.v1(this.f123789d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cj5.v1 v1Var = (cj5.v1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        qi5.w wVar;
        boolean z17;
        ri5.j a17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() lifecycleScope launch default");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        cj5.l2 l2Var = this.f123789d;
        zm3.a T6 = l2Var.T6();
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k kVar = T6 instanceof com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k ? (com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.k) T6 : null;
        if (kVar == null || (wVar = (qi5.w) ((jz5.n) kVar.f290873d).mo141623x754a37bb()) == null) {
            arrayList = null;
        } else {
            p75.n0 n0Var = dm.i2.K;
            p75.d dVar = dm.i2.L;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            p75.d dVar2 = dm.i2.W;
            g17.f434190d = dVar2.j("message_fold");
            g17.f434192f = kz5.b0.c(new g95.v());
            p75.l0 a18 = g17.a();
            p75.i0 g18 = n0Var.g(kz5.c0.i(dVar, dm.i2.T));
            g18.f434190d = dVar2.m().c(dm.i2.M.o(0));
            g18.f434192f = kz5.b0.c(new g95.v());
            java.util.List k17 = g18.a().k(wVar.e().Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.l4.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J((com.p314xaae8f345.mm.p2621x8fb0427b.l4) next)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((com.p314xaae8f345.mm.p2621x8fb0427b.l4) it6.next()).h1());
            }
            java.util.List l17 = a18.l(wVar.e().Q4());
            ((java.util.ArrayList) l17).addAll(arrayList3);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.addAll(wVar.d(new java.util.ArrayList(l17)));
            java.util.List d17 = g95.x.f351360a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList4);
            java.util.Map d18 = d75.b.d(g95.e.f351334a.f(l17), qi5.u.f445378d);
            arrayList = new java.util.ArrayList();
            java.util.Iterator it7 = ((java.util.ArrayList) d17).iterator();
            int i17 = 0;
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.l4) next2;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z3) ((java.util.LinkedHashMap) d18).get(l4Var.h1());
                if (z3Var == null) {
                    z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(l4Var.h1());
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(l4Var.w0(), l4Var.G0(), null, null, 0, 0, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J(l4Var), 60, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                java.util.Iterator it8 = it7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i19, 0);
                java.util.Set set = c01.e2.f118650a;
                boolean z18 = set != null && ((java.util.HashSet) set).contains(l4Var.h1());
                vi5.e eVar = vi5.f.f519153h;
                if (z18) {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = wVar.f445380d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i19, fVar, i19);
                    z17 = true;
                    a17.f477662z = true;
                    a17.A = true;
                } else {
                    z17 = true;
                    a17 = eVar.a(wVar.f445380d, id6, z3Var2, i19, fVar, (r14 & 32) != 0 ? i19 : 0);
                }
                arrayList.add(a17);
                i17 = i18;
                it7 = it8;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() real time getPlaceTopConversations cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " items:" + arrayList);
        l2Var.b7(arrayList);
        cj5.l2 l2Var2 = this.f123789d;
        pf5.e.m158344xbe96bc24(l2Var2, null, null, new cj5.u1(arrayList, l2Var2, null), 3, null);
        return jz5.f0.f384359a;
    }
}
