package os3;

/* loaded from: classes8.dex */
public class e0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429595d;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86) {
        this.f429595d = activityC16931x24037f86;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429595d;
        if (!activityC16931x24037f86.F || !com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.T6(activityC16931x24037f86, false) || activityC16931x24037f86.M != 20) {
            return true;
        }
        ks3.j jVar = new ks3.j();
        jVar.f393223d = activityC16931x24037f86.B;
        jVar.f393224e = activityC16931x24037f86.C;
        jVar.f393225f = activityC16931x24037f86.f236366e.m67777xeb5f5875();
        jVar.f393226g = activityC16931x24037f86.f236370i.m67777xeb5f5875();
        jVar.f393227h = activityC16931x24037f86.f236374o.m67777xeb5f5875();
        jVar.f393229m = activityC16931x24037f86.f236377q.getText().toString();
        jVar.f393228i = activityC16931x24037f86.f236386y.e();
        int i17 = activityC16931x24037f86.M;
        if (i17 != 21 && i17 == 20) {
            jVar.f393230n = activityC16931x24037f86.X6();
            jVar.f393231o = activityC16931x24037f86.M;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.ComposeUI", "save draft mail as normal mode");
        }
        ks3.i iVar = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().f393240c;
        ks3.s sVar = iVar.f393219a;
        try {
            sVar.a();
            java.lang.String str = sVar.f393279a + iVar.a(jVar.f393224e, jVar.f393223d);
            byte[] mo14344x5f01b1f6 = jVar.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.vfs.w6.S(str, mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DraftBoxMgr", e17, "", new java.lang.Object[0]);
        }
        db5.d5 d5Var = activityC16931x24037f86.E;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        activityC16931x24037f86.E = db5.t7.o(activityC16931x24037f86, activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjy), 2000L);
        return true;
    }
}
