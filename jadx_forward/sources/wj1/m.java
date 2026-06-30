package wj1;

/* loaded from: classes14.dex */
public class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f528139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj1.n f528140b;

    public m(wj1.n nVar, java.lang.String str) {
        this.f528140b = nVar;
        this.f528139a = str;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a5 = this.f528140b.f528147a.f528109a;
        final java.lang.String str2 = this.f528139a;
        activityC12702xc32382a5.runOnUiThread(new java.lang.Runnable() { // from class: wj1.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581;
                wj1.m mVar = wj1.m.this;
                int i19 = i17;
                int i27 = i18;
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = oVar;
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = mVar.f528140b.f528147a.f528109a.f171083z;
                if (u3Var != null && u3Var.isShowing()) {
                    mVar.f528140b.f528147a.f528109a.f171083z.dismiss();
                }
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f152244b.f152233a) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, oVar2.f152244b.f152233a);
                    return;
                }
                r45.kh6 kh6Var = (r45.kh6) fVar;
                if (kh6Var.f460234d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a52 = mVar.f528140b.f528147a.f528109a;
                    dp.a.m125854x26a183b(activityC12702xc32382a52, activityC12702xc32382a52.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571691mj), 0).show();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "resp.auth_status:%d", java.lang.Integer.valueOf(kh6Var.f460235e));
                int i28 = kh6Var.f460235e;
                if (i28 != 0) {
                    if (i28 != 1) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14943, mVar.f528140b.f528147a.f528109a.f171065e, 5, mVar.f528140b.f528147a.f528109a.f171072o.f463494s);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a53 = mVar.f528140b.f528147a.f528109a;
                    activityC12702xc32382a53.f171076s = str4;
                    activityC12702xc32382a53.f171073p = kh6Var.f460236f;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardUI", "switchToVerifyFragment");
                    ((ku5.t0) ku5.t0.f394148d).B(new wj1.h0(activityC12702xc32382a53));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14943, mVar.f528140b.f528147a.f528109a.f171065e, 9, mVar.f528140b.f528147a.f528109a.f171072o.f463494s);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.ActivityC12702xc32382a5 activityC12702xc32382a54 = mVar.f528140b.f528147a.f528109a;
                int i29 = activityC12702xc32382a54.f171079v;
                if ((i29 == 1 || i29 == 2) && (c12542x3a17e581 = activityC12702xc32382a54.A) != null) {
                    vi1.o0.f518949a.e(c12542x3a17e581);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_err_code", kh6Var.f460234d.f456611d);
                intent.putExtra("intent_auth_token", kh6Var.f460237g);
                mVar.f528140b.f528147a.f528109a.setResult(-1, intent);
                mVar.f528140b.f528147a.f528109a.finish();
            }
        });
    }
}
