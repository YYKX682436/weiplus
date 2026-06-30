package dk5;

/* loaded from: classes9.dex */
public class v4 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316496e;

    public v4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.util.List list) {
        this.f316496e = activityC22573x19a79d99;
        this.f316495d = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316496e;
        activityC22573x19a79d99.getClass();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        java.util.List list = this.f316495d;
        if (K0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealRecord() called with: msgContent = [" + str + "], userName = [" + list + "]");
        } else {
            for (int i18 = 0; i18 < list.size(); i18++) {
                java.lang.String str2 = (java.lang.String) list.get(i18);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealRecord() called with: msgContent = [" + str + "], userName = [" + str2 + "]");
                } else {
                    ot0.q v17 = ot0.q.v(str);
                    if (v17 != null) {
                        r45.ul5 A = bt3.g2.A(v17.f430196h0);
                        java.lang.String str3 = (A == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(A.f468996d)) ? v17.f430187f : A.f468996d;
                        v17.f430179d = activityC22573x19a79d99.f292552e.f67370x28d45f97;
                        v17.f430187f = activityC22573x19a79d99.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfl, str3);
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044 c5888x4e3b0044 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5888x4e3b0044();
                        am.eq eqVar = c5888x4e3b0044.f136196g;
                        eqVar.f88116a = 4;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.d1(ot0.q.u(v17, null, null));
                        eqVar.f88127l = f9Var;
                        eqVar.f88121f = str2;
                        eqVar.f88134s = true;
                        c5888x4e3b0044.e();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealRecord fail msg content is null");
                    }
                }
            }
        }
        this.f316496e.Z6(2, null, null, "", 0, new java.util.LinkedList(list));
        return null;
    }
}
