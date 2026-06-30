package er3;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final er3.b f337555f = new er3.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f337556d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f337557e;

    public c() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 12764;
        lVar.f152199c = "/cgi-bin/micromsg-bin/getqqassistantinfo";
        lVar.f152197a = new r45.yl3();
        lVar.f152198b = new r45.zl3();
        this.f337556d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f337557e = u0Var;
        return mo9409x10f9447a(sVar, this.f337556d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 12764;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        byte[] m75962x8b6d8abc;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        r45.zl3 zl3Var = (r45.zl3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGYNetEnd totallen: ");
        sb6.append((zl3Var == null || (m75962x8b6d8abc = zl3Var.m75962x8b6d8abc()) == null) ? null : java.lang.Integer.valueOf(m75962x8b6d8abc.length));
        sb6.append(" appID: ");
        sb6.append(zl3Var != null ? zl3Var.f473726d : null);
        sb6.append(" weapp_param: ");
        sb6.append(zl3Var != null ? zl3Var.f473727e : null);
        sb6.append(" menu_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f473728f : null);
        sb6.append(" bind_qq_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f473729g : null);
        sb6.append(" menu_setting_weapp_path: ");
        sb6.append(zl3Var != null ? zl3Var.f473730h : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", sb6.toString());
        if (!(zl3Var == null)) {
            if (!(zl3Var.f473727e == null)) {
                if (!(zl3Var.f473726d == null)) {
                    if (!(zl3Var.f473728f == null)) {
                        if (!(zl3Var.f473729g == null)) {
                            long c17 = c01.id.c();
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("com.tencent.mm.qqassistant", gm0.j1.b().h(), 2);
                            J2.H("info", zl3Var.mo14344x5f01b1f6());
                            J2.B("time", c17);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", "save info to mmkv");
                            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f337557e;
                            if (u0Var != null) {
                                u0Var.mo815x76e0bfae(i18, i19, str, this);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneGetQQAssistantInfo", "can't get toeken");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f337557e;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
