package r45;

/* loaded from: classes7.dex */
public class ac7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451459d;

    /* renamed from: e, reason: collision with root package name */
    public int f451460e;

    /* renamed from: f, reason: collision with root package name */
    public int f451461f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451462g;

    /* renamed from: h, reason: collision with root package name */
    public int f451463h;

    /* renamed from: i, reason: collision with root package name */
    public int f451464i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac7)) {
            return false;
        }
        r45.ac7 ac7Var = (r45.ac7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451459d), java.lang.Integer.valueOf(ac7Var.f451459d)) && n51.f.a(java.lang.Integer.valueOf(this.f451460e), java.lang.Integer.valueOf(ac7Var.f451460e)) && n51.f.a(java.lang.Integer.valueOf(this.f451461f), java.lang.Integer.valueOf(ac7Var.f451461f)) && n51.f.a(this.f451462g, ac7Var.f451462g) && n51.f.a(java.lang.Integer.valueOf(this.f451463h), java.lang.Integer.valueOf(ac7Var.f451463h)) && n51.f.a(java.lang.Integer.valueOf(this.f451464i), java.lang.Integer.valueOf(ac7Var.f451464i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451459d);
            fVar.e(2, this.f451460e);
            fVar.e(3, this.f451461f);
            java.lang.String str = this.f451462g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f451463h);
            fVar.e(6, this.f451464i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451459d) + 0 + b36.f.e(2, this.f451460e) + b36.f.e(3, this.f451461f);
            java.lang.String str2 = this.f451462g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            return e17 + b36.f.e(5, this.f451463h) + b36.f.e(6, this.f451464i);
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
        r45.ac7 ac7Var = (r45.ac7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ac7Var.f451459d = aVar2.g(intValue);
                return 0;
            case 2:
                ac7Var.f451460e = aVar2.g(intValue);
                return 0;
            case 3:
                ac7Var.f451461f = aVar2.g(intValue);
                return 0;
            case 4:
                ac7Var.f451462g = aVar2.k(intValue);
                return 0;
            case 5:
                ac7Var.f451463h = aVar2.g(intValue);
                return 0;
            case 6:
                ac7Var.f451464i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
