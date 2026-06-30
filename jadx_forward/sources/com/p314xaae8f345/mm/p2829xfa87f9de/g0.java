package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes.dex */
final class g0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private g0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            int mo48027x8faab340 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10756x2a5d7b2d.f149939d) ? gm0.j1.n().f354821b.f152297d.mo48027x8faab340(c10756x2a5d7b2d.f149939d, arrayList) : 0;
            bundle.putStringArrayList("ipList", arrayList);
            bundle.putInt("result", mo48027x8faab340);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.GetHostByNameFromNewTask", "GetHostByNameFromNewTask, result:" + mo48027x8faab340 + ", ipList:" + arrayList);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("XWeb.MM.GetHostByNameFromNewTask", e17, "GetHostByNameFromNewTask error", new java.lang.Object[0]);
        }
        return bundle;
    }
}
