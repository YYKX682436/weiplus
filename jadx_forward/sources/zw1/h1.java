package zw1;

/* loaded from: classes8.dex */
public class h1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uk4 f558182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7, r45.uk4 uk4Var) {
        super(false);
        this.f558183e = activityC13144xce1cfbb7;
        this.f558182d = uk4Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb72;
        r45.uk4 uk4Var = this.f558182d;
        int i17 = uk4Var.f468964d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb73 = this.f558183e;
        if (i17 == 1) {
            if (uk4Var.f468966f.equals("wxpay://f2f/f2fdetail")) {
                android.content.Intent intent = new android.content.Intent(activityC13144xce1cfbb73.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85.class);
                intent.putExtra("key_from_scene", 0);
                activityC13144xce1cfbb73.startActivityForResult(intent, 4097);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(13944, 1);
                g0Var.d(14526, 1, 1, uk4Var.f468965e, "", "", "", 2);
                if (uk4Var.f468970m == 1) {
                    activityC13144xce1cfbb72 = activityC13144xce1cfbb73;
                    g0Var.d(14526, 3, 1, uk4Var.f468965e, "", "", "", 2);
                } else {
                    activityC13144xce1cfbb72 = activityC13144xce1cfbb73;
                }
                activityC13144xce1cfbb7 = activityC13144xce1cfbb72;
            }
            activityC13144xce1cfbb7 = activityC13144xce1cfbb73;
        } else if (i17 == 2) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(uk4Var.f468966f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CollectMainUI", "empty bottom h5 url");
                return;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC13144xce1cfbb73.mo55332x76847179(), uk4Var.f468966f, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var2.d(14526, 1, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 2);
            if (uk4Var.f468970m == 1) {
                activityC13144xce1cfbb72 = activityC13144xce1cfbb73;
                g0Var2.d(14526, 3, 2, uk4Var.f468965e, "", "", uk4Var.f468966f, 2);
                activityC13144xce1cfbb7 = activityC13144xce1cfbb72;
            }
            activityC13144xce1cfbb7 = activityC13144xce1cfbb73;
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            java.lang.String str = uk4Var.f468967g;
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f88999a = str;
            java.lang.String str2 = uk4Var.f468968h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f89000b = str2;
            nxVar.f89002d = 1072;
            nxVar.f89001c = 0;
            c6113xa3727625.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            activityC13144xce1cfbb7 = activityC13144xce1cfbb73;
            g0Var3.d(14526, 1, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 2);
            if (uk4Var.f468970m == 1) {
                g0Var3.d(14526, 3, 3, uk4Var.f468965e, uk4Var.f468967g, uk4Var.f468968h, "", 2);
            }
        } else {
            activityC13144xce1cfbb7 = activityC13144xce1cfbb73;
            android.content.Intent intent2 = new android.content.Intent(activityC13144xce1cfbb7.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13141xbbc9be85.class);
            intent2.putExtra("key_from_scene", 0);
            activityC13144xce1cfbb7.startActivityForResult(intent2, 4097);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 1);
        }
        activityC13144xce1cfbb7.C1.setVisibility(4);
        activityC13144xce1cfbb7.D1.setVisibility(8);
    }
}
