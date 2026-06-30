package ps3;

/* loaded from: classes11.dex */
public final class g implements c01.zc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f439616d;

    public g(ps3.m mVar) {
        this.f439616d = mVar;
    }

    @Override // c01.zc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        java.lang.String g17 = x51.j1.g(addMsgInfo.f152259a.f459094h);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(g17, "sysmsg", null);
        if (d17 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17.get(".sysmsg.addcontact.type"), "1")) {
            java.lang.String str = (java.lang.String) d17.get(".sysmsg.addcontact.username");
            java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.addcontact.encryptusername");
            if (!(str == null || r26.n0.N(str))) {
                if (!(str2 == null || r26.n0.N(str2))) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                    z3Var.X1(str);
                    z3Var.K1(str2);
                    this.f439616d.e(z3Var);
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RadarAddContact", "error! server return incorrect content! : %s", g17);
        }
    }

    @Override // c01.zc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        throw new jz5.k("An operation is not implemented: not implemented");
    }
}
