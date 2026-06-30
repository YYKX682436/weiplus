package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String[] f264546a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f264547b;

    public static java.util.LinkedList a(java.util.ArrayList arrayList) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                try {
                    r45.px4 px4Var = new r45.px4();
                    px4Var.mo11468x92b714fd((byte[]) arrayList.get(i17));
                    r45.jv5 jv5Var = new r45.jv5();
                    jv5Var.f459666f = px4Var.f464993f;
                    jv5Var.f459665e = px4Var.f464992e;
                    jv5Var.f459664d = px4Var.f464991d;
                    jv5Var.f459667g = px4Var.f464994g;
                    jv5Var.f459669i = px4Var.f464995h;
                    linkedList.add(jv5Var);
                } catch (java.io.IOException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OauthAuthorizeLogic", "bytesListToBytesListScopeInfoList: i:%d, exp:%s", java.lang.Integer.valueOf(i17), e17.getLocalizedMessage());
                    linkedList.clear();
                }
            }
        }
        return linkedList;
    }

    public static java.lang.String b() {
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_native_oauth_host_for_h5, "", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "getOauthHostPaths %s", Zi);
        return Zi;
    }
}
