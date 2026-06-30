package r45;

/* loaded from: classes8.dex */
public class fk5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f455945d;

    /* renamed from: e, reason: collision with root package name */
    public r45.i34 f455946e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f455947f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fk5)) {
            return false;
        }
        r45.fk5 fk5Var = (r45.fk5) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f455945d), java.lang.Boolean.valueOf(fk5Var.f455945d)) && n51.f.a(this.f455946e, fk5Var.f455946e) && n51.f.a(this.f455947f, fk5Var.f455947f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455947f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f455945d);
            r45.i34 i34Var = this.f455946e;
            if (i34Var != null) {
                fVar.i(2, i34Var.mo75928xcd1e8d8());
                this.f455946e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f455945d) + 0;
            r45.i34 i34Var2 = this.f455946e;
            if (i34Var2 != null) {
                a17 += b36.f.i(2, i34Var2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.g(3, 8, linkedList);
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
        r45.fk5 fk5Var = (r45.fk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fk5Var.f455945d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.i34 i34Var3 = new r45.i34();
                if (bArr2 != null && bArr2.length > 0) {
                    i34Var3.mo11468x92b714fd(bArr2);
                }
                fk5Var.f455946e = i34Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.i34 i34Var4 = new r45.i34();
            if (bArr3 != null && bArr3.length > 0) {
                i34Var4.mo11468x92b714fd(bArr3);
            }
            fk5Var.f455947f.add(i34Var4);
        }
        return 0;
    }
}
