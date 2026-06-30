package r45;

/* loaded from: classes8.dex */
public class ex6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455323d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455324e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f455325f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.c1 f455326g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex6)) {
            return false;
        }
        r45.ex6 ex6Var = (r45.ex6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455323d), java.lang.Integer.valueOf(ex6Var.f455323d)) && n51.f.a(this.f455324e, ex6Var.f455324e) && n51.f.a(this.f455325f, ex6Var.f455325f) && n51.f.a(this.f455326g, ex6Var.f455326g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455323d);
            java.lang.String str = this.f455324e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f455325f);
            r45.c1 c1Var = this.f455326g;
            if (c1Var != null) {
                fVar.i(4, c1Var.mo75928xcd1e8d8());
                this.f455326g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455323d) + 0;
            java.lang.String str2 = this.f455324e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f455325f);
            r45.c1 c1Var2 = this.f455326g;
            return c1Var2 != null ? g17 + b36.f.i(4, c1Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f455325f.clear();
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
        r45.ex6 ex6Var = (r45.ex6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ex6Var.f455323d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ex6Var.f455324e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.b1 b1Var = new r45.b1();
                if (bArr2 != null && bArr2.length > 0) {
                    b1Var.mo11468x92b714fd(bArr2);
                }
                ex6Var.f455325f.add(b1Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.c1 c1Var3 = new r45.c1();
            if (bArr3 != null && bArr3.length > 0) {
                c1Var3.mo11468x92b714fd(bArr3);
            }
            ex6Var.f455326g = c1Var3;
        }
        return 0;
    }
}
