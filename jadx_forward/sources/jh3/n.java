package jh3;

/* loaded from: classes11.dex */
public class n extends ih3.q implements tg3.i1 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f381363d = new java.util.concurrent.ConcurrentHashMap();

    public static boolean f(long j17) {
        return ((jh3.m) ((java.util.concurrent.ConcurrentHashMap) f381363d).get(java.lang.Long.valueOf(j17))) != null;
    }

    public static void i(long j17, int i17) {
        jh3.m mVar = (jh3.m) ((java.util.concurrent.ConcurrentHashMap) f381363d).get(java.lang.Long.valueOf(j17));
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(msgId:%s action:%s)", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        } else {
            k(mVar, i17);
        }
    }

    public static void k(jh3.m mVar, int i17) {
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "openImDimissionSucceedReport info is null.(action:%s)", java.lang.Integer.valueOf(i17));
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6806x70e4a93e c6806x70e4a93e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6806x70e4a93e();
        c6806x70e4a93e.f141348d = c6806x70e4a93e.b("ResignationWorkUsername", mVar.f381358a, true);
        c6806x70e4a93e.f141349e = c6806x70e4a93e.b("TakeOverWorkUsername", mVar.f381359b, true);
        c6806x70e4a93e.f141350f = c6806x70e4a93e.b("WorkEnterpriseDescId", mVar.f381360c, true);
        c6806x70e4a93e.f141351g = c6806x70e4a93e.b("WorkEnterpriseName", mVar.f381361d, true);
        c6806x70e4a93e.f141352h = c6806x70e4a93e.b("SessionId", mVar.f381362e, true);
        c6806x70e4a93e.f141353i = i17;
        c6806x70e4a93e.k();
    }

    @Override // tg3.i1
    public void Ra(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        h(str, map, p0Var);
    }

    @Override // ih3.q
    public void c(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        java.lang.String b17 = b(map, "new_link_succeed_contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onClickLinkImp head is null.");
            return;
        }
        long j17 = bundle.getLong("msg_id");
        jh3.m mVar = (jh3.m) ((java.util.concurrent.ConcurrentHashMap) f381363d).get(java.lang.Long.valueOf(j17));
        if (mVar == null) {
            mVar = l(j17, map, b17);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "link_profile")) {
            k(mVar, 2);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str, "new_link_succeed_contact")) {
            k(mVar, 5);
        }
    }

    public void h(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j4Var.f459101r);
        java.lang.String b17 = b(map, "new_link_succeed_contact");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerNewSuccedContactWindowReceived", "onReceivedImp head is null.(%s %s)", g17, java.lang.Long.valueOf(o27.I0()));
        } else {
            k(l(o27.m124847x74d37ac6(), map, b17), 1);
        }
    }

    public jh3.m l(long j17, java.util.Map map, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) map.get(str + ".origin_username");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(str + ".heir_username");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) map.get(str + ".succeed_ticket");
        java.lang.String str5 = str4 != null ? str4 : "";
        jh3.m mVar = new jh3.m();
        mVar.f381358a = str2;
        mVar.f381359b = str3;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        mVar.f381360c = n17.G0();
        mVar.f381361d = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        mVar.f381362e = str5;
        ((java.util.concurrent.ConcurrentHashMap) f381363d).put(java.lang.Long.valueOf(j17), mVar);
        return mVar;
    }

    @Override // ih3.q, tg3.i1
    public void qf(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super.qf(str, map, bundle, weakReference, weakReference2);
    }
}
