package r45;

/* loaded from: classes10.dex */
public class lx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f461454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461455e;

    /* renamed from: f, reason: collision with root package name */
    public long f461456f;

    /* renamed from: g, reason: collision with root package name */
    public long f461457g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461458h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f461459i;

    /* renamed from: m, reason: collision with root package name */
    public int f461460m;

    /* renamed from: n, reason: collision with root package name */
    public int f461461n;

    /* renamed from: o, reason: collision with root package name */
    public r45.yx1 f461462o;

    /* renamed from: p, reason: collision with root package name */
    public r45.nx1 f461463p;

    /* renamed from: q, reason: collision with root package name */
    public r45.dy1 f461464q;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 20600;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivektvmodsonglist";
        lVar.f152197a = this;
        lVar.f152198b = new r45.mx1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lx1)) {
            return false;
        }
        r45.lx1 lx1Var = (r45.lx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, lx1Var.f76494x2de60e5e) && n51.f.a(this.f461454d, lx1Var.f461454d) && n51.f.a(this.f461455e, lx1Var.f461455e) && n51.f.a(java.lang.Long.valueOf(this.f461456f), java.lang.Long.valueOf(lx1Var.f461456f)) && n51.f.a(java.lang.Long.valueOf(this.f461457g), java.lang.Long.valueOf(lx1Var.f461457g)) && n51.f.a(this.f461458h, lx1Var.f461458h) && n51.f.a(this.f461459i, lx1Var.f461459i) && n51.f.a(java.lang.Integer.valueOf(this.f461460m), java.lang.Integer.valueOf(lx1Var.f461460m)) && n51.f.a(java.lang.Integer.valueOf(this.f461461n), java.lang.Integer.valueOf(lx1Var.f461461n)) && n51.f.a(this.f461462o, lx1Var.f461462o) && n51.f.a(this.f461463p, lx1Var.f461463p) && n51.f.a(this.f461464q, lx1Var.f461464q);
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
            r45.kv0 kv0Var = this.f461454d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f461454d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f461455e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f461456f);
            fVar.h(5, this.f461457g);
            java.lang.String str2 = this.f461458h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f461459i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f461460m);
            fVar.e(9, this.f461461n);
            r45.yx1 yx1Var = this.f461462o;
            if (yx1Var != null) {
                fVar.i(10, yx1Var.mo75928xcd1e8d8());
                this.f461462o.mo75956x3d5d1f78(fVar);
            }
            r45.nx1 nx1Var = this.f461463p;
            if (nx1Var != null) {
                fVar.i(11, nx1Var.mo75928xcd1e8d8());
                this.f461463p.mo75956x3d5d1f78(fVar);
            }
            r45.dy1 dy1Var = this.f461464q;
            if (dy1Var != null) {
                fVar.i(12, dy1Var.mo75928xcd1e8d8());
                this.f461464q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f461454d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f461455e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f461456f) + b36.f.h(5, this.f461457g);
            java.lang.String str4 = this.f461458h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f461459i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int e17 = h17 + b36.f.e(8, this.f461460m) + b36.f.e(9, this.f461461n);
            r45.yx1 yx1Var2 = this.f461462o;
            if (yx1Var2 != null) {
                e17 += b36.f.i(10, yx1Var2.mo75928xcd1e8d8());
            }
            r45.nx1 nx1Var2 = this.f461463p;
            if (nx1Var2 != null) {
                e17 += b36.f.i(11, nx1Var2.mo75928xcd1e8d8());
            }
            r45.dy1 dy1Var2 = this.f461464q;
            return dy1Var2 != null ? e17 + b36.f.i(12, dy1Var2.mo75928xcd1e8d8()) : e17;
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
        r45.lx1 lx1Var = (r45.lx1) objArr[1];
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
                    lx1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    lx1Var.f461454d = kv0Var3;
                }
                return 0;
            case 3:
                lx1Var.f461455e = aVar2.k(intValue);
                return 0;
            case 4:
                lx1Var.f461456f = aVar2.i(intValue);
                return 0;
            case 5:
                lx1Var.f461457g = aVar2.i(intValue);
                return 0;
            case 6:
                lx1Var.f461458h = aVar2.k(intValue);
                return 0;
            case 7:
                lx1Var.f461459i = aVar2.d(intValue);
                return 0;
            case 8:
                lx1Var.f461460m = aVar2.g(intValue);
                return 0;
            case 9:
                lx1Var.f461461n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.yx1 yx1Var3 = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var3.mo11468x92b714fd(bArr3);
                    }
                    lx1Var.f461462o = yx1Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.nx1 nx1Var3 = new r45.nx1();
                    if (bArr4 != null && bArr4.length > 0) {
                        nx1Var3.mo11468x92b714fd(bArr4);
                    }
                    lx1Var.f461463p = nx1Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.dy1 dy1Var3 = new r45.dy1();
                    if (bArr5 != null && bArr5.length > 0) {
                        dy1Var3.mo11468x92b714fd(bArr5);
                    }
                    lx1Var.f461464q = dy1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
