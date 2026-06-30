package m53;

/* loaded from: classes4.dex */
public class e5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f405191d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405192e;

    /* renamed from: f, reason: collision with root package name */
    public int f405193f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e5)) {
            return false;
        }
        m53.e5 e5Var = (m53.e5) fVar;
        return n51.f.a(this.f405191d, e5Var.f405191d) && n51.f.a(this.f405192e, e5Var.f405192e) && n51.f.a(java.lang.Integer.valueOf(this.f405193f), java.lang.Integer.valueOf(e5Var.f405193f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405191d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f405192e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f405193f);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str2 = this.f405192e;
            if (str2 != null) {
                g17 += b36.f.j(2, str2);
            }
            return g17 + b36.f.e(3, this.f405193f);
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
        m53.e5 e5Var = (m53.e5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e5Var.f405191d.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            e5Var.f405192e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        e5Var.f405193f = aVar2.g(intValue);
        return 0;
    }
}
