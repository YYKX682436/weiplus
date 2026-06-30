package m53;

/* loaded from: classes2.dex */
public class c5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405137d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405138e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f405139f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.c5)) {
            return false;
        }
        m53.c5 c5Var = (m53.c5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405137d), java.lang.Boolean.valueOf(c5Var.f405137d)) && n51.f.a(this.f405138e, c5Var.f405138e) && n51.f.a(java.lang.Integer.valueOf(this.f405139f), java.lang.Integer.valueOf(c5Var.f405139f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405138e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405137d);
            fVar.g(3, 1, linkedList);
            fVar.e(4, this.f405139f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f405137d) + 0 + b36.f.g(3, 1, linkedList) + b36.f.e(4, this.f405139f);
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
        m53.c5 c5Var = (m53.c5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c5Var.f405137d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            c5Var.f405138e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c5Var.f405139f = aVar2.g(intValue);
        return 0;
    }
}
