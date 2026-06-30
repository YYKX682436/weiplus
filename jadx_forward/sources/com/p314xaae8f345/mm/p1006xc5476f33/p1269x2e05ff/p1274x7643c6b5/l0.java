package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class l0 implements qp1.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s f174715b;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f174715b = sVar;
        this.f174714a = c12886x91aa2b6d;
    }

    @Override // qp1.l0
    public void a() {
        android.util.SparseArray sparseArray = this.f174715b.f174752e;
        java.util.Set set = (java.util.Set) sparseArray.get(this.f174714a.f174579d);
        if (qp1.w.a(set)) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((sl4.b) ((qp1.i0) it.next())).a();
            }
        }
        java.util.Set set2 = (java.util.Set) sparseArray.get(0);
        if (qp1.w.a(set2)) {
            java.util.Iterator it6 = set2.iterator();
            while (it6.hasNext()) {
                ((sl4.b) ((qp1.i0) it6.next())).a();
            }
        }
    }

    @Override // qp1.l0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.G0(this.f174715b, this.f174714a, false);
    }

    @Override // qp1.l0
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.G0(this.f174715b, this.f174714a, true);
    }
}
