package jh3;

/* loaded from: classes11.dex */
public class q extends ih3.q implements tg3.i1 {
    @Override // tg3.i1
    public void Ra(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        f(str, map, p0Var);
    }

    @Override // ih3.q
    public void c(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b(map, "link_history"))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onClickLinkImp head is null.");
        }
    }

    public void f(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        r45.j4 j4Var = p0Var.f152259a;
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j4Var.f459101r);
        java.lang.String b17 = b(map, "link_history");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onReceivedImp head(LINK_TYPE_HISTORY) is null.(%s %s)", g17, java.lang.Long.valueOf(o27.I0()));
            return;
        }
        ((y04.e) ((vg3.j4) i95.n0.c(vg3.j4.class))).getClass();
        d14.f.h(o27, map, b17, "tmpl_type_profile", null);
        java.lang.String str2 = (java.lang.String) map.get(b17 + ".historyid");
        if (str2 == null) {
            str2 = "";
        }
        o27.h1(str2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.m124847x74d37ac6(), o27, true);
        ((y04.e) ((vg3.j4) i95.n0.c(vg3.j4.class))).Ai(str2, o27.m124847x74d37ac6(), o27.Q0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SysMsgTemp.HandlerProfileWithRevokeReceived", "onReceivedImp msgId:%s historyId:%s", java.lang.Long.valueOf(o27.m124847x74d37ac6()), str2);
    }

    @Override // ih3.q, tg3.i1
    public void qf(java.lang.String str, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super.qf(str, map, bundle, weakReference, weakReference2);
    }
}
