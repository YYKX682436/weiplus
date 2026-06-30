package r45;

/* loaded from: classes12.dex */
public class pz6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qz6 f465037d;

    /* renamed from: e, reason: collision with root package name */
    public long f465038e;

    /* renamed from: f, reason: collision with root package name */
    public long f465039f;

    /* renamed from: g, reason: collision with root package name */
    public long f465040g;

    /* renamed from: h, reason: collision with root package name */
    public long f465041h;

    /* renamed from: i, reason: collision with root package name */
    public long f465042i;

    /* renamed from: m, reason: collision with root package name */
    public long f465043m;

    /* renamed from: n, reason: collision with root package name */
    public int f465044n;

    /* renamed from: o, reason: collision with root package name */
    public int f465045o;

    /* renamed from: p, reason: collision with root package name */
    public int f465046p;

    /* renamed from: q, reason: collision with root package name */
    public int f465047q;

    /* renamed from: r, reason: collision with root package name */
    public int f465048r;

    /* renamed from: s, reason: collision with root package name */
    public long f465049s;

    /* renamed from: t, reason: collision with root package name */
    public int f465050t;

    /* renamed from: u, reason: collision with root package name */
    public int f465051u;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pz6)) {
            return false;
        }
        r45.pz6 pz6Var = (r45.pz6) fVar;
        return n51.f.a(this.f465037d, pz6Var.f465037d) && n51.f.a(java.lang.Long.valueOf(this.f465038e), java.lang.Long.valueOf(pz6Var.f465038e)) && n51.f.a(java.lang.Long.valueOf(this.f465039f), java.lang.Long.valueOf(pz6Var.f465039f)) && n51.f.a(java.lang.Long.valueOf(this.f465040g), java.lang.Long.valueOf(pz6Var.f465040g)) && n51.f.a(java.lang.Long.valueOf(this.f465041h), java.lang.Long.valueOf(pz6Var.f465041h)) && n51.f.a(java.lang.Long.valueOf(this.f465042i), java.lang.Long.valueOf(pz6Var.f465042i)) && n51.f.a(java.lang.Long.valueOf(this.f465043m), java.lang.Long.valueOf(pz6Var.f465043m)) && n51.f.a(java.lang.Integer.valueOf(this.f465044n), java.lang.Integer.valueOf(pz6Var.f465044n)) && n51.f.a(java.lang.Integer.valueOf(this.f465045o), java.lang.Integer.valueOf(pz6Var.f465045o)) && n51.f.a(java.lang.Integer.valueOf(this.f465046p), java.lang.Integer.valueOf(pz6Var.f465046p)) && n51.f.a(java.lang.Integer.valueOf(this.f465047q), java.lang.Integer.valueOf(pz6Var.f465047q)) && n51.f.a(java.lang.Integer.valueOf(this.f465048r), java.lang.Integer.valueOf(pz6Var.f465048r)) && n51.f.a(java.lang.Long.valueOf(this.f465049s), java.lang.Long.valueOf(pz6Var.f465049s)) && n51.f.a(java.lang.Integer.valueOf(this.f465050t), java.lang.Integer.valueOf(pz6Var.f465050t)) && n51.f.a(java.lang.Integer.valueOf(this.f465051u), java.lang.Integer.valueOf(pz6Var.f465051u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qz6 qz6Var = this.f465037d;
            if (qz6Var != null) {
                fVar.i(1, qz6Var.mo75928xcd1e8d8());
                this.f465037d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f465038e);
            fVar.h(3, this.f465039f);
            fVar.h(4, this.f465040g);
            fVar.h(5, this.f465041h);
            fVar.h(6, this.f465042i);
            fVar.h(7, this.f465043m);
            fVar.e(8, this.f465044n);
            fVar.e(9, this.f465045o);
            fVar.e(10, this.f465046p);
            fVar.e(11, this.f465047q);
            fVar.e(12, this.f465048r);
            fVar.h(13, this.f465049s);
            fVar.e(14, this.f465050t);
            fVar.e(15, this.f465051u);
            return 0;
        }
        if (i17 == 1) {
            r45.qz6 qz6Var2 = this.f465037d;
            return (qz6Var2 != null ? b36.f.i(1, qz6Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.h(2, this.f465038e) + b36.f.h(3, this.f465039f) + b36.f.h(4, this.f465040g) + b36.f.h(5, this.f465041h) + b36.f.h(6, this.f465042i) + b36.f.h(7, this.f465043m) + b36.f.e(8, this.f465044n) + b36.f.e(9, this.f465045o) + b36.f.e(10, this.f465046p) + b36.f.e(11, this.f465047q) + b36.f.e(12, this.f465048r) + b36.f.h(13, this.f465049s) + b36.f.e(14, this.f465050t) + b36.f.e(15, this.f465051u);
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
        r45.pz6 pz6Var = (r45.pz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qz6 qz6Var3 = new r45.qz6();
                    if (bArr != null && bArr.length > 0) {
                        qz6Var3.mo11468x92b714fd(bArr);
                    }
                    pz6Var.f465037d = qz6Var3;
                }
                return 0;
            case 2:
                pz6Var.f465038e = aVar2.i(intValue);
                return 0;
            case 3:
                pz6Var.f465039f = aVar2.i(intValue);
                return 0;
            case 4:
                pz6Var.f465040g = aVar2.i(intValue);
                return 0;
            case 5:
                pz6Var.f465041h = aVar2.i(intValue);
                return 0;
            case 6:
                pz6Var.f465042i = aVar2.i(intValue);
                return 0;
            case 7:
                pz6Var.f465043m = aVar2.i(intValue);
                return 0;
            case 8:
                pz6Var.f465044n = aVar2.g(intValue);
                return 0;
            case 9:
                pz6Var.f465045o = aVar2.g(intValue);
                return 0;
            case 10:
                pz6Var.f465046p = aVar2.g(intValue);
                return 0;
            case 11:
                pz6Var.f465047q = aVar2.g(intValue);
                return 0;
            case 12:
                pz6Var.f465048r = aVar2.g(intValue);
                return 0;
            case 13:
                pz6Var.f465049s = aVar2.i(intValue);
                return 0;
            case 14:
                pz6Var.f465050t = aVar2.g(intValue);
                return 0;
            case 15:
                pz6Var.f465051u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
