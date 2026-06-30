package g35;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f349716d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f349717e;

    /* renamed from: f, reason: collision with root package name */
    public final g35.d f349718f;

    public e(ot0.q qVar, java.lang.String str, java.lang.String str2, g35.d dVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vz();
        lVar.f152198b = new r45.wz();
        lVar.f152199c = "/cgi-bin/micromsg-bin/checkbigfileupload";
        lVar.f152200d = 727;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f349717e = a17;
        r45.vz vzVar = (r45.vz) a17.f152243a.f152217a;
        if (qVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.T) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430243t)) {
            vzVar.f470217g = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().d();
            vzVar.f470218h = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().e(str);
            vzVar.f470221n = com.p314xaae8f345.mm.vfs.w6.q(str);
            vzVar.f470220m = com.p314xaae8f345.mm.vfs.w6.n(str);
            vzVar.f470216f = com.p314xaae8f345.mm.vfs.w6.k(str);
        } else {
            vzVar.f470217g = qVar.T;
            vzVar.f470218h = qVar.f430243t;
            vzVar.f470221n = qVar.n();
            vzVar.f470220m = qVar.f430223o;
            vzVar.f470216f = qVar.f430215m;
        }
        vzVar.f470219i = 7;
        vzVar.f470215e = str2;
        vzVar.f470214d = c01.z1.r();
        this.f349718f = dVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckBigFileUpload", "summerbig NetSceneCheckBigFileUpload content[%s], aesKey[%s] md5[%s] FileName[%s] FileSize[%d] FileExt[%s] talker[%s], fromUserName[%s], stack[%s]", qVar, vzVar.f470217g, vzVar.f470218h, vzVar.f470221n, java.lang.Long.valueOf(vzVar.f470216f), vzVar.f470220m, vzVar.f470215e, vzVar.f470214d, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f349716d = u0Var;
        return mo9409x10f9447a(sVar, this.f349717e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 727;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2;
        g35.d dVar = this.f349718f;
        if (i18 == 0 && i19 == 0) {
            this.f349716d.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
            r45.vz vzVar = (r45.vz) oVar.f152243a.f152217a;
            r45.wz wzVar = (r45.wz) oVar.f152244b.f152233a;
            java.lang.String str3 = wzVar.f471121d;
            if (dVar != null) {
                if (wzVar.mo11484xe92ab0a8().f458492d != 0) {
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(wzVar.mo11484xe92ab0a8().f458493e.f454289d, "e", null);
                    str2 = d17 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6u) : (java.lang.String) d17.get(".e.Content");
                } else {
                    str2 = "";
                }
                this.f349718f.a(str2, vzVar.f470218h, vzVar.f470217g, wzVar.f471121d, wzVar.f471123f, wzVar.f471124g, vzVar.f470216f);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCheckBigFileUpload", "summerbig onGYNetEnd errType = " + i18 + ", errCode = " + i19);
        this.f349716d.mo815x76e0bfae(i18, i19, str, this);
        if (dVar != null) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6v);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                java.util.Map d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
                string = d18 == null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b6u) : (java.lang.String) d18.get(".e.Content");
            }
            this.f349718f.a(string, "", "", "", "", "", 0L);
        }
    }
}
