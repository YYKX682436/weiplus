package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationListUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.conversation.ui.BizFansConversationListUI */
/* loaded from: classes11.dex */
public final class ActivityC12969xadf72c8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final int f175481d = 1;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12968x1e3bdbe6 f175482e;

    /* renamed from: f, reason: collision with root package name */
    public int f175483f;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        ((ty.o0) i95.n0.c(ty.o0.class)).getClass();
        return kz5.o1.c(wn.v.class);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f175481d && i18 == -1 && intent != null) {
            if (!intent.getBooleanExtra("key_remind_changed", false)) {
                intent = null;
            }
            if (intent != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12968x1e3bdbe6 c12968x1e3bdbe6 = this.f175482e;
                if (c12968x1e3bdbe6 != null) {
                    ((ir1.e0) ((jz5.n) c12968x1e3bdbe6.f175480x).mo141623x754a37bb()).m8146xced61ae5();
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fragment");
                    throw null;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f175483f = intent != null ? intent.getIntExtra("serviceType", 0) : 0;
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.w_, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new ir1.h0(this));
        dr1.a.f324117a.c(this.f175483f);
        int i17 = this.f175483f;
        jr1.i iVar = jr1.i.f382893a;
        if (i17 == 5) {
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            ((ox.r) d0Var).Bi(2).d(br1.l.f105154a);
            iVar.b();
        } else {
            ((br1.m) ((zq1.u) i95.n0.c(zq1.u.class))).getClass();
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            ((ox.r) d0Var2).Bi(1).d(br1.k.f105151a);
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add("bizfansnofiticationholder@bizfansmsg");
            Di.m(linkedList);
            hr1.i Di2 = yq1.u0.Di();
            hr1.e z07 = Di2.z0("bizfansnofiticationholder@bizfansmsg");
            if (z07.f72763xa3c65b86 < 0) {
                hr1.g gVar = hr1.i.f364882e;
                hr1.e eVar = new hr1.e(hr1.i.f364884g);
                jr1.j.f(eVar, 0);
                Di2.mo55864x413cb2b4(eVar, true);
            }
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l0.f299291c.h(((ox.r) ((rm.d0) i95.n0.c(rm.d0.class))).Bi(1).c(), new jr1.d(z07, Di2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12968x1e3bdbe6 c12968x1e3bdbe6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.C12968x1e3bdbe6(this.f175483f);
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264().m7630xb2c12e75();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7630xb2c12e75, "beginTransaction(...)");
        m7630xb2c12e75.k(com.p314xaae8f345.mm.R.id.gd9, c12968x1e3bdbe6, null);
        m7630xb2c12e75.f();
        this.f175482e = c12968x1e3bdbe6;
        iVar.e(1, "", 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572269n54);
    }
}
