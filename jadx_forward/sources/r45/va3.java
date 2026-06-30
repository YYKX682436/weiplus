package r45;

/* loaded from: classes8.dex */
public class va3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469558d;

    /* renamed from: e, reason: collision with root package name */
    public int f469559e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469560f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f469561g;

    /* renamed from: h, reason: collision with root package name */
    public int f469562h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469563i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469564m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469565n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469566o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va3)) {
            return false;
        }
        r45.va3 va3Var = (r45.va3) fVar;
        return n51.f.a(this.f76494x2de60e5e, va3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f469558d), java.lang.Integer.valueOf(va3Var.f469558d)) && n51.f.a(java.lang.Integer.valueOf(this.f469559e), java.lang.Integer.valueOf(va3Var.f469559e)) && n51.f.a(this.f469560f, va3Var.f469560f) && n51.f.a(this.f469561g, va3Var.f469561g) && n51.f.a(java.lang.Integer.valueOf(this.f469562h), java.lang.Integer.valueOf(va3Var.f469562h)) && n51.f.a(this.f469563i, va3Var.f469563i) && n51.f.a(this.f469564m, va3Var.f469564m) && n51.f.a(this.f469565n, va3Var.f469565n) && n51.f.a(this.f469566o, va3Var.f469566o);
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
            fVar.e(2, this.f469558d);
            fVar.e(3, this.f469559e);
            java.lang.String str = this.f469560f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.cu5 cu5Var = this.f469561g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f469561g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f469562h);
            java.lang.String str2 = this.f469563i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f469564m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469565n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469566o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469558d) + b36.f.e(3, this.f469559e);
            java.lang.String str4 = this.f469560f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f469561g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(6, this.f469562h);
            java.lang.String str5 = this.f469563i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f469564m;
            if (str6 != null) {
                e17 += b36.f.j(8, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f469565n;
            if (gVar3 != null) {
                e17 += b36.f.b(9, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f469566o;
            return gVar4 != null ? e17 + b36.f.b(10, gVar4) : e17;
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
        r45.va3 va3Var = (r45.va3) objArr[1];
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
                    va3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                va3Var.f469558d = aVar2.g(intValue);
                return 0;
            case 3:
                va3Var.f469559e = aVar2.g(intValue);
                return 0;
            case 4:
                va3Var.f469560f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    va3Var.f469561g = cu5Var3;
                }
                return 0;
            case 6:
                va3Var.f469562h = aVar2.g(intValue);
                return 0;
            case 7:
                va3Var.f469563i = aVar2.k(intValue);
                return 0;
            case 8:
                va3Var.f469564m = aVar2.k(intValue);
                return 0;
            case 9:
                va3Var.f469565n = aVar2.d(intValue);
                return 0;
            case 10:
                va3Var.f469566o = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
