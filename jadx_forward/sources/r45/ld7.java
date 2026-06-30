package r45;

/* loaded from: classes9.dex */
public class ld7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460866e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460867f;

    /* renamed from: g, reason: collision with root package name */
    public r45.md7 f460868g;

    /* renamed from: h, reason: collision with root package name */
    public int f460869h;

    /* renamed from: i, reason: collision with root package name */
    public int f460870i;

    /* renamed from: m, reason: collision with root package name */
    public int f460871m;

    /* renamed from: n, reason: collision with root package name */
    public r45.om4 f460872n;

    /* renamed from: o, reason: collision with root package name */
    public r45.v46 f460873o;

    /* renamed from: p, reason: collision with root package name */
    public int f460874p;

    /* renamed from: q, reason: collision with root package name */
    public long f460875q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f460876r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f460877s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld7)) {
            return false;
        }
        r45.ld7 ld7Var = (r45.ld7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460865d), java.lang.Integer.valueOf(ld7Var.f460865d)) && n51.f.a(this.f460866e, ld7Var.f460866e) && n51.f.a(this.f460867f, ld7Var.f460867f) && n51.f.a(this.f460868g, ld7Var.f460868g) && n51.f.a(java.lang.Integer.valueOf(this.f460869h), java.lang.Integer.valueOf(ld7Var.f460869h)) && n51.f.a(java.lang.Integer.valueOf(this.f460870i), java.lang.Integer.valueOf(ld7Var.f460870i)) && n51.f.a(java.lang.Integer.valueOf(this.f460871m), java.lang.Integer.valueOf(ld7Var.f460871m)) && n51.f.a(this.f460872n, ld7Var.f460872n) && n51.f.a(this.f460873o, ld7Var.f460873o) && n51.f.a(java.lang.Integer.valueOf(this.f460874p), java.lang.Integer.valueOf(ld7Var.f460874p)) && n51.f.a(java.lang.Long.valueOf(this.f460875q), java.lang.Long.valueOf(ld7Var.f460875q)) && n51.f.a(this.f460876r, ld7Var.f460876r) && n51.f.a(this.f460877s, ld7Var.f460877s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460865d);
            java.lang.String str = this.f460866e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460867f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.md7 md7Var = this.f460868g;
            if (md7Var != null) {
                fVar.i(4, md7Var.mo75928xcd1e8d8());
                this.f460868g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f460869h);
            fVar.e(6, this.f460870i);
            fVar.e(7, this.f460871m);
            r45.om4 om4Var = this.f460872n;
            if (om4Var != null) {
                fVar.i(8, om4Var.mo75928xcd1e8d8());
                this.f460872n.mo75956x3d5d1f78(fVar);
            }
            r45.v46 v46Var = this.f460873o;
            if (v46Var != null) {
                fVar.i(9, v46Var.mo75928xcd1e8d8());
                this.f460873o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f460874p);
            fVar.h(11, this.f460875q);
            java.lang.String str3 = this.f460876r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            java.lang.String str4 = this.f460877s;
            if (str4 == null) {
                return 0;
            }
            fVar.j(13, str4);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460865d) + 0;
            java.lang.String str5 = this.f460866e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f460867f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            r45.md7 md7Var2 = this.f460868g;
            if (md7Var2 != null) {
                e17 += b36.f.i(4, md7Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(5, this.f460869h) + b36.f.e(6, this.f460870i) + b36.f.e(7, this.f460871m);
            r45.om4 om4Var2 = this.f460872n;
            if (om4Var2 != null) {
                e18 += b36.f.i(8, om4Var2.mo75928xcd1e8d8());
            }
            r45.v46 v46Var2 = this.f460873o;
            if (v46Var2 != null) {
                e18 += b36.f.i(9, v46Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(10, this.f460874p) + b36.f.h(11, this.f460875q);
            java.lang.String str7 = this.f460876r;
            if (str7 != null) {
                e19 += b36.f.j(12, str7);
            }
            java.lang.String str8 = this.f460877s;
            return str8 != null ? e19 + b36.f.j(13, str8) : e19;
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
        r45.ld7 ld7Var = (r45.ld7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ld7Var.f460865d = aVar2.g(intValue);
                return 0;
            case 2:
                ld7Var.f460866e = aVar2.k(intValue);
                return 0;
            case 3:
                ld7Var.f460867f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.md7 md7Var3 = new r45.md7();
                    if (bArr != null && bArr.length > 0) {
                        md7Var3.mo11468x92b714fd(bArr);
                    }
                    ld7Var.f460868g = md7Var3;
                }
                return 0;
            case 5:
                ld7Var.f460869h = aVar2.g(intValue);
                return 0;
            case 6:
                ld7Var.f460870i = aVar2.g(intValue);
                return 0;
            case 7:
                ld7Var.f460871m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.om4 om4Var3 = new r45.om4();
                    if (bArr2 != null && bArr2.length > 0) {
                        om4Var3.mo11468x92b714fd(bArr2);
                    }
                    ld7Var.f460872n = om4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.v46 v46Var3 = new r45.v46();
                    if (bArr3 != null && bArr3.length > 0) {
                        v46Var3.mo11468x92b714fd(bArr3);
                    }
                    ld7Var.f460873o = v46Var3;
                }
                return 0;
            case 10:
                ld7Var.f460874p = aVar2.g(intValue);
                return 0;
            case 11:
                ld7Var.f460875q = aVar2.i(intValue);
                return 0;
            case 12:
                ld7Var.f460876r = aVar2.k(intValue);
                return 0;
            case 13:
                ld7Var.f460877s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
