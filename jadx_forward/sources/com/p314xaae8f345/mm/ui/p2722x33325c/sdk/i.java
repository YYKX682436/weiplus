package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f290733a;

    public i(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar) {
        this.f290733a = lVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290735f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "data = %s, action = %s.", stringExtra, intent.getAction());
        android.os.Bundle bundle = new android.os.Bundle();
        if (com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.f290741l.equals(intent.getAction()) && stringExtra != null && stringExtra.startsWith("fb290293790992170://authorize")) {
            android.os.Bundle e17 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l.e(stringExtra);
            bundle.putString("access_token", e17.getString("access_token"));
            try {
                bundle.putLong("data_access_expiration_time", java.lang.Long.parseLong(e17.getString("data_access_expiration_time")) * 1000);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "DATAACCESSEXPIRATIONTIME = %s", java.lang.Long.valueOf(bundle.getLong("data_access_expiration_time")));
            } catch (java.lang.Exception unused) {
            }
            bundle.putString("expires_in", e17.getString("expires_in"));
            bundle.putString("service_disabled", e17.getString("service_disabled"));
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k kVar = this.f290733a.f290749d;
            if (kVar != null) {
                ((com.p314xaae8f345.mm.ui.p2722x33325c.sdk.j) kVar).b(bundle);
            }
        }
    }
}
