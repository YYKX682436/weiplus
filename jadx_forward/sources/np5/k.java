package np5;

/* loaded from: classes9.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f420372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f420373e;

    public k(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f420372d = m1Var;
        this.f420373e = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f420372d;
        java.lang.String str = m1Var instanceof com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p ? ((com.p314xaae8f345.mm.p2802xd031a825.p2805xcbb51f6b.p2806x633fb29.p) m1Var).f295597v : "";
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f420373e;
        if (!K0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7052xe1d3f727 c7052xe1d3f727 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7052xe1d3f727();
            c7052xe1d3f727.f143647d = 1L;
            c7052xe1d3f727.f143648e = 2L;
            c7052xe1d3f727.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletErrMgr", "jump to forget_url %s", str);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(abstractActivityC22902xe37969e, str, false);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7052xe1d3f727 c7052xe1d3f7272 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7052xe1d3f727();
        c7052xe1d3f7272.f143647d = 1L;
        c7052xe1d3f7272.f143648e = 1L;
        c7052xe1d3f7272.k();
        if (c01.z1.I()) {
            com.p314xaae8f345.mm.p2802xd031a825.a.k(abstractActivityC22902xe37969e, "wallet_payu", "PayUForgotPwdProcess", null, null);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
            ((h45.q) i95.n0.c(h45.q.class)).mo24828x975e1547(abstractActivityC22902xe37969e, null);
        }
        if (abstractActivityC22902xe37969e.mo63463x4510f9c8()) {
            abstractActivityC22902xe37969e.finish();
        }
    }
}
