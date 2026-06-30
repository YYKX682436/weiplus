package r45;

/* loaded from: classes8.dex */
public class b24 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451986d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451987e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451988f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451989g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451990h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451991i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451992m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451993n;

    /* renamed from: o, reason: collision with root package name */
    public int f451994o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f451995p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451996q;

    /* renamed from: r, reason: collision with root package name */
    public int f451997r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b24)) {
            return false;
        }
        r45.b24 b24Var = (r45.b24) fVar;
        return n51.f.a(this.f76494x2de60e5e, b24Var.f76494x2de60e5e) && n51.f.a(this.f451986d, b24Var.f451986d) && n51.f.a(this.f451987e, b24Var.f451987e) && n51.f.a(this.f451988f, b24Var.f451988f) && n51.f.a(this.f451989g, b24Var.f451989g) && n51.f.a(this.f451990h, b24Var.f451990h) && n51.f.a(this.f451991i, b24Var.f451991i) && n51.f.a(this.f451992m, b24Var.f451992m) && n51.f.a(this.f451993n, b24Var.f451993n) && n51.f.a(java.lang.Integer.valueOf(this.f451994o), java.lang.Integer.valueOf(b24Var.f451994o)) && n51.f.a(this.f451995p, b24Var.f451995p) && n51.f.a(this.f451996q, b24Var.f451996q) && n51.f.a(java.lang.Integer.valueOf(this.f451997r), java.lang.Integer.valueOf(b24Var.f451997r));
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
            java.lang.String str = this.f451986d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f451987e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f451988f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f451989g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f451990h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f451991i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            java.lang.String str7 = this.f451992m;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451993n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.e(10, this.f451994o);
            fVar.g(11, 8, this.f451995p);
            java.lang.String str8 = this.f451996q;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            fVar.e(13, this.f451997r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f451986d;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f451987e;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f451988f;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f451989g;
            if (str12 != null) {
                i18 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f451990h;
            if (str13 != null) {
                i18 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f451991i;
            if (str14 != null) {
                i18 += b36.f.j(7, str14);
            }
            java.lang.String str15 = this.f451992m;
            if (str15 != null) {
                i18 += b36.f.j(8, str15);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451993n;
            if (gVar2 != null) {
                i18 += b36.f.b(9, gVar2);
            }
            int e17 = i18 + b36.f.e(10, this.f451994o) + b36.f.g(11, 8, this.f451995p);
            java.lang.String str16 = this.f451996q;
            if (str16 != null) {
                e17 += b36.f.j(12, str16);
            }
            return e17 + b36.f.e(13, this.f451997r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f451995p.clear();
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
        r45.b24 b24Var = (r45.b24) objArr[1];
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
                    b24Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                b24Var.f451986d = aVar2.k(intValue);
                return 0;
            case 3:
                b24Var.f451987e = aVar2.k(intValue);
                return 0;
            case 4:
                b24Var.f451988f = aVar2.k(intValue);
                return 0;
            case 5:
                b24Var.f451989g = aVar2.k(intValue);
                return 0;
            case 6:
                b24Var.f451990h = aVar2.k(intValue);
                return 0;
            case 7:
                b24Var.f451991i = aVar2.k(intValue);
                return 0;
            case 8:
                b24Var.f451992m = aVar2.k(intValue);
                return 0;
            case 9:
                b24Var.f451993n = aVar2.d(intValue);
                return 0;
            case 10:
                b24Var.f451994o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q24 q24Var = new r45.q24();
                    if (bArr3 != null && bArr3.length > 0) {
                        q24Var.mo11468x92b714fd(bArr3);
                    }
                    b24Var.f451995p.add(q24Var);
                }
                return 0;
            case 12:
                b24Var.f451996q = aVar2.k(intValue);
                return 0;
            case 13:
                b24Var.f451997r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
