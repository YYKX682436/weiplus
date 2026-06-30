package r45;

/* loaded from: classes7.dex */
public class n83 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462685d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462686e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462687f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462688g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462689h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462690i;

    /* renamed from: m, reason: collision with root package name */
    public int f462691m;

    /* renamed from: n, reason: collision with root package name */
    public int f462692n;

    /* renamed from: o, reason: collision with root package name */
    public int f462693o;

    /* renamed from: p, reason: collision with root package name */
    public int f462694p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f462695q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n83)) {
            return false;
        }
        r45.n83 n83Var = (r45.n83) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462685d), java.lang.Integer.valueOf(n83Var.f462685d)) && n51.f.a(this.f462686e, n83Var.f462686e) && n51.f.a(this.f462687f, n83Var.f462687f) && n51.f.a(this.f462688g, n83Var.f462688g) && n51.f.a(this.f462689h, n83Var.f462689h) && n51.f.a(this.f462690i, n83Var.f462690i) && n51.f.a(java.lang.Integer.valueOf(this.f462691m), java.lang.Integer.valueOf(n83Var.f462691m)) && n51.f.a(java.lang.Integer.valueOf(this.f462692n), java.lang.Integer.valueOf(n83Var.f462692n)) && n51.f.a(java.lang.Integer.valueOf(this.f462693o), java.lang.Integer.valueOf(n83Var.f462693o)) && n51.f.a(java.lang.Integer.valueOf(this.f462694p), java.lang.Integer.valueOf(n83Var.f462694p)) && n51.f.a(this.f462695q, n83Var.f462695q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462685d);
            java.lang.String str = this.f462686e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f462687f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f462688g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f462689h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f462690i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f462691m);
            fVar.e(9, this.f462692n);
            fVar.e(11, this.f462693o);
            fVar.e(12, this.f462694p);
            r45.cu5 cu5Var = this.f462695q;
            if (cu5Var != null) {
                fVar.i(13, cu5Var.mo75928xcd1e8d8());
                this.f462695q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462685d) + 0;
            java.lang.String str6 = this.f462686e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f462687f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f462688g;
            if (str8 != null) {
                e17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f462689h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f462690i;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            int e18 = e17 + b36.f.e(8, this.f462691m) + b36.f.e(9, this.f462692n) + b36.f.e(11, this.f462693o) + b36.f.e(12, this.f462694p);
            r45.cu5 cu5Var2 = this.f462695q;
            return cu5Var2 != null ? e18 + b36.f.i(13, cu5Var2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.n83 n83Var = (r45.n83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n83Var.f462685d = aVar2.g(intValue);
                return 0;
            case 2:
                n83Var.f462686e = aVar2.k(intValue);
                return 0;
            case 3:
                n83Var.f462687f = aVar2.k(intValue);
                return 0;
            case 4:
                n83Var.f462688g = aVar2.k(intValue);
                return 0;
            case 5:
                n83Var.f462689h = aVar2.k(intValue);
                return 0;
            case 6:
            case 10:
            default:
                return -1;
            case 7:
                n83Var.f462690i = aVar2.k(intValue);
                return 0;
            case 8:
                n83Var.f462691m = aVar2.g(intValue);
                return 0;
            case 9:
                n83Var.f462692n = aVar2.g(intValue);
                return 0;
            case 11:
                n83Var.f462693o = aVar2.g(intValue);
                return 0;
            case 12:
                n83Var.f462694p = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    n83Var.f462695q = cu5Var3;
                }
                return 0;
        }
    }
}
