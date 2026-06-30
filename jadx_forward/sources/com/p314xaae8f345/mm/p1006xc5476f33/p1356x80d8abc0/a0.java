package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f178326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d95.f f178327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a f178329g;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var, com.p314xaae8f345.mm.vfs.r6 r6Var, d95.f fVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar) {
        this.f178326d = r6Var;
        this.f178327e = fVar;
        this.f178328f = str;
        this.f178329g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        try {
            java.lang.Thread.sleep(200L);
        } catch (java.lang.InterruptedException unused) {
        }
        java.lang.String h17 = gm0.j1.u().h();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h17);
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f178326d;
        sb6.append(r6Var.m82467xfb82e301().replace(".db", "temp.db"));
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "temp db path is %s", sb7);
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(sb7);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 M = r6Var.M();
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (M.a() && m17.a()) {
            try {
                m17.f294799a.t(m17.f294800b, M.f294799a, M.f294800b);
            } catch (java.io.IOException unused2) {
            }
        }
        java.util.List asList = java.util.Arrays.asList("getcontactinfo", "contact", "contact_ext", "ContactCmdBuf", "rcontact", "img_flag", "userinfo");
        int[] iArr = new int[1];
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean m107931x3a1cedde = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26984xa28292b4.m107931x3a1cedde(this.f178327e.f309211a, sb7, this.f178328f, h17 + "sqlTemp.sql", asList, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.z(this, iArr), true);
        if (m107931x3a1cedde) {
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).getClass();
            gm0.j1.i();
            gm0.j1.u().c().w(348167, 1);
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).N();
            c01.d9.b().u().getClass();
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).tb();
            i17 = 12;
        } else {
            i17 = 15;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(181L, i17, 1L, true);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "execute %d sql and last %d", java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(currentTimeMillis2));
        g0Var.d(11224, java.lang.Integer.valueOf(m107931x3a1cedde ? 1 : 0), iArr, java.lang.Long.valueOf(currentTimeMillis2));
        gm0.j1.e().o();
        com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar = this.f178329g;
        if (aVar != null) {
            aVar.mo54660x57429edc(m107931x3a1cedde ? 0 : -1);
        }
    }
}
