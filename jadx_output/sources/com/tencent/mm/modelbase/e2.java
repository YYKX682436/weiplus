package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70614e;

    public e2(com.tencent.mm.modelbase.r1 r1Var, int i17) {
        this.f70614e = r1Var;
        this.f70613d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 r1Var = this.f70614e;
        int i17 = this.f70613d;
        synchronized (r1Var.f70773p) {
            java.util.Iterator it = r1Var.f70767g.iterator();
            while (it.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
                if (m1Var != null && m1Var.hashCode() == i17) {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(m1Var.hashCode()));
                    m1Var.cancel();
                    it.remove();
                }
            }
            com.tencent.mm.modelbase.k2.f70660a.a();
            java.util.Iterator it6 = r1Var.f70768h.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var2 = (com.tencent.mm.modelbase.m1) it6.next();
                if (m1Var2 != null && m1Var2.hashCode() == i17) {
                    com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(m1Var2.hashCode()));
                    m1Var2.cancel();
                    it6.remove();
                }
            }
            r1Var.e();
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|cancelImp_" + this.f70613d;
    }
}
