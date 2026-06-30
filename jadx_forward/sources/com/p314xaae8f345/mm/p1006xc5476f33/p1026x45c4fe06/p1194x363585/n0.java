package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 f170630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f170631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k f170632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f170633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f170634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f170635i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x f170636m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s f170637n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559, android.app.Activity activity, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.x xVar, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s sVar) {
        super(1);
        this.f170630d = u0Var;
        this.f170631e = c11809xbc286be4;
        this.f170632f = kVar;
        this.f170633g = intent;
        this.f170634h = c12559xbdae8559;
        this.f170635i = activity;
        this.f170636m = xVar;
        this.f170637n = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity it = (android.app.Activity) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var = this.f170630d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f170631e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k kVar = this.f170632f;
        android.content.Intent intent = this.f170633g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.D(u0Var, c11809xbc286be4, kVar, intent);
        it.startActivityForResult(intent, -1, null);
        c11809xbc286be4.f128802b2 = this.f170634h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u8.INSTANCE.k(this.f170635i, c11809xbc286be4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- by LaunchInBackgroundGuard strategy:" + this.f170636m + ", app:" + this.f170637n);
        return jz5.f0.f384359a;
    }
}
