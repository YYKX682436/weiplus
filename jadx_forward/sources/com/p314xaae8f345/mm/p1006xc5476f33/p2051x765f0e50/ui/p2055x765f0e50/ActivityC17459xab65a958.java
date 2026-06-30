package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI */
/* loaded from: classes8.dex */
public class ActivityC17459xab65a958 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f242186o = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f242187d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wl f242188e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.GridView f242189f;

    /* renamed from: g, reason: collision with root package name */
    public rz.o f242190g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f242192i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f242193m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f242191h = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f242194n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sl(this), true);

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958 activityC17459xab65a958, int i17) {
        activityC17459xab65a958.getClass();
        gm0.j1.u().c().w(66820, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10198, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSelectBgUI", "set chating bg id:%d", java.lang.Integer.valueOf(i17));
        if (activityC17459xab65a958.f242192i) {
            gm0.j1.u().c().w(12311, java.lang.Integer.valueOf(i17));
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().m0(1);
            return;
        }
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.b wi6 = f21.r0.wi();
        f21.a m07 = wi6.m0(activityC17459xab65a958.f242193m);
        if (m07 != null) {
            m07.f340366b = i17;
            wi6.s0(m07);
        } else {
            f21.a aVar = new f21.a();
            aVar.f340365a = activityC17459xab65a958.f242193m;
            aVar.f340366b = i17;
            wi6.n0(aVar);
        }
    }

    public final void U6(java.util.List list) {
        if (list.size() <= 0) {
            this.f242190g = null;
        } else {
            this.f242190g = (rz.o) list.remove(0);
            gm0.j1.d().g((com.p314xaae8f345.mm.p944x882e457a.m1) this.f242190g);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clz;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iq9);
        mo78530x8b45058f();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tl(this));
        this.f242192i = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f242193m = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        this.f242194n.c(20L, 20L);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242187d = i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        mo43517x10010bd5();
        gm0.j1.d().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        gm0.j1.d().a(160, this);
        if (gm0.j1.u().l()) {
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            gm0.j1.d().g(new f21.g0(1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f242190g != null) {
            gm0.j1.d().d((com.p314xaae8f345.mm.p944x882e457a.m1) this.f242190g);
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(((f21.f0) this.f242190g).f340428f, 1);
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f242191h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rz.o oVar = (rz.o) it.next();
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.r0.Bi().L0(((f21.f0) oVar).f340428f, 1);
        }
        arrayList.clear();
        gm0.j1.d().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de, this);
        gm0.j1.d().q(160, this);
        this.f242188e.c();
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.r0.Bi().m163471xc84af884(this.f242188e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if ((m1Var instanceof com.p314xaae8f345.mm.p944x882e457a.q1) && ((com.p314xaae8f345.mm.p944x882e457a.q1) m1Var).u() == 1) {
            int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
            if ((mo808xfb85f7b0 == 159 || mo808xfb85f7b0 == 160) && mo808xfb85f7b0 == 160) {
                U6(this.f242191h);
            }
        }
    }
}
