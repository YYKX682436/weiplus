package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes.dex */
public final class k1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f257167d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("MicroMsg.VLogDataManager");

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f257168e;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.j1(null);
    }

    public k1() {
        new java.util.LinkedList();
        new java.util.LinkedHashMap();
        new java.util.LinkedList();
        this.f257168e = new java.util.ArrayList();
        gm0.j1.d().a(1469, this);
        gm0.j1.d().a(2972, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof po4.a) {
            if (i17 == 0 && i18 == 0) {
                ((po4.a) m1Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("response");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VLogDataManager", "generate vlog from server error, errType = " + i17 + ", errCode = " + i18);
        }
    }
}
