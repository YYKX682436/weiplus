package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.AddAppUI */
/* loaded from: classes8.dex */
public class ActivityC18528xb888b874 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f253933d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc f253934e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc f253935f;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18528xb888b874 activityC18528xb888b874, java.lang.String str) {
        activityC18528xb888b874.getClass();
        android.content.Intent intent = new android.content.Intent(activityC18528xb888b874, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18531x33cf9cfc.class);
        intent.putExtra("AppProfileUI_AppId", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC18528xb888b874, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18528xb888b874.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC18528xb888b874, "com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI", "gotoProfile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576363c;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f571379de);
        mo54448x9c8c0d33(new fg4.a(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f253933d = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).t();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253933d).g(com.p314xaae8f345.mm.R.xml.f576363c);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253933d).h("addapp_added");
        this.f253934e = c18530x30d9cdbc;
        c18530x30d9cdbc.Q = 1;
        c18530x30d9cdbc.N = new fg4.b(this);
        c18530x30d9cdbc.P = new fg4.c(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f253933d).h("addapp_available");
        this.f253935f = c18530x30d9cdbc2;
        c18530x30d9cdbc2.Q = 0;
        c18530x30d9cdbc2.N = new fg4.d(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc = this.f253934e;
        if (c18530x30d9cdbc != null && c18530x30d9cdbc.M != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(c18530x30d9cdbc.M);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc2 = this.f253935f;
        if (c18530x30d9cdbc2 == null || c18530x30d9cdbc2.M == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(c18530x30d9cdbc2.M);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (!c21560x1fce98fb.f279313q.equals("addapp_recommend")) {
            return false;
        }
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571384dj, java.lang.Integer.valueOf(o45.wf.f424562g), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(mo55332x76847179().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), mo55332x76847179()), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc = this.f253934e;
        if (c18530x30d9cdbc != null && c18530x30d9cdbc.M != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(c18530x30d9cdbc.M);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18530x30d9cdbc c18530x30d9cdbc2 = this.f253935f;
        if (c18530x30d9cdbc2 == null || c18530x30d9cdbc2.M == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(c18530x30d9cdbc2.M);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
    }
}
