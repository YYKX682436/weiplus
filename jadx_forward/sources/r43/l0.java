package r43;

/* loaded from: classes8.dex */
public class l0 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        ((ku5.t0) ku5.t0.f394148d).h(new r43.k0(this, p0Var), "GameSysCmdMsgListener");
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
        if (r0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f152293d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f152294e)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameSysCmdMsgListener", "delete msgType:%s, msgId:%s", r0Var.f152293d, r0Var.f152294e);
        if ("gamecenter".equalsIgnoreCase(r0Var.f152293d)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(r0Var.f152294e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.r.a(arrayList, false);
        }
    }
}
