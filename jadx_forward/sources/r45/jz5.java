package r45;

/* loaded from: classes4.dex */
public class jz5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459763d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f459764e;

    /* renamed from: f, reason: collision with root package name */
    public int f459765f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f459766g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jz5)) {
            return false;
        }
        r45.jz5 jz5Var = (r45.jz5) fVar;
        return n51.f.a(this.f459763d, jz5Var.f459763d) && n51.f.a(this.f459764e, jz5Var.f459764e) && n51.f.a(java.lang.Integer.valueOf(this.f459765f), java.lang.Integer.valueOf(jz5Var.f459765f)) && n51.f.a(this.f459766g, jz5Var.f459766g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459766g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459763d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f459764e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f459765f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f459763d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f459764e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f459765f) + b36.f.g(4, 8, linkedList);
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
        r45.jz5 jz5Var = (r45.jz5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jz5Var.f459763d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jz5Var.f459764e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            jz5Var.f459765f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.lk5 lk5Var = new r45.lk5();
            if (bArr2 != null && bArr2.length > 0) {
                lk5Var.mo11468x92b714fd(bArr2);
            }
            jz5Var.f459766g.add(lk5Var);
        }
        return 0;
    }
}
