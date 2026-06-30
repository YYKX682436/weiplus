package r45;

/* loaded from: classes10.dex */
public class yw1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f472971d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472972e;

    /* renamed from: f, reason: collision with root package name */
    public long f472973f;

    /* renamed from: g, reason: collision with root package name */
    public long f472974g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472975h;

    /* renamed from: i, reason: collision with root package name */
    public int f472976i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472977m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472978n;

    /* renamed from: o, reason: collision with root package name */
    public int f472979o;

    /* renamed from: p, reason: collision with root package name */
    public int f472980p;

    /* renamed from: q, reason: collision with root package name */
    public long f472981q;

    /* renamed from: r, reason: collision with root package name */
    public int f472982r;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 20854;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivektvgetmusicboard";
        lVar.f152197a = this;
        lVar.f152198b = new r45.zw1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yw1)) {
            return false;
        }
        r45.yw1 yw1Var = (r45.yw1) fVar;
        return n51.f.a(this.f76494x2de60e5e, yw1Var.f76494x2de60e5e) && n51.f.a(this.f472971d, yw1Var.f472971d) && n51.f.a(this.f472972e, yw1Var.f472972e) && n51.f.a(java.lang.Long.valueOf(this.f472973f), java.lang.Long.valueOf(yw1Var.f472973f)) && n51.f.a(java.lang.Long.valueOf(this.f472974g), java.lang.Long.valueOf(yw1Var.f472974g)) && n51.f.a(this.f472975h, yw1Var.f472975h) && n51.f.a(java.lang.Integer.valueOf(this.f472976i), java.lang.Integer.valueOf(yw1Var.f472976i)) && n51.f.a(this.f472977m, yw1Var.f472977m) && n51.f.a(this.f472978n, yw1Var.f472978n) && n51.f.a(java.lang.Integer.valueOf(this.f472979o), java.lang.Integer.valueOf(yw1Var.f472979o)) && n51.f.a(java.lang.Integer.valueOf(this.f472980p), java.lang.Integer.valueOf(yw1Var.f472980p)) && n51.f.a(java.lang.Long.valueOf(this.f472981q), java.lang.Long.valueOf(yw1Var.f472981q)) && n51.f.a(java.lang.Integer.valueOf(this.f472982r), java.lang.Integer.valueOf(yw1Var.f472982r));
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
            r45.kv0 kv0Var = this.f472971d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f472971d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472972e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f472973f);
            fVar.h(5, this.f472974g);
            java.lang.String str2 = this.f472975h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f472976i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472977m;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472978n;
            if (gVar2 != null) {
                fVar.b(9, gVar2);
            }
            fVar.e(10, this.f472979o);
            fVar.e(11, this.f472980p);
            fVar.h(12, this.f472981q);
            fVar.e(13, this.f472982r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f472971d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f472972e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f472973f) + b36.f.h(5, this.f472974g);
            java.lang.String str4 = this.f472975h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            int e17 = h17 + b36.f.e(7, this.f472976i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f472977m;
            if (gVar3 != null) {
                e17 += b36.f.b(8, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f472978n;
            if (gVar4 != null) {
                e17 += b36.f.b(9, gVar4);
            }
            return e17 + b36.f.e(10, this.f472979o) + b36.f.e(11, this.f472980p) + b36.f.h(12, this.f472981q) + b36.f.e(13, this.f472982r);
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
        r45.yw1 yw1Var = (r45.yw1) objArr[1];
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
                    yw1Var.f76494x2de60e5e = heVar3;
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
                    yw1Var.f472971d = kv0Var3;
                }
                return 0;
            case 3:
                yw1Var.f472972e = aVar2.k(intValue);
                return 0;
            case 4:
                yw1Var.f472973f = aVar2.i(intValue);
                return 0;
            case 5:
                yw1Var.f472974g = aVar2.i(intValue);
                return 0;
            case 6:
                yw1Var.f472975h = aVar2.k(intValue);
                return 0;
            case 7:
                yw1Var.f472976i = aVar2.g(intValue);
                return 0;
            case 8:
                yw1Var.f472977m = aVar2.d(intValue);
                return 0;
            case 9:
                yw1Var.f472978n = aVar2.d(intValue);
                return 0;
            case 10:
                yw1Var.f472979o = aVar2.g(intValue);
                return 0;
            case 11:
                yw1Var.f472980p = aVar2.g(intValue);
                return 0;
            case 12:
                yw1Var.f472981q = aVar2.i(intValue);
                return 0;
            case 13:
                yw1Var.f472982r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
