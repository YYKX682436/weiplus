package r45;

/* loaded from: classes2.dex */
public class s9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467102d;

    /* renamed from: e, reason: collision with root package name */
    public long f467103e;

    /* renamed from: f, reason: collision with root package name */
    public int f467104f;

    /* renamed from: g, reason: collision with root package name */
    public int f467105g;

    /* renamed from: h, reason: collision with root package name */
    public int f467106h;

    /* renamed from: i, reason: collision with root package name */
    public long f467107i;

    /* renamed from: m, reason: collision with root package name */
    public int f467108m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467109n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s9)) {
            return false;
        }
        r45.s9 s9Var = (r45.s9) fVar;
        return n51.f.a(this.f467102d, s9Var.f467102d) && n51.f.a(java.lang.Long.valueOf(this.f467103e), java.lang.Long.valueOf(s9Var.f467103e)) && n51.f.a(java.lang.Integer.valueOf(this.f467104f), java.lang.Integer.valueOf(s9Var.f467104f)) && n51.f.a(java.lang.Integer.valueOf(this.f467105g), java.lang.Integer.valueOf(s9Var.f467105g)) && n51.f.a(java.lang.Integer.valueOf(this.f467106h), java.lang.Integer.valueOf(s9Var.f467106h)) && n51.f.a(java.lang.Long.valueOf(this.f467107i), java.lang.Long.valueOf(s9Var.f467107i)) && n51.f.a(java.lang.Integer.valueOf(this.f467108m), java.lang.Integer.valueOf(s9Var.f467108m)) && n51.f.a(this.f467109n, s9Var.f467109n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467102d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f467103e);
            fVar.e(3, this.f467104f);
            fVar.e(4, this.f467105g);
            fVar.e(5, this.f467106h);
            fVar.h(6, this.f467107i);
            fVar.e(7, this.f467108m);
            java.lang.String str2 = this.f467109n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467102d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f467103e) + b36.f.e(3, this.f467104f) + b36.f.e(4, this.f467105g) + b36.f.e(5, this.f467106h) + b36.f.h(6, this.f467107i) + b36.f.e(7, this.f467108m);
            java.lang.String str4 = this.f467109n;
            return str4 != null ? j17 + b36.f.j(8, str4) : j17;
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
        r45.s9 s9Var = (r45.s9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s9Var.f467102d = aVar2.k(intValue);
                return 0;
            case 2:
                s9Var.f467103e = aVar2.i(intValue);
                return 0;
            case 3:
                s9Var.f467104f = aVar2.g(intValue);
                return 0;
            case 4:
                s9Var.f467105g = aVar2.g(intValue);
                return 0;
            case 5:
                s9Var.f467106h = aVar2.g(intValue);
                return 0;
            case 6:
                s9Var.f467107i = aVar2.i(intValue);
                return 0;
            case 7:
                s9Var.f467108m = aVar2.g(intValue);
                return 0;
            case 8:
                s9Var.f467109n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
