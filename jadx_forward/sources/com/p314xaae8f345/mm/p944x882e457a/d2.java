package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152140e;

    public d2(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var, int i17) {
        this.f152140e = r1Var;
        this.f152139d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f152140e;
        int i17 = this.f152139d;
        synchronized (r1Var.f152306p) {
            java.util.Iterator it = r1Var.f152300g.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
                if (m1Var != null && m1Var.hashCode() == i17) {
                    r1Var.d(m1Var);
                    return;
                }
            }
            java.util.Iterator it6 = r1Var.f152301h.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var2 = (com.p314xaae8f345.mm.p944x882e457a.m1) it6.next();
                if (m1Var2 != null && m1Var2.hashCode() == i17) {
                    r1Var.d(m1Var2);
                    r1Var.e();
                    return;
                }
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m47950x9616526c() {
        return super.toString() + "|cancelImp_" + this.f152139d;
    }
}
