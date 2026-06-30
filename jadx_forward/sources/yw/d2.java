package yw;

/* loaded from: classes9.dex */
public final class d2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a f547836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547837e;

    public d2(com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f547836d = c23232x91bb1d7a;
        this.f547837e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        yw.q2 q2Var;
        com.p314xaae8f345.p2845xc516c4b6.biz.C23232x91bb1d7a c23232x91bb1d7a;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 a17;
        if (yw.q2.f547968b == i17 && i18 == -1 && (a17 = yw.q2.a((q2Var = yw.q2.f547967a), (c23232x91bb1d7a = this.f547836d))) != null && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            yw.q2.b(q2Var, a17, stringExtra, c23232x91bb1d7a, intent.getStringExtra("custom_send_text"));
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f547837e;
            db5.e1.T(abstractActivityC21394xb3d2c0cf, j65.q.a(abstractActivityC21394xb3d2c0cf).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
    }
}
