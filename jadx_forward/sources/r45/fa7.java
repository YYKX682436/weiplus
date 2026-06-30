package r45;

/* loaded from: classes8.dex */
public class fa7 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455685d;

    /* renamed from: e, reason: collision with root package name */
    public int f455686e;

    /* renamed from: f, reason: collision with root package name */
    public int f455687f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455688g;

    /* renamed from: h, reason: collision with root package name */
    public int f455689h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455690i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455691m;

    /* renamed from: n, reason: collision with root package name */
    public r45.n54 f455692n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455693o;

    /* renamed from: p, reason: collision with root package name */
    public int f455694p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa7)) {
            return false;
        }
        r45.fa7 fa7Var = (r45.fa7) fVar;
        return n51.f.a(this.f76494x2de60e5e, fa7Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455685d), java.lang.Integer.valueOf(fa7Var.f455685d)) && n51.f.a(java.lang.Integer.valueOf(this.f455686e), java.lang.Integer.valueOf(fa7Var.f455686e)) && n51.f.a(java.lang.Integer.valueOf(this.f455687f), java.lang.Integer.valueOf(fa7Var.f455687f)) && n51.f.a(this.f455688g, fa7Var.f455688g) && n51.f.a(java.lang.Integer.valueOf(this.f455689h), java.lang.Integer.valueOf(fa7Var.f455689h)) && n51.f.a(this.f455690i, fa7Var.f455690i) && n51.f.a(this.f455691m, fa7Var.f455691m) && n51.f.a(this.f455692n, fa7Var.f455692n) && n51.f.a(this.f455693o, fa7Var.f455693o) && n51.f.a(java.lang.Integer.valueOf(this.f455694p), java.lang.Integer.valueOf(fa7Var.f455694p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455685d);
            fVar.e(3, this.f455686e);
            fVar.e(4, this.f455687f);
            java.lang.String str = this.f455688g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f455689h);
            java.lang.String str2 = this.f455690i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f455691m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.n54 n54Var = this.f455692n;
            if (n54Var != null) {
                fVar.i(9, n54Var.mo75928xcd1e8d8());
                this.f455692n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f455693o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f455694p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455685d) + b36.f.e(3, this.f455686e) + b36.f.e(4, this.f455687f);
            java.lang.String str5 = this.f455688g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f455689h);
            java.lang.String str6 = this.f455690i;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f455691m;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            r45.n54 n54Var2 = this.f455692n;
            if (n54Var2 != null) {
                e17 += b36.f.i(9, n54Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f455693o;
            if (str8 != null) {
                e17 += b36.f.j(10, str8);
            }
            return e17 + b36.f.e(11, this.f455694p);
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
        r45.fa7 fa7Var = (r45.fa7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    fa7Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                fa7Var.f455685d = aVar2.g(intValue);
                return 0;
            case 3:
                fa7Var.f455686e = aVar2.g(intValue);
                return 0;
            case 4:
                fa7Var.f455687f = aVar2.g(intValue);
                return 0;
            case 5:
                fa7Var.f455688g = aVar2.k(intValue);
                return 0;
            case 6:
                fa7Var.f455689h = aVar2.g(intValue);
                return 0;
            case 7:
                fa7Var.f455690i = aVar2.k(intValue);
                return 0;
            case 8:
                fa7Var.f455691m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.n54 n54Var3 = new r45.n54();
                    if (bArr2 != null && bArr2.length > 0) {
                        n54Var3.mo11468x92b714fd(bArr2);
                    }
                    fa7Var.f455692n = n54Var3;
                }
                return 0;
            case 10:
                fa7Var.f455693o = aVar2.k(intValue);
                return 0;
            case 11:
                fa7Var.f455694p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
