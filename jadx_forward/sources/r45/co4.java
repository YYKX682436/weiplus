package r45;

/* loaded from: classes12.dex */
public class co4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453247d;

    /* renamed from: e, reason: collision with root package name */
    public int f453248e;

    /* renamed from: g, reason: collision with root package name */
    public int f453250g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453252i;

    /* renamed from: m, reason: collision with root package name */
    public int f453253m;

    /* renamed from: n, reason: collision with root package name */
    public int f453254n;

    /* renamed from: o, reason: collision with root package name */
    public int f453255o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453256p;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f453249f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f453251h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.co4)) {
            return false;
        }
        r45.co4 co4Var = (r45.co4) fVar;
        return n51.f.a(this.f76494x2de60e5e, co4Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f453247d), java.lang.Integer.valueOf(co4Var.f453247d)) && n51.f.a(java.lang.Integer.valueOf(this.f453248e), java.lang.Integer.valueOf(co4Var.f453248e)) && n51.f.a(this.f453249f, co4Var.f453249f) && n51.f.a(java.lang.Integer.valueOf(this.f453250g), java.lang.Integer.valueOf(co4Var.f453250g)) && n51.f.a(this.f453251h, co4Var.f453251h) && n51.f.a(this.f453252i, co4Var.f453252i) && n51.f.a(java.lang.Integer.valueOf(this.f453253m), java.lang.Integer.valueOf(co4Var.f453253m)) && n51.f.a(java.lang.Integer.valueOf(this.f453254n), java.lang.Integer.valueOf(co4Var.f453254n)) && n51.f.a(java.lang.Integer.valueOf(this.f453255o), java.lang.Integer.valueOf(co4Var.f453255o)) && n51.f.a(this.f453256p, co4Var.f453256p);
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
            fVar.e(2, this.f453247d);
            fVar.e(3, this.f453248e);
            fVar.g(4, 8, this.f453249f);
            fVar.e(5, this.f453250g);
            fVar.g(6, 8, this.f453251h);
            java.lang.String str = this.f453252i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f453253m);
            fVar.e(9, this.f453254n);
            fVar.e(10, this.f453255o);
            java.lang.String str2 = this.f453256p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453247d) + b36.f.e(3, this.f453248e) + b36.f.g(4, 8, this.f453249f) + b36.f.e(5, this.f453250g) + b36.f.g(6, 8, this.f453251h);
            java.lang.String str3 = this.f453252i;
            if (str3 != null) {
                i18 += b36.f.j(7, str3);
            }
            int e17 = i18 + b36.f.e(8, this.f453253m) + b36.f.e(9, this.f453254n) + b36.f.e(10, this.f453255o);
            java.lang.String str4 = this.f453256p;
            return str4 != null ? e17 + b36.f.j(11, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453249f.clear();
            this.f453251h.clear();
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
        r45.co4 co4Var = (r45.co4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    co4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                co4Var.f453247d = aVar2.g(intValue);
                return 0;
            case 3:
                co4Var.f453248e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bo4 bo4Var = new r45.bo4();
                    if (bArr3 != null && bArr3.length > 0) {
                        bo4Var.mo11468x92b714fd(bArr3);
                    }
                    co4Var.f453249f.add(bo4Var);
                }
                return 0;
            case 5:
                co4Var.f453250g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.eo4 eo4Var = new r45.eo4();
                    if (bArr4 != null && bArr4.length > 0) {
                        eo4Var.mo11468x92b714fd(bArr4);
                    }
                    co4Var.f453251h.add(eo4Var);
                }
                return 0;
            case 7:
                co4Var.f453252i = aVar2.k(intValue);
                return 0;
            case 8:
                co4Var.f453253m = aVar2.g(intValue);
                return 0;
            case 9:
                co4Var.f453254n = aVar2.g(intValue);
                return 0;
            case 10:
                co4Var.f453255o = aVar2.g(intValue);
                return 0;
            case 11:
                co4Var.f453256p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
