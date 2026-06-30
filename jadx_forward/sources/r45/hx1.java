package r45;

/* loaded from: classes8.dex */
public class hx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f458060d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458061e;

    /* renamed from: f, reason: collision with root package name */
    public long f458062f;

    /* renamed from: g, reason: collision with root package name */
    public long f458063g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458064h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458065i;

    /* renamed from: m, reason: collision with root package name */
    public int f458066m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458067n;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 18826;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivektvgetsongplayinfo";
        lVar.f152197a = this;
        lVar.f152198b = new r45.ix1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hx1)) {
            return false;
        }
        r45.hx1 hx1Var = (r45.hx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, hx1Var.f76494x2de60e5e) && n51.f.a(this.f458060d, hx1Var.f458060d) && n51.f.a(this.f458061e, hx1Var.f458061e) && n51.f.a(java.lang.Long.valueOf(this.f458062f), java.lang.Long.valueOf(hx1Var.f458062f)) && n51.f.a(java.lang.Long.valueOf(this.f458063g), java.lang.Long.valueOf(hx1Var.f458063g)) && n51.f.a(this.f458064h, hx1Var.f458064h) && n51.f.a(this.f458065i, hx1Var.f458065i) && n51.f.a(java.lang.Integer.valueOf(this.f458066m), java.lang.Integer.valueOf(hx1Var.f458066m)) && n51.f.a(this.f458067n, hx1Var.f458067n);
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
            r45.kv0 kv0Var = this.f458060d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f458060d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f458061e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f458062f);
            fVar.h(5, this.f458063g);
            java.lang.String str2 = this.f458064h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458065i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.e(8, this.f458066m);
            java.lang.String str3 = this.f458067n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f458060d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f458061e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int h17 = i18 + b36.f.h(4, this.f458062f) + b36.f.h(5, this.f458063g);
            java.lang.String str5 = this.f458064h;
            if (str5 != null) {
                h17 += b36.f.j(6, str5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458065i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int e17 = h17 + b36.f.e(8, this.f458066m);
            java.lang.String str6 = this.f458067n;
            return str6 != null ? e17 + b36.f.j(9, str6) : e17;
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
        r45.hx1 hx1Var = (r45.hx1) objArr[1];
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
                    hx1Var.f76494x2de60e5e = heVar3;
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
                    hx1Var.f458060d = kv0Var3;
                }
                return 0;
            case 3:
                hx1Var.f458061e = aVar2.k(intValue);
                return 0;
            case 4:
                hx1Var.f458062f = aVar2.i(intValue);
                return 0;
            case 5:
                hx1Var.f458063g = aVar2.i(intValue);
                return 0;
            case 6:
                hx1Var.f458064h = aVar2.k(intValue);
                return 0;
            case 7:
                hx1Var.f458065i = aVar2.d(intValue);
                return 0;
            case 8:
                hx1Var.f458066m = aVar2.g(intValue);
                return 0;
            case 9:
                hx1Var.f458067n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
