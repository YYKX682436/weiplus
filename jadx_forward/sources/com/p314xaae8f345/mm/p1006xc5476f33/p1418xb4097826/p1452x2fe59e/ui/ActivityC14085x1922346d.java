package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderSelectActivityUI2;", "Lcom/tencent/mm/plugin/finder/search/ui/FinderSearchBaseUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 */
/* loaded from: classes8.dex */
public final class ActivityC14085x1922346d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 E;
    public r45.ip2 G;
    public final java.lang.String C = "Finder.FinderActivitySearchUI";
    public final ot2.f D = new ot2.f();
    public java.lang.String F = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453
    public pt2.o c7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.E;
        if (c14957x1a4885f0 != null) {
            return c14957x1a4885f0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedloader");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453
    public pt2.p g7() {
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.adv;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(-1, intent);
        if (i18 != -1 || isFinishing()) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ui.AbstractActivityC14960x21b59453, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("vst_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.F = stringExtra;
        int intExtra = getIntent().getIntExtra("KEY_FINDER_AD_POST_ENTER_SOURCE", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_FINDER_AD_POST_BY_PASS");
        if (intExtra != 0) {
            r45.ip2 ip2Var = new r45.ip2();
            ip2Var.set(0, java.lang.Integer.valueOf(intExtra));
            ip2Var.set(1, stringExtra2);
            this.G = ip2Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0();
        c14957x1a4885f0.f207212g = this.G;
        c14957x1a4885f0.f207211f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.bk(this, c14957x1a4885f0);
        this.E = c14957x1a4885f0;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f207446w;
        if (c22848x6ddd90cf != null) {
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ck(this);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }
}
