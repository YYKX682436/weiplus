package f21;

/* loaded from: classes8.dex */
public class f0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0, rz.o, com.p314xaae8f345.mm.p944x882e457a.q1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f340426d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f340427e;

    /* renamed from: f, reason: collision with root package name */
    public final int f340428f;

    /* renamed from: g, reason: collision with root package name */
    public final int f340429g;

    /* renamed from: h, reason: collision with root package name */
    public int f340430h = 0;

    public f0(int i17, int i18) {
        this.f340428f = i17;
        this.f340429g = i18;
        f21.i0 z07 = f21.r0.Bi().z0(i17, i18);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get info null, id:" + i17);
            return;
        }
        z07.f340451f = 3;
        z07.f340457l = 64;
        f21.r0.Bi().P0(z07);
        if (i18 == 5) {
            com.p314xaae8f345.mm.vfs.w6.h(gm0.j1.u().h() + "brand_i18n.apk");
            return;
        }
        f21.j0 Bi = f21.r0.Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Bi.getClass();
        sb6.append(zz1.a.a());
        sb6.append(Bi.u0(i17, i18));
        com.p314xaae8f345.mm.vfs.w6.h(sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f340426d = u0Var;
        f21.j0 Bi = f21.r0.Bi();
        int i17 = this.f340428f;
        int i18 = this.f340429g;
        f21.i0 z07 = Bi.z0(i17, i18);
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme failed id:" + i17 + " type:" + i18);
            return -1;
        }
        if (z07.f340451f != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene get Theme stat failed id:" + i17 + " stat:" + z07.f340451f);
            return -1;
        }
        if (z07.f340449d <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "doScene Theme size err id:" + i17 + " size:" + z07.f340449d);
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.lf0();
        lVar.f152198b = new r45.mf0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/downloadpackage";
        lVar.f152200d = 160;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f340427e = a17;
        r45.lf0 lf0Var = (r45.lf0) a17.f152243a.f152217a;
        r45.n35 n35Var = new r45.n35();
        n35Var.f462587d = z07.f340446a;
        n35Var.f462588e = z07.f340447b;
        lf0Var.f460936d = n35Var;
        lf0Var.f460937e = this.f340430h;
        lf0Var.f460938f = 65536;
        lf0Var.f460939g = i18;
        return mo9409x10f9447a(sVar, this.f340427e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 160;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0325  */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo804x5f9cdc6f(int r29, int r30, int r31, java.lang.String r32, com.p314xaae8f345.mm.p971x6de15a2e.v0 r33, byte[] r34) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f21.f0.mo804x5f9cdc6f(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 50;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        int i17;
        int i18;
        r45.lf0 lf0Var = (r45.lf0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152243a.f152217a;
        f21.j0 Bi = f21.r0.Bi();
        int i19 = this.f340429g;
        int i27 = this.f340428f;
        f21.i0 z07 = Bi.z0(i27, i19);
        com.p314xaae8f345.mm.p944x882e457a.o1 o1Var = com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
        if (z07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked get Theme failed id:" + i27);
            return o1Var;
        }
        if (lf0Var.f460936d.f462587d == i27 && (i17 = lf0Var.f460937e) == this.f340430h && i17 < (i18 = z07.f340449d) && lf0Var.f460938f == 65536 && i18 > 0 && z07.f340451f == 3) {
            return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadPackage", "securityVerificationChecked Theme failed id:" + i27);
        return o1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        f21.r0.Bi().L0(this.f340428f, this.f340429g);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.q1
    public int u() {
        return this.f340429g;
    }
}
