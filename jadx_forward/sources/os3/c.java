package os3;

/* loaded from: classes9.dex */
public class c implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ os3.d f429577a;

    public c(os3.d dVar) {
        this.f429577a = dVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.vfs.x1 m17;
        if (i17 != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = this.f429577a.f429589d;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.F;
        java.lang.String Z6 = activityC16930x4222da3c.Z6(false);
        activityC16930x4222da3c.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(Z6);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z6);
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Qqmail.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Qqmail.GetFavDataSource", "do fill event info(fav simple file), title %s, desc %s, path %s, sourceType %d", q17, "", Z6, 9);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(Z6);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            long j17 = (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294766c : 0L;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).getClass();
            if (j17 > ip.c.g()) {
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.hko;
            } else {
                r45.bq0 bq0Var = new r45.bq0();
                r45.jq0 jq0Var = new r45.jq0();
                r45.gp0 gp0Var = new r45.gp0();
                gp0Var.A0(Z6);
                gp0Var.h0(8);
                gp0Var.i0(com.p314xaae8f345.mm.vfs.w6.n(Z6));
                gp0Var.z0(true);
                gp0Var.O0(q17);
                gp0Var.m0("");
                jq0Var.e(c01.z1.r());
                jq0Var.j(c01.z1.r());
                jq0Var.g(9);
                jq0Var.c(java.lang.System.currentTimeMillis());
                bq0Var.o(jq0Var);
                bq0Var.f452497f.add(gp0Var);
                java.lang.String str2 = gp0Var.f456937d;
                c4Var.f87851d = str2;
                c4Var.f87852e = str2;
                c4Var.f87848a = bq0Var;
                c4Var.f87850c = 8;
            }
        }
        c4Var.f87856i = activityC16930x4222da3c;
        c4Var.f87860m = 6;
        c5303xc75d2f73.e();
    }
}
