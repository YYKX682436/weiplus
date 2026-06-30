package r45;

/* loaded from: classes4.dex */
public class lf6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460961d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460962e;

    /* renamed from: f, reason: collision with root package name */
    public int f460963f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tl5 f460964g;

    /* renamed from: h, reason: collision with root package name */
    public r45.oe6 f460965h;

    /* renamed from: i, reason: collision with root package name */
    public long f460966i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460967m;

    /* renamed from: n, reason: collision with root package name */
    public int f460968n;

    /* renamed from: o, reason: collision with root package name */
    public int f460969o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf6)) {
            return false;
        }
        r45.lf6 lf6Var = (r45.lf6) fVar;
        return n51.f.a(this.f460961d, lf6Var.f460961d) && n51.f.a(this.f460962e, lf6Var.f460962e) && n51.f.a(java.lang.Integer.valueOf(this.f460963f), java.lang.Integer.valueOf(lf6Var.f460963f)) && n51.f.a(this.f460964g, lf6Var.f460964g) && n51.f.a(this.f460965h, lf6Var.f460965h) && n51.f.a(java.lang.Long.valueOf(this.f460966i), java.lang.Long.valueOf(lf6Var.f460966i)) && n51.f.a(this.f460967m, lf6Var.f460967m) && n51.f.a(java.lang.Integer.valueOf(this.f460968n), java.lang.Integer.valueOf(lf6Var.f460968n)) && n51.f.a(java.lang.Integer.valueOf(this.f460969o), java.lang.Integer.valueOf(lf6Var.f460969o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f460961d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f460962e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f460963f);
            r45.tl5 tl5Var = this.f460964g;
            if (tl5Var != null) {
                fVar.i(4, tl5Var.mo75928xcd1e8d8());
                this.f460964g.mo75956x3d5d1f78(fVar);
            }
            r45.oe6 oe6Var = this.f460965h;
            if (oe6Var != null) {
                fVar.i(5, oe6Var.mo75928xcd1e8d8());
                this.f460965h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f460966i);
            java.lang.String str3 = this.f460967m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f460968n);
            fVar.e(9, this.f460969o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f460961d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f460962e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f460963f);
            r45.tl5 tl5Var2 = this.f460964g;
            if (tl5Var2 != null) {
                e17 += b36.f.i(4, tl5Var2.mo75928xcd1e8d8());
            }
            r45.oe6 oe6Var2 = this.f460965h;
            if (oe6Var2 != null) {
                e17 += b36.f.i(5, oe6Var2.mo75928xcd1e8d8());
            }
            int h17 = e17 + b36.f.h(6, this.f460966i);
            java.lang.String str6 = this.f460967m;
            if (str6 != null) {
                h17 += b36.f.j(7, str6);
            }
            return h17 + b36.f.e(8, this.f460968n) + b36.f.e(9, this.f460969o);
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
        r45.lf6 lf6Var = (r45.lf6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lf6Var.f460961d = aVar2.k(intValue);
                return 0;
            case 2:
                lf6Var.f460962e = aVar2.k(intValue);
                return 0;
            case 3:
                lf6Var.f460963f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tl5 tl5Var3 = new r45.tl5();
                    if (bArr != null && bArr.length > 0) {
                        tl5Var3.mo11468x92b714fd(bArr);
                    }
                    lf6Var.f460964g = tl5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.oe6 oe6Var3 = new r45.oe6();
                    if (bArr2 != null && bArr2.length > 0) {
                        oe6Var3.mo11468x92b714fd(bArr2);
                    }
                    lf6Var.f460965h = oe6Var3;
                }
                return 0;
            case 6:
                lf6Var.f460966i = aVar2.i(intValue);
                return 0;
            case 7:
                lf6Var.f460967m = aVar2.k(intValue);
                return 0;
            case 8:
                lf6Var.f460968n = aVar2.g(intValue);
                return 0;
            case 9:
                lf6Var.f460969o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
