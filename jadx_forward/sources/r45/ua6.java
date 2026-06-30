package r45;

/* loaded from: classes4.dex */
public class ua6 extends r45.js5 {
    public long A;
    public int B;
    public r45.cu5 C;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468701d;

    /* renamed from: e, reason: collision with root package name */
    public int f468702e;

    /* renamed from: g, reason: collision with root package name */
    public int f468704g;

    /* renamed from: h, reason: collision with root package name */
    public int f468705h;

    /* renamed from: i, reason: collision with root package name */
    public int f468706i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ga6 f468707m;

    /* renamed from: n, reason: collision with root package name */
    public int f468708n;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f468710p;

    /* renamed from: q, reason: collision with root package name */
    public int f468711q;

    /* renamed from: s, reason: collision with root package name */
    public int f468713s;

    /* renamed from: u, reason: collision with root package name */
    public int f468715u;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f468718x;

    /* renamed from: y, reason: collision with root package name */
    public int f468719y;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f468703f = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f468709o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f468712r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f468714t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f468716v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public java.util.LinkedList f468717w = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f468720z = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ua6)) {
            return false;
        }
        r45.ua6 ua6Var = (r45.ua6) fVar;
        return n51.f.a(this.f76492x92037252, ua6Var.f76492x92037252) && n51.f.a(this.f468701d, ua6Var.f468701d) && n51.f.a(java.lang.Integer.valueOf(this.f468702e), java.lang.Integer.valueOf(ua6Var.f468702e)) && n51.f.a(this.f468703f, ua6Var.f468703f) && n51.f.a(java.lang.Integer.valueOf(this.f468704g), java.lang.Integer.valueOf(ua6Var.f468704g)) && n51.f.a(java.lang.Integer.valueOf(this.f468705h), java.lang.Integer.valueOf(ua6Var.f468705h)) && n51.f.a(java.lang.Integer.valueOf(this.f468706i), java.lang.Integer.valueOf(ua6Var.f468706i)) && n51.f.a(this.f468707m, ua6Var.f468707m) && n51.f.a(java.lang.Integer.valueOf(this.f468708n), java.lang.Integer.valueOf(ua6Var.f468708n)) && n51.f.a(this.f468709o, ua6Var.f468709o) && n51.f.a(this.f468710p, ua6Var.f468710p) && n51.f.a(java.lang.Integer.valueOf(this.f468711q), java.lang.Integer.valueOf(ua6Var.f468711q)) && n51.f.a(this.f468712r, ua6Var.f468712r) && n51.f.a(java.lang.Integer.valueOf(this.f468713s), java.lang.Integer.valueOf(ua6Var.f468713s)) && n51.f.a(this.f468714t, ua6Var.f468714t) && n51.f.a(java.lang.Integer.valueOf(this.f468715u), java.lang.Integer.valueOf(ua6Var.f468715u)) && n51.f.a(this.f468716v, ua6Var.f468716v) && n51.f.a(this.f468717w, ua6Var.f468717w) && n51.f.a(this.f468718x, ua6Var.f468718x) && n51.f.a(java.lang.Integer.valueOf(this.f468719y), java.lang.Integer.valueOf(ua6Var.f468719y)) && n51.f.a(this.f468720z, ua6Var.f468720z) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(ua6Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(ua6Var.B)) && n51.f.a(this.C, ua6Var.C);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468720z;
        java.util.LinkedList linkedList2 = this.f468714t;
        java.util.LinkedList linkedList3 = this.f468712r;
        java.util.LinkedList linkedList4 = this.f468709o;
        java.util.LinkedList linkedList5 = this.f468703f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f468701d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f468702e);
            fVar.g(4, 8, linkedList5);
            fVar.e(5, this.f468704g);
            fVar.e(6, this.f468705h);
            fVar.e(7, this.f468706i);
            r45.ga6 ga6Var = this.f468707m;
            if (ga6Var != null) {
                fVar.i(8, ga6Var.mo75928xcd1e8d8());
                this.f468707m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f468708n);
            fVar.g(10, 8, linkedList4);
            r45.cu5 cu5Var = this.f468710p;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.mo75928xcd1e8d8());
                this.f468710p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f468711q);
            fVar.g(13, 8, linkedList3);
            fVar.e(14, this.f468713s);
            fVar.g(15, 8, linkedList2);
            fVar.e(16, this.f468715u);
            fVar.k(17, 3, this.f468716v);
            fVar.k(18, 2, this.f468717w);
            r45.cu5 cu5Var2 = this.f468718x;
            if (cu5Var2 != null) {
                fVar.i(19, cu5Var2.mo75928xcd1e8d8());
                this.f468718x.mo75956x3d5d1f78(fVar);
            }
            fVar.e(20, this.f468719y);
            fVar.g(21, 8, linkedList);
            fVar.h(22, this.A);
            fVar.e(24, this.B);
            r45.cu5 cu5Var3 = this.C;
            if (cu5Var3 == null) {
                return 0;
            }
            fVar.i(25, cu5Var3.mo75928xcd1e8d8());
            this.C.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f468701d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f468702e) + b36.f.g(4, 8, linkedList5) + b36.f.e(5, this.f468704g) + b36.f.e(6, this.f468705h) + b36.f.e(7, this.f468706i);
            r45.ga6 ga6Var2 = this.f468707m;
            if (ga6Var2 != null) {
                e17 += b36.f.i(8, ga6Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(9, this.f468708n) + b36.f.g(10, 8, linkedList4);
            r45.cu5 cu5Var4 = this.f468710p;
            if (cu5Var4 != null) {
                e18 += b36.f.i(11, cu5Var4.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(12, this.f468711q) + b36.f.g(13, 8, linkedList3) + b36.f.e(14, this.f468713s) + b36.f.g(15, 8, linkedList2) + b36.f.e(16, this.f468715u) + b36.f.k(17, 3, this.f468716v) + b36.f.k(18, 2, this.f468717w);
            r45.cu5 cu5Var5 = this.f468718x;
            if (cu5Var5 != null) {
                e19 += b36.f.i(19, cu5Var5.mo75928xcd1e8d8());
            }
            int e27 = e19 + b36.f.e(20, this.f468719y) + b36.f.g(21, 8, linkedList) + b36.f.h(22, this.A) + b36.f.e(24, this.B);
            r45.cu5 cu5Var6 = this.C;
            return cu5Var6 != null ? e27 + b36.f.i(25, cu5Var6.mo75928xcd1e8d8()) : e27;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            this.f468716v.clear();
            this.f468717w.clear();
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
        r45.ua6 ua6Var = (r45.ua6) objArr[1];
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
                    ua6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ua6Var.f468701d = aVar2.k(intValue);
                return 0;
            case 3:
                ua6Var.f468702e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19806x4c372b7.mo11468x92b714fd(bArr3);
                    }
                    ua6Var.f468703f.add(c19806x4c372b7);
                }
                return 0;
            case 5:
                ua6Var.f468704g = aVar2.g(intValue);
                return 0;
            case 6:
                ua6Var.f468705h = aVar2.g(intValue);
                return 0;
            case 7:
                ua6Var.f468706i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga6Var3.mo11468x92b714fd(bArr4);
                    }
                    ua6Var.f468707m = ga6Var3;
                }
                return 0;
            case 9:
                ua6Var.f468708n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.g5 g5Var = new r45.g5();
                    if (bArr5 != null && bArr5.length > 0) {
                        g5Var.mo11468x92b714fd(bArr5);
                    }
                    ua6Var.f468709o.add(g5Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var7.b(bArr6);
                    }
                    ua6Var.f468710p = cu5Var7;
                }
                return 0;
            case 12:
                ua6Var.f468711q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ck5 ck5Var = new r45.ck5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ck5Var.mo11468x92b714fd(bArr7);
                    }
                    ua6Var.f468712r.add(ck5Var);
                }
                return 0;
            case 14:
                ua6Var.f468713s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.pb0 pb0Var = new r45.pb0();
                    if (bArr8 != null && bArr8.length > 0) {
                        pb0Var.mo11468x92b714fd(bArr8);
                    }
                    ua6Var.f468714t.add(pb0Var);
                }
                return 0;
            case 16:
                ua6Var.f468715u = aVar2.g(intValue);
                return 0;
            case 17:
                byte[] bArr9 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr9, 0, bArr9.length);
                java.util.LinkedList linkedList6 = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList6.add(java.lang.Long.valueOf(aVar3.g()));
                }
                ua6Var.f468716v = linkedList6;
                return 0;
            case 18:
                byte[] bArr10 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler2 = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr10, 0, bArr10.length);
                java.util.LinkedList linkedList7 = new java.util.LinkedList();
                while (aVar4.f329129c < aVar4.f329128b) {
                    linkedList7.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                ua6Var.f468717w = linkedList7;
                return 0;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr11 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr11 != null && bArr11.length > 0) {
                        cu5Var8.b(bArr11);
                    }
                    ua6Var.f468718x = cu5Var8;
                }
                return 0;
            case 20:
                ua6Var.f468719y = aVar2.g(intValue);
                return 0;
            case 21:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr12 = (byte[]) j39.get(i48);
                    r45.i5 i5Var = new r45.i5();
                    if (bArr12 != null && bArr12.length > 0) {
                        i5Var.mo11468x92b714fd(bArr12);
                    }
                    ua6Var.f468720z.add(i5Var);
                }
                return 0;
            case 22:
                ua6Var.A = aVar2.i(intValue);
                return 0;
            case 23:
            default:
                return -1;
            case 24:
                ua6Var.B = aVar2.g(intValue);
                return 0;
            case 25:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr13 = (byte[]) j47.get(i49);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr13 != null && bArr13.length > 0) {
                        cu5Var9.b(bArr13);
                    }
                    ua6Var.C = cu5Var9;
                }
                return 0;
        }
    }
}
