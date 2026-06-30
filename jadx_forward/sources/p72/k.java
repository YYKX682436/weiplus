package p72;

/* loaded from: classes12.dex */
public final class k implements o72.b4 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f434032a = jz5.h.b(p72.g.f434020d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f434033b = jz5.h.b(new p72.h(this));

    @Override // o72.b4
    public void a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f434033b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        java.util.List<R> m107107xde3eb429 = ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) mo141623x754a37bb).m107107xde3eb429(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880(up5.d.f511449d).m108501x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc), p72.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107107xde3eb429, "getAllObjects(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", "------ printAllDelInfo ----- size:%s", java.lang.Integer.valueOf(m107107xde3eb429.size()));
        java.util.Iterator it = m107107xde3eb429.iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", " ---- index:%s ----", 0);
            throw null;
        }
    }

    @Override // o72.b4
    public void b(java.util.List list, java.lang.String callMsg, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callMsg, "callMsg");
        if (list == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.i(list, i17, i18, callMsg, this));
    }

    @Override // o72.b4
    public void c(o72.r2 r2Var, java.lang.String callMsg, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callMsg, "callMsg");
        if (r2Var == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.j(r2Var, i17, i18, callMsg, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(o72.r2 r2Var, java.lang.String str, int i17, int i18) {
        jz5.g gVar = this.f434033b;
        try {
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.d.f511448c;
            up5.r rVar = (up5.r) ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) mo141623x754a37bb).m107127x946de4d9(c26981x40bb0da.eq(r2Var.f67643xc8a07680));
            up5.r rVar2 = rVar == null ? new up5.r() : rVar;
            rVar2.f511578a = r2Var.f67643xc8a07680;
            rVar2.f511579b = c01.id.c();
            rVar2.f511582e = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e;
            rVar2.f511583f = i17;
            rVar2.f511584g = r2Var.f67657x2262335f;
            rVar2.f511585h = r2Var.f67659xa783a79b;
            rVar2.f511586i = rVar2.f511586i | i18;
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) mo141623x754a37bb2).m107173xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) rVar2, c26981x40bb0da.eq(rVar2.f511578a));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfoInner: %s, curInfoNull=");
            sb6.append(rVar == null);
            sb6.append("， replaceInfo:");
            sb6.append(rVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDelMgr", sb6.toString(), java.lang.Integer.valueOf(r2Var.f67643xc8a07680));
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
