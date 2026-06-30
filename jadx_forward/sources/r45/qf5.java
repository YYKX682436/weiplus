package r45;

/* loaded from: classes9.dex */
public class qf5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465478d;

    /* renamed from: e, reason: collision with root package name */
    public long f465479e;

    /* renamed from: f, reason: collision with root package name */
    public long f465480f;

    /* renamed from: g, reason: collision with root package name */
    public long f465481g;

    /* renamed from: h, reason: collision with root package name */
    public int f465482h;

    /* renamed from: i, reason: collision with root package name */
    public int f465483i;

    /* renamed from: m, reason: collision with root package name */
    public int f465484m;

    /* renamed from: n, reason: collision with root package name */
    public long f465485n;

    /* renamed from: o, reason: collision with root package name */
    public long f465486o;

    /* renamed from: p, reason: collision with root package name */
    public int f465487p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f465488q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf5)) {
            return false;
        }
        r45.qf5 qf5Var = (r45.qf5) fVar;
        return n51.f.a(this.f76494x2de60e5e, qf5Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f465478d), java.lang.Integer.valueOf(qf5Var.f465478d)) && n51.f.a(java.lang.Long.valueOf(this.f465479e), java.lang.Long.valueOf(qf5Var.f465479e)) && n51.f.a(java.lang.Long.valueOf(this.f465480f), java.lang.Long.valueOf(qf5Var.f465480f)) && n51.f.a(java.lang.Long.valueOf(this.f465481g), java.lang.Long.valueOf(qf5Var.f465481g)) && n51.f.a(java.lang.Integer.valueOf(this.f465482h), java.lang.Integer.valueOf(qf5Var.f465482h)) && n51.f.a(java.lang.Integer.valueOf(this.f465483i), java.lang.Integer.valueOf(qf5Var.f465483i)) && n51.f.a(java.lang.Integer.valueOf(this.f465484m), java.lang.Integer.valueOf(qf5Var.f465484m)) && n51.f.a(java.lang.Long.valueOf(this.f465485n), java.lang.Long.valueOf(qf5Var.f465485n)) && n51.f.a(java.lang.Long.valueOf(this.f465486o), java.lang.Long.valueOf(qf5Var.f465486o)) && n51.f.a(java.lang.Integer.valueOf(this.f465487p), java.lang.Integer.valueOf(qf5Var.f465487p)) && n51.f.a(this.f465488q, qf5Var.f465488q);
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
            fVar.e(2, this.f465478d);
            fVar.h(3, this.f465479e);
            fVar.h(4, this.f465480f);
            fVar.h(5, this.f465481g);
            fVar.e(6, this.f465482h);
            fVar.e(7, this.f465483i);
            fVar.e(8, this.f465484m);
            fVar.h(9, this.f465485n);
            fVar.h(10, this.f465486o);
            fVar.e(11, this.f465487p);
            java.lang.String str = this.f465488q;
            if (str != null) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465478d) + b36.f.h(3, this.f465479e) + b36.f.h(4, this.f465480f) + b36.f.h(5, this.f465481g) + b36.f.e(6, this.f465482h) + b36.f.e(7, this.f465483i) + b36.f.e(8, this.f465484m) + b36.f.h(9, this.f465485n) + b36.f.h(10, this.f465486o) + b36.f.e(11, this.f465487p);
            java.lang.String str2 = this.f465488q;
            return str2 != null ? i18 + b36.f.j(12, str2) : i18;
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
        r45.qf5 qf5Var = (r45.qf5) objArr[1];
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
                    qf5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                qf5Var.f465478d = aVar2.g(intValue);
                return 0;
            case 3:
                qf5Var.f465479e = aVar2.i(intValue);
                return 0;
            case 4:
                qf5Var.f465480f = aVar2.i(intValue);
                return 0;
            case 5:
                qf5Var.f465481g = aVar2.i(intValue);
                return 0;
            case 6:
                qf5Var.f465482h = aVar2.g(intValue);
                return 0;
            case 7:
                qf5Var.f465483i = aVar2.g(intValue);
                return 0;
            case 8:
                qf5Var.f465484m = aVar2.g(intValue);
                return 0;
            case 9:
                qf5Var.f465485n = aVar2.i(intValue);
                return 0;
            case 10:
                qf5Var.f465486o = aVar2.i(intValue);
                return 0;
            case 11:
                qf5Var.f465487p = aVar2.g(intValue);
                return 0;
            case 12:
                qf5Var.f465488q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
