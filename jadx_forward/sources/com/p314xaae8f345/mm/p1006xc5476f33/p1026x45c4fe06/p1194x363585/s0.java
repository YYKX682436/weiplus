package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f170714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 f170715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f170716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k f170717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f170719i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 f170720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170721n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x f170722o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f170723p;

    public s0(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 a1Var, android.content.Context context, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar) {
        this.f170714d = activity;
        this.f170715e = u0Var;
        this.f170716f = c11809xbc286be4;
        this.f170717g = kVar;
        this.f170718h = intent;
        this.f170719i = c12559xbdae8559;
        this.f170720m = a1Var;
        this.f170721n = context;
        this.f170722o = xVar;
        this.f170723p = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = this.f170717g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var = this.f170715e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f170716f;
        android.content.Intent intent = this.f170718h;
        android.app.Activity activity = this.f170714d;
        if (activity != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
            activity.startActivityForResult(intent, -1, null);
            c11809xbc286be4.f128802b2 = this.f170719i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE.k(activity, c11809xbc286be4);
            str = "Activity(" + activity + ')';
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.a1 a1Var = this.f170720m;
            if (a1Var.f170526f != null) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_open_by_h5_intent_forward, 1) == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
                    com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41 = a1Var.f170526f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c3933x11320b41, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    c3933x11320b41.b((android.content.Intent) arrayList.get(0));
                    yj0.a.f(c3933x11320b41, "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$7", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    str = "ActivityStarterIpcDelegate";
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.E(this.f170715e, this.f170721n, this.f170718h, this.f170720m, this.f170722o, this.f170723p);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.E(this.f170715e, this.f170721n, this.f170718h, this.f170720m, this.f170722o, this.f170723p);
            }
            str = "super";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- method:" + str + ", strategy:" + this.f170722o + ", app:" + this.f170723p);
    }
}
