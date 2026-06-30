package r45;

/* loaded from: classes4.dex */
public class g76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f456493d;

    /* renamed from: e, reason: collision with root package name */
    public int f456494e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f456495f;

    /* renamed from: g, reason: collision with root package name */
    public int f456496g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f456497h;

    /* renamed from: i, reason: collision with root package name */
    public int f456498i;

    /* renamed from: m, reason: collision with root package name */
    public r45.mo5 f456499m;

    /* renamed from: n, reason: collision with root package name */
    public int f456500n;

    /* renamed from: o, reason: collision with root package name */
    public int f456501o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f456502p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f456503q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g76)) {
            return false;
        }
        r45.g76 g76Var = (r45.g76) fVar;
        return n51.f.a(this.f76494x2de60e5e, g76Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f456493d), java.lang.Long.valueOf(g76Var.f456493d)) && n51.f.a(java.lang.Integer.valueOf(this.f456494e), java.lang.Integer.valueOf(g76Var.f456494e)) && n51.f.a(this.f456495f, g76Var.f456495f) && n51.f.a(java.lang.Integer.valueOf(this.f456496g), java.lang.Integer.valueOf(g76Var.f456496g)) && n51.f.a(this.f456497h, g76Var.f456497h) && n51.f.a(java.lang.Integer.valueOf(this.f456498i), java.lang.Integer.valueOf(g76Var.f456498i)) && n51.f.a(this.f456499m, g76Var.f456499m) && n51.f.a(java.lang.Integer.valueOf(this.f456500n), java.lang.Integer.valueOf(g76Var.f456500n)) && n51.f.a(java.lang.Integer.valueOf(this.f456501o), java.lang.Integer.valueOf(g76Var.f456501o)) && n51.f.a(this.f456502p, g76Var.f456502p) && n51.f.a(this.f456503q, g76Var.f456503q);
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
            fVar.h(2, this.f456493d);
            fVar.e(3, this.f456494e);
            r45.cu5 cu5Var = this.f456495f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f456495f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f456496g);
            r45.cu5 cu5Var2 = this.f456497h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.mo75928xcd1e8d8());
                this.f456497h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f456498i);
            r45.mo5 mo5Var = this.f456499m;
            if (mo5Var != null) {
                fVar.i(8, mo5Var.mo75928xcd1e8d8());
                this.f456499m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f456500n);
            fVar.e(10, this.f456501o);
            java.lang.String str = this.f456502p;
            if (str != null) {
                fVar.j(11, str);
            }
            java.lang.String str2 = this.f456503q;
            if (str2 == null) {
                return 0;
            }
            fVar.j(12, str2);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f456493d) + b36.f.e(3, this.f456494e);
            r45.cu5 cu5Var3 = this.f456495f;
            if (cu5Var3 != null) {
                i18 += b36.f.i(4, cu5Var3.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f456496g);
            r45.cu5 cu5Var4 = this.f456497h;
            if (cu5Var4 != null) {
                e17 += b36.f.i(6, cu5Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(7, this.f456498i);
            r45.mo5 mo5Var2 = this.f456499m;
            if (mo5Var2 != null) {
                e18 += b36.f.i(8, mo5Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(9, this.f456500n) + b36.f.e(10, this.f456501o);
            java.lang.String str3 = this.f456502p;
            if (str3 != null) {
                e19 += b36.f.j(11, str3);
            }
            java.lang.String str4 = this.f456503q;
            return str4 != null ? e19 + b36.f.j(12, str4) : e19;
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
        r45.g76 g76Var = (r45.g76) objArr[1];
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
                    g76Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                g76Var.f456493d = aVar2.i(intValue);
                return 0;
            case 3:
                g76Var.f456494e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    g76Var.f456495f = cu5Var5;
                }
                return 0;
            case 5:
                g76Var.f456496g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    g76Var.f456497h = cu5Var6;
                }
                return 0;
            case 7:
                g76Var.f456498i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.mo5 mo5Var3 = new r45.mo5();
                    if (bArr4 != null && bArr4.length > 0) {
                        mo5Var3.mo11468x92b714fd(bArr4);
                    }
                    g76Var.f456499m = mo5Var3;
                }
                return 0;
            case 9:
                g76Var.f456500n = aVar2.g(intValue);
                return 0;
            case 10:
                g76Var.f456501o = aVar2.g(intValue);
                return 0;
            case 11:
                g76Var.f456502p = aVar2.k(intValue);
                return 0;
            case 12:
                g76Var.f456503q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
