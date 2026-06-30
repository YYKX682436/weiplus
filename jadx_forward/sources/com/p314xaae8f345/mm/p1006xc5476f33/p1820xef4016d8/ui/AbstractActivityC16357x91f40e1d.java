package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI */
/* loaded from: classes9.dex */
public abstract class AbstractActivityC16357x91f40e1d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements np5.f, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 f227505d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f227506e = true;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f227507f = new java.util.LinkedList();

    public void T6() {
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
    }

    public void U6() {
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().L();
            mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560875wx));
        }
    }

    /* renamed from: addSceneEndListener */
    public void m66163x14f40144(int i17) {
        this.f227505d.c(i17);
    }

    /* renamed from: doSceneProgress */
    public void m66165x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        this.f227505d.d(m1Var, z17);
    }

    /* renamed from: forceCancel */
    public void m66166xc8398945() {
        this.f227505d.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        java.util.Iterator it = ((java.util.List) this.f227507f.clone()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n0) ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next())).f295483a;
            p0Var.f295505k.mo48814x2efc64();
            p0Var.f295506l.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4(this, this);
        this.f227505d = r4Var;
        r4Var.c(1554);
        this.f227505d.c(1575);
        this.f227505d.c(1668);
        this.f227505d.c(fe1.l.f69742x366c91de);
        this.f227505d.c(1685);
        this.f227505d.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6.f34900x366c91de);
        this.f227505d.c(1514);
        this.f227505d.c(1682);
        this.f227505d.c(1612);
        this.f227505d.c(1643);
        this.f227505d.c(1558);
        this.f227505d.c(2715);
        this.f227505d.c(4605);
        this.f227505d.c(4915);
        this.f227505d.c(4536);
        this.f227505d.c(5148);
        this.f227505d.c(4395);
        this.f227505d.c(2832);
        this.f227505d.c(1647);
        this.f227505d.c(4373);
        this.f227505d.c(4595);
        this.f227505d.c(4339);
        this.f227505d.c(4717);
        this.f227505d.c(4878);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560875wx));
        if (this.f227506e) {
            m78554x41d7d42(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560882x3));
        }
        mo43051x2ee31f5b();
        java.util.Iterator it = ((java.util.List) this.f227507f.clone()).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next()).getClass();
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.c(getClass().getSimpleName());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.f227505d.f(1554);
        this.f227505d.f(1575);
        this.f227505d.f(1668);
        this.f227505d.f(fe1.l.f69742x366c91de);
        this.f227505d.f(1685);
        this.f227505d.f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u6.f34900x366c91de);
        this.f227505d.f(1514);
        this.f227505d.f(1682);
        this.f227505d.f(1612);
        this.f227505d.f(1643);
        this.f227505d.f(1558);
        this.f227505d.f(2715);
        this.f227505d.f(4605);
        this.f227505d.f(4915);
        this.f227505d.f(4536);
        this.f227505d.f(5148);
        this.f227505d.f(4395);
        this.f227505d.f(2832);
        this.f227505d.f(1647);
        this.f227505d.f(4373);
        this.f227505d.f(4595);
        this.f227505d.f(4339);
        this.f227505d.f(4717);
        this.f227505d.f(4878);
        java.util.LinkedList linkedList = this.f227507f;
        java.util.Iterator it = ((java.util.List) linkedList.clone()).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p0 p0Var = ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n0) ((com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u) it.next())).f295483a;
            p0Var.f295505k.mo48814x2efc64();
            p0Var.f295506l.mo48814x2efc64();
        }
        linkedList.clear();
        super.onDestroy();
        com.p314xaae8f345.mm.p2802xd031a825.ui.b0.d(getClass().getSimpleName());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.r4 r4Var = this.f227505d;
            if (r4Var != null) {
                if ((r4Var.f227111g.isEmpty() && r4Var.f227110f.isEmpty()) ? false : true) {
                    this.f227505d.e();
                }
            }
            if (m78513xc2a54588().getVisibility() == 8 || m78513xc2a54588().getVisibility() == 4) {
                finish();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // np5.f
    /* renamed from: onSceneEnd */
    public void mo66167x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        if (mo66056x76e0bfae(i17, i18, str, m1Var)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.e1.T(this, str);
        finish();
    }

    /* renamed from: onSceneEnd */
    public abstract boolean mo66056x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.s
    /* renamed from: register */
    public void mo66168xd6dc2ea3(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.u uVar) {
        java.util.LinkedList linkedList = this.f227507f;
        if (linkedList.contains(uVar)) {
            return;
        }
        linkedList.add(uVar);
    }

    /* renamed from: removeSceneEndListener */
    public void m66169xf6ff5b27(int i17) {
        this.f227505d.f(i17);
    }

    /* renamed from: doSceneProgress */
    public void m66164x5406100e(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f227505d.d(m1Var, true);
    }
}
