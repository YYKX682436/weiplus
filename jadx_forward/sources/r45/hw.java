package r45;

/* loaded from: classes15.dex */
public class hw extends r45.js5 {
    public boolean A;
    public r45.lt3 B;
    public r45.hk5 C;
    public java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public int f458008d;

    /* renamed from: e, reason: collision with root package name */
    public r45.lj5 f458009e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458010f;

    /* renamed from: g, reason: collision with root package name */
    public int f458011g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458012h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f458013i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public r45.uk4 f458014m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f458015n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f458016o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f458017p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f458018q;

    /* renamed from: r, reason: collision with root package name */
    public r45.vf5 f458019r;

    /* renamed from: s, reason: collision with root package name */
    public r45.vf5 f458020s;

    /* renamed from: t, reason: collision with root package name */
    public int f458021t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458022u;

    /* renamed from: v, reason: collision with root package name */
    public int f458023v;

    /* renamed from: w, reason: collision with root package name */
    public r45.nn f458024w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f458025x;

    /* renamed from: y, reason: collision with root package name */
    public r45.gk5 f458026y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f458027z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw)) {
            return false;
        }
        r45.hw hwVar = (r45.hw) fVar;
        return n51.f.a(this.f76492x92037252, hwVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f458008d), java.lang.Integer.valueOf(hwVar.f458008d)) && n51.f.a(this.f458009e, hwVar.f458009e) && n51.f.a(this.f458010f, hwVar.f458010f) && n51.f.a(java.lang.Integer.valueOf(this.f458011g), java.lang.Integer.valueOf(hwVar.f458011g)) && n51.f.a(this.f458012h, hwVar.f458012h) && n51.f.a(this.f458013i, hwVar.f458013i) && n51.f.a(this.f458014m, hwVar.f458014m) && n51.f.a(this.f458015n, hwVar.f458015n) && n51.f.a(java.lang.Boolean.valueOf(this.f458016o), java.lang.Boolean.valueOf(hwVar.f458016o)) && n51.f.a(this.f458017p, hwVar.f458017p) && n51.f.a(this.f458018q, hwVar.f458018q) && n51.f.a(this.f458019r, hwVar.f458019r) && n51.f.a(this.f458020s, hwVar.f458020s) && n51.f.a(java.lang.Integer.valueOf(this.f458021t), java.lang.Integer.valueOf(hwVar.f458021t)) && n51.f.a(this.f458022u, hwVar.f458022u) && n51.f.a(java.lang.Integer.valueOf(this.f458023v), java.lang.Integer.valueOf(hwVar.f458023v)) && n51.f.a(this.f458024w, hwVar.f458024w) && n51.f.a(java.lang.Boolean.valueOf(this.f458025x), java.lang.Boolean.valueOf(hwVar.f458025x)) && n51.f.a(this.f458026y, hwVar.f458026y) && n51.f.a(java.lang.Boolean.valueOf(this.f458027z), java.lang.Boolean.valueOf(hwVar.f458027z)) && n51.f.a(java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(hwVar.A)) && n51.f.a(this.B, hwVar.B) && n51.f.a(this.C, hwVar.C) && n51.f.a(this.D, hwVar.D);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458013i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f458008d);
            r45.lj5 lj5Var = this.f458009e;
            if (lj5Var != null) {
                fVar.i(3, lj5Var.mo75928xcd1e8d8());
                this.f458009e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f458010f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f458011g);
            java.lang.String str2 = this.f458012h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList);
            r45.uk4 uk4Var = this.f458014m;
            if (uk4Var != null) {
                fVar.i(8, uk4Var.mo75928xcd1e8d8());
                this.f458014m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f458015n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f458016o);
            java.lang.String str4 = this.f458017p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f458018q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            r45.vf5 vf5Var = this.f458019r;
            if (vf5Var != null) {
                fVar.i(13, vf5Var.mo75928xcd1e8d8());
                this.f458019r.mo75956x3d5d1f78(fVar);
            }
            r45.vf5 vf5Var2 = this.f458020s;
            if (vf5Var2 != null) {
                fVar.i(14, vf5Var2.mo75928xcd1e8d8());
                this.f458020s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(15, this.f458021t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458022u;
            if (gVar != null) {
                fVar.b(16, gVar);
            }
            fVar.e(17, this.f458023v);
            r45.nn nnVar = this.f458024w;
            if (nnVar != null) {
                fVar.i(18, nnVar.mo75928xcd1e8d8());
                this.f458024w.mo75956x3d5d1f78(fVar);
            }
            fVar.a(19, this.f458025x);
            r45.gk5 gk5Var = this.f458026y;
            if (gk5Var != null) {
                fVar.i(20, gk5Var.mo75928xcd1e8d8());
                this.f458026y.mo75956x3d5d1f78(fVar);
            }
            fVar.a(21, this.f458027z);
            fVar.a(22, this.A);
            r45.lt3 lt3Var = this.B;
            if (lt3Var != null) {
                fVar.i(23, lt3Var.mo75928xcd1e8d8());
                this.B.mo75956x3d5d1f78(fVar);
            }
            r45.hk5 hk5Var = this.C;
            if (hk5Var != null) {
                fVar.i(24, hk5Var.mo75928xcd1e8d8());
                this.C.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.D;
            if (str6 != null) {
                fVar.j(25, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f458008d);
            r45.lj5 lj5Var2 = this.f458009e;
            if (lj5Var2 != null) {
                i18 += b36.f.i(3, lj5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f458010f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f458011g);
            java.lang.String str8 = this.f458012h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList);
            r45.uk4 uk4Var2 = this.f458014m;
            if (uk4Var2 != null) {
                g17 += b36.f.i(8, uk4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f458015n;
            if (str9 != null) {
                g17 += b36.f.j(9, str9);
            }
            int a17 = g17 + b36.f.a(10, this.f458016o);
            java.lang.String str10 = this.f458017p;
            if (str10 != null) {
                a17 += b36.f.j(11, str10);
            }
            java.lang.String str11 = this.f458018q;
            if (str11 != null) {
                a17 += b36.f.j(12, str11);
            }
            r45.vf5 vf5Var3 = this.f458019r;
            if (vf5Var3 != null) {
                a17 += b36.f.i(13, vf5Var3.mo75928xcd1e8d8());
            }
            r45.vf5 vf5Var4 = this.f458020s;
            if (vf5Var4 != null) {
                a17 += b36.f.i(14, vf5Var4.mo75928xcd1e8d8());
            }
            int e18 = a17 + b36.f.e(15, this.f458021t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458022u;
            if (gVar2 != null) {
                e18 += b36.f.b(16, gVar2);
            }
            int e19 = e18 + b36.f.e(17, this.f458023v);
            r45.nn nnVar2 = this.f458024w;
            if (nnVar2 != null) {
                e19 += b36.f.i(18, nnVar2.mo75928xcd1e8d8());
            }
            int a18 = e19 + b36.f.a(19, this.f458025x);
            r45.gk5 gk5Var2 = this.f458026y;
            if (gk5Var2 != null) {
                a18 += b36.f.i(20, gk5Var2.mo75928xcd1e8d8());
            }
            int a19 = a18 + b36.f.a(21, this.f458027z) + b36.f.a(22, this.A);
            r45.lt3 lt3Var2 = this.B;
            if (lt3Var2 != null) {
                a19 += b36.f.i(23, lt3Var2.mo75928xcd1e8d8());
            }
            r45.hk5 hk5Var2 = this.C;
            if (hk5Var2 != null) {
                a19 += b36.f.i(24, hk5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str12 = this.D;
            return str12 != null ? a19 + b36.f.j(25, str12) : a19;
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
        r45.hw hwVar = (r45.hw) objArr[1];
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
                    hwVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                hwVar.f458008d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.lj5 lj5Var3 = new r45.lj5();
                    if (bArr3 != null && bArr3.length > 0) {
                        lj5Var3.mo11468x92b714fd(bArr3);
                    }
                    hwVar.f458009e = lj5Var3;
                }
                return 0;
            case 4:
                hwVar.f458010f = aVar2.k(intValue);
                return 0;
            case 5:
                hwVar.f458011g = aVar2.g(intValue);
                return 0;
            case 6:
                hwVar.f458012h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.uk4 uk4Var3 = new r45.uk4();
                    if (bArr4 != null && bArr4.length > 0) {
                        uk4Var3.mo11468x92b714fd(bArr4);
                    }
                    hwVar.f458013i.add(uk4Var3);
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.uk4 uk4Var4 = new r45.uk4();
                    if (bArr5 != null && bArr5.length > 0) {
                        uk4Var4.mo11468x92b714fd(bArr5);
                    }
                    hwVar.f458014m = uk4Var4;
                }
                return 0;
            case 9:
                hwVar.f458015n = aVar2.k(intValue);
                return 0;
            case 10:
                hwVar.f458016o = aVar2.c(intValue);
                return 0;
            case 11:
                hwVar.f458017p = aVar2.k(intValue);
                return 0;
            case 12:
                hwVar.f458018q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.vf5 vf5Var5 = new r45.vf5();
                    if (bArr6 != null && bArr6.length > 0) {
                        vf5Var5.mo11468x92b714fd(bArr6);
                    }
                    hwVar.f458019r = vf5Var5;
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.vf5 vf5Var6 = new r45.vf5();
                    if (bArr7 != null && bArr7.length > 0) {
                        vf5Var6.mo11468x92b714fd(bArr7);
                    }
                    hwVar.f458020s = vf5Var6;
                }
                return 0;
            case 15:
                hwVar.f458021t = aVar2.g(intValue);
                return 0;
            case 16:
                hwVar.f458022u = aVar2.d(intValue);
                return 0;
            case 17:
                hwVar.f458023v = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.nn nnVar3 = new r45.nn();
                    if (bArr8 != null && bArr8.length > 0) {
                        nnVar3.mo11468x92b714fd(bArr8);
                    }
                    hwVar.f458024w = nnVar3;
                }
                return 0;
            case 19:
                hwVar.f458025x = aVar2.c(intValue);
                return 0;
            case 20:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.gk5 gk5Var3 = new r45.gk5();
                    if (bArr9 != null && bArr9.length > 0) {
                        gk5Var3.mo11468x92b714fd(bArr9);
                    }
                    hwVar.f458026y = gk5Var3;
                }
                return 0;
            case 21:
                hwVar.f458027z = aVar2.c(intValue);
                return 0;
            case 22:
                hwVar.A = aVar2.c(intValue);
                return 0;
            case 23:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.lt3 lt3Var3 = new r45.lt3();
                    if (bArr10 != null && bArr10.length > 0) {
                        lt3Var3.mo11468x92b714fd(bArr10);
                    }
                    hwVar.B = lt3Var3;
                }
                return 0;
            case 24:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.hk5 hk5Var3 = new r45.hk5();
                    if (bArr11 != null && bArr11.length > 0) {
                        hk5Var3.mo11468x92b714fd(bArr11);
                    }
                    hwVar.C = hk5Var3;
                }
                return 0;
            case 25:
                hwVar.D = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
