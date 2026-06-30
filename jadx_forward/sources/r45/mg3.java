package r45;

/* loaded from: classes2.dex */
public class mg3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462002d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462003e;

    /* renamed from: f, reason: collision with root package name */
    public int f462004f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462005g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462006h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462007i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mg3)) {
            return false;
        }
        r45.mg3 mg3Var = (r45.mg3) fVar;
        return n51.f.a(this.f462002d, mg3Var.f462002d) && n51.f.a(this.f462003e, mg3Var.f462003e) && n51.f.a(java.lang.Integer.valueOf(this.f462004f), java.lang.Integer.valueOf(mg3Var.f462004f)) && n51.f.a(this.f462005g, mg3Var.f462005g) && n51.f.a(this.f462006h, mg3Var.f462006h) && n51.f.a(this.f462007i, mg3Var.f462007i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f462002d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f462003e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f462004f);
            java.lang.String str3 = this.f462005g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462006h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f462007i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f462002d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f462003e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f462004f);
            java.lang.String str8 = this.f462005g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f462006h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f462007i;
            return str10 != null ? e17 + b36.f.j(6, str10) : e17;
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
        r45.mg3 mg3Var = (r45.mg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mg3Var.f462002d = aVar2.k(intValue);
                return 0;
            case 2:
                mg3Var.f462003e = aVar2.k(intValue);
                return 0;
            case 3:
                mg3Var.f462004f = aVar2.g(intValue);
                return 0;
            case 4:
                mg3Var.f462005g = aVar2.k(intValue);
                return 0;
            case 5:
                mg3Var.f462006h = aVar2.k(intValue);
                return 0;
            case 6:
                mg3Var.f462007i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
