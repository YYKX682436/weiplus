package pj4;

/* loaded from: classes9.dex */
public class k2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f436692d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f436693e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436694f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.k2)) {
            return false;
        }
        pj4.k2 k2Var = (pj4.k2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f436692d), java.lang.Integer.valueOf(k2Var.f436692d)) && n51.f.a(this.f436693e, k2Var.f436693e) && n51.f.a(this.f436694f, k2Var.f436694f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f436694f;
        java.util.LinkedList linkedList2 = this.f436693e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f436692d);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f436692d) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        pj4.k2 k2Var = (pj4.k2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k2Var.f436692d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            k2Var.f436693e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        k2Var.f436694f.add(aVar2.k(intValue));
        return 0;
    }
}
