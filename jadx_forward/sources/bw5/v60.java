package bw5;

/* loaded from: classes2.dex */
public class v60 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115699e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115700f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115701g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115702h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.r60 f115703i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.s60 f115704m;

    /* renamed from: o, reason: collision with root package name */
    public bw5.g70 f115706o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.d70 f115707p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f115709r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.f90 f115710s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.m40 f115711t;

    /* renamed from: w, reason: collision with root package name */
    public bw5.q60 f115714w;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f115698d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f115705n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f115708q = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f115712u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f115713v = new java.util.LinkedList();

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f115715x = new boolean[28];

    static {
        new bw5.v60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.v60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v60)) {
            return false;
        }
        bw5.v60 v60Var = (bw5.v60) fVar;
        return n51.f.a(this.f76492x92037252, v60Var.f76492x92037252) && n51.f.a(this.f115698d, v60Var.f115698d) && n51.f.a(this.f115699e, v60Var.f115699e) && n51.f.a(java.lang.Boolean.valueOf(this.f115700f), java.lang.Boolean.valueOf(v60Var.f115700f)) && n51.f.a(this.f115701g, v60Var.f115701g) && n51.f.a(this.f115702h, v60Var.f115702h) && n51.f.a(this.f115703i, v60Var.f115703i) && n51.f.a(this.f115704m, v60Var.f115704m) && n51.f.a(this.f115705n, v60Var.f115705n) && n51.f.a(this.f115706o, v60Var.f115706o) && n51.f.a(this.f115707p, v60Var.f115707p) && n51.f.a(this.f115708q, v60Var.f115708q) && n51.f.a(java.lang.Boolean.valueOf(this.f115709r), java.lang.Boolean.valueOf(v60Var.f115709r)) && n51.f.a(this.f115710s, v60Var.f115710s) && n51.f.a(this.f115711t, v60Var.f115711t) && n51.f.a(this.f115712u, v60Var.f115712u) && n51.f.a(this.f115713v, v60Var.f115713v) && n51.f.a(this.f115714w, v60Var.f115714w);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f115715x[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115713v;
        java.util.LinkedList linkedList2 = this.f115712u;
        java.util.LinkedList linkedList3 = this.f115708q;
        java.util.LinkedList linkedList4 = this.f115705n;
        java.util.LinkedList linkedList5 = this.f115698d;
        int i18 = 0;
        boolean[] zArr = this.f115715x;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115699e;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.a(5, this.f115700f);
            }
            java.lang.String str = this.f115701g;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f115702h;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.r60 r60Var = this.f115703i;
            if (r60Var != null && zArr[8]) {
                fVar.i(8, r60Var.mo75928xcd1e8d8());
                this.f115703i.mo75956x3d5d1f78(fVar);
            }
            bw5.s60 s60Var = this.f115704m;
            if (s60Var != null && zArr[12]) {
                fVar.i(12, s60Var.mo75928xcd1e8d8());
                this.f115704m.mo75956x3d5d1f78(fVar);
            }
            fVar.g(13, 8, linkedList4);
            bw5.g70 g70Var = this.f115706o;
            if (g70Var != null && zArr[9]) {
                fVar.i(9, g70Var.mo75928xcd1e8d8());
                this.f115706o.mo75956x3d5d1f78(fVar);
            }
            bw5.d70 d70Var = this.f115707p;
            if (d70Var != null && zArr[10]) {
                fVar.i(10, d70Var.mo75928xcd1e8d8());
                this.f115707p.mo75956x3d5d1f78(fVar);
            }
            fVar.g(11, 8, linkedList3);
            if (zArr[14]) {
                fVar.a(14, this.f115709r);
            }
            bw5.f90 f90Var = this.f115710s;
            if (f90Var != null && zArr[23]) {
                fVar.i(23, f90Var.mo75928xcd1e8d8());
                this.f115710s.mo75956x3d5d1f78(fVar);
            }
            bw5.m40 m40Var = this.f115711t;
            if (m40Var != null && zArr[24]) {
                fVar.i(24, m40Var.mo75928xcd1e8d8());
                this.f115711t.mo75956x3d5d1f78(fVar);
            }
            fVar.g(25, 8, linkedList2);
            fVar.g(26, 8, linkedList);
            bw5.q60 q60Var = this.f115714w;
            if (q60Var != null && zArr[27]) {
                fVar.i(27, q60Var.mo75928xcd1e8d8());
                this.f115714w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList5);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115699e;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f115700f);
            }
            java.lang.String str3 = this.f115701g;
            if (str3 != null && zArr[6]) {
                g17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f115702h;
            if (str4 != null && zArr[7]) {
                g17 += b36.f.j(7, str4);
            }
            bw5.r60 r60Var2 = this.f115703i;
            if (r60Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, r60Var2.mo75928xcd1e8d8());
            }
            bw5.s60 s60Var2 = this.f115704m;
            if (s60Var2 != null && zArr[12]) {
                g17 += b36.f.i(12, s60Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(13, 8, linkedList4);
            bw5.g70 g70Var2 = this.f115706o;
            if (g70Var2 != null && zArr[9]) {
                g18 += b36.f.i(9, g70Var2.mo75928xcd1e8d8());
            }
            bw5.d70 d70Var2 = this.f115707p;
            if (d70Var2 != null && zArr[10]) {
                g18 += b36.f.i(10, d70Var2.mo75928xcd1e8d8());
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList3);
            if (zArr[14]) {
                g19 += b36.f.a(14, this.f115709r);
            }
            bw5.f90 f90Var2 = this.f115710s;
            if (f90Var2 != null && zArr[23]) {
                g19 += b36.f.i(23, f90Var2.mo75928xcd1e8d8());
            }
            bw5.m40 m40Var2 = this.f115711t;
            if (m40Var2 != null && zArr[24]) {
                g19 += b36.f.i(24, m40Var2.mo75928xcd1e8d8());
            }
            int g27 = g19 + b36.f.g(25, 8, linkedList2) + b36.f.g(26, 8, linkedList);
            bw5.q60 q60Var2 = this.f115714w;
            return (q60Var2 == null || !zArr[27]) ? g27 : g27 + b36.f.i(27, q60Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                this.f76492x92037252 = ieVar3;
            }
            zArr[1] = true;
            return 0;
        }
        switch (intValue) {
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.o60 o60Var = new bw5.o60();
                    if (bArr2 != null && bArr2.length > 0) {
                        o60Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList5.add(o60Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f115699e = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115700f = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115701g = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115702h = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.r60 r60Var3 = new bw5.r60();
                    if (bArr3 != null && bArr3.length > 0) {
                        r60Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f115703i = r60Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.g70 g70Var3 = new bw5.g70();
                    if (bArr4 != null && bArr4.length > 0) {
                        g70Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f115706o = g70Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.d70 d70Var3 = new bw5.d70();
                    if (bArr5 != null && bArr5.length > 0) {
                        d70Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f115707p = d70Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.u60 u60Var = new bw5.u60();
                    if (bArr6 != null && bArr6.length > 0) {
                        u60Var.mo11468x92b714fd(bArr6);
                    }
                    linkedList3.add(u60Var);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.s60 s60Var3 = new bw5.s60();
                    if (bArr7 != null && bArr7.length > 0) {
                        s60Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f115704m = s60Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.s60 s60Var4 = new bw5.s60();
                    if (bArr8 != null && bArr8.length > 0) {
                        s60Var4.mo11468x92b714fd(bArr8);
                    }
                    linkedList4.add(s60Var4);
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f115709r = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            default:
                switch (intValue) {
                    case 23:
                        java.util.LinkedList j39 = aVar2.j(intValue);
                        int size9 = j39.size();
                        for (int i48 = 0; i48 < size9; i48++) {
                            byte[] bArr9 = (byte[]) j39.get(i48);
                            bw5.f90 f90Var3 = new bw5.f90();
                            if (bArr9 != null && bArr9.length > 0) {
                                f90Var3.mo11468x92b714fd(bArr9);
                            }
                            this.f115710s = f90Var3;
                        }
                        zArr[23] = true;
                        return 0;
                    case 24:
                        java.util.LinkedList j47 = aVar2.j(intValue);
                        int size10 = j47.size();
                        for (int i49 = 0; i49 < size10; i49++) {
                            byte[] bArr10 = (byte[]) j47.get(i49);
                            bw5.m40 m40Var3 = new bw5.m40();
                            if (bArr10 != null && bArr10.length > 0) {
                                m40Var3.mo11468x92b714fd(bArr10);
                            }
                            this.f115711t = m40Var3;
                        }
                        zArr[24] = true;
                        return 0;
                    case 25:
                        java.util.LinkedList j48 = aVar2.j(intValue);
                        int size11 = j48.size();
                        for (int i57 = 0; i57 < size11; i57++) {
                            byte[] bArr11 = (byte[]) j48.get(i57);
                            bw5.o60 o60Var2 = new bw5.o60();
                            if (bArr11 != null && bArr11.length > 0) {
                                o60Var2.mo11468x92b714fd(bArr11);
                            }
                            linkedList2.add(o60Var2);
                        }
                        zArr[25] = true;
                        return 0;
                    case 26:
                        java.util.LinkedList j49 = aVar2.j(intValue);
                        int size12 = j49.size();
                        for (int i58 = 0; i58 < size12; i58++) {
                            byte[] bArr12 = (byte[]) j49.get(i58);
                            bw5.t60 t60Var = new bw5.t60();
                            if (bArr12 != null && bArr12.length > 0) {
                                t60Var.mo11468x92b714fd(bArr12);
                            }
                            linkedList.add(t60Var);
                        }
                        zArr[26] = true;
                        return 0;
                    case 27:
                        java.util.LinkedList j57 = aVar2.j(intValue);
                        int size13 = j57.size();
                        for (int i59 = 0; i59 < size13; i59++) {
                            byte[] bArr13 = (byte[]) j57.get(i59);
                            bw5.q60 q60Var3 = new bw5.q60();
                            if (bArr13 != null && bArr13.length > 0) {
                                q60Var3.mo11468x92b714fd(bArr13);
                            }
                            this.f115714w = q60Var3;
                        }
                        zArr[27] = true;
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f115715x[1] = true;
        return this;
    }
}
