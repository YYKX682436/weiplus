package p72;

/* loaded from: classes12.dex */
public final class e implements o72.b4 {

    /* renamed from: a, reason: collision with root package name */
    public final p75.n0 f434018a = dm.l3.f319741p;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f434019b = jz5.h.b(p72.b.f434007d);

    @Override // o72.b4
    public void a() {
        p75.i0 i17 = this.f434018a.i();
        i17.e(dm.l3.f319743r.u());
        java.util.ArrayList arrayList = (java.util.ArrayList) i17.a().k((l75.k0) ((jz5.n) this.f434019b).mo141623x754a37bb(), p72.a.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", "------ printAllDelInfo ----- size:%s", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", " ---- index:%s ----", java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", ((p72.a) next).m157931x9616526c());
            i18 = i19;
        }
    }

    @Override // o72.b4
    public void b(java.util.List list, java.lang.String callMsg, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callMsg, "callMsg");
        if (list == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.c(list, i17, i18, callMsg, this));
    }

    @Override // o72.b4
    public void c(o72.r2 r2Var, java.lang.String callMsg, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callMsg, "callMsg");
        if (r2Var == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.d(r2Var, i17, i18, callMsg, this));
    }

    public final void d(o72.r2 r2Var, java.lang.String str, int i17, int i18) {
        try {
            int i19 = r2Var.f67643xc8a07680;
            p75.i0 i27 = dm.l3.f319741p.i();
            i27.f434190d = dm.l3.f319742q.i(java.lang.Integer.valueOf(i19));
            i27.f434189c = "MicroMsg.SDK.BaseFavDelInfo";
            p75.l0 a17 = i27.a();
            jz5.g gVar = this.f434019b;
            p72.a aVar = (p72.a) a17.o((l75.k0) ((jz5.n) gVar).mo141623x754a37bb(), p72.a.class);
            p72.a aVar2 = aVar == null ? new p72.a() : aVar;
            aVar2.D0(r2Var.f67643xc8a07680);
            aVar2.z0(c01.id.c());
            aVar2.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
            aVar2.A0(i17);
            aVar2.F0(r2Var.f67657x2262335f);
            aVar2.G0(r2Var.f67659xa783a79b);
            aVar2.y0(aVar2.t0() | i18);
            long a18 = new m75.d(aVar2, null, null, "MicroMsg.SDK.BaseFavDelInfo").a((l75.k0) ((jz5.n) gVar).mo141623x754a37bb());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfoInner: %s, curInfoNull=");
            sb6.append(aVar == null);
            sb6.append("， replaceInfo:");
            sb6.append(aVar2);
            sb6.append(" replaceRet:%s");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", sb6.toString(), java.lang.Integer.valueOf(r2Var.f67643xc8a07680), java.lang.Long.valueOf(a18));
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6443x7a91f398 c6443x7a91f398 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6443x7a91f398();
            c6443x7a91f398.f137840d = 1L;
            c6443x7a91f398.f137843g = r2Var.f67643xc8a07680;
            c6443x7a91f398.f137841e = i17;
            c6443x7a91f398.f137842f = i18;
            c6443x7a91f398.k();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FavDelMgr", th6, "updateDelInfoInner err", new java.lang.Object[0]);
        }
    }
}
