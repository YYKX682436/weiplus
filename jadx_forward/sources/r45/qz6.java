package r45;

/* loaded from: classes10.dex */
public class qz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465914d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465915e;

    /* renamed from: f, reason: collision with root package name */
    public long f465916f;

    /* renamed from: g, reason: collision with root package name */
    public long f465917g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465918h;

    /* renamed from: i, reason: collision with root package name */
    public long f465919i;

    /* renamed from: m, reason: collision with root package name */
    public long f465920m;

    /* renamed from: n, reason: collision with root package name */
    public long f465921n;

    /* renamed from: o, reason: collision with root package name */
    public long f465922o;

    /* renamed from: p, reason: collision with root package name */
    public int f465923p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465924q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f465925r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz6)) {
            return false;
        }
        r45.qz6 qz6Var = (r45.qz6) fVar;
        return n51.f.a(this.f465914d, qz6Var.f465914d) && n51.f.a(this.f465915e, qz6Var.f465915e) && n51.f.a(java.lang.Long.valueOf(this.f465916f), java.lang.Long.valueOf(qz6Var.f465916f)) && n51.f.a(java.lang.Long.valueOf(this.f465917g), java.lang.Long.valueOf(qz6Var.f465917g)) && n51.f.a(this.f465918h, qz6Var.f465918h) && n51.f.a(java.lang.Long.valueOf(this.f465919i), java.lang.Long.valueOf(qz6Var.f465919i)) && n51.f.a(java.lang.Long.valueOf(this.f465920m), java.lang.Long.valueOf(qz6Var.f465920m)) && n51.f.a(java.lang.Long.valueOf(this.f465921n), java.lang.Long.valueOf(qz6Var.f465921n)) && n51.f.a(java.lang.Long.valueOf(this.f465922o), java.lang.Long.valueOf(qz6Var.f465922o)) && n51.f.a(java.lang.Integer.valueOf(this.f465923p), java.lang.Integer.valueOf(qz6Var.f465923p)) && n51.f.a(this.f465924q, qz6Var.f465924q) && n51.f.a(this.f465925r, qz6Var.f465925r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465914d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465915e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f465916f);
            fVar.h(4, this.f465917g);
            java.lang.String str3 = this.f465918h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f465919i);
            fVar.h(7, this.f465920m);
            fVar.h(8, this.f465921n);
            fVar.h(9, this.f465922o);
            fVar.e(10, this.f465923p);
            java.lang.String str4 = this.f465924q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f465925r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f465914d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f465915e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int h17 = j17 + b36.f.h(3, this.f465916f) + b36.f.h(4, this.f465917g);
            java.lang.String str8 = this.f465918h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            int h18 = h17 + b36.f.h(6, this.f465919i) + b36.f.h(7, this.f465920m) + b36.f.h(8, this.f465921n) + b36.f.h(9, this.f465922o) + b36.f.e(10, this.f465923p);
            java.lang.String str9 = this.f465924q;
            if (str9 != null) {
                h18 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f465925r;
            return str10 != null ? h18 + b36.f.j(12, str10) : h18;
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
        r45.qz6 qz6Var = (r45.qz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qz6Var.f465914d = aVar2.k(intValue);
                return 0;
            case 2:
                qz6Var.f465915e = aVar2.k(intValue);
                return 0;
            case 3:
                qz6Var.f465916f = aVar2.i(intValue);
                return 0;
            case 4:
                qz6Var.f465917g = aVar2.i(intValue);
                return 0;
            case 5:
                qz6Var.f465918h = aVar2.k(intValue);
                return 0;
            case 6:
                qz6Var.f465919i = aVar2.i(intValue);
                return 0;
            case 7:
                qz6Var.f465920m = aVar2.i(intValue);
                return 0;
            case 8:
                qz6Var.f465921n = aVar2.i(intValue);
                return 0;
            case 9:
                qz6Var.f465922o = aVar2.i(intValue);
                return 0;
            case 10:
                qz6Var.f465923p = aVar2.g(intValue);
                return 0;
            case 11:
                qz6Var.f465924q = aVar2.k(intValue);
                return 0;
            case 12:
                qz6Var.f465925r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
