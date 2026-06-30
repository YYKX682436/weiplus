package wj1;

/* loaded from: classes14.dex */
public class p implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f528156a;

    public p(wj1.c0 c0Var) {
        this.f528156a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f528156a.f528109a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.p$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
                wj1.c0 c0Var = wj1.p.this.f528156a;
                int i19 = i17;
                int i27 = i18;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f152244b.f152233a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f152244b.f152233a);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = c0Var.f528109a;
                    dp.a.m125854x26a183b(activityC12702xc32382a5, activityC12702xc32382a5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571691mj), 0).show();
                    return;
                }
                r45.cy6 cy6Var = (r45.cy6) fVar;
                r45.gc gcVar = cy6Var.f453465d;
                if (gcVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response is null");
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(gcVar.f456611d);
                java.lang.String str2 = cy6Var.f453465d.f456612e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                objArr[1] = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response errcode:%s, errMsg:%s", objArr);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.String str3 = c0Var.f528109a.f171065e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a52 = c0Var.f528109a;
                g0Var.d(14943, str3, 8, activityC12702xc32382a52.f171072o.f463494s);
                int i28 = cy6Var.f453465d.f456611d;
                if (i28 != 0) {
                    if (i28 == 40013) {
                        wj1.c0.a(c0Var, activityC12702xc32382a52.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571696mo));
                        return;
                    } else {
                        wj1.c0.a(c0Var, activityC12702xc32382a52.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571695mn));
                        return;
                    }
                }
                g0Var.d(14943, activityC12702xc32382a52.f171065e, 9, activityC12702xc32382a52.f171072o.f463494s);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "verify success");
                int i29 = activityC12702xc32382a52.f171079v;
                if ((i29 == 1 || i29 == 2) && (c12542x3a17e581 = activityC12702xc32382a52.A) != null) {
                    vi1.o0.f518949a.e(c12542x3a17e581);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_err_code", cy6Var.f453465d.f456611d);
                intent.putExtra("intent_auth_token", cy6Var.f453466e);
                activityC12702xc32382a52.setResult(-1, intent);
                activityC12702xc32382a52.finish();
            }
        });
    }
}
