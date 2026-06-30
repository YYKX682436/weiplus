package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public final class r2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 f239445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 f239446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 f239447c;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var) {
        this.f239445a = h3Var;
        this.f239446b = n2Var;
        this.f239447c = z0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1 c1Var;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1 c1Var2;
        java.util.ArrayList arrayList3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1 c1Var3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailReceiveAccountInfoAdapter", "LiteAppStoreCallback called, instanceId: " + j17 + ", actionName: " + str + ", data: " + obj + ", callbackId: " + i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "setSelectIndex") && (obj instanceof org.json.JSONObject)) {
            org.json.JSONArray optJSONArray = ((org.json.JSONObject) obj).optJSONArray("selectIndexes");
            int optInt = optJSONArray != null ? optJSONArray.optInt(0, 0) : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.z0 z0Var = this.f239447c;
            sb6.append(z0Var.f238620s.f238338a);
            sb6.append(((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) z0Var.f238620s.f238341d.get(optInt)).f238334b);
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.n2 n2Var = this.f239446b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3 h3Var = this.f239445a;
            h3Var.O(n2Var, sb7);
            int i18 = z0Var.f238602a;
            long j18 = 0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f238621t)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t.a();
                java.lang.String str2 = "TRANS_SELECTED_SHOP_" + i18;
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var = z0Var.f238620s;
                a17.putLong(str2, (d1Var == null || (arrayList3 = d1Var.f238341d) == null || (c1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) arrayList3.get(optInt)) == null) ? 0L : c1Var3.f238333a);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h3.f239266t.a();
                java.lang.String str3 = "TRANS_SELECTED_SHOP_" + i18 + '_' + z0Var.f238621t;
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var2 = z0Var.f238620s;
                a18.putLong(str3, (d1Var2 == null || (arrayList = d1Var2.f238341d) == null || (c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) arrayList.get(optInt)) == null) ? 0L : c1Var.f238333a);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.m2 m2Var = h3Var.f239272h;
            if (m2Var != null) {
                java.lang.String str4 = z0Var.f238621t;
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.d1 d1Var3 = z0Var.f238620s;
                if (d1Var3 != null && (arrayList2 = d1Var3.f238341d) != null && (c1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.c1) arrayList2.get(optInt)) != null) {
                    j18 = c1Var2.f238333a;
                }
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883.f238869u2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.t5) m2Var).f239487a;
                ((java.util.HashMap) activityC17133x39d21883.Z1).put(activityC17133x39d21883.h7(i18, str4), java.lang.Long.valueOf(j18));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.j2 j2Var = h3Var.f239270f;
            if (j2Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.r5) j2Var).a(h3Var.f239273i, z0Var);
            }
            h3Var.z(z0Var, true);
            h3Var.L(z0Var);
        }
        return false;
    }
}
