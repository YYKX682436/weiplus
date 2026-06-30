package r45;

/* loaded from: classes4.dex */
public class ms0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462321e;

    /* renamed from: f, reason: collision with root package name */
    public int f462322f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f462323g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ms0)) {
            return false;
        }
        r45.ms0 ms0Var = (r45.ms0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462320d), java.lang.Integer.valueOf(ms0Var.f462320d)) && n51.f.a(this.f462321e, ms0Var.f462321e) && n51.f.a(java.lang.Integer.valueOf(this.f462322f), java.lang.Integer.valueOf(ms0Var.f462322f)) && n51.f.a(this.f462323g, ms0Var.f462323g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462323g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462320d);
            java.lang.String str = this.f462321e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f462322f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462320d) + 0;
            java.lang.String str2 = this.f462321e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f462322f) + b36.f.g(4, 8, linkedList);
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
        r45.ms0 ms0Var = (r45.ms0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ms0Var.f462320d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ms0Var.f462321e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ms0Var.f462322f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.ks0 ks0Var = new r45.ks0();
            if (bArr2 != null && bArr2.length > 0) {
                ks0Var.mo11468x92b714fd(bArr2);
            }
            ms0Var.f462323g.add(ks0Var);
        }
        return 0;
    }
}
