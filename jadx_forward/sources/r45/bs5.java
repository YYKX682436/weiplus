package r45;

/* loaded from: classes11.dex */
public class bs5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452558d;

    /* renamed from: e, reason: collision with root package name */
    public int f452559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452560f;

    /* renamed from: g, reason: collision with root package name */
    public int f452561g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f452562h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452563i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452564m;

    /* renamed from: n, reason: collision with root package name */
    public int f452565n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bs5)) {
            return false;
        }
        r45.bs5 bs5Var = (r45.bs5) fVar;
        return n51.f.a(this.f452558d, bs5Var.f452558d) && n51.f.a(java.lang.Integer.valueOf(this.f452559e), java.lang.Integer.valueOf(bs5Var.f452559e)) && n51.f.a(this.f452560f, bs5Var.f452560f) && n51.f.a(java.lang.Integer.valueOf(this.f452561g), java.lang.Integer.valueOf(bs5Var.f452561g)) && n51.f.a(this.f452562h, bs5Var.f452562h) && n51.f.a(this.f452563i, bs5Var.f452563i) && n51.f.a(this.f452564m, bs5Var.f452564m) && n51.f.a(java.lang.Integer.valueOf(this.f452565n), java.lang.Integer.valueOf(bs5Var.f452565n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452558d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f452559e);
            java.lang.String str2 = this.f452560f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f452561g);
            fVar.g(5, 8, this.f452562h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452563i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str3 = this.f452564m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f452565n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f452558d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f452559e);
            java.lang.String str5 = this.f452560f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int e17 = j17 + b36.f.e(4, this.f452561g) + b36.f.g(5, 8, this.f452562h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452563i;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str6 = this.f452564m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f452565n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f452562h.clear();
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
        r45.bs5 bs5Var = (r45.bs5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bs5Var.f452558d = aVar2.k(intValue);
                return 0;
            case 2:
                bs5Var.f452559e = aVar2.g(intValue);
                return 0;
            case 3:
                bs5Var.f452560f = aVar2.k(intValue);
                return 0;
            case 4:
                bs5Var.f452561g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y56 y56Var = new r45.y56();
                    if (bArr2 != null && bArr2.length > 0) {
                        y56Var.mo11468x92b714fd(bArr2);
                    }
                    bs5Var.f452562h.add(y56Var);
                }
                return 0;
            case 6:
                bs5Var.f452563i = aVar2.d(intValue);
                return 0;
            case 7:
                bs5Var.f452564m = aVar2.k(intValue);
                return 0;
            case 8:
                bs5Var.f452565n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
