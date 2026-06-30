package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x f170685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f170686f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 f170687g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f170688h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k f170689i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170690m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f170691n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f170692o;

    public q0(java.lang.String str, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar, android.content.Intent intent, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f170684d = str;
        this.f170685e = xVar;
        this.f170686f = sVar;
        this.f170687g = u0Var;
        this.f170688h = c11809xbc286be4;
        this.f170689i = kVar;
        this.f170690m = intent;
        this.f170691n = activityC0065xcd7aa112;
        this.f170692o = c12559xbdae8559;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartWxaApp try with LauncherUI.startActivity ");
        java.lang.String str = this.f170684d;
        sb6.append(str);
        sb6.append(" strategy:");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar = this.f170685e;
        sb6.append(xVar);
        sb6.append(", app:");
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar = this.f170686f;
        sb6.append(sVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var = this.f170687g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f170688h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = this.f170689i;
        android.content.Intent intent = this.f170690m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f170691n;
        activityC0065xcd7aa112.startActivityForResult(intent, -1, null);
        c11809xbc286be4.f128802b2 = this.f170692o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE.k(activityC0065xcd7aa112, c11809xbc286be4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- try with LauncherUI.startActivity " + str + " strategy:" + xVar + ", app:" + sVar);
    }
}
