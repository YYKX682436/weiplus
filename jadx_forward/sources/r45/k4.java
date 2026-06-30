package r45;

/* loaded from: classes9.dex */
public class k4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f459878d;

    /* renamed from: e, reason: collision with root package name */
    public long f459879e;

    /* renamed from: f, reason: collision with root package name */
    public int f459880f;

    /* renamed from: g, reason: collision with root package name */
    public int f459881g;

    /* renamed from: h, reason: collision with root package name */
    public int f459882h;

    /* renamed from: i, reason: collision with root package name */
    public r45.du5 f459883i;

    /* renamed from: m, reason: collision with root package name */
    public int f459884m;

    /* renamed from: n, reason: collision with root package name */
    public int f459885n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k4)) {
            return false;
        }
        r45.k4 k4Var = (r45.k4) fVar;
        return n51.f.a(this.f459878d, k4Var.f459878d) && n51.f.a(java.lang.Long.valueOf(this.f459879e), java.lang.Long.valueOf(k4Var.f459879e)) && n51.f.a(java.lang.Integer.valueOf(this.f459880f), java.lang.Integer.valueOf(k4Var.f459880f)) && n51.f.a(java.lang.Integer.valueOf(this.f459881g), java.lang.Integer.valueOf(k4Var.f459881g)) && n51.f.a(java.lang.Integer.valueOf(this.f459882h), java.lang.Integer.valueOf(k4Var.f459882h)) && n51.f.a(this.f459883i, k4Var.f459883i) && n51.f.a(java.lang.Integer.valueOf(this.f459884m), java.lang.Integer.valueOf(k4Var.f459884m)) && n51.f.a(java.lang.Integer.valueOf(this.f459885n), java.lang.Integer.valueOf(k4Var.f459885n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.du5 du5Var = this.f459878d;
            if (du5Var != null) {
                fVar.i(1, du5Var.mo75928xcd1e8d8());
                this.f459878d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f459879e);
            fVar.e(3, this.f459880f);
            fVar.e(4, this.f459881g);
            fVar.e(5, this.f459882h);
            r45.du5 du5Var2 = this.f459883i;
            if (du5Var2 != null) {
                fVar.i(6, du5Var2.mo75928xcd1e8d8());
                this.f459883i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f459884m);
            fVar.e(8, this.f459885n);
            return 0;
        }
        if (i17 == 1) {
            r45.du5 du5Var3 = this.f459878d;
            int i18 = (du5Var3 != null ? 0 + b36.f.i(1, du5Var3.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f459879e) + b36.f.e(3, this.f459880f) + b36.f.e(4, this.f459881g) + b36.f.e(5, this.f459882h);
            r45.du5 du5Var4 = this.f459883i;
            if (du5Var4 != null) {
                i18 += b36.f.i(6, du5Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(7, this.f459884m) + b36.f.e(8, this.f459885n);
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
        r45.k4 k4Var = (r45.k4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var5.b(bArr);
                    }
                    k4Var.f459878d = du5Var5;
                }
                return 0;
            case 2:
                k4Var.f459879e = aVar2.i(intValue);
                return 0;
            case 3:
                k4Var.f459880f = aVar2.g(intValue);
                return 0;
            case 4:
                k4Var.f459881g = aVar2.g(intValue);
                return 0;
            case 5:
                k4Var.f459882h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var6.b(bArr2);
                    }
                    k4Var.f459883i = du5Var6;
                }
                return 0;
            case 7:
                k4Var.f459884m = aVar2.g(intValue);
                return 0;
            case 8:
                k4Var.f459885n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
