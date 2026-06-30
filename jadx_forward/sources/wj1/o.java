package wj1;

/* loaded from: classes14.dex */
public class o implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f528149a;

    public o(wj1.c0 c0Var) {
        this.f528149a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f528149a.f528109a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.o$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
                wj1.c0 c0Var = wj1.o.this.f528149a;
                int i19 = i17;
                int i27 = i18;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f152244b.f152233a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "sendSms cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f152244b.f152233a);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
                    dp.a.m125854x26a183b(activityC12702xc32382a5, activityC12702xc32382a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571691mj), 0).show();
                    return;
                }
                r45.rz5 rz5Var = (r45.rz5) fVar;
                r45.gc gcVar = rz5Var.f466851d;
                if (gcVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response is null");
                    wj1.c0.a(c0Var, c0Var.f528109a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571697mp));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response.err_code:%d", java.lang.Integer.valueOf(gcVar.f456611d));
                if (rz5Var.f466851d.f456611d != 0) {
                    wj1.c0.a(c0Var, c0Var.f528109a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571697mp));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a52 = c0Var.f528109a;
                java.lang.String str2 = rz5Var.f466852e;
                activityC12702xc32382a52.f171077t = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "send success, verifyToken:%s", str2);
            }
        });
    }
}
