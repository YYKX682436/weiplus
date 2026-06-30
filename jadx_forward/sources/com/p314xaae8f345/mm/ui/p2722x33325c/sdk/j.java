package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class j implements com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f290734a;

    public j(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar) {
        this.f290734a = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void b(android.os.Bundle bundle) {
        com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
        java.lang.String string = bundle.getString("access_token");
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f290734a;
        lVar.g(string);
        java.lang.String string2 = bundle.getString("expires_in");
        if (string2 != null) {
            lVar.f290747b = string2.equals("0") ? 0L : java.lang.System.currentTimeMillis() + (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(string2) * 1000);
        }
        if (bundle.getLong("data_access_expiration_time") > java.lang.System.currentTimeMillis() / 1000) {
            lVar.f290747b = bundle.getLong("data_access_expiration_time");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "onComplete, onError, values.getLong(DATAACCESSEXPIRATIONTIME) = " + bundle.getLong("data_access_expiration_time") + ", System.currentTimeMillis() = " + java.lang.System.currentTimeMillis());
        }
        if (lVar.d()) {
            lVar.f290748c.b(bundle);
        } else {
            lVar.f290748c.d(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n("Failed to receive access token."));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void c(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.h hVar) {
        java.util.Objects.toString(hVar);
        this.f290734a.f290748c.c(hVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    public void d(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.n nVar) {
        java.util.Objects.toString(nVar);
        this.f290734a.f290748c.d(nVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k
    /* renamed from: onCancel */
    public void mo48702x3d6f0539() {
        this.f290734a.f290748c.mo48702x3d6f0539();
    }
}
