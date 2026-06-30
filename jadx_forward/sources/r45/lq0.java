package r45;

/* loaded from: classes8.dex */
public class lq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f461249d;

    /* renamed from: e, reason: collision with root package name */
    public r45.c50 f461250e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f461251f;

    /* renamed from: g, reason: collision with root package name */
    public int f461252g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq0)) {
            return false;
        }
        r45.lq0 lq0Var = (r45.lq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461249d), java.lang.Integer.valueOf(lq0Var.f461249d)) && n51.f.a(this.f461250e, lq0Var.f461250e) && n51.f.a(this.f461251f, lq0Var.f461251f) && n51.f.a(java.lang.Integer.valueOf(this.f461252g), java.lang.Integer.valueOf(lq0Var.f461252g));
    }

    @Override // r45.k66
    /* renamed from: getRet */
    public final int mo161589xb588696b() {
        return this.f461249d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461249d);
            r45.c50 c50Var = this.f461250e;
            if (c50Var != null) {
                fVar.i(2, c50Var.mo75928xcd1e8d8());
                this.f461250e.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f461251f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f461251f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f461252g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461249d) + 0;
            r45.c50 c50Var2 = this.f461250e;
            if (c50Var2 != null) {
                e17 += b36.f.i(2, c50Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var2 = this.f461251f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(4, this.f461252g);
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
        r45.lq0 lq0Var = (r45.lq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lq0Var.f461249d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.c50 c50Var3 = new r45.c50();
                if (bArr != null && bArr.length > 0) {
                    c50Var3.mo11468x92b714fd(bArr);
                }
                lq0Var.f461250e = c50Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            lq0Var.f461252g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var3.b(bArr2);
            }
            lq0Var.f461251f = cu5Var3;
        }
        return 0;
    }
}
