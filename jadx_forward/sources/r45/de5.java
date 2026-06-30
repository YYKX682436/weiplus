package r45;

/* loaded from: classes12.dex */
public class de5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f453887d;

    /* renamed from: e, reason: collision with root package name */
    public int f453888e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453889f;

    /* renamed from: g, reason: collision with root package name */
    public int f453890g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453891h;

    /* renamed from: i, reason: collision with root package name */
    public int f453892i;

    /* renamed from: m, reason: collision with root package name */
    public int f453893m;

    /* renamed from: n, reason: collision with root package name */
    public int f453894n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453895o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453896p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de5)) {
            return false;
        }
        r45.de5 de5Var = (r45.de5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f453887d), java.lang.Integer.valueOf(de5Var.f453887d)) && n51.f.a(java.lang.Integer.valueOf(this.f453888e), java.lang.Integer.valueOf(de5Var.f453888e)) && n51.f.a(this.f453889f, de5Var.f453889f) && n51.f.a(java.lang.Integer.valueOf(this.f453890g), java.lang.Integer.valueOf(de5Var.f453890g)) && n51.f.a(this.f453891h, de5Var.f453891h) && n51.f.a(java.lang.Integer.valueOf(this.f453892i), java.lang.Integer.valueOf(de5Var.f453892i)) && n51.f.a(java.lang.Integer.valueOf(this.f453893m), java.lang.Integer.valueOf(de5Var.f453893m)) && n51.f.a(java.lang.Integer.valueOf(this.f453894n), java.lang.Integer.valueOf(de5Var.f453894n)) && n51.f.a(this.f453895o, de5Var.f453895o) && n51.f.a(this.f453896p, de5Var.f453896p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f453887d);
            fVar.e(2, this.f453888e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453889f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f453890g);
            java.lang.String str = this.f453891h;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f453892i);
            fVar.e(7, this.f453893m);
            fVar.e(8, this.f453894n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453895o;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f453896p;
            if (gVar3 != null) {
                fVar.b(10, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f453887d) + 0 + b36.f.e(2, this.f453888e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f453889f;
            if (gVar4 != null) {
                e17 += b36.f.b(3, gVar4);
            }
            int e18 = e17 + b36.f.e(4, this.f453890g);
            java.lang.String str2 = this.f453891h;
            if (str2 != null) {
                e18 += b36.f.j(5, str2);
            }
            int e19 = e18 + b36.f.e(6, this.f453892i) + b36.f.e(7, this.f453893m) + b36.f.e(8, this.f453894n);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f453895o;
            if (gVar5 != null) {
                e19 += b36.f.b(9, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f453896p;
            return gVar6 != null ? e19 + b36.f.b(10, gVar6) : e19;
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
        r45.de5 de5Var = (r45.de5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                de5Var.f453887d = aVar2.g(intValue);
                return 0;
            case 2:
                de5Var.f453888e = aVar2.g(intValue);
                return 0;
            case 3:
                de5Var.f453889f = aVar2.d(intValue);
                return 0;
            case 4:
                de5Var.f453890g = aVar2.g(intValue);
                return 0;
            case 5:
                de5Var.f453891h = aVar2.k(intValue);
                return 0;
            case 6:
                de5Var.f453892i = aVar2.g(intValue);
                return 0;
            case 7:
                de5Var.f453893m = aVar2.g(intValue);
                return 0;
            case 8:
                de5Var.f453894n = aVar2.g(intValue);
                return 0;
            case 9:
                de5Var.f453895o = aVar2.d(intValue);
                return 0;
            case 10:
                de5Var.f453896p = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
