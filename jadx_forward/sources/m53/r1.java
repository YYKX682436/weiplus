package m53;

/* loaded from: classes2.dex */
public class r1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f405533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f405534e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405535f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f405536g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.r1)) {
            return false;
        }
        m53.r1 r1Var = (m53.r1) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f405533d), java.lang.Boolean.valueOf(r1Var.f405533d)) && n51.f.a(java.lang.Boolean.valueOf(this.f405534e), java.lang.Boolean.valueOf(r1Var.f405534e)) && n51.f.a(this.f405535f, r1Var.f405535f) && n51.f.a(java.lang.Boolean.valueOf(this.f405536g), java.lang.Boolean.valueOf(r1Var.f405536g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405535f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f405533d);
            fVar.a(2, this.f405534e);
            fVar.g(3, 1, linkedList);
            fVar.a(4, this.f405536g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f405533d) + 0 + b36.f.a(2, this.f405534e) + b36.f.g(3, 1, linkedList) + b36.f.a(4, this.f405536g);
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
        m53.r1 r1Var = (m53.r1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            r1Var.f405533d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            r1Var.f405534e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            r1Var.f405535f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        r1Var.f405536g = aVar2.c(intValue);
        return 0;
    }
}
