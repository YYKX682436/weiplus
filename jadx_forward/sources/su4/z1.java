package su4;

/* loaded from: classes.dex */
public class z1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494680d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494681e;

    /* renamed from: f, reason: collision with root package name */
    public r45.th4 f494682f;

    /* renamed from: g, reason: collision with root package name */
    public final int f494683g;

    /* renamed from: h, reason: collision with root package name */
    public final int f494684h;

    /* renamed from: i, reason: collision with root package name */
    public final int f494685i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f494686m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f494687n;

    public z1(int i17, int i18, int i19, int i27, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list) {
        this(i17, i18, i19, i27, str, j17, str2, str3, str4, list, 0);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494680d = u0Var;
        return mo9409x10f9447a(sVar, this.f494681e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1048;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetSceneWebSearchGuide", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            su4.k2.h(207, this.f494684h, this.f494687n, "", "", 0, true, this.f494686m, false, "", "", 1048);
            this.f494680d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            r45.th4 th4Var = (r45.th4) this.f494681e.f152244b.f152233a;
            this.f494682f = th4Var;
            su4.k2.h(207, this.f494684h, this.f494687n, "", th4Var.f467973f, 0, true, this.f494686m, true, "", "", 1048);
            this.f494680d.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public z1(int i17, int i18, int i19, int i27, java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i28) {
        this.f494684h = i17;
        this.f494685i = i27;
        this.f494683g = i18;
        this.f494686m = str2;
        this.f494687n = str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.NetSceneWebSearchGuide", "scene %d, h5Version=%d type=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1048;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchguide";
        lVar.f152197a = new r45.sh4();
        lVar.f152198b = new r45.th4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494681e = a17;
        r45.sh4 sh4Var = (r45.sh4) a17.f152243a.f152217a;
        sh4Var.f467257d = i17;
        sh4Var.f467258e = i19;
        sh4Var.f467259f = su4.r2.i();
        sh4Var.f467260g = i18;
        sh4Var.f467261h = str;
        sh4Var.f467262i = j17;
        sh4Var.f467263m = str3;
        sh4Var.f467264n = str4;
        sh4Var.f467267q = str2;
        sh4Var.f467268r = i28;
        sh4Var.f467265o = su4.r2.g();
        if (list != null) {
            sh4Var.f467266p.addAll(list);
        }
        su4.k2.h(204, i17, str3, "", "", 0, true, str2, true, null, "", i18);
    }
}
