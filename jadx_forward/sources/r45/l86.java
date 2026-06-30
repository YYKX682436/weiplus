package r45;

/* loaded from: classes4.dex */
public class l86 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460763d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f460764e;

    /* renamed from: f, reason: collision with root package name */
    public int f460765f;

    /* renamed from: g, reason: collision with root package name */
    public int f460766g;

    /* renamed from: h, reason: collision with root package name */
    public int f460767h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460768i;

    /* renamed from: m, reason: collision with root package name */
    public int f460769m;

    /* renamed from: n, reason: collision with root package name */
    public int f460770n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l86)) {
            return false;
        }
        r45.l86 l86Var = (r45.l86) fVar;
        return n51.f.a(this.f460763d, l86Var.f460763d) && n51.f.a(this.f460764e, l86Var.f460764e) && n51.f.a(java.lang.Integer.valueOf(this.f460765f), java.lang.Integer.valueOf(l86Var.f460765f)) && n51.f.a(java.lang.Integer.valueOf(this.f460766g), java.lang.Integer.valueOf(l86Var.f460766g)) && n51.f.a(java.lang.Integer.valueOf(this.f460767h), java.lang.Integer.valueOf(l86Var.f460767h)) && n51.f.a(this.f460768i, l86Var.f460768i) && n51.f.a(java.lang.Integer.valueOf(this.f460769m), java.lang.Integer.valueOf(l86Var.f460769m)) && n51.f.a(java.lang.Integer.valueOf(this.f460770n), java.lang.Integer.valueOf(l86Var.f460770n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460763d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.cu5 cu5Var = this.f460764e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f460764e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f460765f);
            fVar.e(4, this.f460766g);
            fVar.e(5, this.f460767h);
            java.lang.String str2 = this.f460768i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f460769m);
            fVar.e(8, this.f460770n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f460763d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.cu5 cu5Var2 = this.f460764e;
            if (cu5Var2 != null) {
                j17 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(3, this.f460765f) + b36.f.e(4, this.f460766g) + b36.f.e(5, this.f460767h);
            java.lang.String str4 = this.f460768i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            return e17 + b36.f.e(7, this.f460769m) + b36.f.e(8, this.f460770n);
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
        r45.l86 l86Var = (r45.l86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                l86Var.f460763d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    l86Var.f460764e = cu5Var3;
                }
                return 0;
            case 3:
                l86Var.f460765f = aVar2.g(intValue);
                return 0;
            case 4:
                l86Var.f460766g = aVar2.g(intValue);
                return 0;
            case 5:
                l86Var.f460767h = aVar2.g(intValue);
                return 0;
            case 6:
                l86Var.f460768i = aVar2.k(intValue);
                return 0;
            case 7:
                l86Var.f460769m = aVar2.g(intValue);
                return 0;
            case 8:
                l86Var.f460770n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
