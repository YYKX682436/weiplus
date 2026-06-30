package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f129206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r f129207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar, java.lang.String str) {
        super(1);
        this.f129206d = z17;
        this.f129207e = rVar;
        this.f129208f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h hVar;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s record = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        boolean z17 = this.f129206d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar = this.f129207e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0) rVar;
            u0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessesManager", "sendFinishMessageSync record:" + record + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.k) u0Var.f(record)).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12606x6310078e(record.f129217a, record.f129224h, true));
        } else {
            rVar.w(record);
        }
        if (record.f129221e) {
            rVar.getClass();
            java.lang.String appId = this.f129208f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            rVar.i(appId, -1, com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.q.f129213d);
        } else {
            rVar.getClass();
            try {
                hVar = rVar.f(record);
            } catch (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.y unused) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.b(record);
            }
        }
        return jz5.f0.f384359a;
    }
}
