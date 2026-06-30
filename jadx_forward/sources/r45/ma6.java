package r45;

/* loaded from: classes4.dex */
public class ma6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461844d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461845e;

    /* renamed from: f, reason: collision with root package name */
    public int f461846f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461847g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ma6)) {
            return false;
        }
        r45.ma6 ma6Var = (r45.ma6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461844d), java.lang.Long.valueOf(ma6Var.f461844d)) && n51.f.a(this.f461845e, ma6Var.f461845e) && n51.f.a(java.lang.Integer.valueOf(this.f461846f), java.lang.Integer.valueOf(ma6Var.f461846f)) && n51.f.a(this.f461847g, ma6Var.f461847g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461847g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f461844d);
            java.lang.String str = this.f461845e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f461846f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f461844d) + 0;
            java.lang.String str2 = this.f461845e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f461846f) + b36.f.g(4, 8, linkedList);
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
        r45.ma6 ma6Var = (r45.ma6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ma6Var.f461844d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            ma6Var.f461845e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ma6Var.f461846f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.du5 du5Var = new r45.du5();
            if (bArr2 != null && bArr2.length > 0) {
                du5Var.b(bArr2);
            }
            ma6Var.f461847g.add(du5Var);
        }
        return 0;
    }
}
