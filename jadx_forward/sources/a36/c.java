package a36;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f82637d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f82638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82639f;

    /* renamed from: g, reason: collision with root package name */
    public int f82640g;

    /* renamed from: h, reason: collision with root package name */
    public a36.a f82641h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f82642i;

    /* renamed from: m, reason: collision with root package name */
    public int f82643m;

    /* renamed from: n, reason: collision with root package name */
    public int f82644n;

    /* renamed from: o, reason: collision with root package name */
    public a36.f f82645o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f82646p;

    /* renamed from: q, reason: collision with root package name */
    public a36.b f82647q;

    /* renamed from: r, reason: collision with root package name */
    public a36.d f82648r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof a36.c)) {
            return false;
        }
        a36.c cVar = (a36.c) fVar;
        return n51.f.a(this.f82637d, cVar.f82637d) && n51.f.a(java.lang.Integer.valueOf(this.f82638e), java.lang.Integer.valueOf(cVar.f82638e)) && n51.f.a(this.f82639f, cVar.f82639f) && n51.f.a(java.lang.Integer.valueOf(this.f82640g), java.lang.Integer.valueOf(cVar.f82640g)) && n51.f.a(this.f82641h, cVar.f82641h) && n51.f.a(this.f82642i, cVar.f82642i) && n51.f.a(java.lang.Integer.valueOf(this.f82643m), java.lang.Integer.valueOf(cVar.f82643m)) && n51.f.a(java.lang.Integer.valueOf(this.f82644n), java.lang.Integer.valueOf(cVar.f82644n)) && n51.f.a(this.f82645o, cVar.f82645o) && n51.f.a(this.f82646p, cVar.f82646p) && n51.f.a(this.f82647q, cVar.f82647q) && n51.f.a(this.f82648r, cVar.f82648r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f82637d);
            fVar.e(2, this.f82638e);
            java.lang.String str = this.f82639f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f82640g);
            a36.a aVar = this.f82641h;
            if (aVar != null) {
                fVar.i(5, aVar.mo75928xcd1e8d8());
                this.f82641h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f82642i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f82643m);
            fVar.e(8, this.f82644n);
            a36.f fVar2 = this.f82645o;
            if (fVar2 != null) {
                fVar.i(9, fVar2.mo75928xcd1e8d8());
                this.f82645o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f82646p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            a36.b bVar = this.f82647q;
            if (bVar != null) {
                fVar.i(11, bVar.mo75928xcd1e8d8());
                this.f82647q.mo75956x3d5d1f78(fVar);
            }
            a36.d dVar = this.f82648r;
            if (dVar != null) {
                fVar.i(12, dVar.mo75928xcd1e8d8());
                this.f82648r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f82637d) + 0 + b36.f.e(2, this.f82638e);
            java.lang.String str4 = this.f82639f;
            if (str4 != null) {
                g17 += b36.f.j(3, str4);
            }
            int e17 = g17 + b36.f.e(4, this.f82640g);
            a36.a aVar2 = this.f82641h;
            if (aVar2 != null) {
                e17 += b36.f.i(5, aVar2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f82642i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f82643m) + b36.f.e(8, this.f82644n);
            a36.f fVar3 = this.f82645o;
            if (fVar3 != null) {
                e18 += b36.f.i(9, fVar3.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f82646p;
            if (str6 != null) {
                e18 += b36.f.j(10, str6);
            }
            a36.b bVar2 = this.f82647q;
            if (bVar2 != null) {
                e18 += b36.f.i(11, bVar2.mo75928xcd1e8d8());
            }
            a36.d dVar2 = this.f82648r;
            return dVar2 != null ? e18 + b36.f.i(12, dVar2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f82637d.clear();
            c36.a aVar3 = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        a36.c cVar = (a36.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    a36.i iVar = new a36.i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar.mo11468x92b714fd(bArr2);
                    }
                    cVar.f82637d.add(iVar);
                }
                return 0;
            case 2:
                cVar.f82638e = aVar4.g(intValue);
                return 0;
            case 3:
                cVar.f82639f = aVar4.k(intValue);
                return 0;
            case 4:
                cVar.f82640g = aVar4.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    a36.a aVar5 = new a36.a();
                    if (bArr3 != null && bArr3.length > 0) {
                        aVar5.mo11468x92b714fd(bArr3);
                    }
                    cVar.f82641h = aVar5;
                }
                return 0;
            case 6:
                cVar.f82642i = aVar4.k(intValue);
                return 0;
            case 7:
                cVar.f82643m = aVar4.g(intValue);
                return 0;
            case 8:
                cVar.f82644n = aVar4.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    a36.f fVar4 = new a36.f();
                    if (bArr4 != null && bArr4.length > 0) {
                        fVar4.mo11468x92b714fd(bArr4);
                    }
                    cVar.f82645o = fVar4;
                }
                return 0;
            case 10:
                cVar.f82646p = aVar4.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar4.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    a36.b bVar3 = new a36.b();
                    if (bArr5 != null && bArr5.length > 0) {
                        bVar3.mo11468x92b714fd(bArr5);
                    }
                    cVar.f82647q = bVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar4.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    a36.d dVar3 = new a36.d();
                    if (bArr6 != null && bArr6.length > 0) {
                        dVar3.mo11468x92b714fd(bArr6);
                    }
                    cVar.f82648r = dVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
