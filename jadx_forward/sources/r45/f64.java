package r45;

/* loaded from: classes8.dex */
public class f64 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455570d;

    /* renamed from: e, reason: collision with root package name */
    public float f455571e;

    /* renamed from: f, reason: collision with root package name */
    public float f455572f;

    /* renamed from: g, reason: collision with root package name */
    public int f455573g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455574h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455575i;

    /* renamed from: m, reason: collision with root package name */
    public int f455576m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f455577n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f455578o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f64)) {
            return false;
        }
        r45.f64 f64Var = (r45.f64) fVar;
        return n51.f.a(this.f76494x2de60e5e, f64Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f455570d), java.lang.Integer.valueOf(f64Var.f455570d)) && n51.f.a(java.lang.Float.valueOf(this.f455571e), java.lang.Float.valueOf(f64Var.f455571e)) && n51.f.a(java.lang.Float.valueOf(this.f455572f), java.lang.Float.valueOf(f64Var.f455572f)) && n51.f.a(java.lang.Integer.valueOf(this.f455573g), java.lang.Integer.valueOf(f64Var.f455573g)) && n51.f.a(this.f455574h, f64Var.f455574h) && n51.f.a(this.f455575i, f64Var.f455575i) && n51.f.a(java.lang.Integer.valueOf(this.f455576m), java.lang.Integer.valueOf(f64Var.f455576m)) && n51.f.a(this.f455577n, f64Var.f455577n) && n51.f.a(this.f455578o, f64Var.f455578o);
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
            fVar.e(2, this.f455570d);
            fVar.d(3, this.f455571e);
            fVar.d(4, this.f455572f);
            fVar.e(5, this.f455573g);
            java.lang.String str = this.f455574h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f455575i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f455576m);
            r45.cu5 cu5Var = this.f455577n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.mo75928xcd1e8d8());
                this.f455577n.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f455578o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.mo75928xcd1e8d8());
                this.f455578o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455570d) + b36.f.d(3, this.f455571e) + b36.f.d(4, this.f455572f) + b36.f.e(5, this.f455573g);
            java.lang.String str3 = this.f455574h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f455575i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            int e17 = i18 + b36.f.e(8, this.f455576m);
            r45.cu5 cu5Var3 = this.f455577n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(9, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f455578o;
            return cu5Var4 != null ? e17 + b36.f.i(10, cu5Var4.mo75928xcd1e8d8()) : e17;
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
        r45.f64 f64Var = (r45.f64) objArr[1];
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
                    f64Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                f64Var.f455570d = aVar2.g(intValue);
                return 0;
            case 3:
                f64Var.f455571e = aVar2.f(intValue);
                return 0;
            case 4:
                f64Var.f455572f = aVar2.f(intValue);
                return 0;
            case 5:
                f64Var.f455573g = aVar2.g(intValue);
                return 0;
            case 6:
                f64Var.f455574h = aVar2.k(intValue);
                return 0;
            case 7:
                f64Var.f455575i = aVar2.k(intValue);
                return 0;
            case 8:
                f64Var.f455576m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    f64Var.f455577n = cu5Var5;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    f64Var.f455578o = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
