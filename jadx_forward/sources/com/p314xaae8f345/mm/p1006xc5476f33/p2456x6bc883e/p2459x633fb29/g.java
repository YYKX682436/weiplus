package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

@mk0.a
/* loaded from: classes8.dex */
class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private g() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        java.lang.String str = null;
        if (c10756x2a5d7b2d == null) {
            return null;
        }
        java.lang.String str2 = c10756x2a5d7b2d.f149939d;
        java.util.Map map = vz4.s.f523277a;
        java.lang.String str3 = "";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String c17 = vz4.b.c();
            if (c17 == null) {
                c17 = "";
            }
            if (str2.equals(c17)) {
                str3 = vz4.b.a();
            } else if (str2.equals("jscore_lib")) {
                vz4.x xVar = vz4.h.f523268b;
                if (xVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda2 = xVar.f523291f;
                    str = c19543x781c5eda2 != null ? c19543x781c5eda2.f269909f : "";
                }
                str3 = str;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s) ((java.util.HashMap) vz4.s.f523277a).get(str2);
                if (sVar != null && (c19543x781c5eda = sVar.f269995d) != null) {
                    str3 = c19543x781c5eda.f269909f;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.CleanWepkgMgr", "pkgid:%s used_version:%s", str2, str3);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("used_wepkg_version", str3);
        return bundle;
    }
}
