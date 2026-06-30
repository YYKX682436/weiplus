package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandKillByClientMessage;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lcom/tencent/mm/plugin/appbrand/o6;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage */
/* loaded from: classes7.dex */
public final class C12607x91d5b381 extends com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6> {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12607x91d5b381> f35266x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.g();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170572f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c f170573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12607x91d5b381(java.lang.String appId, int i17) {
        super(appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f170571e = appId;
        this.f170572f = i17;
        this.f170573g = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.c.m32225xcee59d22()[i17];
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: a, reason: from getter */
    public java.lang.String getF129169d() {
        return this.f170571e;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p444xaf12f3cb.AbstractC3942x17b79479
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.h(this, runtime));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKillByClientMessage", "runInLuggageProcess killType:" + this.f170573g + ", web-kernel:" + com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de());
        int ordinal = this.f170573g.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                com.p314xaae8f345.p3210x3857dc.a3.c(true);
                d(runtime);
                return;
            } else {
                if (ordinal != 4) {
                    d(runtime);
                    return;
                }
                android.app.Activity r07 = runtime.r0();
                if (r07 != null) {
                    r07.finish();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p3210x3857dc.a3.c(true);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_account_expired_enable, false)) {
            d(runtime);
            return;
        }
        android.app.Activity r08 = runtime.r0();
        if (r08 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.m8.f171399a.a(r08);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            d(runtime);
        }
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKillByClientMessage", "silentKill runtime:" + o6Var.f156336n);
        o6Var.L2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.i.f170602d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170571e);
        out.writeInt(this.f170572f);
    }
}
