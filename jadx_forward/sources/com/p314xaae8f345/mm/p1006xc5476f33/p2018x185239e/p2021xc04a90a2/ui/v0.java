package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes9.dex */
public class v0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17120xa7199913 f238264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17120xa7199913 activityC17120xa7199913) {
        super(false);
        this.f238264d = activityC17120xa7199913;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "goto MobileRemitNumberInputUI");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17120xa7199913.f238144d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17120xa7199913 activityC17120xa7199913 = this.f238264d;
        byte[] byteArrayExtra = activityC17120xa7199913.getIntent().getByteArrayExtra("key_compliance_item ");
        r45.d70 d70Var = new r45.d70();
        try {
            d70Var.mo11468x92b714fd(byteArrayExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24835, 1, 1);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.z0(activityC17120xa7199913.mo55332x76847179(), d70Var.f453725e, d70Var.f453724d, d70Var.f453726f, new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.w0(activityC17120xa7199913));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemitWelcomeUI", "pars error :%s", e17.toString());
            db5.e1.y(activityC17120xa7199913.mo55332x76847179(), activityC17120xa7199913.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g), "", activityC17120xa7199913.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ke6), new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.x0(activityC17120xa7199913));
        }
    }
}
