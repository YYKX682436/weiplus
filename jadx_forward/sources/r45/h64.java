package r45;

/* loaded from: classes9.dex */
public class h64 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457404d;

    /* renamed from: e, reason: collision with root package name */
    public float f457405e;

    /* renamed from: f, reason: collision with root package name */
    public float f457406f;

    /* renamed from: g, reason: collision with root package name */
    public int f457407g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457408h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457409i;

    /* renamed from: m, reason: collision with root package name */
    public int f457410m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f457411n;

    /* renamed from: o, reason: collision with root package name */
    public int f457412o;

    /* renamed from: p, reason: collision with root package name */
    public int f457413p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h64)) {
            return false;
        }
        r45.h64 h64Var = (r45.h64) fVar;
        return n51.f.a(this.f76494x2de60e5e, h64Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f457404d), java.lang.Integer.valueOf(h64Var.f457404d)) && n51.f.a(java.lang.Float.valueOf(this.f457405e), java.lang.Float.valueOf(h64Var.f457405e)) && n51.f.a(java.lang.Float.valueOf(this.f457406f), java.lang.Float.valueOf(h64Var.f457406f)) && n51.f.a(java.lang.Integer.valueOf(this.f457407g), java.lang.Integer.valueOf(h64Var.f457407g)) && n51.f.a(this.f457408h, h64Var.f457408h) && n51.f.a(this.f457409i, h64Var.f457409i) && n51.f.a(java.lang.Integer.valueOf(this.f457410m), java.lang.Integer.valueOf(h64Var.f457410m)) && n51.f.a(this.f457411n, h64Var.f457411n) && n51.f.a(java.lang.Integer.valueOf(this.f457412o), java.lang.Integer.valueOf(h64Var.f457412o)) && n51.f.a(java.lang.Integer.valueOf(this.f457413p), java.lang.Integer.valueOf(h64Var.f457413p));
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
            fVar.e(2, this.f457404d);
            fVar.d(3, this.f457405e);
            fVar.d(4, this.f457406f);
            fVar.e(5, this.f457407g);
            java.lang.String str = this.f457408h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f457409i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f457410m);
            java.lang.String str3 = this.f457411n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.e(10, this.f457412o);
            fVar.e(11, this.f457413p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457404d) + b36.f.d(3, this.f457405e) + b36.f.d(4, this.f457406f) + b36.f.e(5, this.f457407g);
            java.lang.String str4 = this.f457408h;
            if (str4 != null) {
                i18 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f457409i;
            if (str5 != null) {
                i18 += b36.f.j(7, str5);
            }
            int e17 = i18 + b36.f.e(8, this.f457410m);
            java.lang.String str6 = this.f457411n;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.e(10, this.f457412o) + b36.f.e(11, this.f457413p);
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
        r45.h64 h64Var = (r45.h64) objArr[1];
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
                    h64Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                h64Var.f457404d = aVar2.g(intValue);
                return 0;
            case 3:
                h64Var.f457405e = aVar2.f(intValue);
                return 0;
            case 4:
                h64Var.f457406f = aVar2.f(intValue);
                return 0;
            case 5:
                h64Var.f457407g = aVar2.g(intValue);
                return 0;
            case 6:
                h64Var.f457408h = aVar2.k(intValue);
                return 0;
            case 7:
                h64Var.f457409i = aVar2.k(intValue);
                return 0;
            case 8:
                h64Var.f457410m = aVar2.g(intValue);
                return 0;
            case 9:
                h64Var.f457411n = aVar2.k(intValue);
                return 0;
            case 10:
                h64Var.f457412o = aVar2.g(intValue);
                return 0;
            case 11:
                h64Var.f457413p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
