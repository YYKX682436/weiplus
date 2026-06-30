package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardDetailBaseUI */
/* loaded from: classes3.dex */
public abstract class AbstractActivityC13045xe08b6026 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f176285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f176286e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f176287f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f176288g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f176289h;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: noActionBar */
    public boolean mo44293x69604d3c() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569824p9, (android.view.ViewGroup) null);
        this.f176285d = inflate;
        inflate.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560119bk));
        this.f176287f = (android.widget.TextView) this.f176285d.findViewById(com.p314xaae8f345.mm.R.id.obn);
        this.f176288g = (android.widget.TextView) this.f176285d.findViewById(com.p314xaae8f345.mm.R.id.nqs);
        this.f176286e = (android.widget.ImageView) this.f176285d.findViewById(com.p314xaae8f345.mm.R.id.a4p);
        this.f176289h = this.f176285d.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        if (m78513xc2a54588() == null || ((android.view.ViewGroup) m78513xc2a54588()).getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = ((android.view.ViewGroup) m78513xc2a54588()).getChildAt(0);
        ((android.view.ViewGroup) m78513xc2a54588()).removeView(childAt);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
        linearLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        linearLayout.addView(this.f176285d, new android.widget.LinearLayout.LayoutParams(-1, displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay)));
        linearLayout.addView(childAt);
        ((android.view.ViewGroup) m78513xc2a54588()).addView(linearLayout);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(10);
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setBackBtn */
    public void mo54448x9c8c0d33(android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f176286e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.m(this, onMenuItemClickListener));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMSubTitle */
    public void mo54449x3f86539a(java.lang.String str) {
        this.f176288g.setText(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMTitle */
    public void mo54450xbf7c1df6(java.lang.String str) {
        this.f176287f.setText(str);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMTitleColor */
    public void mo54451xb23a6b0d(int i17) {
        this.f176287f.setTextColor(i17);
    }
}
