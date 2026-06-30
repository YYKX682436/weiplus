package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
class d1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PluginAppBrand", "current not it MM proc");
            return null;
        }
        java.lang.String str = c10756x2a5d7b2d.f149939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginAppBrand", "try resolve host %s", str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int f17 = com.p314xaae8f345.mm.p971x6de15a2e.n.f(str, false, arrayList);
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginAppBrand", "resolved dnstype %d iplist %s", java.lang.Integer.valueOf(f17), java.util.Arrays.toString(strArr));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("NEW_DNS_IP", strArr);
        return bundle;
    }
}
