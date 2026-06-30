package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70607e;

    public d2(com.tencent.mm.modelbase.r1 r1Var, int i17) {
        this.f70607e = r1Var;
        this.f70606d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 r1Var = this.f70607e;
        int i17 = this.f70606d;
        synchronized (r1Var.f70773p) {
            java.util.Iterator it = r1Var.f70767g.iterator();
            while (it.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var = (com.tencent.mm.modelbase.m1) it.next();
                if (m1Var != null && m1Var.hashCode() == i17) {
                    r1Var.d(m1Var);
                    return;
                }
            }
            java.util.Iterator it6 = r1Var.f70768h.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.modelbase.m1 m1Var2 = (com.tencent.mm.modelbase.m1) it6.next();
                if (m1Var2 != null && m1Var2.hashCode() == i17) {
                    r1Var.d(m1Var2);
                    r1Var.e();
                    return;
                }
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|cancelImp_" + this.f70606d;
    }
}
