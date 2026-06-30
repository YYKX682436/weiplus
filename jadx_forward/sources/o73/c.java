package o73;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f425073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n75.b f425074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o73.j jVar, n75.b bVar) {
        super(0);
        this.f425073d = jVar;
        this.f425074e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init start");
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_SYNC_COMM_USERNAMEMAP_V1_LONG_SYNC;
        long t17 = c17.t(u3Var, 0L);
        if (java.lang.System.currentTimeMillis() - t17 < 604800000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HashInfo.HashUserNameMapStorage", "lastSyncTime: " + t17 + ", not need to sync now~");
        } else {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            o73.j jVar = this.f425073d;
            java.lang.String a76 = jVar.a7();
            if (a76 == null || a76.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HashInfo.HashUserNameMapStorage", "salt is empty");
            } else {
                java.util.LinkedHashSet<o73.b> linkedHashSet = new java.util.LinkedHashSet();
                android.database.Cursor K = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
                if (K != null) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    while (K.moveToNext()) {
                        z3Var.mo9015xbf5d97fd(K);
                        o73.b bVar = new o73.b();
                        bVar.f76395x11b86abb = z3Var.d1();
                        linkedHashSet.add(bVar);
                    }
                    K.close();
                }
                o73.b bVar2 = new o73.b();
                bVar2.f76395x11b86abb = en1.a.a();
                linkedHashSet.add(bVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "get contact done");
                for (o73.b bVar3 : linkedHashSet) {
                    bVar3.f76394x8d8a3769 = jVar.X6(bVar3.f76395x11b86abb, jVar.a7());
                    bVar3.f76392xdcacde15 = jVar.X6(bVar3.f76395x11b86abb, jVar.Z6());
                    bVar3.f76393xda587801 = jVar.X6(bVar3.f76395x11b86abb, jVar.b7());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "compute salt done");
                l75.k0 Q4 = this.f425074e.Q4();
                if (Q4 != null) {
                    o73.j jVar2 = this.f425073d;
                    long F = Q4.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                    java.util.Iterator it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.V6(jVar2, (o73.b) it.next(), false, false, 6, null);
                    }
                    Q4.w(java.lang.Long.valueOf(F));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end size:" + linkedHashSet.size());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HashInfo.HashUserNameMapStorage", "init end db is null size:" + linkedHashSet.size());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
