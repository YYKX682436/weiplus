package r45;

/* loaded from: classes2.dex */
public class yz2 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public r45.l42 f473051e;

    /* renamed from: f, reason: collision with root package name */
    public int f473052f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473053g;

    /* renamed from: h, reason: collision with root package name */
    public int f473054h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473055i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f473056m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f473057n;

    /* renamed from: p, reason: collision with root package name */
    public int f473059p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f473060q;

    /* renamed from: r, reason: collision with root package name */
    public int f473061r;

    /* renamed from: s, reason: collision with root package name */
    public r45.s92 f473062s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ha2 f473063t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vz2 f473064u;

    /* renamed from: v, reason: collision with root package name */
    public r45.zz2 f473065v;

    /* renamed from: w, reason: collision with root package name */
    public int f473066w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f473067x;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f473050d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f473058o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yz2)) {
            return false;
        }
        r45.yz2 yz2Var = (r45.yz2) fVar;
        return n51.f.a(this.f76492x92037252, yz2Var.f76492x92037252) && n51.f.a(this.f473050d, yz2Var.f473050d) && n51.f.a(this.f473051e, yz2Var.f473051e) && n51.f.a(java.lang.Integer.valueOf(this.f473052f), java.lang.Integer.valueOf(yz2Var.f473052f)) && n51.f.a(this.f473053g, yz2Var.f473053g) && n51.f.a(java.lang.Integer.valueOf(this.f473054h), java.lang.Integer.valueOf(yz2Var.f473054h)) && n51.f.a(this.f473055i, yz2Var.f473055i) && n51.f.a(java.lang.Boolean.valueOf(this.f473056m), java.lang.Boolean.valueOf(yz2Var.f473056m)) && n51.f.a(java.lang.Boolean.valueOf(this.f473057n), java.lang.Boolean.valueOf(yz2Var.f473057n)) && n51.f.a(this.f473058o, yz2Var.f473058o) && n51.f.a(java.lang.Integer.valueOf(this.f473059p), java.lang.Integer.valueOf(yz2Var.f473059p)) && n51.f.a(java.lang.Boolean.valueOf(this.f473060q), java.lang.Boolean.valueOf(yz2Var.f473060q)) && n51.f.a(java.lang.Integer.valueOf(this.f473061r), java.lang.Integer.valueOf(yz2Var.f473061r)) && n51.f.a(this.f473062s, yz2Var.f473062s) && n51.f.a(this.f473063t, yz2Var.f473063t) && n51.f.a(this.f473064u, yz2Var.f473064u) && n51.f.a(this.f473065v, yz2Var.f473065v) && n51.f.a(java.lang.Integer.valueOf(this.f473066w), java.lang.Integer.valueOf(yz2Var.f473066w)) && n51.f.a(java.lang.Boolean.valueOf(this.f473067x), java.lang.Boolean.valueOf(yz2Var.f473067x));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473058o;
        java.util.LinkedList linkedList2 = this.f473050d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            r45.l42 l42Var = this.f473051e;
            if (l42Var != null) {
                fVar.i(3, l42Var.mo75928xcd1e8d8());
                this.f473051e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f473052f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473053g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f473054h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473055i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.a(8, this.f473056m);
            fVar.a(9, this.f473057n);
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f473059p);
            fVar.a(12, this.f473060q);
            fVar.e(13, this.f473061r);
            r45.s92 s92Var = this.f473062s;
            if (s92Var != null) {
                fVar.i(14, s92Var.mo75928xcd1e8d8());
                this.f473062s.mo75956x3d5d1f78(fVar);
            }
            r45.ha2 ha2Var = this.f473063t;
            if (ha2Var != null) {
                fVar.i(15, ha2Var.mo75928xcd1e8d8());
                this.f473063t.mo75956x3d5d1f78(fVar);
            }
            r45.vz2 vz2Var = this.f473064u;
            if (vz2Var != null) {
                fVar.i(16, vz2Var.mo75928xcd1e8d8());
                this.f473064u.mo75956x3d5d1f78(fVar);
            }
            r45.zz2 zz2Var = this.f473065v;
            if (zz2Var != null) {
                fVar.i(17, zz2Var.mo75928xcd1e8d8());
                this.f473065v.mo75956x3d5d1f78(fVar);
            }
            fVar.e(18, this.f473066w);
            fVar.a(19, this.f473067x);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList2);
            r45.l42 l42Var2 = this.f473051e;
            if (l42Var2 != null) {
                i18 += b36.f.i(3, l42Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f473052f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f473053g;
            if (gVar3 != null) {
                e17 += b36.f.b(5, gVar3);
            }
            int e18 = e17 + b36.f.e(6, this.f473054h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f473055i;
            if (gVar4 != null) {
                e18 += b36.f.b(7, gVar4);
            }
            int a17 = e18 + b36.f.a(8, this.f473056m) + b36.f.a(9, this.f473057n) + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f473059p) + b36.f.a(12, this.f473060q) + b36.f.e(13, this.f473061r);
            r45.s92 s92Var2 = this.f473062s;
            if (s92Var2 != null) {
                a17 += b36.f.i(14, s92Var2.mo75928xcd1e8d8());
            }
            r45.ha2 ha2Var2 = this.f473063t;
            if (ha2Var2 != null) {
                a17 += b36.f.i(15, ha2Var2.mo75928xcd1e8d8());
            }
            r45.vz2 vz2Var2 = this.f473064u;
            if (vz2Var2 != null) {
                a17 += b36.f.i(16, vz2Var2.mo75928xcd1e8d8());
            }
            r45.zz2 zz2Var2 = this.f473065v;
            if (zz2Var2 != null) {
                a17 += b36.f.i(17, zz2Var2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.e(18, this.f473066w) + b36.f.a(19, this.f473067x);
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
        r45.yz2 yz2Var = (r45.yz2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    yz2Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fa2 fa2Var = new r45.fa2();
                    if (bArr3 != null && bArr3.length > 0) {
                        fa2Var.mo11468x92b714fd(bArr3);
                    }
                    yz2Var.f473050d.add(fa2Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.l42 l42Var3 = new r45.l42();
                    if (bArr4 != null && bArr4.length > 0) {
                        l42Var3.mo11468x92b714fd(bArr4);
                    }
                    yz2Var.f473051e = l42Var3;
                }
                return 0;
            case 4:
                yz2Var.f473052f = aVar2.g(intValue);
                return 0;
            case 5:
                yz2Var.f473053g = aVar2.d(intValue);
                return 0;
            case 6:
                yz2Var.f473054h = aVar2.g(intValue);
                return 0;
            case 7:
                yz2Var.f473055i = aVar2.d(intValue);
                return 0;
            case 8:
                yz2Var.f473056m = aVar2.c(intValue);
                return 0;
            case 9:
                yz2Var.f473057n = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr5 != null && bArr5.length > 0) {
                        c19792x256d2725.mo11468x92b714fd(bArr5);
                    }
                    yz2Var.f473058o.add(c19792x256d2725);
                }
                return 0;
            case 11:
                yz2Var.f473059p = aVar2.g(intValue);
                return 0;
            case 12:
                yz2Var.f473060q = aVar2.c(intValue);
                return 0;
            case 13:
                yz2Var.f473061r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.s92 s92Var3 = new r45.s92();
                    if (bArr6 != null && bArr6.length > 0) {
                        s92Var3.mo11468x92b714fd(bArr6);
                    }
                    yz2Var.f473062s = s92Var3;
                }
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ha2 ha2Var3 = new r45.ha2();
                    if (bArr7 != null && bArr7.length > 0) {
                        ha2Var3.mo11468x92b714fd(bArr7);
                    }
                    yz2Var.f473063t = ha2Var3;
                }
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.vz2 vz2Var3 = new r45.vz2();
                    if (bArr8 != null && bArr8.length > 0) {
                        vz2Var3.mo11468x92b714fd(bArr8);
                    }
                    yz2Var.f473064u = vz2Var3;
                }
                return 0;
            case 17:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.zz2 zz2Var3 = new r45.zz2();
                    if (bArr9 != null && bArr9.length > 0) {
                        zz2Var3.mo11468x92b714fd(bArr9);
                    }
                    yz2Var.f473065v = zz2Var3;
                }
                return 0;
            case 18:
                yz2Var.f473066w = aVar2.g(intValue);
                return 0;
            case 19:
                yz2Var.f473067x = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
