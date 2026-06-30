package r45;

/* loaded from: classes2.dex */
public class ds4 extends r45.mr5 {
    public r45.kd3 A;
    public final java.util.LinkedList B = new java.util.LinkedList();
    public r45.ym3 C;
    public r45.rn1 D;

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f454245d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454246e;

    /* renamed from: f, reason: collision with root package name */
    public long f454247f;

    /* renamed from: g, reason: collision with root package name */
    public float f454248g;

    /* renamed from: h, reason: collision with root package name */
    public float f454249h;

    /* renamed from: i, reason: collision with root package name */
    public int f454250i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f454251m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f454252n;

    /* renamed from: o, reason: collision with root package name */
    public int f454253o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f454254p;

    /* renamed from: q, reason: collision with root package name */
    public r45.xu2 f454255q;

    /* renamed from: r, reason: collision with root package name */
    public r45.kw0 f454256r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454257s;

    /* renamed from: t, reason: collision with root package name */
    public r45.dx0 f454258t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f454259u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f454260v;

    /* renamed from: w, reason: collision with root package name */
    public r45.y91 f454261w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f454262x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f454263y;

    /* renamed from: z, reason: collision with root package name */
    public r45.ni6 f454264z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ds4)) {
            return false;
        }
        r45.ds4 ds4Var = (r45.ds4) fVar;
        return n51.f.a(this.f76494x2de60e5e, ds4Var.f76494x2de60e5e) && n51.f.a(this.f454245d, ds4Var.f454245d) && n51.f.a(this.f454246e, ds4Var.f454246e) && n51.f.a(java.lang.Long.valueOf(this.f454247f), java.lang.Long.valueOf(ds4Var.f454247f)) && n51.f.a(java.lang.Float.valueOf(this.f454248g), java.lang.Float.valueOf(ds4Var.f454248g)) && n51.f.a(java.lang.Float.valueOf(this.f454249h), java.lang.Float.valueOf(ds4Var.f454249h)) && n51.f.a(java.lang.Integer.valueOf(this.f454250i), java.lang.Integer.valueOf(ds4Var.f454250i)) && n51.f.a(this.f454251m, ds4Var.f454251m) && n51.f.a(this.f454252n, ds4Var.f454252n) && n51.f.a(java.lang.Integer.valueOf(this.f454253o), java.lang.Integer.valueOf(ds4Var.f454253o)) && n51.f.a(this.f454254p, ds4Var.f454254p) && n51.f.a(this.f454255q, ds4Var.f454255q) && n51.f.a(this.f454256r, ds4Var.f454256r) && n51.f.a(this.f454257s, ds4Var.f454257s) && n51.f.a(this.f454258t, ds4Var.f454258t) && n51.f.a(this.f454259u, ds4Var.f454259u) && n51.f.a(this.f454260v, ds4Var.f454260v) && n51.f.a(this.f454261w, ds4Var.f454261w) && n51.f.a(this.f454262x, ds4Var.f454262x) && n51.f.a(this.f454263y, ds4Var.f454263y) && n51.f.a(this.f454264z, ds4Var.f454264z) && n51.f.a(this.A, ds4Var.A) && n51.f.a(this.B, ds4Var.B) && n51.f.a(this.C, ds4Var.C) && n51.f.a(this.D, ds4Var.D);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            r45.kv0 kv0Var = this.f454245d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f454245d.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f454246e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f454247f);
            fVar.d(6, this.f454248g);
            fVar.d(7, this.f454249h);
            fVar.e(5, this.f454250i);
            java.lang.String str = this.f454251m;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f454252n;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            fVar.e(10, this.f454253o);
            java.lang.String str3 = this.f454254p;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            r45.xu2 xu2Var = this.f454255q;
            if (xu2Var != null) {
                fVar.i(12, xu2Var.mo75928xcd1e8d8());
                this.f454255q.mo75956x3d5d1f78(fVar);
            }
            r45.kw0 kw0Var = this.f454256r;
            if (kw0Var != null) {
                fVar.i(13, kw0Var.mo75928xcd1e8d8());
                this.f454256r.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f454257s;
            if (gVar2 != null) {
                fVar.b(14, gVar2);
            }
            r45.dx0 dx0Var = this.f454258t;
            if (dx0Var != null) {
                fVar.i(15, dx0Var.mo75928xcd1e8d8());
                this.f454258t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f454259u;
            if (str4 != null) {
                fVar.j(16, str4);
            }
            java.lang.String str5 = this.f454260v;
            if (str5 != null) {
                fVar.j(17, str5);
            }
            r45.y91 y91Var = this.f454261w;
            if (y91Var != null) {
                fVar.i(18, y91Var.mo75928xcd1e8d8());
                this.f454261w.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f454262x;
            if (str6 != null) {
                fVar.j(19, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f454263y;
            if (gVar3 != null) {
                fVar.b(20, gVar3);
            }
            r45.ni6 ni6Var = this.f454264z;
            if (ni6Var != null) {
                fVar.i(21, ni6Var.mo75928xcd1e8d8());
                this.f454264z.mo75956x3d5d1f78(fVar);
            }
            r45.kd3 kd3Var = this.A;
            if (kd3Var != null) {
                fVar.i(22, kd3Var.mo75928xcd1e8d8());
                this.A.mo75956x3d5d1f78(fVar);
            }
            fVar.g(23, 8, linkedList);
            r45.ym3 ym3Var = this.C;
            if (ym3Var != null) {
                fVar.i(24, ym3Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            r45.rn1 rn1Var = this.D;
            if (rn1Var != null) {
                fVar.i(25, rn1Var.mo75928xcd1e8d8());
                this.D.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f454245d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f454246e;
            if (gVar4 != null) {
                i18 += b36.f.b(3, gVar4);
            }
            int h17 = i18 + b36.f.h(4, this.f454247f) + b36.f.d(6, this.f454248g) + b36.f.d(7, this.f454249h) + b36.f.e(5, this.f454250i);
            java.lang.String str7 = this.f454251m;
            if (str7 != null) {
                h17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f454252n;
            if (str8 != null) {
                h17 += b36.f.j(9, str8);
            }
            int e17 = h17 + b36.f.e(10, this.f454253o);
            java.lang.String str9 = this.f454254p;
            if (str9 != null) {
                e17 += b36.f.j(11, str9);
            }
            r45.xu2 xu2Var2 = this.f454255q;
            if (xu2Var2 != null) {
                e17 += b36.f.i(12, xu2Var2.mo75928xcd1e8d8());
            }
            r45.kw0 kw0Var2 = this.f454256r;
            if (kw0Var2 != null) {
                e17 += b36.f.i(13, kw0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f454257s;
            if (gVar5 != null) {
                e17 += b36.f.b(14, gVar5);
            }
            r45.dx0 dx0Var2 = this.f454258t;
            if (dx0Var2 != null) {
                e17 += b36.f.i(15, dx0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f454259u;
            if (str10 != null) {
                e17 += b36.f.j(16, str10);
            }
            java.lang.String str11 = this.f454260v;
            if (str11 != null) {
                e17 += b36.f.j(17, str11);
            }
            r45.y91 y91Var2 = this.f454261w;
            if (y91Var2 != null) {
                e17 += b36.f.i(18, y91Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.f454262x;
            if (str12 != null) {
                e17 += b36.f.j(19, str12);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f454263y;
            if (gVar6 != null) {
                e17 += b36.f.b(20, gVar6);
            }
            r45.ni6 ni6Var2 = this.f454264z;
            if (ni6Var2 != null) {
                e17 += b36.f.i(21, ni6Var2.mo75928xcd1e8d8());
            }
            r45.kd3 kd3Var2 = this.A;
            if (kd3Var2 != null) {
                e17 += b36.f.i(22, kd3Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(23, 8, linkedList);
            r45.ym3 ym3Var2 = this.C;
            if (ym3Var2 != null) {
                g17 += b36.f.i(24, ym3Var2.mo75928xcd1e8d8());
            }
            r45.rn1 rn1Var2 = this.D;
            return rn1Var2 != null ? g17 + b36.f.i(25, rn1Var2.mo75928xcd1e8d8()) : g17;
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
        r45.ds4 ds4Var = (r45.ds4) objArr[1];
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
                    ds4Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr3);
                    }
                    ds4Var.f454245d = kv0Var3;
                }
                return 0;
            case 3:
                ds4Var.f454246e = aVar2.d(intValue);
                return 0;
            case 4:
                ds4Var.f454247f = aVar2.i(intValue);
                return 0;
            case 5:
                ds4Var.f454250i = aVar2.g(intValue);
                return 0;
            case 6:
                ds4Var.f454248g = aVar2.f(intValue);
                return 0;
            case 7:
                ds4Var.f454249h = aVar2.f(intValue);
                return 0;
            case 8:
                ds4Var.f454251m = aVar2.k(intValue);
                return 0;
            case 9:
                ds4Var.f454252n = aVar2.k(intValue);
                return 0;
            case 10:
                ds4Var.f454253o = aVar2.g(intValue);
                return 0;
            case 11:
                ds4Var.f454254p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xu2 xu2Var3 = new r45.xu2();
                    if (bArr4 != null && bArr4.length > 0) {
                        xu2Var3.mo11468x92b714fd(bArr4);
                    }
                    ds4Var.f454255q = xu2Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.kw0 kw0Var3 = new r45.kw0();
                    if (bArr5 != null && bArr5.length > 0) {
                        kw0Var3.mo11468x92b714fd(bArr5);
                    }
                    ds4Var.f454256r = kw0Var3;
                }
                return 0;
            case 14:
                ds4Var.f454257s = aVar2.d(intValue);
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr6 != null && bArr6.length > 0) {
                        dx0Var3.mo11468x92b714fd(bArr6);
                    }
                    ds4Var.f454258t = dx0Var3;
                }
                return 0;
            case 16:
                ds4Var.f454259u = aVar2.k(intValue);
                return 0;
            case 17:
                ds4Var.f454260v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.y91 y91Var3 = new r45.y91();
                    if (bArr7 != null && bArr7.length > 0) {
                        y91Var3.mo11468x92b714fd(bArr7);
                    }
                    ds4Var.f454261w = y91Var3;
                }
                return 0;
            case 19:
                ds4Var.f454262x = aVar2.k(intValue);
                return 0;
            case 20:
                ds4Var.f454263y = aVar2.d(intValue);
                return 0;
            case 21:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ni6 ni6Var3 = new r45.ni6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ni6Var3.mo11468x92b714fd(bArr8);
                    }
                    ds4Var.f454264z = ni6Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.kd3 kd3Var3 = new r45.kd3();
                    if (bArr9 != null && bArr9.length > 0) {
                        kd3Var3.mo11468x92b714fd(bArr9);
                    }
                    ds4Var.A = kd3Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.vd6 vd6Var = new r45.vd6();
                    if (bArr10 != null && bArr10.length > 0) {
                        vd6Var.mo11468x92b714fd(bArr10);
                    }
                    ds4Var.B.add(vd6Var);
                }
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.ym3 ym3Var3 = new r45.ym3();
                    if (bArr11 != null && bArr11.length > 0) {
                        ym3Var3.mo11468x92b714fd(bArr11);
                    }
                    ds4Var.C = ym3Var3;
                }
                return 0;
            case 25:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    r45.rn1 rn1Var3 = new r45.rn1();
                    if (bArr12 != null && bArr12.length > 0) {
                        rn1Var3.mo11468x92b714fd(bArr12);
                    }
                    ds4Var.D = rn1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
