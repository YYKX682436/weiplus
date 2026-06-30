package r45;

/* loaded from: classes4.dex */
public class nf7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f462900d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f462901e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f462902f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nf7)) {
            return false;
        }
        r45.nf7 nf7Var = (r45.nf7) fVar;
        return n51.f.a(this.f462900d, nf7Var.f462900d) && n51.f.a(java.lang.Boolean.valueOf(this.f462901e), java.lang.Boolean.valueOf(nf7Var.f462901e)) && n51.f.a(this.f462902f, nf7Var.f462902f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462902f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f462900d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.mo75928xcd1e8d8());
                this.f462900d.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f462901e);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f462900d;
            return (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f462901e) + b36.f.g(3, 1, linkedList);
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
        r45.nf7 nf7Var = (r45.nf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                nf7Var.f462901e = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            nf7Var.f462902f.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr2 != null && bArr2.length > 0) {
                cf7Var3.mo11468x92b714fd(bArr2);
            }
            nf7Var.f462900d = cf7Var3;
        }
        return 0;
    }
}
