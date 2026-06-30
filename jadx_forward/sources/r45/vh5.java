package r45;

/* loaded from: classes9.dex */
public class vh5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f469777d;

    /* renamed from: e, reason: collision with root package name */
    public int f469778e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469779f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469780g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469781h;

    /* renamed from: i, reason: collision with root package name */
    public int f469782i;

    /* renamed from: m, reason: collision with root package name */
    public int f469783m;

    /* renamed from: n, reason: collision with root package name */
    public int f469784n;

    /* renamed from: o, reason: collision with root package name */
    public long f469785o;

    /* renamed from: p, reason: collision with root package name */
    public r45.wh5 f469786p;

    /* renamed from: q, reason: collision with root package name */
    public r45.u67 f469787q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f469788r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vh5)) {
            return false;
        }
        r45.vh5 vh5Var = (r45.vh5) fVar;
        return n51.f.a(this.f76494x2de60e5e, vh5Var.f76494x2de60e5e) && n51.f.a(this.f469777d, vh5Var.f469777d) && n51.f.a(java.lang.Integer.valueOf(this.f469778e), java.lang.Integer.valueOf(vh5Var.f469778e)) && n51.f.a(this.f469779f, vh5Var.f469779f) && n51.f.a(this.f469780g, vh5Var.f469780g) && n51.f.a(this.f469781h, vh5Var.f469781h) && n51.f.a(java.lang.Integer.valueOf(this.f469782i), java.lang.Integer.valueOf(vh5Var.f469782i)) && n51.f.a(java.lang.Integer.valueOf(this.f469783m), java.lang.Integer.valueOf(vh5Var.f469783m)) && n51.f.a(java.lang.Integer.valueOf(this.f469784n), java.lang.Integer.valueOf(vh5Var.f469784n)) && n51.f.a(java.lang.Long.valueOf(this.f469785o), java.lang.Long.valueOf(vh5Var.f469785o)) && n51.f.a(this.f469786p, vh5Var.f469786p) && n51.f.a(this.f469787q, vh5Var.f469787q) && n51.f.a(this.f469788r, vh5Var.f469788r);
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
            r45.ae aeVar = this.f469777d;
            if (aeVar != null) {
                fVar.i(2, aeVar.mo75928xcd1e8d8());
                this.f469777d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469778e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469779f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469780g;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f469781h;
            if (gVar3 != null) {
                fVar.b(6, gVar3);
            }
            fVar.e(7, this.f469782i);
            fVar.e(8, this.f469783m);
            fVar.e(9, this.f469784n);
            fVar.h(10, this.f469785o);
            r45.wh5 wh5Var = this.f469786p;
            if (wh5Var != null) {
                fVar.i(11, wh5Var.mo75928xcd1e8d8());
                this.f469786p.mo75956x3d5d1f78(fVar);
            }
            r45.u67 u67Var = this.f469787q;
            if (u67Var != null) {
                fVar.i(12, u67Var.mo75928xcd1e8d8());
                this.f469787q.mo75956x3d5d1f78(fVar);
            }
            fVar.g(13, 2, this.f469788r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.ae aeVar2 = this.f469777d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f469778e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f469779f;
            if (gVar4 != null) {
                e17 += b36.f.b(4, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f469780g;
            if (gVar5 != null) {
                e17 += b36.f.b(5, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f469781h;
            if (gVar6 != null) {
                e17 += b36.f.b(6, gVar6);
            }
            int e18 = e17 + b36.f.e(7, this.f469782i) + b36.f.e(8, this.f469783m) + b36.f.e(9, this.f469784n) + b36.f.h(10, this.f469785o);
            r45.wh5 wh5Var2 = this.f469786p;
            if (wh5Var2 != null) {
                e18 += b36.f.i(11, wh5Var2.mo75928xcd1e8d8());
            }
            r45.u67 u67Var2 = this.f469787q;
            if (u67Var2 != null) {
                e18 += b36.f.i(12, u67Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.g(13, 2, this.f469788r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f469788r.clear();
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
        r45.vh5 vh5Var = (r45.vh5) objArr[1];
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
                    vh5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr3 != null && bArr3.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr3);
                    }
                    vh5Var.f469777d = aeVar3;
                }
                return 0;
            case 3:
                vh5Var.f469778e = aVar2.g(intValue);
                return 0;
            case 4:
                vh5Var.f469779f = aVar2.d(intValue);
                return 0;
            case 5:
                vh5Var.f469780g = aVar2.d(intValue);
                return 0;
            case 6:
                vh5Var.f469781h = aVar2.d(intValue);
                return 0;
            case 7:
                vh5Var.f469782i = aVar2.g(intValue);
                return 0;
            case 8:
                vh5Var.f469783m = aVar2.g(intValue);
                return 0;
            case 9:
                vh5Var.f469784n = aVar2.g(intValue);
                return 0;
            case 10:
                vh5Var.f469785o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wh5 wh5Var3 = new r45.wh5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wh5Var3.mo11468x92b714fd(bArr4);
                    }
                    vh5Var.f469786p = wh5Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.u67 u67Var3 = new r45.u67();
                    if (bArr5 != null && bArr5.length > 0) {
                        u67Var3.mo11468x92b714fd(bArr5);
                    }
                    vh5Var.f469787q = u67Var3;
                }
                return 0;
            case 13:
                vh5Var.f469788r.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            default:
                return -1;
        }
    }
}
