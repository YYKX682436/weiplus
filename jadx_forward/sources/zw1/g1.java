package zw1;

/* loaded from: classes15.dex */
public class g1 implements ww1.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558167a;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558167a = activityC13144xce1cfbb7;
    }

    public void a(boolean z17, r45.hw hwVar) {
        int i17 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = hwVar == null ? "null" : java.lang.Integer.valueOf(hwVar.f458008d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectMainUI", "get from cgi: %s resp.retcode: %s", objArr);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558167a;
            if (hwVar != null && hwVar.f458008d == 416) {
                activityC13144xce1cfbb7.f177940u.setVisibility(4);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.CollectMainUI");
                bundle.putString("realname_verify_process_jump_plugin", "collect");
                zs4.q.d(this.f558167a, hwVar.f458008d, hwVar.f458009e, bundle, true, new zw1.f1(this), null, 1010, 2);
                return;
            }
            activityC13144xce1cfbb7.t7();
            activityC13144xce1cfbb7.f177940u.setVisibility(0);
            activityC13144xce1cfbb7.L = hwVar.f458010f;
            int i18 = hwVar.f458011g;
            if (i18 == 0) {
                i17 = 0;
            } else if (i18 == 1) {
                i17 = 1;
            } else if (i18 != 2) {
                i17 = 3;
            }
            activityC13144xce1cfbb7.Q = i17;
            activityC13144xce1cfbb7.M = hwVar.f458012h;
            activityC13144xce1cfbb7.f177948y1 = hwVar.f458017p;
            activityC13144xce1cfbb7.f177950z1 = hwVar.f458018q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.a7(activityC13144xce1cfbb7, hwVar.f458014m);
            activityC13144xce1cfbb7.m7(hwVar.f458013i);
            activityC13144xce1cfbb7.G1 = hwVar.f458019r;
            activityC13144xce1cfbb7.H1 = hwVar.f458020s;
            activityC13144xce1cfbb7.M1 = hwVar.f458022u;
            activityC13144xce1cfbb7.T1 = hwVar.f458021t == 0;
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_BUSITYPE_INT_SYNC, java.lang.Integer.valueOf(activityC13144xce1cfbb7.f177935p1));
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_COLLECT_BUSIURL_STRING_SYNC, activityC13144xce1cfbb7.f177945x1);
            activityC13144xce1cfbb7.p7();
        }
    }
}
