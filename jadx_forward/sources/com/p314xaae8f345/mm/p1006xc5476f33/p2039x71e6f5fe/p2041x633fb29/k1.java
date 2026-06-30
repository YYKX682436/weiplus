package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g1 f240476d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g1 g1Var) {
        super(2);
        this.f240476d = g1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1 decodeInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decodeInfo, "decodeInfo");
        if (decodeInfo.f240468b == 0) {
            java.util.Iterator it = this.f240476d.f240444b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsResourceManager", "checkFinish finish");
                    z17 = true;
                    break;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1) it.next()).f240469c != 2) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.g1 g1Var = this.f240476d;
                java.util.Iterator it6 = g1Var.f240444b.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        g1Var.f240445c = 0;
                        g1Var.f240446d = "ok";
                        break;
                    }
                    int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.i1) it6.next()).f240468b;
                    if (i17 != 0) {
                        g1Var.f240445c = i17;
                        g1Var.f240446d = i17 != 0 ? i17 == 2 ? "image not exist" : i17 == 3 ? "decode fail" : "unknown error" : "ok";
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.j1(this.f240476d));
            }
        }
        return jz5.f0.f384359a;
    }
}
