package r45;

/* loaded from: classes12.dex */
public class hu6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f457987d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f457988e;

    /* renamed from: f, reason: collision with root package name */
    public int f457989f;

    /* renamed from: g, reason: collision with root package name */
    public int f457990g;

    /* renamed from: h, reason: collision with root package name */
    public int f457991h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f457992i;

    /* renamed from: m, reason: collision with root package name */
    public int f457993m;

    /* renamed from: n, reason: collision with root package name */
    public int f457994n;

    /* renamed from: o, reason: collision with root package name */
    public int f457995o;

    /* renamed from: p, reason: collision with root package name */
    public int f457996p;

    /* renamed from: q, reason: collision with root package name */
    public int f457997q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hu6)) {
            return false;
        }
        r45.hu6 hu6Var = (r45.hu6) fVar;
        return n51.f.a(this.f76494x2de60e5e, hu6Var.f76494x2de60e5e) && n51.f.a(this.f457987d, hu6Var.f457987d) && n51.f.a(this.f457988e, hu6Var.f457988e) && n51.f.a(java.lang.Integer.valueOf(this.f457989f), java.lang.Integer.valueOf(hu6Var.f457989f)) && n51.f.a(java.lang.Integer.valueOf(this.f457990g), java.lang.Integer.valueOf(hu6Var.f457990g)) && n51.f.a(java.lang.Integer.valueOf(this.f457991h), java.lang.Integer.valueOf(hu6Var.f457991h)) && n51.f.a(this.f457992i, hu6Var.f457992i) && n51.f.a(java.lang.Integer.valueOf(this.f457993m), java.lang.Integer.valueOf(hu6Var.f457993m)) && n51.f.a(java.lang.Integer.valueOf(this.f457994n), java.lang.Integer.valueOf(hu6Var.f457994n)) && n51.f.a(java.lang.Integer.valueOf(this.f457995o), java.lang.Integer.valueOf(hu6Var.f457995o)) && n51.f.a(java.lang.Integer.valueOf(this.f457996p), java.lang.Integer.valueOf(hu6Var.f457996p)) && n51.f.a(java.lang.Integer.valueOf(this.f457997q), java.lang.Integer.valueOf(hu6Var.f457997q));
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
            r45.du5 du5Var = this.f457987d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f457987d.mo75956x3d5d1f78(fVar);
            }
            r45.du5 du5Var2 = this.f457988e;
            if (du5Var2 != null) {
                fVar.i(3, du5Var2.mo75928xcd1e8d8());
                this.f457988e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f457989f);
            fVar.e(5, this.f457990g);
            fVar.e(6, this.f457991h);
            r45.cu5 cu5Var = this.f457992i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.mo75928xcd1e8d8());
                this.f457992i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f457993m);
            fVar.e(9, this.f457994n);
            fVar.e(10, this.f457995o);
            fVar.e(11, this.f457996p);
            fVar.e(12, this.f457997q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var3 = this.f457987d;
            if (du5Var3 != null) {
                i18 += b36.f.i(2, du5Var3.mo75928xcd1e8d8());
            }
            r45.du5 du5Var4 = this.f457988e;
            if (du5Var4 != null) {
                i18 += b36.f.i(3, du5Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f457989f) + b36.f.e(5, this.f457990g) + b36.f.e(6, this.f457991h);
            r45.cu5 cu5Var2 = this.f457992i;
            if (cu5Var2 != null) {
                e17 += b36.f.i(7, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(8, this.f457993m) + b36.f.e(9, this.f457994n) + b36.f.e(10, this.f457995o) + b36.f.e(11, this.f457996p) + b36.f.e(12, this.f457997q);
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
        r45.hu6 hu6Var = (r45.hu6) objArr[1];
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
                    hu6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    hu6Var.f457987d = du5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var6.b(bArr3);
                    }
                    hu6Var.f457988e = du5Var6;
                }
                return 0;
            case 4:
                hu6Var.f457989f = aVar2.g(intValue);
                return 0;
            case 5:
                hu6Var.f457990g = aVar2.g(intValue);
                return 0;
            case 6:
                hu6Var.f457991h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    hu6Var.f457992i = cu5Var3;
                }
                return 0;
            case 8:
                hu6Var.f457993m = aVar2.g(intValue);
                return 0;
            case 9:
                hu6Var.f457994n = aVar2.g(intValue);
                return 0;
            case 10:
                hu6Var.f457995o = aVar2.g(intValue);
                return 0;
            case 11:
                hu6Var.f457996p = aVar2.g(intValue);
                return 0;
            case 12:
                hu6Var.f457997q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
