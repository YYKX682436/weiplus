package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1745xadfe2b3.ui;

@mk0.a
/* loaded from: classes8.dex */
final class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private c() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiteActionBar", "InvokeTask, mm received invalid data");
            return;
        }
        java.lang.String string = bundle.getString("userName");
        java.lang.String string2 = bundle.getString("exportId");
        java.lang.String string3 = bundle.getString("byPass");
        int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(string);
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, string2, 9, j17, string3, null);
    }
}
