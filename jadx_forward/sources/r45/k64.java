package r45;

/* loaded from: classes9.dex */
public class k64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f459967d = 0;

    /* renamed from: e, reason: collision with root package name */
    public r45.du4 f459968e;

    /* renamed from: f, reason: collision with root package name */
    public r45.m64 f459969f;

    /* renamed from: g, reason: collision with root package name */
    public int f459970g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k64)) {
            return false;
        }
        r45.k64 k64Var = (r45.k64) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f459967d), java.lang.Integer.valueOf(k64Var.f459967d)) && n51.f.a(this.f459968e, k64Var.f459968e) && n51.f.a(this.f459969f, k64Var.f459969f) && n51.f.a(java.lang.Integer.valueOf(this.f459970g), java.lang.Integer.valueOf(k64Var.f459970g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f459967d);
            r45.du4 du4Var = this.f459968e;
            if (du4Var != null) {
                fVar.i(2, du4Var.mo75928xcd1e8d8());
                this.f459968e.mo75956x3d5d1f78(fVar);
            }
            r45.m64 m64Var = this.f459969f;
            if (m64Var != null) {
                fVar.i(3, m64Var.mo75928xcd1e8d8());
                this.f459969f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f459970g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f459967d) + 0;
            r45.du4 du4Var2 = this.f459968e;
            if (du4Var2 != null) {
                e17 += b36.f.i(2, du4Var2.mo75928xcd1e8d8());
            }
            r45.m64 m64Var2 = this.f459969f;
            if (m64Var2 != null) {
                e17 += b36.f.i(3, m64Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(4, this.f459970g);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.k64 k64Var = (r45.k64) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k64Var.f459967d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.du4 du4Var3 = new r45.du4();
                if (bArr != null && bArr.length > 0) {
                    du4Var3.mo11468x92b714fd(bArr);
                }
                k64Var.f459968e = du4Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            k64Var.f459970g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.m64 m64Var3 = new r45.m64();
            if (bArr2 != null && bArr2.length > 0) {
                m64Var3.mo11468x92b714fd(bArr2);
            }
            k64Var.f459969f = m64Var3;
        }
        return 0;
    }
}
