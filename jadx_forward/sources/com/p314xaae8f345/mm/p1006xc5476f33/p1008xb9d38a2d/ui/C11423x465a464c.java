package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$d */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11423x465a464c implements js.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 f154910a;

    public final void a(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.t tVar) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = this.f154910a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
        activityC11419x78fe9e98.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$j
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                android.app.ProgressDialog progressDialog = activityC11419x78fe9e982.f154871s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    activityC11419x78fe9e982.f154871s.dismiss();
                    activityC11419x78fe9e982.f154871s = null;
                }
                activityC11419x78fe9e982.g7(false);
            }
        });
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "gateway login param is null");
            activityC11419x78fe9e98.n7();
            return;
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6 v6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v6(activityC11419x78fe9e98);
        is.f fVar = (is.f) r0Var;
        fVar.getClass();
        java.lang.String str = tVar.f290764a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.Integer num = tVar.f290765b;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new is.e(activityC11419x78fe9e98, tVar, str2, num != null ? num.intValue() : 0, fVar, v6Var));
    }
}
