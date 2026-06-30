package ef3;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f333951d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f333952e;

    /* renamed from: f, reason: collision with root package name */
    public r45.t67 f333953f;

    /* renamed from: g, reason: collision with root package name */
    public r45.k65 f333954g;

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.j65();
        lVar.f152198b = new r45.k65();
        ss4.p0 p0Var = ss4.p0.f493657a;
        ss4.n0 n0Var = ss4.n0.f493642h;
        int a17 = p0Var.a(n0Var, fe1.i.f69740x366c91de);
        lVar.f152199c = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/payibggetoverseawallet");
        lVar.f152200d = a17;
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
        this.f333952e = a18;
        r45.j65 j65Var = (r45.j65) a18.f152243a.f152217a;
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_MULTI_WALLET_GUIDE_BOOLEAN, java.lang.Boolean.FALSE);
        j65Var.f459141d = m17 != null ? ((java.lang.Boolean) m17).booleanValue() : 0;
        j65Var.f459142e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        j65Var.f459144g = android.os.Build.VERSION.RELEASE;
        j65Var.f459143f = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.a(null, o45.wf.f424562g);
        j65Var.f459145h = android.os.Build.MANUFACTURER;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "req IsShowTips %s language %s os_ver %s wxg_ver %s phone_type %s", java.lang.Integer.valueOf(j65Var.f459141d), j65Var.f459142e, j65Var.f459144g, j65Var.f459143f, j65Var.f459145h);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f333951d = u0Var;
        return mo9409x10f9447a(sVar, this.f333952e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return fe1.i.f69740x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        r45.k65 k65Var;
        r45.x67 x67Var;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            r45.k65 k65Var2 = (r45.k65) fVar;
            this.f333954g = (r45.k65) fVar;
            h45.q qVar = (h45.q) i95.n0.c(h45.q.class);
            if (qVar != null && (k65Var = this.f333954g) != null && (x67Var = k65Var.f459983s) != null && (linkedList = x67Var.f471368d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.y67 y67Var = (r45.y67) it.next();
                    qVar.mo24798xfeb18fb0(y67Var.f472362d, y67Var.f472363e);
                }
            }
            if (k65Var2.f459975h == null || k65Var2.f459976i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd other is null " + k65Var2.f459977m);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "onGYNetEnd wallet_region : %s wallet_gray_area: %s wallet_threepoint_area size: %s", java.lang.Integer.valueOf(k65Var2.f459977m), java.lang.Integer.valueOf(k65Var2.f459975h.f464342d.size()), java.lang.Integer.valueOf(k65Var2.f459976i.f473288d.size()));
                r45.t67 t67Var = k65Var2.f459981q;
                if (t67Var != null) {
                    this.f333953f = t67Var;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePayIBGGetOverseaWallet", "wallet_key_info flag %s wallet_key_info.url %s", java.lang.Integer.valueOf(t67Var.f467705d), k65Var2.f459981q.f467706e);
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, java.lang.Integer.valueOf(k65Var2.f459977m));
            c01.je.m(k65Var2.f459977m);
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.d.f();
            ((pg0.a3) i95.n0.c(pg0.a3.class)).mj().z0(k65Var2.f459977m, k65Var2);
        }
        this.f333951d.mo815x76e0bfae(i18, i19, str, this);
    }
}
