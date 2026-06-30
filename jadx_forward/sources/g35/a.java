package g35;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final wy.f f349710d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f349711e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f349712f;

    public a(java.util.List list, wy.f fVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.le();
        lVar.f152198b = new r45.me();
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchcheckbigfileupload";
        lVar.f152200d = 3939;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f349712f = a17;
        r45.le leVar = (r45.le) a17.f152243a.f152217a;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            wy.g gVar = (wy.g) it.next();
            r45.vz vzVar = new r45.vz();
            java.lang.String str = gVar.f532132f;
            java.lang.String str2 = gVar.f532133g;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f532128b) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f532127a)) {
                vzVar.f470217g = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().d();
                vzVar.f470218h = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().e(str);
                vzVar.f470221n = com.p314xaae8f345.mm.vfs.w6.q(str);
                vzVar.f470220m = com.p314xaae8f345.mm.vfs.w6.n(str);
                vzVar.f470216f = com.p314xaae8f345.mm.vfs.w6.k(str);
            } else {
                vzVar.f470217g = gVar.f532128b;
                vzVar.f470218h = gVar.f532127a;
                vzVar.f470221n = gVar.f532129c;
                vzVar.f470220m = gVar.f532130d;
                vzVar.f470216f = gVar.f532131e;
            }
            vzVar.f470219i = 7;
            vzVar.f470215e = str2;
            vzVar.f470214d = c01.z1.r();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig NetSceneBatchCheckBigFileUpload, aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", vzVar.f470217g, vzVar.f470218h, vzVar.f470221n, java.lang.Long.valueOf(vzVar.f470216f), vzVar.f470220m, vzVar.f470215e, vzVar.f470214d, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            leVar.f460879e.add(vzVar);
        }
        leVar.f460878d = leVar.f460879e.size();
        this.f349710d = fVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f349711e = u0Var;
        return mo9409x10f9447a(sVar, this.f349712f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3939;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        wy.f fVar = this.f349710d;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i18 + ", errCode = " + i19);
            this.f349711e.mo815x76e0bfae(i18, i19, str, this);
            if (fVar != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6v);
                }
                if (i19 == 0) {
                    i19 = com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a;
                }
                fVar.a(i19, str, null);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.le leVar = (r45.le) oVar.f152243a.f152217a;
        r45.me meVar = (r45.me) oVar.f152244b.f152233a;
        int i27 = meVar.mo11484xe92ab0a8().f458492d;
        if (i27 != 0) {
            java.lang.String str2 = meVar.mo11484xe92ab0a8().f458493e.f454289d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig outer resp.getBaseResponse().Ret: " + i27 + ", errMsg:" + str2);
            this.f349711e.mo815x76e0bfae(i18, i27, str2, this);
            if (fVar != null) {
                fVar.a(i27, str2, null);
                return;
            }
            return;
        }
        int i28 = leVar.f460878d;
        int i29 = meVar.f461916d;
        java.util.LinkedList linkedList = meVar.f461917e;
        if (i28 == i29) {
            java.util.LinkedList linkedList2 = leVar.f460879e;
            if (linkedList2.size() == linkedList.size() && meVar.f461916d == linkedList.size()) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.wz wzVar = (r45.wz) it.next();
                    int i37 = wzVar.mo11484xe92ab0a8().f458492d;
                    java.lang.String str3 = wzVar.mo11484xe92ab0a8().f458493e.f454289d;
                    if (i37 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig inner resp.getBaseResponse().Ret: " + wzVar + ", errMsg:" + str3);
                        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str3, "e", null);
                        java.lang.String string = d17 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6u) : (java.lang.String) d17.get(".e.Content");
                        this.f349711e.mo815x76e0bfae(i18, i37, string, this);
                        if (fVar != null) {
                            fVar.a(i37, string, null);
                            return;
                        }
                        return;
                    }
                }
                this.f349711e.mo815x76e0bfae(i18, i19, str, this);
                if (fVar != null) {
                    java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
                    for (int i38 = 0; i38 < meVar.f461916d; i38++) {
                        wy.h hVar = new wy.h();
                        java.lang.String str4 = ((r45.vz) linkedList2.get(i38)).f470218h;
                        long j17 = ((r45.vz) linkedList2.get(i38)).f470216f;
                        java.lang.String str5 = ((r45.vz) linkedList2.get(i38)).f470217g;
                        java.lang.String str6 = ((r45.wz) linkedList.get(i38)).f471121d;
                        java.lang.String str7 = ((r45.wz) linkedList.get(i38)).f471123f;
                        java.lang.String str8 = ((r45.wz) linkedList.get(i38)).f471124g;
                        int i39 = ((r45.wz) linkedList.get(i38)).f471122e;
                        synchronizedList.add(hVar);
                    }
                    fVar.a(0, "", synchronizedList);
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneBatchCheckBigFileUpload", "summerbig  req.count: " + leVar.f460878d + " not equals resp.Count:" + meVar.f461916d + ", resp.List.size() = " + linkedList.size());
        this.f349711e.mo815x76e0bfae(i18, -1000, "req-count mismatch resp-count", this);
        if (fVar != null) {
            fVar.a(-1000, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6t), null);
        }
    }
}
