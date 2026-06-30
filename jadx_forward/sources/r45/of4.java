package r45;

/* loaded from: classes4.dex */
public class of4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f463757d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f463758e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of4)) {
            return false;
        }
        r45.of4 of4Var = (r45.of4) fVar;
        return n51.f.a(this.f463757d, of4Var.f463757d) && n51.f.a(java.lang.Integer.valueOf(this.f463758e), java.lang.Integer.valueOf(of4Var.f463758e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463757d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            fVar.e(2, this.f463758e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, linkedList) + 0 + b36.f.e(2, this.f463758e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.of4 of4Var = (r45.of4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            of4Var.f463757d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        of4Var.f463758e = aVar2.g(intValue);
        return 0;
    }
}
