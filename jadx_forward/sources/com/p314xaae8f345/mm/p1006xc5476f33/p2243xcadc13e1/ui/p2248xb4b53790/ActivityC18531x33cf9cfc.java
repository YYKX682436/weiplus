package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AppProfileUI */
/* loaded from: classes8.dex */
public class ActivityC18531x33cf9cfc extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f253936d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f253937e;

    /* renamed from: f, reason: collision with root package name */
    public fg4.f f253938f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f253939g = null;

    public final void V6(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(mVar.f67370x28d45f97);
        sb6.append(",");
        sb6.append(z17 ? "1" : "2");
        linkedList.add(new e21.p(10165, sb6.toString()));
        ((e21.z0) c01.d9.b().w()).c(new e21.q(linkedList));
    }

    public final void W6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253937e).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253937e).g(com.p314xaae8f345.mm.R.xml.f576367g);
        if (this.f253936d.f67391x10a0fed7 == 1) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253937e).w("app_profile_add");
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253937e).w("app_profile_remove");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18529x9df29369 c18529x9df29369 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18529x9df29369) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253937e).h("app_profile_header");
        fg4.f fVar = this.f253938f;
        boolean z17 = this.f253936d.f67391x10a0fed7 == 1;
        c18529x9df29369.getClass();
        iz5.a.g(null, fVar != null);
        c18529x9df29369.Q = fVar;
        c18529x9df29369.R = z17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576367g;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f253938f = new fg4.i(this);
        java.lang.String stringExtra = getIntent().getStringExtra("AppProfileUI_AppId");
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        this.f253936d = h17;
        iz5.a.g("initView : appInfo does not exist", h17 != null);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572062xp);
        this.f253937e = m79336x8b97809d();
        mo54448x9c8c0d33(new fg4.j(this));
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (str.equals(this.f253936d.f67370x28d45f97)) {
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(this);
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppProfileUI", str + " item has been clicked!");
        if (str.equals("app_profile_add")) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f253936d;
            mVar.f67391x10a0fed7 = 1;
            mVar.f67383x15b870c = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo9952xce0038c9(this.f253936d, new java.lang.String[0]);
            W6();
            V6(this.f253936d, true);
            fg4.k kVar = new fg4.k(this);
            this.f253939g = kVar;
            kVar.mo50307xb9e94560(0, 30L);
            return true;
        }
        if (!str.equals("app_profile_remove")) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = this.f253936d;
        mVar2.f67391x10a0fed7 = 0;
        mVar2.f67383x15b870c = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo9952xce0038c9(this.f253936d, new java.lang.String[0]);
        W6();
        V6(this.f253936d, false);
        fg4.k kVar2 = new fg4.k(this);
        this.f253939g = kVar2;
        kVar2.mo50307xb9e94560(0, 30L);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(this);
    }
}
