package r45;

/* loaded from: classes10.dex */
public class cy5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453456d;

    /* renamed from: e, reason: collision with root package name */
    public int f453457e;

    /* renamed from: f, reason: collision with root package name */
    public int f453458f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f453459g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453460h;

    /* renamed from: i, reason: collision with root package name */
    public int f453461i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f453462m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f453463n;

    /* renamed from: o, reason: collision with root package name */
    public int f453464o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cy5)) {
            return false;
        }
        r45.cy5 cy5Var = (r45.cy5) fVar;
        return n51.f.a(this.f453456d, cy5Var.f453456d) && n51.f.a(java.lang.Integer.valueOf(this.f453457e), java.lang.Integer.valueOf(cy5Var.f453457e)) && n51.f.a(java.lang.Integer.valueOf(this.f453458f), java.lang.Integer.valueOf(cy5Var.f453458f)) && n51.f.a(this.f453459g, cy5Var.f453459g) && n51.f.a(this.f453460h, cy5Var.f453460h) && n51.f.a(java.lang.Integer.valueOf(this.f453461i), java.lang.Integer.valueOf(cy5Var.f453461i)) && n51.f.a(this.f453462m, cy5Var.f453462m) && n51.f.a(this.f453463n, cy5Var.f453463n) && n51.f.a(java.lang.Integer.valueOf(this.f453464o), java.lang.Integer.valueOf(cy5Var.f453464o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453456d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f453457e);
            fVar.e(3, this.f453458f);
            fVar.g(4, 1, this.f453459g);
            java.lang.String str2 = this.f453460h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f453461i);
            java.lang.String str3 = this.f453462m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f453463n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f453464o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f453456d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f453457e) + b36.f.e(3, this.f453458f) + b36.f.g(4, 1, this.f453459g);
            java.lang.String str6 = this.f453460h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            int e17 = j17 + b36.f.e(6, this.f453461i);
            java.lang.String str7 = this.f453462m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f453463n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f453464o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453459g.clear();
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
        r45.cy5 cy5Var = (r45.cy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cy5Var.f453456d = aVar2.k(intValue);
                return 0;
            case 2:
                cy5Var.f453457e = aVar2.g(intValue);
                return 0;
            case 3:
                cy5Var.f453458f = aVar2.g(intValue);
                return 0;
            case 4:
                cy5Var.f453459g.add(aVar2.k(intValue));
                return 0;
            case 5:
                cy5Var.f453460h = aVar2.k(intValue);
                return 0;
            case 6:
                cy5Var.f453461i = aVar2.g(intValue);
                return 0;
            case 7:
                cy5Var.f453462m = aVar2.k(intValue);
                return 0;
            case 8:
                cy5Var.f453463n = aVar2.k(intValue);
                return 0;
            case 9:
                cy5Var.f453464o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
