package r01;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f449574a = "";

    /* renamed from: b, reason: collision with root package name */
    public static long f449575b;

    public static boolean a() {
        int i17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BIZ_ATTR_SYNC_OPEN_FLAG_INT, null);
        if (m17 == null || !(m17 instanceof java.lang.Integer)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "openFlag is null.");
            i17 = 1;
        } else {
            i17 = ((java.lang.Integer) m17).intValue();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "openFlag is %d.", java.lang.Integer.valueOf(i17));
        return i17 == 1;
    }

    public final boolean b(qk.o oVar) {
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
            return false;
        }
        if (!a()) {
            return false;
        }
        int b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBizAttrSyncFreq", -1);
        if (b17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
            b17 = 3600;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = oVar.f66742x48b98940;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b17), oVar.f66731x4b3625c7);
        return currentTimeMillis - j17 >= ((long) b17) * 1000;
    }

    public boolean c(java.lang.String str, r01.c cVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
            return false;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(f449574a, str) && java.lang.System.currentTimeMillis() - f449575b < 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is just delete.");
            return false;
        }
        qk.o b17 = r01.q3.cj().b1(str);
        if (!b(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
            return false;
        }
        if (str.equals("gh_f0a92aa7146c")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAttrRenovator", "username == ContactStorageLogic.SPUSER_WXPAY_COLLECTION，go NetScene Plugin");
            gm0.j1.n().f354821b.g(new r01.k3(new r01.b(this, str)));
        }
        gm0.j1.n().f354821b.g(new r01.d3(str, b17.f66731x4b3625c7, new r01.a(this, str, new java.lang.ref.WeakReference(cVar), b17)));
        return true;
    }
}
