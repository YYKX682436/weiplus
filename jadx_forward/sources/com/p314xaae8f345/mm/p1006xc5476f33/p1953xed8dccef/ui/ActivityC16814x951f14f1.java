package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductReceiptUI */
/* loaded from: classes8.dex */
public class ActivityC16814x951f14f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079 {

    /* renamed from: f, reason: collision with root package name */
    public wq3.j f234737f;

    /* renamed from: e, reason: collision with root package name */
    public wq3.k f234736e = null;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f234738g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0 f234739h = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.caf;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.grt);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.f0(this));
        this.f234738g = (android.widget.AutoCompleteTextView) findViewById(com.p314xaae8f345.mm.R.id.j_t);
        r45.ek5 h17 = this.f234737f.h();
        if (h17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f455116e)) {
            this.f234738g.setText(h17.f455116e);
        }
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f234738g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.e0(this);
        this.f234739h = e0Var;
        this.f234738g.setAdapter(e0Var);
        this.f234738g.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.g0(this));
        android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cac, null).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.h0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.AbstractActivityC16810x42519079, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f234736e = vq3.e.wi().Bi();
        this.f234737f = vq3.e.wi().Ai();
        mo43517x10010bd5();
    }
}
