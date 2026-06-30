package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI */
/* loaded from: classes15.dex */
public class ActivityC17298xea2f7277 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f240831d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 f240832e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe f240833f;

    /* renamed from: g, reason: collision with root package name */
    public e04.m3 f240834g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f240835h;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ca7;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ca6;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576444bd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getIntent().getStringExtra("key_title"));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.u(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w(this));
        this.f240831d = m79336x8b97809d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f240834g.f327558a.iterator();
        while (it.hasNext()) {
            arrayList.add(((e04.k3) it.next()).f327538a);
        }
        this.f240833f = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) findViewById(com.p314xaae8f345.mm.R.id.kod);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3) findViewById(com.p314xaae8f345.mm.R.id.hc7);
        this.f240832e = c21508xc28dbdd3;
        c21508xc28dbdd3.m79063x9da123c9(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8v);
        this.f240832e.setVisibility(0);
        this.f240833f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.x(this));
        this.f240833f.m8322x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.y(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a0 a0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.a0(this, this);
        this.f240833f.m8315x6cab2c8d(a0Var);
        if (arrayList.size() > 0) {
            a0Var.f241030e = arrayList;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd32 = this.f240832e;
            c21508xc28dbdd32.f279047e = arrayList.size();
            c21508xc28dbdd32.a(0);
            a0Var.mo8343xced61ae5();
            this.f240833f.setVisibility(0);
        }
        for (int i17 = 0; i17 < this.f240834g.f327559b.size(); i17++) {
            e04.l3 l3Var = (e04.l3) this.f240834g.f327559b.get(i17);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb.C(i17 + "");
            c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.c2y;
            c21560x1fce98fb.L(l3Var.f327553a);
            c21560x1fce98fb.H(l3Var.f327554b);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f240831d).d(c21560x1fce98fb, -1);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f240831d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        e04.m3 m3Var;
        super.onCreate(bundle);
        e04.n3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b17 == null || (m3Var = b17.f327566b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProductFurtherInfoUI", "initView(), product or product field detail null -> finish");
            finish();
        } else {
            this.f240834g = m3Var;
            this.f240835h = b17.f69631x1e1bc805;
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }
}
