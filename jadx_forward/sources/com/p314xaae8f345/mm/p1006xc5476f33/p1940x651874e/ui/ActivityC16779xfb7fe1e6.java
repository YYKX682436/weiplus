package com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui;

/* renamed from: com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI */
/* loaded from: classes9.dex */
public class ActivityC16779xfb7fe1e6 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f234396g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 f234397h = null;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.w f234398i;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368
    public boolean W6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.a aVar;
        gp3.n nVar;
        java.util.List a17;
        if (i17 != 0 || i18 != 0) {
            return false;
        }
        if (!(m1Var instanceof dp3.n) || (aVar = ((dp3.n) m1Var).f323756d) == null) {
            return true;
        }
        this.f234397h = aVar.f234352a;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234396g).t();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f234396g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.p1941x633fb29.C16774xbacd37e9 c16774xbacd37e9 = this.f234397h;
        java.lang.Object[] objArr = {this.f234398i};
        if (c16774xbacd37e9 == null) {
            a17 = null;
        } else {
            if (c16774xbacd37e9.f234315e != 21) {
                gp3.k kVar = new gp3.k();
                java.lang.Object obj = objArr[0];
                nVar = kVar;
                if (obj instanceof com.p314xaae8f345.mm.p2802xd031a825.ui.w) {
                    kVar.f355913a = (com.p314xaae8f345.mm.p2802xd031a825.ui.w) obj;
                    nVar = kVar;
                }
            } else {
                nVar = new gp3.n();
            }
            a17 = nVar.a(mo55332x76847179, rVar, c16774xbacd37e9);
        }
        if (a17 != null) {
            for (int i19 = 0; i19 < a17.size(); i19++) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234396g).d((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) a17.get(i19), -1);
            }
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f234396g).notifyDataSetChanged();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bwt;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576435b3;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.grg);
        mo54448x9c8c0d33(new fp3.y(this));
        this.f234396g = m79336x8b97809d();
        com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar = new com.p314xaae8f345.mm.p2802xd031a825.ui.w(this, false);
        this.f234398i = wVar;
        wVar.a();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(this);
        if (g17 != null && (g17 instanceof bp3.e)) {
            android.os.Bundle e17 = com.p314xaae8f345.mm.p2802xd031a825.a.e(this);
            if (e17 == null) {
                e17 = new android.os.Bundle();
            }
            stringExtra = e17.getString("key_trans_id");
            android.os.Bundle e18 = com.p314xaae8f345.mm.p2802xd031a825.a.e(this);
            if (e18 == null) {
                e18 = new android.os.Bundle();
            }
            stringExtra2 = e18.getString("bill_id");
        } else if (getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) == 1 || getIntent().getIntExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) == 2) {
            stringExtra = getIntent().getStringExtra("trans_id");
            stringExtra2 = getIntent().getStringExtra("bill_id");
        } else {
            stringExtra = null;
            stringExtra2 = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "mOrders info is Illegal!");
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.ks_, 0, new fp3.x(this));
        }
        android.os.Bundle e19 = com.p314xaae8f345.mm.p2802xd031a825.a.e(this);
        if (e19 == null) {
            e19 = new android.os.Bundle();
        }
        e19.getInt("key_pay_type");
        mo43517x10010bd5();
        V6().d(new dp3.n(stringExtra, stringExtra2, -1), true);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22903x6773368, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p2802xd031a825.ui.w wVar = this.f234398i;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }
}
