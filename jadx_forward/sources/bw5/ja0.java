package bw5;

/* loaded from: classes2.dex */
public class ja0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110422d;

    /* renamed from: e, reason: collision with root package name */
    public int f110423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f110424f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f110425g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f110427i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ia0 f110428m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f110429n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.ga0 f110430o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f110431p;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f110433r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.ea0 f110434s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f110435t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.ha0 f110436u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f110437v;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f110426h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f110432q = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final boolean[] f110438w = new boolean[18];

    static {
        new bw5.ja0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ja0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ja0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ja0)) {
            return false;
        }
        bw5.ja0 ja0Var = (bw5.ja0) fVar;
        return n51.f.a(this.f76492x92037252, ja0Var.f76492x92037252) && n51.f.a(this.f110422d, ja0Var.f110422d) && n51.f.a(java.lang.Integer.valueOf(this.f110423e), java.lang.Integer.valueOf(ja0Var.f110423e)) && n51.f.a(java.lang.Boolean.valueOf(this.f110424f), java.lang.Boolean.valueOf(ja0Var.f110424f)) && n51.f.a(java.lang.Boolean.valueOf(this.f110425g), java.lang.Boolean.valueOf(ja0Var.f110425g)) && n51.f.a(this.f110426h, ja0Var.f110426h) && n51.f.a(this.f110427i, ja0Var.f110427i) && n51.f.a(this.f110428m, ja0Var.f110428m) && n51.f.a(java.lang.Boolean.valueOf(this.f110429n), java.lang.Boolean.valueOf(ja0Var.f110429n)) && n51.f.a(this.f110430o, ja0Var.f110430o) && n51.f.a(this.f110431p, ja0Var.f110431p) && n51.f.a(this.f110432q, ja0Var.f110432q) && n51.f.a(this.f110433r, ja0Var.f110433r) && n51.f.a(this.f110434s, ja0Var.f110434s) && n51.f.a(this.f110435t, ja0Var.f110435t) && n51.f.a(this.f110436u, ja0Var.f110436u) && n51.f.a(java.lang.Boolean.valueOf(this.f110437v), java.lang.Boolean.valueOf(ja0Var.f110437v));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f110438w[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ja0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110432q;
        java.util.LinkedList linkedList2 = this.f110426h;
        int i18 = 0;
        boolean[] zArr = this.f110438w;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f110422d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f110423e);
            }
            if (zArr[4]) {
                fVar.a(4, this.f110424f);
            }
            if (zArr[5]) {
                fVar.a(5, this.f110425g);
            }
            fVar.g(6, 8, linkedList2);
            java.lang.String str2 = this.f110427i;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.ia0 ia0Var = this.f110428m;
            if (ia0Var != null && zArr[8]) {
                fVar.i(8, ia0Var.mo75928xcd1e8d8());
                this.f110428m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[9]) {
                fVar.a(9, this.f110429n);
            }
            bw5.ga0 ga0Var = this.f110430o;
            if (ga0Var != null && zArr[10]) {
                fVar.i(10, ga0Var.mo75928xcd1e8d8());
                this.f110430o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f110431p;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            fVar.g(12, 8, linkedList);
            java.lang.String str4 = this.f110433r;
            if (str4 != null && zArr[13]) {
                fVar.j(13, str4);
            }
            bw5.ea0 ea0Var = this.f110434s;
            if (ea0Var != null && zArr[14]) {
                fVar.i(14, ea0Var.mo75928xcd1e8d8());
                this.f110434s.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f110435t;
            if (str5 != null && zArr[15]) {
                fVar.j(15, str5);
            }
            bw5.ha0 ha0Var = this.f110436u;
            if (ha0Var != null && zArr[16]) {
                fVar.i(16, ha0Var.mo75928xcd1e8d8());
                this.f110436u.mo75956x3d5d1f78(fVar);
            }
            if (zArr[17]) {
                fVar.a(17, this.f110437v);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            java.lang.String str6 = this.f110422d;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f110423e);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f110424f);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f110425g);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList2);
            java.lang.String str7 = this.f110427i;
            if (str7 != null && zArr[7]) {
                g17 += b36.f.j(7, str7);
            }
            bw5.ia0 ia0Var2 = this.f110428m;
            if (ia0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, ia0Var2.mo75928xcd1e8d8());
            }
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f110429n);
            }
            bw5.ga0 ga0Var2 = this.f110430o;
            if (ga0Var2 != null && zArr[10]) {
                g17 += b36.f.i(10, ga0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f110431p;
            if (str8 != null && zArr[11]) {
                g17 += b36.f.j(11, str8);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList);
            java.lang.String str9 = this.f110433r;
            if (str9 != null && zArr[13]) {
                g18 += b36.f.j(13, str9);
            }
            bw5.ea0 ea0Var2 = this.f110434s;
            if (ea0Var2 != null && zArr[14]) {
                g18 += b36.f.i(14, ea0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f110435t;
            if (str10 != null && zArr[15]) {
                g18 += b36.f.j(15, str10);
            }
            bw5.ha0 ha0Var2 = this.f110436u;
            if (ha0Var2 != null && zArr[16]) {
                g18 += b36.f.i(16, ha0Var2.mo75928xcd1e8d8());
            }
            return zArr[17] ? g18 + b36.f.a(17, this.f110437v) : g18;
        }
        if (i17 == 2) {
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
        switch (intValue) {
            case 1:
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
            case 2:
                this.f110422d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f110423e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f110424f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f110425g = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.ea0 ea0Var3 = new bw5.ea0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ea0Var3.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(ea0Var3);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f110427i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.ia0 ia0Var3 = new bw5.ia0();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f110428m = ia0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f110429n = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ga0 ga0Var3 = new bw5.ga0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f110430o = ga0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f110431p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.fa0 fa0Var = new bw5.fa0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fa0Var.mo11468x92b714fd(bArr5);
                    }
                    linkedList.add(fa0Var);
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f110433r = aVar2.k(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.ea0 ea0Var4 = new bw5.ea0();
                    if (bArr6 != null && bArr6.length > 0) {
                        ea0Var4.mo11468x92b714fd(bArr6);
                    }
                    this.f110434s = ea0Var4;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f110435t = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.ha0 ha0Var3 = new bw5.ha0();
                    if (bArr7 != null && bArr7.length > 0) {
                        ha0Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f110436u = ha0Var3;
                }
                zArr[16] = true;
                return 0;
            case 17:
                this.f110437v = aVar2.c(intValue);
                zArr[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f110438w[1] = true;
        return this;
    }
}
