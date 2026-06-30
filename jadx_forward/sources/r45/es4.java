package r45;

/* loaded from: classes2.dex */
public class es4 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455235e;

    /* renamed from: f, reason: collision with root package name */
    public int f455236f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455237g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sq2 f455238h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455239i;

    /* renamed from: o, reason: collision with root package name */
    public r45.l42 f455242o;

    /* renamed from: p, reason: collision with root package name */
    public r45.bx2 f455243p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f455245r;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f455234d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f455240m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f455241n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f455244q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.es4)) {
            return false;
        }
        r45.es4 es4Var = (r45.es4) fVar;
        return n51.f.a(this.f76492x92037252, es4Var.f76492x92037252) && n51.f.a(this.f455234d, es4Var.f455234d) && n51.f.a(this.f455235e, es4Var.f455235e) && n51.f.a(java.lang.Integer.valueOf(this.f455236f), java.lang.Integer.valueOf(es4Var.f455236f)) && n51.f.a(this.f455237g, es4Var.f455237g) && n51.f.a(this.f455238h, es4Var.f455238h) && n51.f.a(this.f455239i, es4Var.f455239i) && n51.f.a(this.f455240m, es4Var.f455240m) && n51.f.a(this.f455241n, es4Var.f455241n) && n51.f.a(this.f455242o, es4Var.f455242o) && n51.f.a(this.f455243p, es4Var.f455243p) && n51.f.a(this.f455244q, es4Var.f455244q) && n51.f.a(this.f455245r, es4Var.f455245r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455244q;
        java.util.LinkedList linkedList2 = this.f455241n;
        java.util.LinkedList linkedList3 = this.f455240m;
        java.util.LinkedList linkedList4 = this.f455234d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList4);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455235e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f455236f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455237g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            r45.sq2 sq2Var = this.f455238h;
            if (sq2Var != null) {
                fVar.i(6, sq2Var.mo75928xcd1e8d8());
                this.f455238h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455239i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.g(8, 8, linkedList3);
            fVar.g(9, 8, linkedList2);
            r45.l42 l42Var = this.f455242o;
            if (l42Var != null) {
                fVar.i(10, l42Var.mo75928xcd1e8d8());
                this.f455242o.mo75956x3d5d1f78(fVar);
            }
            r45.bx2 bx2Var = this.f455243p;
            if (bx2Var != null) {
                fVar.i(11, bx2Var.mo75928xcd1e8d8());
                this.f455243p.mo75956x3d5d1f78(fVar);
            }
            fVar.g(12, 7, linkedList);
            java.lang.String str2 = this.f455245r;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList4);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f455235e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f455236f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f455237g;
            if (gVar4 != null) {
                e17 += b36.f.b(5, gVar4);
            }
            r45.sq2 sq2Var2 = this.f455238h;
            if (sq2Var2 != null) {
                e17 += b36.f.i(6, sq2Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f455239i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList3) + b36.f.g(9, 8, linkedList2);
            r45.l42 l42Var2 = this.f455242o;
            if (l42Var2 != null) {
                g17 += b36.f.i(10, l42Var2.mo75928xcd1e8d8());
            }
            r45.bx2 bx2Var2 = this.f455243p;
            if (bx2Var2 != null) {
                g17 += b36.f.i(11, bx2Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(12, 7, linkedList);
            java.lang.String str4 = this.f455245r;
            return str4 != null ? g18 + b36.f.j(100, str4) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.es4 es4Var = (r45.es4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            es4Var.f455245r = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    es4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19792x256d2725.mo11468x92b714fd(bArr3);
                    }
                    es4Var.f455234d.add(c19792x256d2725);
                }
                return 0;
            case 3:
                es4Var.f455235e = aVar2.d(intValue);
                return 0;
            case 4:
                es4Var.f455236f = aVar2.g(intValue);
                return 0;
            case 5:
                es4Var.f455237g = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.sq2 sq2Var3 = new r45.sq2();
                    if (bArr4 != null && bArr4.length > 0) {
                        sq2Var3.mo11468x92b714fd(bArr4);
                    }
                    es4Var.f455238h = sq2Var3;
                }
                return 0;
            case 7:
                es4Var.f455239i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ww2 ww2Var = new r45.ww2();
                    if (bArr5 != null && bArr5.length > 0) {
                        ww2Var.mo11468x92b714fd(bArr5);
                    }
                    es4Var.f455240m.add(ww2Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.rx2 rx2Var = new r45.rx2();
                    if (bArr6 != null && bArr6.length > 0) {
                        rx2Var.mo11468x92b714fd(bArr6);
                    }
                    es4Var.f455241n.add(rx2Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.l42 l42Var3 = new r45.l42();
                    if (bArr7 != null && bArr7.length > 0) {
                        l42Var3.mo11468x92b714fd(bArr7);
                    }
                    es4Var.f455242o = l42Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.bx2 bx2Var3 = new r45.bx2();
                    if (bArr8 != null && bArr8.length > 0) {
                        bx2Var3.mo11468x92b714fd(bArr8);
                    }
                    es4Var.f455243p = bx2Var3;
                }
                return 0;
            case 12:
                es4Var.f455244q.add(java.lang.Boolean.valueOf(aVar2.c(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
