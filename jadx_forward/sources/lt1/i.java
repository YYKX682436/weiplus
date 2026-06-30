package lt1;

/* loaded from: classes11.dex */
public final class i extends lt1.e {

    /* renamed from: a, reason: collision with root package name */
    public final w11.u f402719a = new lt1.h();

    @Override // lt1.e
    public int b() {
        return 30;
    }

    @Override // lt1.e
    public int c() {
        return 11747;
    }

    @Override // lt1.e
    public java.lang.String d() {
        return "MicroMsg.BypContactSyncProcessor";
    }

    @Override // lt1.e
    public java.lang.String e() {
        return "/cgi-bin/micromsg-bin/bypcontactsync";
    }

    @Override // lt1.e
    public boolean h() {
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableSyncAfterAutoAuth", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypContactSyncProcessor", "isSyncOnAuth called EnableSyncAfterAutoAuth:" + z17);
        return z17;
    }

    @Override // lt1.e
    public void k(java.util.List syncItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(syncItems, "syncItems");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypContactSyncProcessor", "process() called with: syncItems = " + java.lang.Integer.valueOf(syncItems.size()));
        if (syncItems.isEmpty()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();
        w11.u uVar = this.f402719a;
        a1Var.b(uVar);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int size = syncItems.size();
        java.util.Iterator it = syncItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.go5 go5Var = (r45.go5) next;
            r45.b50 b50Var = new r45.b50();
            b50Var.f452063d = go5Var.f456929d;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.c(go5Var.f456930e);
            b50Var.f452064e = cu5Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypContactSyncProcessor", "process cmd ret:" + a1Var.d(uVar, i17, size, b50Var, false, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), 5) + " diff:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " index:" + i17 + " size:" + size);
            it = it;
            i17 = i18;
        }
        a1Var.a(uVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BypContactSyncProcessor", "process() end called");
    }
}
