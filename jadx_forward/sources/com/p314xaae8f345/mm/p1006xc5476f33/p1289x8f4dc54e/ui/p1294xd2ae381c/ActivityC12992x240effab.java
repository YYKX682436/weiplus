package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1294xd2ae381c;

@db5.a(m123858x6ac9171 = 3)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/flutter/BizTextCoverUI;", "Lcom/tencent/mm/ui/gallery/BaseMediaTabActivity;", "Lpi0/o0;", "Lrr1/a;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.flutter.BizTextCoverUI */
/* loaded from: classes11.dex */
public final class ActivityC12992x240effab extends com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051 implements pi0.o0, rr1.a {

    /* renamed from: i, reason: collision with root package name */
    public static rr1.a f175591i;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f175592f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f175593g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 f175594h;

    @Override // pi0.o0
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 F5() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = this.f175594h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10715x7014d3f9);
        return c10715x7014d3f9;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        na5.a m81182xbabac7d4 = m81182xbabac7d4();
        w03.h hVar = m81182xbabac7d4 instanceof w03.h ? (w03.h) m81182xbabac7d4 : null;
        if (hVar != null) {
            return (w03.f) ((jz5.n) hVar.f523416f).mo141623x754a37bb();
        }
        return null;
    }

    @Override // pi0.o0
    public android.view.ViewGroup S2() {
        android.view.ViewGroup viewGroup = this.f175592f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        return viewGroup;
    }

    @Override // pi0.o0
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 S3() {
        return new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(1, 1, null, false, false, false, null, 0, false, false, false, null, 4092, null);
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public void V6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        xg5.b bVar = this.f290217d;
        if (bVar != null) {
            ((b33.o) bVar).U6().m78873x6e5cce43(false);
        }
        f175591i = this;
        int intExtra = getIntent().getIntExtra("BizTextCoverEditorUI_kEditorScene", 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6348x25fa736d c6348x25fa736d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6348x25fa736d();
        c6348x25fa736d.f136965d = 101L;
        c6348x25fa736d.f136966e = intExtra;
        c6348x25fa736d.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051
    public void W6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        xg5.b bVar = this.f290217d;
        if (bVar != null) {
            ((b33.o) bVar).U6().m78873x6e5cce43(true);
        }
        f175591i = null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f175593g;
        if (c10717xfba6b263 != null) {
            c10717xfba6b263.b();
        }
    }

    @Override // pi0.o0
    /* renamed from: getActivity */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo8719x19263085() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzz;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onBackPressed " + hashCode());
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f175593g;
        if (c10717xfba6b263 != null) {
            c10717xfba6b263.f149666h.m137435x8a0ad399().m138190x262dda78();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onCreate " + hashCode());
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        this.f175592f = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f568814ve3);
        this.f175594h = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9) getIntent().getParcelableExtra("page_info");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4 m137465x9cf0d20b = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b();
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = this.f175594h;
        if (c10715x7014d3f9 == null || (str = c10715x7014d3f9.f149646d) == null) {
            str = "";
        }
        if (m137465x9cf0d20b.get(str) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launch with cached engine id ");
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f92 = this.f175594h;
            sb6.append(c10715x7014d3f92 != null ? c10715x7014d3f92.f149646d : null);
            sb6.append(", but it has been destroyed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizTextCoverUI", sb6.toString());
            finish();
            return;
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263(this);
        this.f175593g = c10717xfba6b263;
        c10717xfba6b263.f();
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setNavigationBarColor(0);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTextCoverUI", "BizTextCoverUI onDestroy " + hashCode());
        f175591i = null;
        super.onDestroy();
        this.f175593g = null;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onUserLeaveHint() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f175593g;
        if (c10717xfba6b263 != null) {
            c10717xfba6b263.h();
        }
        super.onUserLeaveHint();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, pi0.o0
    public void pop() {
    }
}
