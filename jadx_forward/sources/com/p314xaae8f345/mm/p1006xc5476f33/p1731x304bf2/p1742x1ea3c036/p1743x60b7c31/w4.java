package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class w4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private w4() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        boolean z17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("key");
        java.lang.String string3 = bundle.getString("value");
        java.lang.String string4 = bundle.getString("weight");
        java.lang.String string5 = bundle.getString("expireTime");
        boolean z18 = bundle.getBoolean("autoClean");
        long j17 = bundle.getLong("storeSize");
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3)) {
            boolean e17 = ew4.c.c().e(string, string2, "", string4, string5, z18, j17, string2);
            bundle2.putBoolean("backIsFile", true);
            bundle2.putString("backFileName", string2);
            z17 = e17;
        } else {
            ew4.c c17 = ew4.c.c();
            c17.getClass();
            z17 = c17.e(string, string2, string3, string4, string5, z18, string2.getBytes().length + string3.getBytes().length, "");
        }
        bundle2.putBoolean("backRet", z17);
        rVar.a(bundle2);
    }
}
