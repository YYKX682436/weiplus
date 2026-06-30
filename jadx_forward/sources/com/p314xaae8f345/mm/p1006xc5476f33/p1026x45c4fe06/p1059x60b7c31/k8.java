package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes9.dex */
public class k8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca f162881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f162882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f162883f;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l8 l8Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca, android.os.Bundle bundle, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f162881d = c5653x583ecdca;
        this.f162882e = bundle;
        this.f162883f = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5653x583ecdca c5653x583ecdca = this.f162881d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCLoadPayOfflineUserBindQuery", "event.data.callback，result ：%s", c5653x583ecdca.f135979h.f89729a);
        java.lang.String str = c5653x583ecdca.f135979h.f89729a;
        android.os.Bundle bundle = this.f162882e;
        bundle.putString("errMsg", str);
        this.f162883f.a(bundle);
    }
}
