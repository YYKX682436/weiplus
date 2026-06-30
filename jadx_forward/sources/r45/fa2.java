package r45;

/* loaded from: classes2.dex */
public class fa2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455658d;

    /* renamed from: e, reason: collision with root package name */
    public int f455659e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455660f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455661g;

    /* renamed from: i, reason: collision with root package name */
    public int f455663i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f455665n;

    /* renamed from: o, reason: collision with root package name */
    public int f455666o;

    /* renamed from: p, reason: collision with root package name */
    public r45.dd2 f455667p;

    /* renamed from: q, reason: collision with root package name */
    public r45.uz2 f455668q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ed2 f455669r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hp1 f455670s;

    /* renamed from: t, reason: collision with root package name */
    public int f455671t;

    /* renamed from: u, reason: collision with root package name */
    public r45.nq1 f455672u;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f455662h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f455664m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa2)) {
            return false;
        }
        r45.fa2 fa2Var = (r45.fa2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455658d), java.lang.Integer.valueOf(fa2Var.f455658d)) && n51.f.a(java.lang.Integer.valueOf(this.f455659e), java.lang.Integer.valueOf(fa2Var.f455659e)) && n51.f.a(this.f455660f, fa2Var.f455660f) && n51.f.a(this.f455661g, fa2Var.f455661g) && n51.f.a(this.f455662h, fa2Var.f455662h) && n51.f.a(java.lang.Integer.valueOf(this.f455663i), java.lang.Integer.valueOf(fa2Var.f455663i)) && n51.f.a(this.f455664m, fa2Var.f455664m) && n51.f.a(this.f455665n, fa2Var.f455665n) && n51.f.a(java.lang.Integer.valueOf(this.f455666o), java.lang.Integer.valueOf(fa2Var.f455666o)) && n51.f.a(this.f455667p, fa2Var.f455667p) && n51.f.a(this.f455668q, fa2Var.f455668q) && n51.f.a(this.f455669r, fa2Var.f455669r) && n51.f.a(this.f455670s, fa2Var.f455670s) && n51.f.a(java.lang.Integer.valueOf(this.f455671t), java.lang.Integer.valueOf(fa2Var.f455671t)) && n51.f.a(this.f455672u, fa2Var.f455672u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455664m;
        java.util.LinkedList linkedList2 = this.f455662h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455658d);
            fVar.e(2, this.f455659e);
            java.lang.String str = this.f455660f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f455661g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f455663i);
            fVar.g(7, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f455665n;
            if (gVar != null) {
                fVar.b(8, gVar);
            }
            fVar.e(9, this.f455666o);
            r45.dd2 dd2Var = this.f455667p;
            if (dd2Var != null) {
                fVar.i(10, dd2Var.mo75928xcd1e8d8());
                this.f455667p.mo75956x3d5d1f78(fVar);
            }
            r45.uz2 uz2Var = this.f455668q;
            if (uz2Var != null) {
                fVar.i(11, uz2Var.mo75928xcd1e8d8());
                this.f455668q.mo75956x3d5d1f78(fVar);
            }
            r45.ed2 ed2Var = this.f455669r;
            if (ed2Var != null) {
                fVar.i(12, ed2Var.mo75928xcd1e8d8());
                this.f455669r.mo75956x3d5d1f78(fVar);
            }
            r45.hp1 hp1Var = this.f455670s;
            if (hp1Var != null) {
                fVar.i(13, hp1Var.mo75928xcd1e8d8());
                this.f455670s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f455671t);
            r45.nq1 nq1Var = this.f455672u;
            if (nq1Var != null) {
                fVar.i(15, nq1Var.mo75928xcd1e8d8());
                this.f455672u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455658d) + 0 + b36.f.e(2, this.f455659e);
            java.lang.String str3 = this.f455660f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f455661g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            int g17 = e17 + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f455663i) + b36.f.g(7, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f455665n;
            if (gVar2 != null) {
                g17 += b36.f.b(8, gVar2);
            }
            int e18 = g17 + b36.f.e(9, this.f455666o);
            r45.dd2 dd2Var2 = this.f455667p;
            if (dd2Var2 != null) {
                e18 += b36.f.i(10, dd2Var2.mo75928xcd1e8d8());
            }
            r45.uz2 uz2Var2 = this.f455668q;
            if (uz2Var2 != null) {
                e18 += b36.f.i(11, uz2Var2.mo75928xcd1e8d8());
            }
            r45.ed2 ed2Var2 = this.f455669r;
            if (ed2Var2 != null) {
                e18 += b36.f.i(12, ed2Var2.mo75928xcd1e8d8());
            }
            r45.hp1 hp1Var2 = this.f455670s;
            if (hp1Var2 != null) {
                e18 += b36.f.i(13, hp1Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(14, this.f455671t);
            r45.nq1 nq1Var2 = this.f455672u;
            return nq1Var2 != null ? e19 + b36.f.i(15, nq1Var2.mo75928xcd1e8d8()) : e19;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.fa2 fa2Var = (r45.fa2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fa2Var.f455658d = aVar2.g(intValue);
                return 0;
            case 2:
                fa2Var.f455659e = aVar2.g(intValue);
                return 0;
            case 3:
                fa2Var.f455660f = aVar2.k(intValue);
                return 0;
            case 4:
                fa2Var.f455661g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ea2 ea2Var = new r45.ea2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ea2Var.mo11468x92b714fd(bArr2);
                    }
                    fa2Var.f455662h.add(ea2Var);
                }
                return 0;
            case 6:
                fa2Var.f455663i = aVar2.g(intValue);
                return 0;
            case 7:
                fa2Var.f455664m.add(aVar2.k(intValue));
                return 0;
            case 8:
                fa2Var.f455665n = aVar2.d(intValue);
                return 0;
            case 9:
                fa2Var.f455666o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.dd2 dd2Var3 = new r45.dd2();
                    if (bArr3 != null && bArr3.length > 0) {
                        dd2Var3.mo11468x92b714fd(bArr3);
                    }
                    fa2Var.f455667p = dd2Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.uz2 uz2Var3 = new r45.uz2();
                    if (bArr4 != null && bArr4.length > 0) {
                        uz2Var3.mo11468x92b714fd(bArr4);
                    }
                    fa2Var.f455668q = uz2Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ed2 ed2Var3 = new r45.ed2();
                    if (bArr5 != null && bArr5.length > 0) {
                        ed2Var3.mo11468x92b714fd(bArr5);
                    }
                    fa2Var.f455669r = ed2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.hp1 hp1Var3 = new r45.hp1();
                    if (bArr6 != null && bArr6.length > 0) {
                        hp1Var3.mo11468x92b714fd(bArr6);
                    }
                    fa2Var.f455670s = hp1Var3;
                }
                return 0;
            case 14:
                fa2Var.f455671t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.nq1 nq1Var3 = new r45.nq1();
                    if (bArr7 != null && bArr7.length > 0) {
                        nq1Var3.mo11468x92b714fd(bArr7);
                    }
                    fa2Var.f455672u = nq1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
