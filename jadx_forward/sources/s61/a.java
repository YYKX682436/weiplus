package s61;

/* loaded from: classes15.dex */
public class a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 f484849d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669) {
        this.f484849d = activityC11375x7be2c669;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11375x7be2c669 activityC11375x7be2c669 = this.f484849d;
        android.app.ProgressDialog progressDialog = activityC11375x7be2c669.f154651g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC11375x7be2c669.f154651g = null;
        }
        if (activityC11375x7be2c669.f154659r != null) {
            gm0.j1.d().q(30, activityC11375x7be2c669.f154659r);
            activityC11375x7be2c669.f154659r = null;
        }
        if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            return;
        }
        java.lang.String str2 = activityC11375x7be2c669.f154660s;
        if (str2 == null || !str2.contains("2")) {
            activityC11375x7be2c669.a7();
            return;
        }
        android.content.Intent intent = new android.content.Intent(activityC11375x7be2c669, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69.class);
        intent.putExtra("regsetinfo_ticket", activityC11375x7be2c669.f154658q);
        intent.putExtra("login_type", activityC11375x7be2c669.f154662u);
        intent.putExtra("regsetinfo_NextStyle", activityC11375x7be2c669.f154661t);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11375x7be2c669, intent);
    }
}
