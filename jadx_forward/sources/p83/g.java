package p83;

/* loaded from: classes8.dex */
public class g extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f434280d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zr3 f434281e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f434282f;

    public g(int i17) {
        this.f434280d = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yr3();
        lVar.f152198b = new r45.zr3();
        lVar.f152200d = 257;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f434280d = a17;
        r45.yr3 yr3Var = (r45.yr3) a17.f152243a.f152217a;
        yr3Var.f472854d = i17;
        yr3Var.f472855e = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_REDDOT_RECHARGE_VERSION_INT, 0)).intValue();
        yr3Var.f472856f = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ADDRESS_ACCOUNT_ACTIVITY_TYPE_VERSION_INT, 0)).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", java.lang.Integer.valueOf(yr3Var.f472854d), java.lang.Integer.valueOf(yr3Var.f472855e), java.lang.Integer.valueOf(yr3Var.f472856f));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f434282f = u0Var;
        return mo9409x10f9447a(sVar, this.f434280d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 257;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.zr3 zr3Var = (r45.zr3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f434281e = zr3Var;
        if ((i18 == 0 || i19 == 0) && i18 == 0 && i19 == 0 && zr3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", zr3Var.f473856m, zr3Var.f473857n, zr3Var.f473850d, zr3Var.f473851e, zr3Var.f473852f, zr3Var.f473853g, zr3Var.f473854h, zr3Var.f473855i, zr3Var.f473858o, zr3Var.f473864u);
            try {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_ACCOUNT_CACHE_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(zr3Var.mo14344x5f01b1f6()));
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f434282f;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
