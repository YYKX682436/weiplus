package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class d1 extends l75.v0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f1 f275364e;

    public d1(com.p314xaae8f345.mm.p2621x8fb0427b.f1 f1Var) {
        this.f275364e = f1Var;
    }

    @Override // l75.v0
    public boolean g() {
        return true;
    }

    @Override // l75.v0
    public void h(java.lang.Object obj, java.lang.Object obj2) {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.z1) obj).a(this.f275364e, (com.p314xaae8f345.mm.p2621x8fb0427b.x1) obj2);
    }

    @Override // l75.v0
    public void i(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x1) obj;
        java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.p2621x8fb0427b.l2.class)).all()).iterator();
        while (true) {
            fs.f fVar = (fs.f) it;
            if (!fVar.hasNext()) {
                return;
            }
            xw.m1 m1Var = (xw.m1) ((com.p314xaae8f345.mm.p2621x8fb0427b.l2) ((fs.q) fVar.next()).get());
            m1Var.getClass();
            yq1.n.a("UpdateBizMainCellThread", new xw.l1(m1Var, this.f275364e, x1Var), 0L);
        }
    }
}
