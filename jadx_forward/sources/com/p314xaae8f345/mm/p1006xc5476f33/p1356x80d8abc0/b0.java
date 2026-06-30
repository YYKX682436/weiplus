package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class b0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a {

    /* renamed from: a, reason: collision with root package name */
    public int f178359a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f178360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a f178361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 f178362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 f178363e;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var, com.p314xaae8f345.mm.vfs.r6 r6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar, com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9) {
        this.f178363e = e0Var;
        this.f178360b = r6Var;
        this.f178361c = aVar;
        this.f178362d = c4549xd1736fd9;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a
    /* renamed from: onResult */
    public void mo54660x57429edc(int i17) {
        int Ni;
        int i18 = this.f178359a;
        if (i18 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Recovery stage %d result: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9 c4549xd1736fd9 = this.f178362d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar = this.f178361c;
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f178360b;
        if (i17 == 0) {
            r6Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(181L, 29L, 1L, true);
            if (aVar != null) {
                aVar.mo54660x57429edc(i17);
            }
            c4549xd1736fd9.mo40017xcdd95364();
            return;
        }
        int i19 = -2;
        if (i17 == -2) {
            r6Var.l();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(181L, 3L, 1L, true);
            if (aVar != null) {
                aVar.mo54660x57429edc(i17);
            }
            c4549xd1736fd9.mo40017xcdd95364();
            return;
        }
        int i27 = this.f178359a + 1;
        this.f178359a = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var = this.f178363e;
        if (i27 != 1) {
            Ni = 0;
            if (i27 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: BACKUP RECOVER", java.lang.Integer.valueOf(i27));
                e0Var.Di(null, this);
            } else {
                if (i27 != 3) {
                    r6Var.l();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(181L, 30L, 1L, true);
                    if (aVar != null) {
                        aVar.mo54660x57429edc(i17);
                    }
                    c4549xd1736fd9.mo40017xcdd95364();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: DUMP", java.lang.Integer.valueOf(i27));
                e0Var.getClass();
                c01.d9.b().getClass();
                gm0.j1.i();
                java.lang.String m17 = gm0.j1.u().m();
                if (m17 != null && !m17.isEmpty()) {
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(m17));
                    if (r6Var2.h()) {
                        d95.f fVar = c01.d9.b().s() instanceof d95.b0 ? ((d95.b0) c01.d9.b().s()).f309143b : null;
                        if (fVar != null) {
                            java.lang.String substring = kk.k.g((wo.w0.g(true) + c01.d9.b().C()).getBytes()).substring(0, 7);
                            long C = r6Var2.C() * 2;
                            long B = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "db recover needSize : %d blockSize:%d", java.lang.Long.valueOf(C), java.lang.Long.valueOf(B));
                            if (B >= C) {
                                gm0.j1.e().n();
                                gm0.j1.e().f(new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a0(e0Var, r6Var2, fVar, substring, this));
                                i19 = 0;
                            }
                            Ni = i19;
                        }
                    }
                }
                i19 = -3;
                Ni = i19;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Database recovery stage %d: REPAIR", java.lang.Integer.valueOf(i27));
            Ni = e0Var.Ni(null, this);
        }
        if (Ni != 0) {
            mo54660x57429edc(Ni);
        }
    }
}
