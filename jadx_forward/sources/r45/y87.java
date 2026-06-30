package r45;

/* loaded from: classes4.dex */
public class y87 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472397d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472398e;

    /* renamed from: f, reason: collision with root package name */
    public int f472399f;

    /* renamed from: g, reason: collision with root package name */
    public int f472400g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472401h;

    /* renamed from: i, reason: collision with root package name */
    public int f472402i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472403m;

    /* renamed from: n, reason: collision with root package name */
    public int f472404n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472405o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y87)) {
            return false;
        }
        r45.y87 y87Var = (r45.y87) fVar;
        return n51.f.a(this.f472397d, y87Var.f472397d) && n51.f.a(this.f472398e, y87Var.f472398e) && n51.f.a(java.lang.Integer.valueOf(this.f472399f), java.lang.Integer.valueOf(y87Var.f472399f)) && n51.f.a(java.lang.Integer.valueOf(this.f472400g), java.lang.Integer.valueOf(y87Var.f472400g)) && n51.f.a(this.f472401h, y87Var.f472401h) && n51.f.a(java.lang.Integer.valueOf(this.f472402i), java.lang.Integer.valueOf(y87Var.f472402i)) && n51.f.a(this.f472403m, y87Var.f472403m) && n51.f.a(java.lang.Integer.valueOf(this.f472404n), java.lang.Integer.valueOf(y87Var.f472404n)) && n51.f.a(this.f472405o, y87Var.f472405o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472397d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472398e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f472399f);
            fVar.e(4, this.f472400g);
            java.lang.String str3 = this.f472401h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f472402i);
            java.lang.String str4 = this.f472403m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f472404n);
            java.lang.String str5 = this.f472405o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f472397d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f472398e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int e17 = j17 + b36.f.e(3, this.f472399f) + b36.f.e(4, this.f472400g);
            java.lang.String str8 = this.f472401h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            int e18 = e17 + b36.f.e(6, this.f472402i);
            java.lang.String str9 = this.f472403m;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            int e19 = e18 + b36.f.e(8, this.f472404n);
            java.lang.String str10 = this.f472405o;
            return str10 != null ? e19 + b36.f.j(9, str10) : e19;
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
        r45.y87 y87Var = (r45.y87) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y87Var.f472397d = aVar2.k(intValue);
                return 0;
            case 2:
                y87Var.f472398e = aVar2.k(intValue);
                return 0;
            case 3:
                y87Var.f472399f = aVar2.g(intValue);
                return 0;
            case 4:
                y87Var.f472400g = aVar2.g(intValue);
                return 0;
            case 5:
                y87Var.f472401h = aVar2.k(intValue);
                return 0;
            case 6:
                y87Var.f472402i = aVar2.g(intValue);
                return 0;
            case 7:
                y87Var.f472403m = aVar2.k(intValue);
                return 0;
            case 8:
                y87Var.f472404n = aVar2.g(intValue);
                return 0;
            case 9:
                y87Var.f472405o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
