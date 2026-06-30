package ls1;

/* loaded from: classes8.dex */
public final class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f402506c;

    public d0(ls1.e0 e0Var, java.lang.String str, nw4.y2 y2Var) {
        this.f402504a = e0Var;
        this.f402505b = str;
        this.f402506c = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        ls1.e0 e0Var = this.f402504a;
        java.util.HashSet hashSet = e0Var.f402512e2;
        java.lang.String str2 = this.f402505b;
        hashSet.remove(str2);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        if (fVar instanceof r45.s83) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetA8KeyResp");
            r45.s83 s83Var = (r45.s83) fVar;
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s83Var.f467078d);
            nw4.y2 y2Var = this.f402506c;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e0Var.B1(), "updatePageAuth fail fullurl is null");
                ax4.a.a(82);
                nw4.n g07 = e0Var.g0();
                if (g07 != null) {
                    g07.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                ax4.a.a(82);
                nw4.n g08 = e0Var.g0();
                if (g08 != null) {
                    g08.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                    return;
                }
                return;
            }
            try {
                e0Var.R.g(s83Var.f467078d, new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(x51.j1.d(s83Var.f467093v)), new com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e(s83Var.f467084m));
                java.lang.String FullURL = s83Var.f467078d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FullURL, "FullURL");
                e0Var.K1(str2, FullURL, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d.g(s83Var.f467095x));
                ax4.a.c(109);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String FullURL2 = s83Var.f467078d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FullURL2, "FullURL");
                hashMap.put("fullUrl", FullURL2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e0Var.B1(), "updatePageAuth values:%s", hashMap);
                ax4.a.a(81);
                nw4.n g09 = e0Var.g0();
                if (g09 != null) {
                    g09.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
                }
            } catch (java.lang.Exception unused) {
                ax4.a.a(82);
                nw4.n g010 = e0Var.g0();
                if (g010 != null) {
                    g010.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
                }
            }
        }
    }
}
