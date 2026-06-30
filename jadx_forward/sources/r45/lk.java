package r45;

/* loaded from: classes11.dex */
public class lk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461066d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461067e;

    /* renamed from: f, reason: collision with root package name */
    public int f461068f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461069g;

    /* renamed from: h, reason: collision with root package name */
    public int f461070h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461071i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f461072m;

    /* renamed from: n, reason: collision with root package name */
    public r45.g77 f461073n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lk)) {
            return false;
        }
        r45.lk lkVar = (r45.lk) fVar;
        return n51.f.a(this.f461066d, lkVar.f461066d) && n51.f.a(this.f461067e, lkVar.f461067e) && n51.f.a(java.lang.Integer.valueOf(this.f461068f), java.lang.Integer.valueOf(lkVar.f461068f)) && n51.f.a(this.f461069g, lkVar.f461069g) && n51.f.a(java.lang.Integer.valueOf(this.f461070h), java.lang.Integer.valueOf(lkVar.f461070h)) && n51.f.a(this.f461071i, lkVar.f461071i) && n51.f.a(java.lang.Boolean.valueOf(this.f461072m), java.lang.Boolean.valueOf(lkVar.f461072m)) && n51.f.a(this.f461073n, lkVar.f461073n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f461066d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f461067e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f461068f);
            java.lang.String str3 = this.f461069g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f461070h);
            java.lang.String str4 = this.f461071i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f461072m);
            r45.g77 g77Var = this.f461073n;
            if (g77Var != null) {
                fVar.i(8, g77Var.mo75928xcd1e8d8());
                this.f461073n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f461066d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f461067e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f461068f);
            java.lang.String str7 = this.f461069g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f461070h);
            java.lang.String str8 = this.f461071i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            int a17 = e18 + b36.f.a(7, this.f461072m);
            r45.g77 g77Var2 = this.f461073n;
            return g77Var2 != null ? a17 + b36.f.i(8, g77Var2.mo75928xcd1e8d8()) : a17;
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
        r45.lk lkVar = (r45.lk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lkVar.f461066d = aVar2.k(intValue);
                return 0;
            case 2:
                lkVar.f461067e = aVar2.k(intValue);
                return 0;
            case 3:
                lkVar.f461068f = aVar2.g(intValue);
                return 0;
            case 4:
                lkVar.f461069g = aVar2.k(intValue);
                return 0;
            case 5:
                lkVar.f461070h = aVar2.g(intValue);
                return 0;
            case 6:
                lkVar.f461071i = aVar2.k(intValue);
                return 0;
            case 7:
                lkVar.f461072m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g77 g77Var3 = new r45.g77();
                    if (bArr != null && bArr.length > 0) {
                        g77Var3.mo11468x92b714fd(bArr);
                    }
                    lkVar.f461073n = g77Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
