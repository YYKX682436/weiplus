package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes7.dex */
final class h0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private h0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d)) {
                arrayList.addAll(((com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004.class)).m40300x39a1c6e9(c10756x2a5d7b2d.f149939d, 100, false, 0));
            }
            bundle.putStringArrayList("ipList", arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.GetHostByNameFromSimpleTask", "GetHostByNameFromSimpleTask ipList:" + arrayList.size());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("XWeb.MM.GetHostByNameFromSimpleTask", e17, "GetHostByNameFromSimpleTask error", new java.lang.Object[0]);
        }
        return bundle;
    }
}
