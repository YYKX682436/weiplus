package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* renamed from: com.tencent.mm.plugin.card.ui.CardInvalidCardUI */
/* loaded from: classes15.dex */
public class ActivityC13055xa00cb92b extends com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f176404w = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public xt1.r U6() {
        return xt1.r.INVALID_TYPE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875
    public void V6() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.at_);
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.arp), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.q2(this));
        if (this.f176165e.getCount() > 0) {
            m78501x43e00957(true);
        } else {
            m78501x43e00957(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569862qb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1310x2e06d1.AbstractActivityC13036x7f885875, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (i17 == 0 && i18 == 0 && (m1Var instanceof xt1.z)) {
            if (this.f176170m) {
                db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.arr));
            } else {
                db5.e1.T(this, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.as6));
            }
        }
        this.f176170m = false;
    }
}
