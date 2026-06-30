package td1;

/* loaded from: classes14.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f76808x366c91de = 854;

    /* renamed from: NAME */
    public static final java.lang.String f76809x24728b = "operateRecentUsageList";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null || jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.operateRecentUsageList", "data = " + jSONObject);
        td1.l lVar2 = td1.l.f499141e;
        java.util.HashMap i18 = kz5.c1.i(new jz5.l(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, 1));
        int optInt = jSONObject.optInt("actionType", -1);
        td1.k[] m166268xcee59d22 = td1.k.m166268xcee59d22();
        int length = m166268xcee59d22.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                z17 = true;
                break;
            }
            if (m166268xcee59d22[i19].f499140d == optInt) {
                z17 = false;
                break;
            }
            i19++;
        }
        if (z17) {
            C("fail:illegal actionType", ":" + optInt);
            c0Var.a(i17, p("fail:illegal actionType", i18));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5, "");
        if (optString == null || r26.n0.N(optString)) {
            C("fail:username is empty", "");
            c0Var.a(i17, p("fail:username is empty", i18));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("appId", "");
        if (optString2 == null || r26.n0.N(optString2)) {
            C("fail:appId is empty", "");
            c0Var.a(i17, p("fail:appId is empty", i18));
            return;
        }
        int optInt2 = jSONObject.optInt("versionType", -1);
        if (optInt2 == -1) {
            C("fail:versionType is empty", "");
            c0Var.a(i17, p("fail:versionType is empty", i18));
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        td1.k.f499138e.getClass();
        for (td1.k kVar : td1.k.m166268xcee59d22()) {
            if (kVar.f499140d == optInt) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1107xfcb882be.C12224xfdf1bf9e(kVar, optString, optString2, optInt2), td1.o.class, new td1.p(c0Var, i17, this));
                return;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final java.lang.String C(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.operateRecentUsageList", str + str2);
        return str;
    }
}
