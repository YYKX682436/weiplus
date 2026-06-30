package r45;

/* loaded from: classes9.dex */
public class aj extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451562d;

    /* renamed from: e, reason: collision with root package name */
    public int f451563e;

    /* renamed from: f, reason: collision with root package name */
    public int f451564f;

    /* renamed from: g, reason: collision with root package name */
    public long f451565g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 f451566h;

    /* renamed from: i, reason: collision with root package name */
    public int f451567i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cj f451568m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vi f451569n;

    /* renamed from: o, reason: collision with root package name */
    public long f451570o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f451571p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f451572q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f451573r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f451574s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f451575t;

    /* renamed from: u, reason: collision with root package name */
    public int f451576u;

    /* renamed from: v, reason: collision with root package name */
    public int f451577v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f451578w = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f451579x;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aj)) {
            return false;
        }
        r45.aj ajVar = (r45.aj) fVar;
        return n51.f.a(this.f76494x2de60e5e, ajVar.f76494x2de60e5e) && n51.f.a(this.f451562d, ajVar.f451562d) && n51.f.a(java.lang.Integer.valueOf(this.f451563e), java.lang.Integer.valueOf(ajVar.f451563e)) && n51.f.a(java.lang.Integer.valueOf(this.f451564f), java.lang.Integer.valueOf(ajVar.f451564f)) && n51.f.a(java.lang.Long.valueOf(this.f451565g), java.lang.Long.valueOf(ajVar.f451565g)) && n51.f.a(this.f451566h, ajVar.f451566h) && n51.f.a(java.lang.Integer.valueOf(this.f451567i), java.lang.Integer.valueOf(ajVar.f451567i)) && n51.f.a(this.f451568m, ajVar.f451568m) && n51.f.a(this.f451569n, ajVar.f451569n) && n51.f.a(java.lang.Long.valueOf(this.f451570o), java.lang.Long.valueOf(ajVar.f451570o)) && n51.f.a(this.f451571p, ajVar.f451571p) && n51.f.a(this.f451572q, ajVar.f451572q) && n51.f.a(this.f451573r, ajVar.f451573r) && n51.f.a(this.f451574s, ajVar.f451574s) && n51.f.a(this.f451575t, ajVar.f451575t) && n51.f.a(java.lang.Integer.valueOf(this.f451576u), java.lang.Integer.valueOf(ajVar.f451576u)) && n51.f.a(java.lang.Integer.valueOf(this.f451577v), java.lang.Integer.valueOf(ajVar.f451577v)) && n51.f.a(this.f451578w, ajVar.f451578w) && n51.f.a(this.f451579x, ajVar.f451579x);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451578w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451562d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(11, this.f451563e);
            fVar.e(12, this.f451564f);
            fVar.h(18, this.f451565g);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b97615 = this.f451566h;
            if (c19798x64b97615 != null) {
                fVar.i(21, c19798x64b97615.mo75928xcd1e8d8());
                this.f451566h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(22, this.f451567i);
            r45.cj cjVar = this.f451568m;
            if (cjVar != null) {
                fVar.i(23, cjVar.mo75928xcd1e8d8());
                this.f451568m.mo75956x3d5d1f78(fVar);
            }
            r45.vi viVar = this.f451569n;
            if (viVar != null) {
                fVar.i(26, viVar.mo75928xcd1e8d8());
                this.f451569n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(27, this.f451570o);
            java.lang.String str = this.f451571p;
            if (str != null) {
                fVar.j(28, str);
            }
            java.lang.String str2 = this.f451572q;
            if (str2 != null) {
                fVar.j(29, str2);
            }
            java.lang.String str3 = this.f451573r;
            if (str3 != null) {
                fVar.j(30, str3);
            }
            java.lang.String str4 = this.f451574s;
            if (str4 != null) {
                fVar.j(31, str4);
            }
            java.lang.String str5 = this.f451575t;
            if (str5 != null) {
                fVar.j(32, str5);
            }
            fVar.e(33, this.f451576u);
            fVar.e(34, this.f451577v);
            fVar.g(35, 8, linkedList);
            java.lang.String str6 = this.f451579x;
            if (str6 != null) {
                fVar.j(37, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451562d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(11, this.f451563e) + b36.f.e(12, this.f451564f) + b36.f.h(18, this.f451565g);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976152 = this.f451566h;
            if (c19798x64b976152 != null) {
                e17 += b36.f.i(21, c19798x64b976152.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(22, this.f451567i);
            r45.cj cjVar2 = this.f451568m;
            if (cjVar2 != null) {
                e18 += b36.f.i(23, cjVar2.mo75928xcd1e8d8());
            }
            r45.vi viVar2 = this.f451569n;
            if (viVar2 != null) {
                e18 += b36.f.i(26, viVar2.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(27, this.f451570o);
            java.lang.String str7 = this.f451571p;
            if (str7 != null) {
                h17 += b36.f.j(28, str7);
            }
            java.lang.String str8 = this.f451572q;
            if (str8 != null) {
                h17 += b36.f.j(29, str8);
            }
            java.lang.String str9 = this.f451573r;
            if (str9 != null) {
                h17 += b36.f.j(30, str9);
            }
            java.lang.String str10 = this.f451574s;
            if (str10 != null) {
                h17 += b36.f.j(31, str10);
            }
            java.lang.String str11 = this.f451575t;
            if (str11 != null) {
                h17 += b36.f.j(32, str11);
            }
            int e19 = h17 + b36.f.e(33, this.f451576u) + b36.f.e(34, this.f451577v) + b36.f.g(35, 8, linkedList);
            java.lang.String str12 = this.f451579x;
            return str12 != null ? e19 + b36.f.j(37, str12) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.aj ajVar = (r45.aj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                ajVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ajVar.f451562d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 11) {
            ajVar.f451563e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 12) {
            ajVar.f451564f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 18) {
            ajVar.f451565g = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 37) {
            ajVar.f451579x = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 21:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615 c19798x64b976153 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19798x64b97615();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19798x64b976153.mo11468x92b714fd(bArr3);
                    }
                    ajVar.f451566h = c19798x64b976153;
                }
                return 0;
            case 22:
                ajVar.f451567i = aVar2.g(intValue);
                return 0;
            case 23:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.cj cjVar3 = new r45.cj();
                    if (bArr4 != null && bArr4.length > 0) {
                        cjVar3.mo11468x92b714fd(bArr4);
                    }
                    ajVar.f451568m = cjVar3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 26:
                        java.util.LinkedList j27 = aVar2.j(intValue);
                        int size4 = j27.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            byte[] bArr5 = (byte[]) j27.get(i29);
                            r45.vi viVar3 = new r45.vi();
                            if (bArr5 != null && bArr5.length > 0) {
                                viVar3.mo11468x92b714fd(bArr5);
                            }
                            ajVar.f451569n = viVar3;
                        }
                        return 0;
                    case 27:
                        ajVar.f451570o = aVar2.i(intValue);
                        return 0;
                    case 28:
                        ajVar.f451571p = aVar2.k(intValue);
                        return 0;
                    case 29:
                        ajVar.f451572q = aVar2.k(intValue);
                        return 0;
                    case 30:
                        ajVar.f451573r = aVar2.k(intValue);
                        return 0;
                    case 31:
                        ajVar.f451574s = aVar2.k(intValue);
                        return 0;
                    case 32:
                        ajVar.f451575t = aVar2.k(intValue);
                        return 0;
                    case 33:
                        ajVar.f451576u = aVar2.g(intValue);
                        return 0;
                    case 34:
                        ajVar.f451577v = aVar2.g(intValue);
                        return 0;
                    case 35:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size5 = j28.size();
                        for (int i37 = 0; i37 < size5; i37++) {
                            byte[] bArr6 = (byte[]) j28.get(i37);
                            r45.si siVar = new r45.si();
                            if (bArr6 != null && bArr6.length > 0) {
                                siVar.mo11468x92b714fd(bArr6);
                            }
                            ajVar.f451578w.add(siVar);
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
