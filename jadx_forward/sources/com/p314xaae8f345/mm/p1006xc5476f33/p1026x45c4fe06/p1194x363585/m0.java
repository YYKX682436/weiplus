package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f170624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f170625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xg1.c f170626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x f170627g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f170628h;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, xg1.c cVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar) {
        this.f170624d = c11809xbc286be4;
        this.f170625e = c12559xbdae8559;
        this.f170626f = cVar;
        this.f170627g = xVar;
        this.f170628h = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.String str;
        this.f170624d.f128802b2 = this.f170625e;
        xg1.c cVar = this.f170626f;
        cVar.getClass();
        xg1.h hVar = xg1.h.f535903a;
        xg1.j jVar = new xg1.j(cVar.f535891a, cVar.f535892b, cVar.f535893c, cVar.f535895e);
        synchronized (hVar) {
            android.util.SparseArray sparseArray = xg1.h.f535904b;
            int i18 = xg1.h.f535905c + 1;
            xg1.h.f535905c = i18;
            sparseArray.append(i18, jVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new xg1.i(xg1.h.f535905c, "MicroMsg.AppBrand.PendingIntentPoster"), 12000L);
            i17 = xg1.h.f535905c;
        }
        cVar.f535896f = i17;
        java.lang.Class cls = cVar.f535894d.f170613k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "onNeedPreLoadingUI: triggerService = " + cls.getCanonicalName());
        java.lang.String canonicalName = cls.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName);
        android.content.ComponentName component = cVar.f535892b.getComponent();
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = cVar.f535893c;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12656xc58423b1> cls2 = c11809xbc286be4.Y ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12656xc58423b1.class : cVar.f535894d.f170614l;
        android.content.Context context = cVar.f535891a;
        android.content.Intent intent = new android.content.Intent(context, cls2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startPreLoadingActivity, ctx = " + context);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.name", c11809xbc286be4.f158812e);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.icon", c11809xbc286be4.f158813f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.serviceName", canonicalName);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.intentKey", cVar.f535896f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.targetActivityName", str);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.splashFlavor", 5);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.appId", c11809xbc286be4.f158811d);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.scene", cVar.f535895e.f169323f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.versionInfo", c11809xbc286be4.N);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.appServiceType", c11809xbc286be4.f128817z);
        intent.addFlags(268435456);
        android.content.Context context2 = cVar.f535891a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (context instanceof android.app.Activity) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.dd.class))).k((android.app.Activity) context, c11809xbc286be4);
        }
        pm0.v.M("MicroMsg.AppBrand.AppBrandPreLoadingLogic:startService:".concat(canonicalName), false, new xg1.b(cVar, canonicalName), 2, null);
        cVar.f535893c.f158828h2 = cls.getCanonicalName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- strategy:" + this.f170627g + ", app:" + this.f170628h);
    }
}
