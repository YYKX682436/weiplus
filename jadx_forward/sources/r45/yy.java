package r45;

/* loaded from: classes9.dex */
public class yy extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f473019d;

    /* renamed from: e, reason: collision with root package name */
    public int f473020e;

    /* renamed from: f, reason: collision with root package name */
    public long f473021f;

    /* renamed from: g, reason: collision with root package name */
    public int f473022g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f473023h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f473024i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f473025m;

    /* renamed from: n, reason: collision with root package name */
    public int f473026n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f473027o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yy)) {
            return false;
        }
        r45.yy yyVar = (r45.yy) fVar;
        return n51.f.a(this.f76494x2de60e5e, yyVar.f76494x2de60e5e) && n51.f.a(this.f473019d, yyVar.f473019d) && n51.f.a(java.lang.Integer.valueOf(this.f473020e), java.lang.Integer.valueOf(yyVar.f473020e)) && n51.f.a(java.lang.Long.valueOf(this.f473021f), java.lang.Long.valueOf(yyVar.f473021f)) && n51.f.a(java.lang.Integer.valueOf(this.f473022g), java.lang.Integer.valueOf(yyVar.f473022g)) && n51.f.a(this.f473023h, yyVar.f473023h) && n51.f.a(this.f473024i, yyVar.f473024i) && n51.f.a(this.f473025m, yyVar.f473025m) && n51.f.a(java.lang.Integer.valueOf(this.f473026n), java.lang.Integer.valueOf(yyVar.f473026n)) && n51.f.a(this.f473027o, yyVar.f473027o);
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
            java.lang.String str = this.f473019d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f473020e);
            fVar.h(4, this.f473021f);
            fVar.e(5, this.f473022g);
            java.lang.String str2 = this.f473023h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f473024i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.cu5 cu5Var = this.f473025m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f473025m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f473026n);
            java.lang.String str4 = this.f473027o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f473019d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int e17 = i18 + b36.f.e(3, this.f473020e) + b36.f.h(4, this.f473021f) + b36.f.e(5, this.f473022g);
            java.lang.String str6 = this.f473023h;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f473024i;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            r45.cu5 cu5Var2 = this.f473025m;
            if (cu5Var2 != null) {
                e17 += b36.f.i(8, cu5Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(9, this.f473026n);
            java.lang.String str8 = this.f473027o;
            return str8 != null ? e18 + b36.f.j(10, str8) : e18;
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
        r45.yy yyVar = (r45.yy) objArr[1];
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
                    yyVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yyVar.f473019d = aVar2.k(intValue);
                return 0;
            case 3:
                yyVar.f473020e = aVar2.g(intValue);
                return 0;
            case 4:
                yyVar.f473021f = aVar2.i(intValue);
                return 0;
            case 5:
                yyVar.f473022g = aVar2.g(intValue);
                return 0;
            case 6:
                yyVar.f473023h = aVar2.k(intValue);
                return 0;
            case 7:
                yyVar.f473024i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    yyVar.f473025m = cu5Var3;
                }
                return 0;
            case 9:
                yyVar.f473026n = aVar2.g(intValue);
                return 0;
            case 10:
                yyVar.f473027o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
