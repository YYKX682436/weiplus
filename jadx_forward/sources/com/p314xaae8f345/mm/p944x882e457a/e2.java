package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152147e;

    public e2(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, int i17) {
        this.f152147e = r1Var;
        this.f152146d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f152147e;
        int i17 = this.f152146d;
        synchronized (r1Var.f152306p) {
            java.util.Iterator it = r1Var.f152300g.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
                if (m1Var != null && m1Var.hashCode() == i17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(m1Var.hashCode()));
                    m1Var.mo9408xae7a2e7a();
                    it.remove();
                }
            }
            com.p314xaae8f345.mm.p944x882e457a.k2.f152193a.a();
            java.util.Iterator it6 = r1Var.f152301h.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = (com.p314xaae8f345.mm.p944x882e457a.m1) it6.next();
                if (m1Var2 != null && m1Var2.hashCode() == i17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(m1Var2.hashCode()));
                    m1Var2.mo9408xae7a2e7a();
                    it6.remove();
                }
            }
            r1Var.e();
        }
    }

    /* renamed from: toString */
    public java.lang.String m47955x9616526c() {
        return super.toString() + "|cancelImp_" + this.f152146d;
    }
}
