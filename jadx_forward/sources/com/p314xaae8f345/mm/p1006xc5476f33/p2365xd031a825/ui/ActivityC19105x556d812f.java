package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBankCardTypeSelectUI */
/* loaded from: classes8.dex */
public class ActivityC19105x556d812f extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f261386d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f261387e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f261388f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f261389g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f261390h;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576502cy;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f261388f = m79336x8b97809d();
        for (int i17 = 0; i17 < this.f261386d.size(); i17++) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717(mo55332x76847179());
            c21571x8a410717.C((java.lang.String) this.f261386d.get(i17));
            c21571x8a410717.L((java.lang.CharSequence) this.f261386d.get(i17));
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261388f).d(c21571x8a410717, -1);
        }
        if (this.f261386d.get(0) != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261388f).h((java.lang.String) this.f261386d.get(0));
            this.f261390h = c21571x8a4107172;
            c21571x8a4107172.P = true;
            this.f261387e = (java.lang.String) this.f261386d.get(0);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f261388f).notifyDataSetChanged();
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.w0(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.x0(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.kld);
        this.f261386d = getIntent().getStringArrayListExtra("bank_type_show_list");
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        for (int i17 = 0; i17 < this.f261386d.size(); i17++) {
            if (str.equals(this.f261386d.get(i17))) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar;
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) h0Var.h((java.lang.String) this.f261386d.get(i17));
                this.f261389g = c21571x8a410717;
                c21571x8a410717.P = true;
                this.f261387e = (java.lang.String) this.f261386d.get(i17);
                if (!this.f261390h.f279313q.equals(this.f261389g.f279313q)) {
                    this.f261390h.P = false;
                    this.f261390h = this.f261389g;
                }
                h0Var.notifyDataSetChanged();
            }
        }
        return false;
    }
}
