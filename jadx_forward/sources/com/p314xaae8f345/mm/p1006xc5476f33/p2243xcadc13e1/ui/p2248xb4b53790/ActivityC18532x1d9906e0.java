package com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790;

/* renamed from: com.tencent.mm.plugin.subapp.ui.openapi.ServiceAppUI */
/* loaded from: classes8.dex */
public class ActivityC18532x1d9906e0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f253940d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 f253941e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 f253942f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b f253943g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21568x1a71b23b f253944h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f253945i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f253946m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f253947n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f253948o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f253949p;

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0 activityC18532x1d9906e0, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        int i17;
        activityC18532x1d9906e0.getClass();
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceAppUI", "app is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10923, 13, mVar.f67370x28d45f97, 1, activityC18532x1d9906e0.f253949p);
        if (mVar.f319924x1 != 2 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f319914p1)) {
            int i18 = mVar.f319924x1;
            if (i18 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("service_app_package_name", mVar.f67386xa1e9e82c);
                intent.putExtra("service_app_openid", mVar.f67384x996f3ea);
                intent.putExtra("service_app_appid", mVar.f67370x28d45f97);
                activityC18532x1d9906e0.setResult(-1, intent);
                activityC18532x1d9906e0.finish();
                return;
            }
            if (i18 == 1) {
                com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC18532x1d9906e0.mo55332x76847179();
                java.lang.String str = mVar.f319914p1;
                y7Var.getClass();
                ((com.p314xaae8f345.mm.app.p622xc5476f33.j) o25.z1.a()).c(mo55332x76847179, str, true, null);
                activityC18532x1d9906e0.finish();
                return;
            }
            return;
        }
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(activityC18532x1d9906e0.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), activityC18532x1d9906e0.mo55332x76847179());
        if ("language_default".equalsIgnoreCase(o17) && java.util.Locale.getDefault() != null) {
            o17 = java.util.Locale.getDefault().toString();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC18532x1d9906e0.f253949p)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l()).z0(activityC18532x1d9906e0.f253949p);
            if (z07 != null) {
                i17 = z07.A0().size();
                android.content.Intent intent2 = new android.content.Intent();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("jsapi_args_appid", mVar.f67370x28d45f97);
                bundle.putBoolean("isFromService", true);
                bundle.putString("sendAppMsgToUserName", activityC18532x1d9906e0.f253949p);
                intent2.putExtra("jsapiargs", bundle);
                intent2.putExtra("forceHideShare", true);
                intent2.putExtra("show_bottom", false);
                intent2.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f319914p1, java.lang.Integer.valueOf(i17), o17));
                j45.l.j(activityC18532x1d9906e0.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent2, null);
                activityC18532x1d9906e0.finish();
            }
        }
        i17 = 1;
        android.content.Intent intent22 = new android.content.Intent();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("jsapi_args_appid", mVar.f67370x28d45f97);
        bundle2.putBoolean("isFromService", true);
        bundle2.putString("sendAppMsgToUserName", activityC18532x1d9906e0.f253949p);
        intent22.putExtra("jsapiargs", bundle2);
        intent22.putExtra("forceHideShare", true);
        intent22.putExtra("show_bottom", false);
        intent22.putExtra("rawUrl", java.lang.String.format("%s&wxchatmembers=%s&lang=%s", mVar.f319914p1, java.lang.Integer.valueOf(i17), o17));
        j45.l.j(activityC18532x1d9906e0.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent22, null);
        activityC18532x1d9906e0.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576457bq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (r4.moveToNext() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r8 != 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r3.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005f, code lost:
    
        if (r4.moveToFirst() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0061, code lost:
    
        r7 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        r7.mo9015xbf5d97fd(r4);
        r8 = r7.f67388x728ca6b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006b, code lost:
    
        if (r8 != 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006d, code lost:
    
        r1.add(r7);
     */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.ActivityC18532x1d9906e0.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf1098150 = this.f253941e;
        if (c18533xf1098150 != null && c18533xf1098150.M != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(c18533xf1098150.M);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf10981502 = this.f253942f;
        if (c18533xf10981502 == null || c18533xf10981502.M == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().mo49775xc84af884(c18533xf10981502.M);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf1098150 = this.f253941e;
        if (c18533xf1098150 != null && c18533xf1098150.M != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(c18533xf1098150.M);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2248xb4b53790.C18533xf1098150 c18533xf10981502 = this.f253942f;
        if (c18533xf10981502 == null || c18533xf10981502.M == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.Di().add(c18533xf10981502.M);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ServiceAppUI", "onSceneEnd, errType = " + i17 + ", errCode = " + i18);
    }
}
