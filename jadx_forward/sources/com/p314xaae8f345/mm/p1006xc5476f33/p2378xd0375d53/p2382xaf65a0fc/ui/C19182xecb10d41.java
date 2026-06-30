package com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2382xaf65a0fc.ui;

/* renamed from: com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUOpenIntroView */
/* loaded from: classes15.dex */
public class C19182xecb10d41 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21482x75478f48 f262777d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 f262778e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f262779f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f262780g;

    /* renamed from: h, reason: collision with root package name */
    public tt4.a[] f262781h;

    public C19182xecb10d41(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f262780g = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c98, (android.view.ViewGroup) this, true);
        this.f262777d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21482x75478f48) inflate.findViewById(com.p314xaae8f345.mm.R.id.kod);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3) inflate.findViewById(com.p314xaae8f345.mm.R.id.cii);
        this.f262778e = c21508xc28dbdd3;
        c21508xc28dbdd3.setVisibility(0);
        this.f262777d.m8322x2d3430b4(new ut4.a(this));
    }

    /* renamed from: setPagerData */
    public void m73992x9165ebcb(tt4.a[] aVarArr) {
        this.f262781h = aVarArr;
        this.f262779f = new java.util.ArrayList();
        if (this.f262781h != null) {
            for (int i17 = 0; i17 < this.f262781h.length; i17++) {
                this.f262779f.add(android.view.LayoutInflater.from(this.f262780g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c99, (android.view.ViewGroup) null));
            }
        }
        this.f262777d.m8315x6cab2c8d(new ut4.b(this, null));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = this.f262778e;
        tt4.a[] aVarArr2 = this.f262781h;
        c21508xc28dbdd3.f279047e = aVarArr2 == null ? 0 : aVarArr2.length;
        c21508xc28dbdd3.a(0);
    }

    public C19182xecb10d41(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
