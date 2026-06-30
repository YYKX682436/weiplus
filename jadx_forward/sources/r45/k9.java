package r45;

/* loaded from: classes9.dex */
public class k9 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f460031d;

    /* renamed from: e, reason: collision with root package name */
    public int f460032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460033f;

    /* renamed from: g, reason: collision with root package name */
    public int f460034g;

    /* renamed from: h, reason: collision with root package name */
    public int f460035h;

    /* renamed from: i, reason: collision with root package name */
    public int f460036i;

    /* renamed from: m, reason: collision with root package name */
    public int f460037m;

    /* renamed from: n, reason: collision with root package name */
    public int f460038n;

    /* renamed from: o, reason: collision with root package name */
    public int f460039o;

    /* renamed from: p, reason: collision with root package name */
    public int f460040p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460041q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k9)) {
            return false;
        }
        r45.k9 k9Var = (r45.k9) fVar;
        return n51.f.a(this.f76494x2de60e5e, k9Var.f76494x2de60e5e) && n51.f.a(this.f460031d, k9Var.f460031d) && n51.f.a(java.lang.Integer.valueOf(this.f460032e), java.lang.Integer.valueOf(k9Var.f460032e)) && n51.f.a(this.f460033f, k9Var.f460033f) && n51.f.a(java.lang.Integer.valueOf(this.f460034g), java.lang.Integer.valueOf(k9Var.f460034g)) && n51.f.a(java.lang.Integer.valueOf(this.f460035h), java.lang.Integer.valueOf(k9Var.f460035h)) && n51.f.a(java.lang.Integer.valueOf(this.f460036i), java.lang.Integer.valueOf(k9Var.f460036i)) && n51.f.a(java.lang.Integer.valueOf(this.f460037m), java.lang.Integer.valueOf(k9Var.f460037m)) && n51.f.a(java.lang.Integer.valueOf(this.f460038n), java.lang.Integer.valueOf(k9Var.f460038n)) && n51.f.a(java.lang.Integer.valueOf(this.f460039o), java.lang.Integer.valueOf(k9Var.f460039o)) && n51.f.a(java.lang.Integer.valueOf(this.f460040p), java.lang.Integer.valueOf(k9Var.f460040p)) && n51.f.a(this.f460041q, k9Var.f460041q);
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
            java.lang.String str = this.f460031d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(5, this.f460032e);
            java.lang.String str2 = this.f460033f;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f460034g);
            fVar.e(8, this.f460035h);
            fVar.e(9, this.f460036i);
            fVar.e(10, this.f460037m);
            fVar.e(11, this.f460038n);
            fVar.e(12, this.f460039o);
            fVar.e(13, this.f460040p);
            java.lang.String str3 = this.f460041q;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f460031d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(5, this.f460032e);
            java.lang.String str5 = this.f460033f;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f460034g) + b36.f.e(8, this.f460035h) + b36.f.e(9, this.f460036i) + b36.f.e(10, this.f460037m) + b36.f.e(11, this.f460038n) + b36.f.e(12, this.f460039o) + b36.f.e(13, this.f460040p);
            java.lang.String str6 = this.f460041q;
            return str6 != null ? e18 + b36.f.j(14, str6) : e18;
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
        r45.k9 k9Var = (r45.k9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                k9Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            k9Var.f460031d = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                k9Var.f460032e = aVar2.g(intValue);
                return 0;
            case 6:
                k9Var.f460033f = aVar2.k(intValue);
                return 0;
            case 7:
                k9Var.f460034g = aVar2.g(intValue);
                return 0;
            case 8:
                k9Var.f460035h = aVar2.g(intValue);
                return 0;
            case 9:
                k9Var.f460036i = aVar2.g(intValue);
                return 0;
            case 10:
                k9Var.f460037m = aVar2.g(intValue);
                return 0;
            case 11:
                k9Var.f460038n = aVar2.g(intValue);
                return 0;
            case 12:
                k9Var.f460039o = aVar2.g(intValue);
                return 0;
            case 13:
                k9Var.f460040p = aVar2.g(intValue);
                return 0;
            case 14:
                k9Var.f460041q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
