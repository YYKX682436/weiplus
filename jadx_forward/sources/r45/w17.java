package r45;

/* loaded from: classes12.dex */
public class w17 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f470319d;

    /* renamed from: e, reason: collision with root package name */
    public int f470320e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470321f;

    /* renamed from: g, reason: collision with root package name */
    public int f470322g;

    /* renamed from: h, reason: collision with root package name */
    public int f470323h;

    /* renamed from: i, reason: collision with root package name */
    public int f470324i;

    /* renamed from: m, reason: collision with root package name */
    public int f470325m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f470326n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public r45.du5 f470327o;

    /* renamed from: p, reason: collision with root package name */
    public int f470328p;

    /* renamed from: q, reason: collision with root package name */
    public int f470329q;

    /* renamed from: r, reason: collision with root package name */
    public int f470330r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w17)) {
            return false;
        }
        r45.w17 w17Var = (r45.w17) fVar;
        return n51.f.a(this.f76494x2de60e5e, w17Var.f76494x2de60e5e) && n51.f.a(this.f470319d, w17Var.f470319d) && n51.f.a(java.lang.Integer.valueOf(this.f470320e), java.lang.Integer.valueOf(w17Var.f470320e)) && n51.f.a(this.f470321f, w17Var.f470321f) && n51.f.a(java.lang.Integer.valueOf(this.f470322g), java.lang.Integer.valueOf(w17Var.f470322g)) && n51.f.a(java.lang.Integer.valueOf(this.f470323h), java.lang.Integer.valueOf(w17Var.f470323h)) && n51.f.a(java.lang.Integer.valueOf(this.f470324i), java.lang.Integer.valueOf(w17Var.f470324i)) && n51.f.a(java.lang.Integer.valueOf(this.f470325m), java.lang.Integer.valueOf(w17Var.f470325m)) && n51.f.a(this.f470326n, w17Var.f470326n) && n51.f.a(this.f470327o, w17Var.f470327o) && n51.f.a(java.lang.Integer.valueOf(this.f470328p), java.lang.Integer.valueOf(w17Var.f470328p)) && n51.f.a(java.lang.Integer.valueOf(this.f470329q), java.lang.Integer.valueOf(w17Var.f470329q)) && n51.f.a(java.lang.Integer.valueOf(this.f470330r), java.lang.Integer.valueOf(w17Var.f470330r));
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
            r45.cu5 cu5Var = this.f470319d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f470319d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f470320e);
            java.lang.String str = this.f470321f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f470322g);
            fVar.e(6, this.f470323h);
            fVar.e(7, this.f470324i);
            fVar.e(8, this.f470325m);
            fVar.g(9, 8, this.f470326n);
            r45.du5 du5Var = this.f470327o;
            if (du5Var != null) {
                fVar.i(10, du5Var.mo75928xcd1e8d8());
                this.f470327o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(11, this.f470328p);
            fVar.e(12, this.f470329q);
            fVar.e(16, this.f470330r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f470319d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f470320e);
            java.lang.String str2 = this.f470321f;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            int e18 = e17 + b36.f.e(5, this.f470322g) + b36.f.e(6, this.f470323h) + b36.f.e(7, this.f470324i) + b36.f.e(8, this.f470325m) + b36.f.g(9, 8, this.f470326n);
            r45.du5 du5Var2 = this.f470327o;
            if (du5Var2 != null) {
                e18 += b36.f.i(10, du5Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(11, this.f470328p) + b36.f.e(12, this.f470329q) + b36.f.e(16, this.f470330r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470326n.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.w17 w17Var = (r45.w17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 16) {
            w17Var.f470330r = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    w17Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    w17Var.f470319d = cu5Var3;
                }
                return 0;
            case 3:
                w17Var.f470320e = aVar2.g(intValue);
                return 0;
            case 4:
                w17Var.f470321f = aVar2.k(intValue);
                return 0;
            case 5:
                w17Var.f470322g = aVar2.g(intValue);
                return 0;
            case 6:
                w17Var.f470323h = aVar2.g(intValue);
                return 0;
            case 7:
                w17Var.f470324i = aVar2.g(intValue);
                return 0;
            case 8:
                w17Var.f470325m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var3.b(bArr4);
                    }
                    w17Var.f470326n.add(du5Var3);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var4.b(bArr5);
                    }
                    w17Var.f470327o = du5Var4;
                }
                return 0;
            case 11:
                w17Var.f470328p = aVar2.g(intValue);
                return 0;
            case 12:
                w17Var.f470329q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
