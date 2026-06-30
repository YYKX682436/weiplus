package r45;

/* loaded from: classes9.dex */
public class s36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f467008d;

    /* renamed from: e, reason: collision with root package name */
    public int f467009e;

    /* renamed from: f, reason: collision with root package name */
    public int f467010f;

    /* renamed from: g, reason: collision with root package name */
    public float f467011g;

    /* renamed from: h, reason: collision with root package name */
    public int f467012h;

    /* renamed from: i, reason: collision with root package name */
    public int f467013i;

    /* renamed from: m, reason: collision with root package name */
    public float f467014m;

    /* renamed from: n, reason: collision with root package name */
    public float f467015n;

    /* renamed from: o, reason: collision with root package name */
    public int f467016o;

    /* renamed from: p, reason: collision with root package name */
    public int f467017p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s36)) {
            return false;
        }
        r45.s36 s36Var = (r45.s36) fVar;
        return n51.f.a(this.f76494x2de60e5e, s36Var.f76494x2de60e5e) && n51.f.a(this.f467008d, s36Var.f467008d) && n51.f.a(java.lang.Integer.valueOf(this.f467009e), java.lang.Integer.valueOf(s36Var.f467009e)) && n51.f.a(java.lang.Integer.valueOf(this.f467010f), java.lang.Integer.valueOf(s36Var.f467010f)) && n51.f.a(java.lang.Float.valueOf(this.f467011g), java.lang.Float.valueOf(s36Var.f467011g)) && n51.f.a(java.lang.Integer.valueOf(this.f467012h), java.lang.Integer.valueOf(s36Var.f467012h)) && n51.f.a(java.lang.Integer.valueOf(this.f467013i), java.lang.Integer.valueOf(s36Var.f467013i)) && n51.f.a(java.lang.Float.valueOf(this.f467014m), java.lang.Float.valueOf(s36Var.f467014m)) && n51.f.a(java.lang.Float.valueOf(this.f467015n), java.lang.Float.valueOf(s36Var.f467015n)) && n51.f.a(java.lang.Integer.valueOf(this.f467016o), java.lang.Integer.valueOf(s36Var.f467016o)) && n51.f.a(java.lang.Integer.valueOf(this.f467017p), java.lang.Integer.valueOf(s36Var.f467017p));
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
            r45.cu5 cu5Var = this.f467008d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f467008d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f467009e);
            fVar.e(4, this.f467010f);
            fVar.d(5, this.f467011g);
            fVar.e(6, this.f467012h);
            fVar.e(7, this.f467013i);
            fVar.d(8, this.f467014m);
            fVar.d(9, this.f467015n);
            fVar.e(10, this.f467016o);
            fVar.e(11, this.f467017p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f467008d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(3, this.f467009e) + b36.f.e(4, this.f467010f) + b36.f.d(5, this.f467011g) + b36.f.e(6, this.f467012h) + b36.f.e(7, this.f467013i) + b36.f.d(8, this.f467014m) + b36.f.d(9, this.f467015n) + b36.f.e(10, this.f467016o) + b36.f.e(11, this.f467017p);
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
        r45.s36 s36Var = (r45.s36) objArr[1];
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
                    s36Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    s36Var.f467008d = cu5Var3;
                }
                return 0;
            case 3:
                s36Var.f467009e = aVar2.g(intValue);
                return 0;
            case 4:
                s36Var.f467010f = aVar2.g(intValue);
                return 0;
            case 5:
                s36Var.f467011g = aVar2.f(intValue);
                return 0;
            case 6:
                s36Var.f467012h = aVar2.g(intValue);
                return 0;
            case 7:
                s36Var.f467013i = aVar2.g(intValue);
                return 0;
            case 8:
                s36Var.f467014m = aVar2.f(intValue);
                return 0;
            case 9:
                s36Var.f467015n = aVar2.f(intValue);
                return 0;
            case 10:
                s36Var.f467016o = aVar2.g(intValue);
                return 0;
            case 11:
                s36Var.f467017p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
