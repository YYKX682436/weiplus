package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class k0 implements qp1.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gp1.z f174708b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s f174709c;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, gp1.z zVar) {
        this.f174709c = sVar;
        this.f174707a = c12886x91aa2b6d;
        this.f174708b = zVar;
    }

    @Override // qp1.k0
    public void b(qp1.j0 j0Var) {
        android.util.SparseArray sparseArray = this.f174709c.f174752e;
        java.util.Set set = (java.util.Set) sparseArray.get(this.f174707a.f174579d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sl4.b) ((qp1.i0) it.next())).b(j0Var);
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((sl4.b) ((qp1.i0) it6.next())).b(j0Var);
            }
        }
        if (j0Var.h()) {
            pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.j0(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallService", "no float window permission");
        }
    }
}
